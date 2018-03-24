package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;

public class Jb_feedback05 {
	private int id;
	private String useractive;
	private String parName;
	private int supid;
	private List<String> uservar = new ArrayList<String>();
	
	public List<String> getUservar() {
		return uservar;
	}
	public void setUservar(List<String> uservar) {
		this.uservar = uservar;
	}
	private int parid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	public String getUseractive() {
		return useractive;
	}
	public void setUseractive(String useractive) {
		this.useractive = useractive;
	}
	public int getParid() {
		return parid;
	}
	public void setParid(int parid) {
		this.parid = parid;
	}
	public String getParName() {
		return parName;
	}
	public void setParName(String parName) {
		this.parName = parName;
	}
	
	
	
}
