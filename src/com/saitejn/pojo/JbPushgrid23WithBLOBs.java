package com.saitejn.pojo;

public class JbPushgrid23WithBLOBs extends JbPushgrid23 {
    private String 样本类;

    private String 日增效;

    private String 折算年增效;

    public String get样本类() {
        return 样本类;
    }

    public void set样本类(String 样本类) {
        this.样本类 = 样本类 == null ? null : 样本类.trim();
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