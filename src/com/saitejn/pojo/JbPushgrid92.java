package com.saitejn.pojo;

public class JbPushgrid92 {
    private Integer 序号;

    private Float 控制下限;

    private Float 控制上限;
    private String 审核情况;
    public String get审核情况() {
        return 审核情况;
    }

    public void set审核情况(String 审核情况) {
        this.审核情况 = 审核情况 == null ? null : 审核情况.trim();
    }

    private Integer 变量控制类型;

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public Float get控制下限() {
        return 控制下限;
    }

    public void set控制下限(Float 控制下限) {
        this.控制下限 = 控制下限;
    }

    public Float get控制上限() {
        return 控制上限;
    }

    public void set控制上限(Float 控制上限) {
        this.控制上限 = 控制上限;
    }

    public Integer get变量控制类型() {
        return 变量控制类型;
    }

    public void set变量控制类型(Integer 变量控制类型) {
        this.变量控制类型 = 变量控制类型;
    }
}