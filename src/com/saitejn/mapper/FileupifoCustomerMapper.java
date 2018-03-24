package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.FileUpInfo;

/**
 * 文件上传记录信息
 * @class FileupifoCustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-22
 */
public interface FileupifoCustomerMapper {
	//查询所有的用户上传的记录，
	public List<FileUpInfo> selectAll()throws Exception;
	
}
