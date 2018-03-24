package com.saitejn.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.saitejn.pojo.FileUpInfo;
import com.saitejn.pojo.GajyUploadMiddle;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.services.GAJYServices;
/**
 * 广安玖源控制类
 * @GAJYController
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-8-8
 */
@Controller
public class GAJYController {
	@Autowired
	private GAJYServices gajyServices;
	//前往文件上传页面
	@RequestMapping("/gajy_toupload")
	public String gajy_toupload()throws Exception{
		
		return "gajy/gajy_toUpload";
	}
	//处理文件上传
	@RequestMapping("/gajy_doUploadFile")
	public void gajy_doUploadFile(@RequestParam("gajy_file") MultipartFile[] file,Model model,HttpSession session)throws Exception{
		if(file != null){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\gajy\\gajyys\\";
			for(int i = 0; i<file.length;i++){
				String OriginalFilename = file[i].getOriginalFilename();
				String preff = OriginalFilename.substring(0,OriginalFilename.lastIndexOf("."));
				String newFileName =preff+UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				File newFile = new File(file_path+newFileName);
				file[i].transferTo(newFile);
				String filePath_ys = newFile.toString();	
				String file_path_bz = "E:\\myeclipse10\\upload\\temp\\file\\gajy\\";
				String bzFileName = preff+UUID.randomUUID()+".xls";
				File bzfile = new File(file_path_bz+bzFileName);
				gajyServices.saveCopyAs(filePath_ys, bzfile.toString());
				Date nowtime  = new Date();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String uptime =   format.format(nowtime);
				JbUserifo user = (JbUserifo) session.getAttribute("user");
				String upperson = user.getUtruename();
				String upname = OriginalFilename;
				String fileename = newFileName;
				String filtype = "未处理";
				FileUpInfo fileupifo = new FileUpInfo();
				fileupifo.setFileename(fileename);
				fileupifo.setFiltype(filtype);
				fileupifo.setUpname(upname);
				fileupifo.setUpperson(upperson);
				fileupifo.setUptime(uptime);
				//dataServices.saveUpFileIfo(fileupifo);
				String filePath = bzfile.toString();
				List<GajyUploadMiddle> datalist =  gajyServices.gajy_readExcel(filePath);
				 for(GajyUploadMiddle gajy : datalist){
					 GajyUploadMiddle gajyUploadMiddle = gajy;
					 gajyServices.gajy_insertToUploadMiddle(gajyUploadMiddle);
					gajyServices.gajy_insertToExcel(gajyUploadMiddle);
				 }
				 
			}
		}
		gajyServices.gajy_deleteUploadMiddle();
		/*jf_UploadServices.insertDataToHand1_jf();
		jf_UploadServices.insertDataToHand2_jf();
		jf_UploadServices.deleterawdataMiddle_jf();
		jf_UploadServices.deleteUploadMiddle_jf();*/
	}
	//文件上传成功后
	@RequestMapping("/gajy_toUploadType")
	public String gajy_toUploadType()throws Exception{
		
		return "gajy/gajy_toUploadType";
	}
}
