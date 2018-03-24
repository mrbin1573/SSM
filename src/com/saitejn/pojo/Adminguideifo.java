package com.saitejn.pojo;

public class Adminguideifo {
    private Integer id;

    private String upperson;

    private String uptime;

    private String newname;

    private String oldname;

    private String cheactype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUpperson() {
        return upperson;
    }

    public void setUpperson(String upperson) {
        this.upperson = upperson == null ? null : upperson.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname == null ? null : newname.trim();
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    public String getCheactype() {
        return cheactype;
    }

    public void setCheactype(String cheactype) {
        this.cheactype = cheactype == null ? null : cheactype.trim();
    }
}