package com.saitejn.pojo;

public class JbPushgrid81 {
    private Integer 序号;

    private Double 全体对照样本;

    private Double 新样本;
    private String 审核情况;
    public String get审核情况() {
        return 审核情况;
    }

    public void set审核情况(String 审核情况) {
        this.审核情况 = 审核情况 == null ? null : 审核情况.trim();
    }

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public Double get全体对照样本() {
        return 全体对照样本;
    }

    public void set全体对照样本(Double 全体对照样本) {
        this.全体对照样本 = 全体对照样本;
    }

    public Double get新样本() {
        return 新样本;
    }

    public void set新样本(Double 新样本) {
        this.新样本 = 新样本;
    }
}