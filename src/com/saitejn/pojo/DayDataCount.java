package com.saitejn.pojo;

import java.sql.Timestamp;

public class DayDataCount {
	
	private Timestamp data_time;
	
	private Double time_nh3_yield;
	
	private Double time_electric;
	
	private Double time_raw_gas_consume;
	
	public Timestamp getData_time() {
		return data_time;
	}
	public void setData_time(Timestamp data_time) {
		this.data_time = data_time;
	}
	public Double getTime_nh3_yield() {
		return time_nh3_yield;
	}
	public void setTime_nh3_yield(Double time_nh3_yield) {
		this.time_nh3_yield = time_nh3_yield;
	}
	public Double getTime_electric() {
		return time_electric;
	}
	public void setTime_electric(Double time_electric) {
		this.time_electric = time_electric;
	}
	public Double getTime_raw_gas_consume() {
		return time_raw_gas_consume;
	}
	public void setTime_raw_gas_consume(Double time_raw_gas_consume) {
		this.time_raw_gas_consume = time_raw_gas_consume;
	}
	public DayDataCount(Timestamp data_time, Double time_nh3_yield,
			Double time_electric, Double time_raw_gas_consume) {
		super();
		this.data_time = data_time;
		this.time_nh3_yield = time_nh3_yield;
		this.time_electric = time_electric;
		this.time_raw_gas_consume = time_raw_gas_consume;
	}
	

}
