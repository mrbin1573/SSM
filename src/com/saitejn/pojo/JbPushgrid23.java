package com.saitejn.pojo;

public class JbPushgrid23 {
    private Integer 序号;

    private Float 累计液氨产值;

    private Float 累计天然气费用;

    private Float 累计电费;

    private Float 累计效益;

    private Float 日均效益;
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

    public Float get累计液氨产值() {
        return 累计液氨产值;
    }

    public void set累计液氨产值(Float 累计液氨产值) {
        this.累计液氨产值 = 累计液氨产值;
    }

    public Float get累计天然气费用() {
        return 累计天然气费用;
    }

    public void set累计天然气费用(Float 累计天然气费用) {
        this.累计天然气费用 = 累计天然气费用;
    }

    public Float get累计电费() {
        return 累计电费;
    }

    public void set累计电费(Float 累计电费) {
        this.累计电费 = 累计电费;
    }

    public Float get累计效益() {
        return 累计效益;
    }

    public void set累计效益(Float 累计效益) {
        this.累计效益 = 累计效益;
    }

    public Float get日均效益() {
        return 日均效益;
    }

    public void set日均效益(Float 日均效益) {
        this.日均效益 = 日均效益;
    }
}