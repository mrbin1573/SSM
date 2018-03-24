package com.saitejn.pojo;

public class JbPushgrid21 {
    private Integer 序号;

    private Float 优类样本;

    private Float 最佳模式样本;

    private Float 全体样本;

    private String 统计量;
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

    public Float get优类样本() {
        return 优类样本;
    }

    public void set优类样本(Float 优类样本) {
        this.优类样本 = 优类样本;
    }

    public Float get最佳模式样本() {
        return 最佳模式样本;
    }

    public void set最佳模式样本(Float 最佳模式样本) {
        this.最佳模式样本 = 最佳模式样本;
    }

    public Float get全体样本() {
        return 全体样本;
    }

    public void set全体样本(Float 全体样本) {
        this.全体样本 = 全体样本;
    }

    public String get统计量() {
        return 统计量;
    }

    public void set统计量(String 统计量) {
        this.统计量 = 统计量 == null ? null : 统计量.trim();
    }
}