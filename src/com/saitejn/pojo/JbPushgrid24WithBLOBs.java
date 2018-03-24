package com.saitejn.pojo;

public class JbPushgrid24WithBLOBs extends JbPushgrid24 {
    private String 样本类;

    private String 氨产量改变量;

    private String 气耗改变量;

    private String 电耗改变量;

    public String get样本类() {
        return 样本类;
    }

    public void set样本类(String 样本类) {
        this.样本类 = 样本类 == null ? null : 样本类.trim();
    }

    public String get氨产量改变量() {
        return 氨产量改变量;
    }

    public void set氨产量改变量(String 氨产量改变量) {
        this.氨产量改变量 = 氨产量改变量 == null ? null : 氨产量改变量.trim();
    }

    public String get气耗改变量() {
        return 气耗改变量;
    }

    public void set气耗改变量(String 气耗改变量) {
        this.气耗改变量 = 气耗改变量 == null ? null : 气耗改变量.trim();
    }

    public String get电耗改变量() {
        return 电耗改变量;
    }

    public void set电耗改变量(String 电耗改变量) {
        this.电耗改变量 = 电耗改变量 == null ? null : 电耗改变量.trim();
    }
}