package com.saitejn.pojo;

public class Fileupifo {
    private Integer filupid;

    private String uptime;

    private String upname;

    private String upperson;

    private String filtype;

    private String fileename;

    public Integer getFilupid() {
        return filupid;
    }

    public void setFilupid(Integer filupid) {
        this.filupid = filupid;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getUpname() {
        return upname;
    }

    public void setUpname(String upname) {
        this.upname = upname == null ? null : upname.trim();
    }

    public String getUpperson() {
        return upperson;
    }

    public void setUpperson(String upperson) {
        this.upperson = upperson == null ? null : upperson.trim();
    }

    public String getFiltype() {
        return filtype;
    }

    public void setFiltype(String filtype) {
        this.filtype = filtype == null ? null : filtype.trim();
    }

    public String getFileename() {
        return fileename;
    }

    public void setFileename(String fileename) {
        this.fileename = fileename == null ? null : fileename.trim();
    }
}