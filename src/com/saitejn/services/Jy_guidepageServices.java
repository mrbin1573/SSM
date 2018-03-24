package com.saitejn.services;

import java.util.List;

import com.saitejn.pojo.Adminguideifo;
import com.saitejn.pojo.JyAdminguideifo;
import com.saitejn.pojo.Messageleaving;

public interface Jy_guidepageServices {
	/**
	 * 前台指导文件查看
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public String showBefoFile(String filename)throws Exception;
	/**
	 * 查询所有的推送记录
	 * @return
	 * @throws Exception
	 */
	public List<JyAdminguideifo> getAllAdminGuideifo ()throws Exception;
	/**
	 * 查看历史记录
	 * @return
	 * @throws Exception
	 */
	public String showguidehis(int gid)throws Exception;
	/**
	 * 公司留言信息
	 * @param company
	 * @return
	 * @throws Exception
	 */
	public List<Messageleaving>selectMessageByConpany(String company)throws Exception;
	/**
	 * 用户未读消息数量
	 * @return
	 * @throws Exception
	 */
	public int selectMessageNumber(String company)throws Exception;
	

}
