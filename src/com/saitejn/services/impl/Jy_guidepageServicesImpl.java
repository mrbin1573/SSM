package com.saitejn.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.saitejn.mapper.JyAdminguideifoMapper;
import com.saitejn.mapper.JyRawdataHandle1CustomerMapper;
import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.JyAdminguideifo;
import com.saitejn.pojo.Messageleaving;
import com.saitejn.services.Jy_guidepageServices;

public class Jy_guidepageServicesImpl implements Jy_guidepageServices {
	@Autowired
	private JyRawdataHandle1CustomerMapper jyRawdataHandle1CustomerMapper;
	@Autowired
	private JyAdminguideifoMapper jyAdminguideifoMapper;
	@Override
	public String showBefoFile(String filename) throws Exception {
		// TODO Auto-generated method stub
		return jyRawdataHandle1CustomerMapper.BeforFileShow(filename);
	}
	@Override
	public List<JyAdminguideifo> getAllAdminGuideifo() throws Exception {
		// TODO Auto-generated method stub
		return jyRawdataHandle1CustomerMapper.getAllAdminGuideifo();
	}
	@Override
	public String showguidehis(int gid) throws Exception {
		JyAdminguideifo adminguideifo = jyAdminguideifoMapper.selectByid(gid);
		String name = adminguideifo.getNewname();
		String guidename = "/pic/guide/"+name;
		return guidename;
	}
	@Override
	public List<Messageleaving> selectMessageByConpany(String company)
			throws Exception {
		// TODO Auto-generated method stub
		return jyAdminguideifoMapper.selectMessageByConpany(company);
	}
	@Override
	public int selectMessageNumber(String company) throws Exception {
		// TODO Auto-generated method stub
		return jyAdminguideifoMapper.selectMessageNumber(company);
	}

}
