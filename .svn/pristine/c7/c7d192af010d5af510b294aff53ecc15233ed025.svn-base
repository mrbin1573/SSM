package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.Admin;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JbuserInfoVo;

/**
 * 用户扩展接口
 * @class UserCustomerMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-14
 */
public interface UserCustomerMapper {
	//根据用户名查询用户
	public JbUserifo selectByName(String u_loginname) throws Exception;
	//根据管理员用户名查询用户
	public Admin selectByAdminName(String a_loginname) throws Exception;
	//用户注册
	public void insertUser(JbuserInfoVo jbuserInfoVo)throws Exception;
	//修改用户班次信息
	public void updateUser(String classinfo,int uid) throws Exception;
	//保存班次记录信息
	public void saveClassifo(JbClassinfor jbClassinfor) throws Exception;
	//修改上次登录时间
	public void updateloginTime(String lastLogin,int uid)throws Exception;
	//修改注销时间
	public void updateExitTime(String exittime,int uid)throws Exception;
	//修改用户的姓名和密码
	 public void updateUserifo(JbUserifo user)throws Exception;
	//查询所有的用户信息
	public List<JbUserifo> selectAlljbUser()throws Exception;
	
	

}
