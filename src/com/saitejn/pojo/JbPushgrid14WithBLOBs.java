package com.saitejn.pojo;

public class JbPushgrid14WithBLOBs extends JbPushgrid14 {
    private String 运行期;

    private String 日增效;

    private String 折算年增效;

    public String get运行期() {
        return 运行期;
    }

    public void set运行期(String 运行期) {
        this.运行期 = 运行期 == null ? null : 运行期.trim();
    }

    public String get日增效() {
        return 日增效;
    }

    public void set日增效(String 日增效) {
        this.日增效 = 日增效 == null ? null : 日增效.trim();
    }

    public String get折算年增效() {
        return 折算年增效;
    }

    public void set折算年增效(String 折算年增效) {
        this.折算年增效 = 折算年增效 == null ? null : 折算年增效.trim();
    }
}