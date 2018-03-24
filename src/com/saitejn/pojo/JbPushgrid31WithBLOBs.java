package com.saitejn.pojo;

public class JbPushgrid31WithBLOBs extends JbPushgrid31 {
    private String 位号;

    private String 模型影响方向;

    public String get位号() {
        return 位号;
    }

    public void set位号(String 位号) {
        this.位号 = 位号 == null ? null : 位号.trim();
    }

    public String get模型影响方向() {
        return 模型影响方向;
    }

    public void set模型影响方向(String 模型影响方向) {
        this.模型影响方向 = 模型影响方向 == null ? null : 模型影响方向.trim();
    }
}