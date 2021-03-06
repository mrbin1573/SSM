﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>成都赛特优化节能平台</title>
<!--时间控件-->
<link rel="stylesheet" type="text/css" href="stylesheets/normalize.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/stylesheet.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/github-light.css" media="screen">
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<script type="text/javascript" src="jedate/jedate.js"></script>
<script type="text/javascript" src="js/jquery.blockUI.js"></script>
<link type="text/css" rel="stylesheet" href="jedate/skin/jedate.css">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">
		<img alt="" id="loading" src="images/ajax_soon.gif" style="display: none">
        <div style="padding-top:5px;background:#fff" class="tab-content navbar-fixed-top print_hidden">
            <!--右边二级菜单-->
                <ul id="myTab" class="nav nav-tabs menu_rihgt">
                   	<li class="active"><a class="31" href="to_show_day_data.action" >日 报 表</a></li>
                   	<li><a href="do_select_Mouth.action" >月 报 表</a></li>
                    <li><a href="do_select_Quarter.action">季度报表</a></li>
                    <li><a href="do_select_Year.action">年度报表</a></li>
                </ul>
                <!--右边二级菜单结束-->
                <div class="tab-content menu-third-content">
                    <!--日报表三级菜单-->
                    <div class="tab-pane fade in active">
                        <!--日报表--按班查看---按日查看菜单------>
                        <ul id="myTab" class="nav nav-tabs menu_rihgt_after">
                            <li class="active">
                                <a href="#three_c_31" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;按日查看</a>
                            </li>
                            <li>
                                <a href="#three_c_32" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;按班查看</a>
                            </li>
                            <div id="message"></div>
                        </ul>
                    </div>
				</div>
        </div>
             <!--能耗分期日考核日报表--->
                   	<div class="tab-content menu_third_page">
	                        <c:if test="${fun:length(dayList) > 0}">
	                            <!-----------------------按日查看------------------>
	                            <div class="tab-pane fade in active menu-third" id="three_c_31">
	                                <!-----------------------打印内容------------------>
	                                <div  >
	                                    <center>
	                                        <div class="fmy">
	                                            <h3>
	                                                <div class="col-md-5 col-sm-5 col-xs-5  print_hidden">
	                                                	<div class="chart_title_l">
			                                                <form action="" >
			                                                      <span class="date_title">考核时间:</span>
			                                                      <input name="date_begin" class="datainp" id="indate_day_day1" type="text"  value="${edate_begin}"  readonly>
			                                                        <span class="date_title">-</span>
			                                                      <input name="date_end"  class="datainp" id="indate_day_day2" type="text"  value="${edate_end}"  readonly>
			                                                      <input type="button" class="look"id="day_day_show" value="查看">
															</form>
														</div>
	                                                </div>
	                                                <div class="col-md-5 col-sm-5 col-xs-5">
	                                                	<div class="chart_title_l"  >日报表--按日查看</div>
	                                                </div>
													<!--打印按钮-->
	                                                <div class="col-md-2 col-sm-2 col-xs-2 print_hidden">
	                                                	<div class="chart_title_r">
	                                                        <!-- <img width="30px" src="images/print.png">
	                                                        <input class="btn_print" type="button"  onclick="javascript:window.print();" value="打印" />  -->
	                                                	</div>
	                                                </div>
	                                            </h3>
	                                        </div>
	                                        <!--固定表头-->
	                                         
	                                        <table class="table tbl_hd_dd">
	                                            <tr>
	                                                <th>时间段</th>
	                                                <th>日氨产量(t)</th>
	                                                <th>日耗电(kWh)</th>
	                                                <th>日耗气(Nm<sup>3</sup>)</th>
	                                                <th>小时氨产量(t/h)</th>
	                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
	                                                <th>吨氨电耗(kWh/tNH<sub>3</sub>)</th>
	                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
	                                                <th>样本数</th>
	                                            </tr>
	                                             
	                                            	<c:forEach var="day" items="${dayList}" varStatus="st">
														<c:if test="${st.index<=0  }">
	                                            		<tr class="hiden_tr">
			                                                <td><fmt:formatDate value="${day.data_time}" pattern="yyyy/MM/dd"/></td>
			                                                
			                                                <td><fmt:formatNumber value="${day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
			                                                <td><fmt:formatNumber value="${day.time_electric_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_raw_gas_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_nh3_yield/day.orig_id*6}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${1.2143*day.time_raw_gas_consume/day.time_nh3_yield+day.time_electric_consume/day.time_nh3_yield*0.1229}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_electric_consume/day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_raw_gas_consume/day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                            	<td><fmt:formatNumber value="${day.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
			                                            </tr>
			                                            </c:if>
	                                            	</c:forEach>
	                                        </table>
	                                        <!--表格和折线图-->
	                                         
	                                        <table id="energy_day"  class="table">
	                                            <tr>
	                                                <th>时间段</th>
	                                                <th>日氨产量(t)</th>
	                                                <th>日耗电(kWh)</th>
	                                                <th>日耗气(Nm<sup>3</sup>)</th>
	                                                <th>小时氨产量(t/h)</th>
	                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
	                                                <th>吨氨电耗(kWh/tNH<sub>3</sub>)</th>
	                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
	                                                <th>样本数</th>
	                                            </tr>
	                                             
	                                            	<c:forEach var="day" items="${dayList}">
	                                            		<tr>
	                                            		 <c:if test="${day.data_time != null}">
			                                                <td><fmt:formatDate value="${day.data_time}" pattern="yyyy/MM/dd"/></td>
			                                                </c:if>
			                                                 <c:if test="${day.data_time == null}">
	                                                	     <td>合计</td>
	                                                         </c:if>
			                                                <td><fmt:formatNumber value="${day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
			                                                <td><fmt:formatNumber value="${day.time_electric_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_raw_gas_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <c:if test="${day.orig_id ==0}">
	                                               				<td>--</td>
	                                               				<td>--</td>
	                                               				<td>--</td>
	                                               				<td>--</td>
	                                               				<td>--</td>
	                                                		</c:if>
	                                                		<c:if test="${day.orig_id !=0}">
			                                                <td><fmt:formatNumber value="${day.time_nh3_yield/day.orig_id*6}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${1.2143*day.time_raw_gas_consume/day.time_nh3_yield+day.time_electric_consume/day.time_nh3_yield*0.1229}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_electric_consume/day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.time_raw_gas_consume/day.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                            	<td><fmt:formatNumber value="${day.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
			                                            	</c:if>
			                                            </tr>
			                                            
	                                            	</c:forEach>
	                                        </table>
	                                       
	                                        <!--折线图-->
	                                        <button class="fresh">更新图表</button>
	                                        <div id="lineChart_day">
	                                            <center>
	                                                <!-- <h3>吨氨综合消耗考核走势图</h3> --><br>
	                                                <div class="line-chart" id="container_day"></div>
	                                            </center>
	                                        </div>
	                                        <div id="lineChart_day_1">
	                                            <center>
	                                                <!-- <h3>吨氨综合消耗考核走势图</h3> --><br>
	                                                <div class="line-chart" id="container_day_1"></div>
	                                            </center>
	                                        </div>
	                                        <div id="lineChart_day_2">
	                                            <center>
	                                                <!-- <h3>吨氨综合消耗考核走势图</h3> --><br>
	                                                <div class="line-chart" id="container_day_2"></div>
	                                            </center>
	                                        </div>
	                                   
		                                    <c:if test="${fun:length(dayList) <= 0}">
											       <h1>该时间段暂无数据</h1>
											 </c:if>
	                                    
	                                    
	                                    </center>
	                                </div>
	                                
	                                
	                                <br>
	                                <br>
	                                <br>
	
	                            </div>
	                            <!-----------------------按班查看------------------->
	                            <div class="tab-pane fade menu-third" id="three_c_32">
	                                <div >
	                                    <center>
	                                        <div class="fmy">
	                                            <h3>
	                                                <div class="col-md-5 col-sm-5 col-xs-5">
	                                                	<div class="chart_title_l">
	                                                	 <form action="to_show_day_data.action" method="post">
	                                                    <span class="date_title">考核时间:</span>
	                                                      <input name="date_begin" class="datainp" id="indate_day_ban1" type="text" value="${edate_begin}"  readonly>
	                                                      <span class="date_title">-</span>
	                                                      <input name="date_end"  class="datainp" id="indate_day_ban2" type="text" value="${edate_end}"  readonly>
	                                                       <input type="button" class="look" id="day_class_show" value="查看">
	                                                       </form>
														</div>
	                                                </div>
	                                                <div class="col-md-5 col-sm-5 col-xs-5"><div class="chart_title_l" >日报表--按班查看</div></div>
	                                                
	                                                <!--打印按钮-->
	                                                <!--打印按钮-->
	                                                <div class="col-md-2 col-sm-2 col-xs-2 print_hidden">
	                                                	<div class="chart_title_r">
	                                                        <!-- <img width="30px" src="images/print.png">
	                                                        <input class="btn_print" type="button"  onclick="javascript:window.print();" value="打印" />  -->
	                                                	</div>
	                                                </div>
	                                            </h3>
	                                        </div>
	                                        <!--固定表头-->
	                                         
	                                        <table class="table tbl1 tbl_hd_db">
	                                            <tr class="" id="${pageContext.request.contextPath}/to_show_day_data_ajax">
	                                                <th>时间段</th>
	                                                <th>班次</th>
	                                                <th>班氨产量(t)</th>
	                                                <th>班耗电(kWh)</th>
	                                                <th>班耗气(Nm<sup>3</sup>)</th>
	                                                <th>小时氨产量(t/h)</th>
	                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
	                                                <th>吨氨电耗(kWh/tNH<sub>3</sub>)</th>
	                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
	                                                <th>样本数</th>
	                                            </tr>
	                                             <c:forEach var="mon" items="${monList}" varStatus="st">
														<c:if test="${st.index<=0  }">
	                                           				<tr class="hiden_tr">
				                                                 <td><fmt:formatDate value="${mon.data_time}" pattern="yyyy/MM/dd"/></td>
				                                                 <c:if test="${mon.classNumber==1}">
					                                                <td>
					                                              		白班(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber>)
					                                                </td>
				                                                </c:if>
				                                                <c:if test="${mon.classNumber==2}">
					                                                <td>
					                                              		夜班(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber>)
					                                                </td>
				                                                </c:if>
				                                                
				                                                <td><fmt:formatNumber value="${mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2"  ></fmt:formatNumber>   </td>
				                                                <td><fmt:formatNumber value="${mon.time_electric_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                                <td><fmt:formatNumber value="${mon.time_raw_gas_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                                <td><fmt:formatNumber value="${mon.time_nh3_yield/mon.orig_id*6}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                                <td><fmt:formatNumber value="${1.2143*mon.time_raw_gas_consume/mon.time_nh3_yield+mon.time_electric_consume/mon.time_nh3_yield*0.1229}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                                <td><fmt:formatNumber value="${mon.time_electric_consume/mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                                <td><fmt:formatNumber value="${mon.time_raw_gas_consume/mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
				                                               
				                                           	
				                                            	<td><fmt:formatNumber value="${mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
				                                            
				                                            
				                                            	
				                                            	
				                                            </tr >
			                                            </c:if>
	                                              </c:forEach>
	                                            
	                                        </table>
	                                        <table id="energy_day_ban"  class="table tbl1">
	                                            <tr class="" id="${pageContext.request.contextPath}/to_show_day_data_ajax">
	                                                <th>时间段</th>
	                                                <th>班次</th>
	                                                <th>班氨产量(t)</th>
	                                                <th>班耗电(kWh)</th>
	                                                <th>班耗气(Nm<sup>3</sup>)</th>
	                                                <th>小时氨产量(t/h)</th>
	                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
	                                                <th>吨氨电耗(kWh/tNH<sub>3</sub>)</th>
	                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
	                                                <th>样本数</th>
	                                            </tr>
	                                             <c:forEach var="mon" items="${monList}">
	                                           
	                                         
	                                            <tr>
	                                            	 <c:if test="${mon.data_time != null}">
	                                                 <td><fmt:formatDate value="${mon.data_time}" pattern="yyyy/MM/dd"/></td>
	                                                 </c:if>
	                                                <c:if test="${mon.data_time == null}">
	                                                	<td>合计</td>
	                                                </c:if>
	                                                 <c:if test="${mon.classNumber==1}">
	                                                  <c:if test="${mon.orig_id !=0}">
	                                                 <td>
	                                              		白班(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber>)
	                                                </td>
	                                                 </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>
	                                              		白班(缺失)
	                                                </td>
	                                                 </c:if>
	                                                </c:if>
	                                                <c:if test="${mon.classNumber==2}">
	                                                <c:if test="${mon.orig_id !=0}">
	                                                <td>
	                                              		夜班(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber>)
	                                                </td>
	                                                 </c:if>
	                                                 <c:if test="${mon.orig_id ==0}">
	                                                <td>
	                                              		夜班(缺失)
	                                                </td>
	                                                 </c:if>
	                                                </c:if>
	                                                <c:if test="${mon.classNumber==3}">
	                                                <td>
	                                              		晚班
	                                                </td>
	                                                </c:if>
	                                                  <c:if test="${mon.classNumber==11}">
	                                                <td>
	                                              		1 班
	                                                </td>
	                                                </c:if>
	                                                  <c:if test="${mon.classNumber==12}">
	                                                <td>
	                                              		2 班
	                                                </td>
	                                                </c:if>
	                                                  <c:if test="${mon.classNumber==13}">
	                                                <td>
	                                              		3 班
	                                                </td>
	                                                </c:if>
	                                                  <c:if test="${mon.orig_id !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2"  ></fmt:formatNumber>   </td>
	                                                 </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                  <c:if test="${mon.orig_id !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_electric_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                 </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                  <c:if test="${mon.orig_id !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_raw_gas_consume}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                 </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                <c:if test="${mon.orig_id !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_nh3_yield/mon.orig_id*6}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                 </c:if>
	                                                 <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                 </c:if>
	                                                <c:if test="${mon.orig_id !=0}">
	                                                 <c:if test="${mon.time_nh3_yield !=0}">
	                                                <td><fmt:formatNumber value="${1.2143*mon.time_raw_gas_consume/mon.time_nh3_yield+mon.time_electric_consume/mon.time_nh3_yield*0.1229}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                 <c:if test="${mon.time_nh3_yield ==0}">
	                                                <td>0.0</td>
	                                                </c:if>
	                                                </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                 <c:if test="${mon.orig_id !=0}">
	                                                  <c:if test="${mon.time_nh3_yield !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_electric_consume/mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                 <c:if test="${mon.time_nh3_yield ==0}">
	                                                <td>0.0</td>
	                                                </c:if>
	                                                </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                 <c:if test="${mon.orig_id !=0}">
	                                                  <c:if test="${mon.time_nh3_yield !=0}">
	                                                <td><fmt:formatNumber value="${mon.time_raw_gas_consume/mon.time_nh3_yield}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                 <c:if test="${mon.time_nh3_yield ==0}">
	                                                <td>0.0</td>
	                                                </c:if>
	                                                </c:if>
	                                                <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                           	    <c:if test="${mon.orig_id !=0}">
	                                            	<td><fmt:formatNumber value="${mon.orig_id}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
	                                            	 </c:if>
	                                            	 <c:if test="${mon.orig_id ==0}">
	                                                <td>--</td>
	                                                </c:if>
	                                            </tr >
	                                              </c:forEach>
	                                            
	                                        </table>
	                                        <!--走势图-->
	                                            <div id="lineChart_ban_1">
	                                                <center>
	                                                    <br>
	                                                    <div class="line-chart" id="container_day_ban_1"></div>
	                                                </center>
	                                            </div>
	                                            <div id="lineChart_ban_2">
	                                                <center>
	                                                    <br>
	                                                    <div class="line-chart" id="container_day_ban_2"></div>
	                                                </center>
	                                            </div>
	                                            <div id="lineChart_ban_3">
	                                                <center>
	                                                    <br>
	                                                    <div class="line-chart" id="container_day_ban_3"></div>
	                                                </center>
	                                            </div>
	                                            
	                                      
	                                        <c:if test="${fun:length(monList) <= 0}">
	                                        <h1>该时间段暂无数据</h1>
	                                        </c:if>
	                                    </center>
	                                </div>
	                                <br>
	                                <br>
	                                <br>
	                            </div>
	                         </c:if>
	                         <c:if test="${fun:length(dayList) <= 0}">
					
								<center>
									该时段暂无数据！
								
								</center>
				
							</c:if>
                        </div>
                 
                  
	


</body>
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/index.js"></script>
<script src="js/bootstrap.min.js"></script>

<!--折线图-->
<script type="text/javascript" src="js/highcharts1.js"></script>
<script type="text/javascript" src="js/exporting1.js"></script>
<script type="text/javascript" src="js/data_jb.js"></script><!--折线图数据位置-->

<script>
	

	/*时间控件*/
	/*日报表-日*/
	jeDate({
		dateCell : "#indate_day_day1", //isinitVal:true,
		format : "YYYY-MM-DD",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	})
	jeDate({
		dateCell : "#indate_day_day2", //isinitVal:true,
		format : "YYYY-MM-DD",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	});

	/*日报表-班*/
	jeDate({
		dateCell : "#indate_day_ban1", //isinitVal:true,
		format : "YYYY-MM-DD",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	});
	jeDate({
		dateCell : "#indate_day_ban2", //isinitVal:true,
		format : "YYYY-MM-DD",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	});

	/* 统计打印次数 */
	$(".btn_print").click(function() {
		var val = 1;
		if (val != "") {
			var url = "${pageContext.request.contextPath}/CountPrintNumber";
			var args = {
				"printnumber" : val,
				"time" : new Date()
			};
			$.post(url, args, function(data) {
				$("#message").html(data);
			});
		}
	});
</script>
</html>