package com.saitejn.pojo;

public class JbPushgrid11WithBLOBs extends JbPushgrid11 {
    private String 运行期间;

    private String 样本数;

    public String get运行期间() {
        return 运行期间;
    }

    public void set运行期间(String 运行期间) {
        this.运行期间 = 运行期间 == null ? null : 运行期间.trim();
    }

    public String get样本数() {
        return 样本数;
    }

    public void set样本数(String 样本数) {
        this.样本数 = 样本数 == null ? null : 样本数.trim();
    }
}