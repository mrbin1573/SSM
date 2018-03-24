package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.GajyUploadMiddle;

/**
 * 广安玖源业务接口
 * @GAJYServices
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-8-8
 */
public interface GAJYServices {
	//转换为标准文件
	public void saveCopyAs(String xlsfile, String saveAsFile)throws Exception;
	//读取Excel文件
	public List<GajyUploadMiddle> gajy_readExcel(String filePath) throws Exception;
	//保存数据到上传临时表中
	public void gajy_insertToUploadMiddle(GajyUploadMiddle gajyUploadMiddle)throws Exception;
	//保存数据到原始表中
	public void gajy_insertToExcel(GajyUploadMiddle gajyUploadMiddle)throws Exception;
	//删除上传数据临时表中的数据
	public void gajy_deleteUploadMiddle()throws Exception;
}
