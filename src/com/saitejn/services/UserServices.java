package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.Admin;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JbuserInfoVo;


/**
 * 用户接口
 * @class UserServices.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-14
 */
public interface UserServices {
	/**
	 * 用户登录
	 * @param username 用户名
	 * @param userpass 密码
	 * @return
	 * @throws Exception
	 */
	public boolean  login(String username,String userpass) throws Exception;
	/**
	 * 管理用户用户登录
	 * @param username 用户名
	 * @param userpass 密码
	 * @return
	 * @throws Exception
	 */
	public boolean  adminlogin(String adminname,String adminpass) throws Exception;
	/**
	 * 用户注册
	 * @param jbuserInfoVo
	 * @throws Exception
	 */
	public void register (JbuserInfoVo jbuserInfoVo)throws Exception;
	/**
	 * 根据用户名查询用户
	 * @param username
	 * @return 的是一个用户对象
	 * @throws Exception
	 */
	public JbUserifo ulogin(String username)throws Exception;
	/**
	 * 根据管理员用户名查询用户
	 * @param username
	 * @return 的是一个用户对象
	 * @throws Exception
	 */
	public Admin aulogin(String adminname)throws Exception;
	/**
	 * 修改用户信息
	 * 根据登录名获取登录ID，根据ID修改用户信息，并保存
	 * @throws Exception
	 */
	public void updateuser(String classinfo,int uid)throws Exception;
	/**
	 * 根基ID查询用户对象
	 */
	public JbUserifo seclectById(int uid) throws Exception;
	/**
	 * 保存班次记录信息
	 * @param jbClassinfor
	 * @throws Exception
	 */
	public void saveClassifo(JbClassinfor jbClassinfor) throws Exception;
	/**
	 * 修改上次登录时间
	 * @param lastLogin
	 * @param uid
	 * @throws Exception 
	 */
	public void updateloginTime(String lastLogin,int uid) throws Exception;
	/**
	 * 修改注销时间
	 * @param exittime
	 * @param uid
	 * @throws Exception
	 */
	public void updateExitTime(String exittime,int uid)throws Exception;
	/**
	 * 修改用户的姓名和密码
	 * @throws Exception
	 */
	 public void updateUserifo(JbUserifo user)throws Exception;
	/**
	 * 查询所有的用户信息
	 * @return
	 * @throws Exception
	 */
	public List<JbUserifo> selectAlljbUser()throws Exception;
	
	
	
	
}
