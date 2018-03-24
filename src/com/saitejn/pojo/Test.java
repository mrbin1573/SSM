package com.saitejn.pojo;

public class Test {
    private Integer testid;

    private String testname;

    private Double 用户名;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname == null ? null : testname.trim();
    }

    public Double get用户名() {
        return 用户名;
    }

    public void set用户名(Double 用户名) {
        this.用户名 = 用户名;
    }
}