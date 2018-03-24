package com.saitejn.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.TestMapper;
import com.saitejn.pojo.Test;
import com.saitejn.services.TestServices;

/**
 * 测试接口实现类
 * @class TestServicesImpl.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-9-9
 */
public class TestServicesImpl implements TestServices {
	//注册TestMapper
	@Autowired
	private TestMapper testMapper;
	@Override
	public Test getTestById(int tid) throws Exception {
		
		return testMapper.selectByPrimaryKey(tid);
	}

}
