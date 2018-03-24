package com.saitejn.pojo;

public class JbPushgrid41 {
    private Integer 序号;

    private String 被动控制变量位号;

    private String 被动控制变量名;

    private String 相关变量位号;

    private String 相关变量名;
    private String 审核情况;
    public String get审核情况() {
        return 审核情况;
    }

    public void set审核情况(String 审核情况) {
        this.审核情况 = 审核情况 == null ? null : 审核情况.trim();
    }

    private String 相关变量影响方向;

    private String 相关变量控制类型;

    public Integer get序号() {
        return 序号;
    }

    public void set序号(Integer 序号) {
        this.序号 = 序号;
    }

    public String get被动控制变量位号() {
        return 被动控制变量位号;
    }

    public void set被动控制变量位号(String 被动控制变量位号) {
        this.被动控制变量位号 = 被动控制变量位号 == null ? null : 被动控制变量位号.trim();
    }

    public String get被动控制变量名() {
        return 被动控制变量名;
    }

    public void set被动控制变量名(String 被动控制变量名) {
        this.被动控制变量名 = 被动控制变量名 == null ? null : 被动控制变量名.trim();
    }

    public String get相关变量位号() {
        return 相关变量位号;
    }

    public void set相关变量位号(String 相关变量位号) {
        this.相关变量位号 = 相关变量位号 == null ? null : 相关变量位号.trim();
    }

    public String get相关变量名() {
        return 相关变量名;
    }

    public void set相关变量名(String 相关变量名) {
        this.相关变量名 = 相关变量名 == null ? null : 相关变量名.trim();
    }

    public String get相关变量影响方向() {
        return 相关变量影响方向;
    }

    public void set相关变量影响方向(String 相关变量影响方向) {
        this.相关变量影响方向 = 相关变量影响方向 == null ? null : 相关变量影响方向.trim();
    }

    public String get相关变量控制类型() {
        return 相关变量控制类型;
    }

    public void set相关变量控制类型(String 相关变量控制类型) {
        this.相关变量控制类型 = 相关变量控制类型 == null ? null : 相关变量控制类型.trim();
    }
}