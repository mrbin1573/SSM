package com.saitejn.pojo;

import java.util.Date;

/**
 * 建峰倒班表
 * @Jfclassinfo
 * @Description
 * @author 罗康元
 * @company 成都赛特工信科技有限公司
 * @date 2017-6-30
 */
public class Jfclassinfo {
	 private Integer cid;

	 private Date class_time;

	 private Integer morclass;

	 private Integer aftclass;

	private Integer eveclass;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Date getClass_time() {
		return class_time;
	}

	public void setClass_time(Date class_time) {
		this.class_time = class_time;
	}

	public Integer getMorclass() {
		return morclass;
	}

	public void setMorclass(Integer morclass) {
		this.morclass = morclass;
	}

	public Integer getAftclass() {
		return aftclass;
	}

	public void setAftclass(Integer aftclass) {
		this.aftclass = aftclass;
	}

	public Integer getEveclass() {
		return eveclass;
	}

	public void setEveclass(Integer eveclass) {
		this.eveclass = eveclass;
	}

	
}
