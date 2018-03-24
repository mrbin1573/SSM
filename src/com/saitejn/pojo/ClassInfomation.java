package com.saitejn.pojo;

import java.util.Date;

/**
 * 分班查看情况
 * @class ClassInfomation.java
 * @Description:
 * @author:罗康元
 * Company:赛特工信科技有限公司
 * @date :2016-10-4
 */
public class ClassInfomation {
	private Date date_time;//时间
	private MonClassInfo monClassInfo;//早班
	private AftClassInfo aftClassInfo;//中班
	private EveClassInfo eveClassInfo;//晚班
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public MonClassInfo getMonClassInfo() {
		return monClassInfo;
	}
	public void setMonClassInfo(MonClassInfo monClassInfo) {
		this.monClassInfo = monClassInfo;
	}
	public AftClassInfo getAftClassInfo() {
		return aftClassInfo;
	}
	public void setAftClassInfo(AftClassInfo aftClassInfo) {
		this.aftClassInfo = aftClassInfo;
	}
	public EveClassInfo getEveClassInfo() {
		return eveClassInfo;
	}
	public void setEveClassInfo(EveClassInfo eveClassInfo) {
		this.eveClassInfo = eveClassInfo;
	}
	

}
