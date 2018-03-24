package com.saitejn.mapper;

import java.util.List;

import com.saitejn.pojo.Messageleaving;


/**
 * 管理员数据相关接口
 * @class AdminDataMapper.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-10-12
 */
public interface AdminDataMapper {
	//公司留言信息
	public List<Messageleaving>selectMessageByConpany(String company)throws Exception;
	//用户未读消息数量
	public int selectMessageNumber(String company)throws Exception;
	//用户未读消息内容
	public List<Messageleaving> selectMessageCount(String company)throws Exception;
	//根据消息ID获得消息
	public Messageleaving selectMessByid(int id)throws Exception;
	//根据ID修改消息状态
	public void updateMessByid() throws Exception;
	//修改表的审核情况
	public void updatejb_pushgrid_1_1(int id) throws Exception;
	//修改表的审核情况
	public void updatejb_pushgrid_1_2(int id) throws Exception;

}
