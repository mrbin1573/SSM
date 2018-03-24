package com.saitejn.services.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.JbUserifoMapper;
import com.saitejn.mapper.UserCustomerMapper;
import com.saitejn.pojo.Admin;
import com.saitejn.pojo.JbClassinfor;
import com.saitejn.pojo.JbUserifo;
import com.saitejn.pojo.JbuserInfoVo;
import com.saitejn.services.UserServices;

/**
 * 用户登录接口实现类
 * @class UserServicesImpl.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-14
 */
public class UserServicesImpl  implements UserServices{
	@Autowired
	private UserCustomerMapper userCustomerMapper;
	@Autowired
	private JbUserifoMapper jbUserifoMapper;
	@Override
	public boolean login(String u_loginname, String uLoginpass) throws Exception {
	    
		JbUserifo jb = userCustomerMapper.selectByName(u_loginname);
		
		if(jb != null){
			if(jb.getUloginname().equals(u_loginname) && jb.getUloginpass().equals(uLoginpass))
				return true;
		}
		return false;
	}

	@Override
	public void register(JbuserInfoVo jbuserInfoVo) throws Exception {
		userCustomerMapper.insertUser(jbuserInfoVo);
	}

	@Override
	public JbUserifo ulogin(String username) throws Exception {
		return userCustomerMapper.selectByName(username);
	}

	@Override
	public void updateuser(String classinfo, int uid) throws Exception {
		userCustomerMapper.updateUser(classinfo, uid);
		
	}

	@Override
	public JbUserifo seclectById(int uid) throws Exception {
		
		return jbUserifoMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void saveClassifo(JbClassinfor jbClassinfor) throws Exception {
		userCustomerMapper.saveClassifo(jbClassinfor);
	}

	@Override
	public void updateloginTime(String lastLogin, int uid)throws Exception {
		userCustomerMapper.updateloginTime(lastLogin, uid);
		
	}

	@Override
	public boolean adminlogin(String adminname, String adminpass)
			throws Exception {
        Admin admin = userCustomerMapper.selectByAdminName(adminname);
		
		if(admin != null){
			if(admin.getAdminname().equals(adminname) && admin.getAdminpass().equals(adminpass))
				return true;
		}
		return false;
		
	}

	@Override
	public Admin aulogin(String adminname) throws Exception {
		// TODO Auto-generated method stub
		return userCustomerMapper.selectByAdminName(adminname);
	}

	

	@Override
	public void updateExitTime(String exittime, int uid) throws Exception {
		userCustomerMapper.updateExitTime(exittime, uid);
		
	}

	@Override
	public List<JbUserifo> selectAlljbUser() throws Exception {
		// TODO Auto-generated method stub
		return userCustomerMapper.selectAlljbUser();
	}

	@Override
	public void updateUserifo(JbUserifo user) throws Exception {
		userCustomerMapper.updateUserifo(user);
		
	}

	
}
