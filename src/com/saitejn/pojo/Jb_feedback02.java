package com.saitejn.pojo;

import java.util.ArrayList;
import java.util.List;


public class Jb_feedback02 {
		private int id;
		private int timid;
		private String passivevar;
		private List<Jb_feedback03> feedback03s = new ArrayList<Jb_feedback03>();
		private List<Jb_feedback05> feedback05s = new ArrayList<Jb_feedback05>();
		private String type;
		
		public int getTimid() {
			return timid;
		}
		public void setTimid(int timid) {
			this.timid = timid;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPassivevar() {
			return passivevar;
		}
		public void setPassivevar(String passivevar) {
			this.passivevar = passivevar;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<Jb_feedback03> getFeedback03s() {
			return feedback03s;
		}
		public void setFeedback03s(List<Jb_feedback03> feedback03s) {
			this.feedback03s = feedback03s;
		}
		public List<Jb_feedback05> getFeedback05s() {
			return feedback05s;
		}
		public void setFeedback05s(List<Jb_feedback05> feedback05s) {
			this.feedback05s = feedback05s;
		}
		
		
}
