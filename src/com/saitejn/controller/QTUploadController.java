package com.saitejn.controller;

import java.io.File;
import java.text.SimpleDateFormat;
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
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JfRawdataHandle1;
import com.saitejn.pojo.JfUploadMiddle;
import com.saitejn.services.QT_UploadServices;

@Controller
public class QTUploadController {
	@Autowired
	private QT_UploadServices qT_UploadServices;
	/*去文件的上传页面*/
	@RequestMapping("/qt_upload")
	public String jf_toUpload(Model model,HttpSession session)throws Exception{
		JfRawdataHandle1 jfRawdataHandle1 = qT_UploadServices.getLastTime_jf();
		if(jfRawdataHandle1 != null){
			Date time =  jfRawdataHandle1.getData_time();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			String db_endtime = sdf.format(time);
			session.setAttribute("db_endtime", db_endtime);
		}
		return "qt/jf_upload";
	}
	/*文件上传完成后*/
	@RequestMapping("qt_toUploadType")
	public String jf_toUploadType(Model model)throws Exception{
		JfRawdataHandle1 jfRawdataHandle1 = qT_UploadServices.getLastTime_jf();
		if(jfRawdataHandle1 != null){
			Date time =  jfRawdataHandle1.getData_time();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			String db_newendtime = sdf.format(time);
			model.addAttribute("db_newendtime",db_newendtime);
		}
		return "qt/jf_toUploadType";
	}
	//处理文件上传
	@RequestMapping("/qt_doUploadFile")
	public void jf_doUploadFile(@RequestParam("jf_file") MultipartFile[] file,Model model,HttpSession session)throws Exception{
		if(file != null){
			String file_path = "E:\\myeclipse10\\upload\\temp\\file\\qt\\qtys\\";
			for(int i = 0; i<file.length;i++){
				String OriginalFilename = file[i].getOriginalFilename();
				String preff = OriginalFilename.substring(0,OriginalFilename.lastIndexOf("."));
				String newFileName =preff+UUID.randomUUID()+OriginalFilename.substring(OriginalFilename.lastIndexOf("."));
				File newFile = new File(file_path+newFileName);
				file[i].transferTo(newFile);
				String filePath_ys = newFile.toString();	
				String file_path_bz = "E:\\myeclipse10\\upload\\temp\\file\\qt\\";
				String bzFileName = preff+UUID.randomUUID()+".xls";
				File bzfile = new File(file_path_bz+bzFileName);
				qT_UploadServices.saveCopyAs(filePath_ys, bzfile.toString());
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
				 List<JfUploadMiddle> datalist =  qT_UploadServices.readExcel_jf(filePath);
				 for(JfUploadMiddle jb : datalist){
					 JfUploadMiddle jbExcelMiddle = jb;
					 qT_UploadServices.insertDataToMiddle_jf(jbExcelMiddle);
					/* qT_UploadServices.insertDataToExcel_jf(jbExcelMiddle);*/
				 }
				 
			}
		}
	/*	qT_UploadServices.insertDataToHand1_jf();
		qT_UploadServices.insertDataToHand2_jf();
		qT_UploadServices.deleterawdataMiddle_jf();
		qT_UploadServices.deleteUploadMiddle_jf();*/
		
	}

}
