﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta charset="utf-8">
<title>成都赛特优化节能平台</title>
<link rel="stylesheet" type="text/css" href="stylesheets/normalize.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/stylesheet.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/github-light.css" media="screen">
<link rel="stylesheet" type="text/css" href="jedate/skin/jedate.css">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/index.css" type="text/css">
</head>

<body onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">
	<div style="padding-top:5px;background:#fff" class="tab-content navbar-fixed-top print_hidden">
		<ul id="myTab" class="nav nav-tabs menu_rihgt">
			<%--<li ><a class="31" href="jf_loadDayData.action">日 报 表</a></li>
			--%><li class="active"><a href="jf_loadMouthData.action">月 报 表</a></li>
			<%--<li><a href="jf_loadQuarterData.action">季度报表</a></li>
			<li><a href="jf_loadYearData.action">年度报表</a></li>
		--%></ul>
		<div class="tab-content menu-third-content ">
			<div class="tab-pane fade in active">
				<ul id="myTab" class="nav nav-tabs menu_rihgt_after">
					<li class="active"><a href="#three_c_31" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;按日查看</a></li>
					<li><a href="#three_c_32" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;按班查看</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--能耗分期日考核日报表--->
	<c:if test="${fun:length(mouthList) > 0}">
	<div class="tab-content menu_third_page">
		<!-----------------------按日查看------------------>
		<div class="tab-pane fade in active menu-third" id="three_c_31">
			<!-----------------------打印内容------------------>
			<div id="printTable">
				<center>
					<div class="fmy">
						<h3>
							<div class="col-md-5 col-sm-5 col-xs-5  print_hidden">
								<div class="chart_title_l">
									<form method="post">
										<span class="date_title">考核时间:</span>
										 <input name="mouth_date_begin" class="datainp" id="indate_month_day1" type="text" value="${edate_begin}" placeholder="选择日期" readonly>
										  <input type="button" id="month_day_show" class="look" value="查看">
									</form>
								</div>
							</div>
							<div class="col-md-5 col-sm-5 col-xs-5">
								<div class="chart_title_l">月报表--按日查看</div>
							</div>
							<!--打印按钮-->
							<div class="col-md-2 print_hidden">
						</h3>
					</div>

					<!--固定表头-->
					<table class="table tbl_hd_md">
						<tr>
							<th>时间段</th>
							<th>日氨产量<br>(t)</th>
							<th>日驰放气折氨量<br>(t)</th>
							<th>日天然气耗<br>(Nm<sup>3</sup>)</th>
							<th>日蒸汽耗<br>(折标煤)(kgce)</th>
							<th>日氨产量<br>(含驰放气折算)(t)</th>
							
							<th>小时氨产量<br>(含驰放气折算)(t/h)</th>
							<th>吨氨天然气耗<br>(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
							
							<th>吨氨综合消耗<br>(kgce/tNH<sub>3</sub>)</th>
							<th>样本数</th>
						</tr>
						
						<c:forEach var="day" items="${mouthList}" varStatus="st">
							<c:if test="${st.index <= 0}">
						<tr class="hiden_tr">
						<c:if test="${day.data_time != null}">
							<td><fmt:formatDate value="${day.data_time}" pattern="yyyy/MM/dd" /></td>
						</c:if>
						<c:if test="${day.data_time == null}">
							<td>合计</td>
						</c:if>
							<td><fmt:formatNumber value="${day.time_FIQ162+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.time_purge_nh3 + 0.0001}" pattern="##.###" minFractionDigits="3"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.time_FIQ203 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.time_steam_coal + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							
							<td><fmt:formatNumber value="${day.time_NH3/day.orig_id * 6 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.time_FIQ203/day.time_purge_nh3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							
							<td><fmt:formatNumber value="${(day.time_FIQ203/day.time_NH3)*1.2143+day.time_steam_coal + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
							<td><fmt:formatNumber value="${day.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber></td>
						</tr>
						</c:if>
						</c:forEach>
						
					</table>
					<!--表格和折线图-->
					<table id="energy_month_day" class="table">
						<tr>
							<th>时间段</th>
							<th>日氨产量<br>(t)</th>
							<th>日驰放气折氨量<br>(t)</th>
							<th>日天然气耗<br>(Nm<sup>3</sup>)</th>
							<th>日蒸汽耗<br>(折标煤)(kgce)</th>
							<th>日氨产量<br>(含驰放气折算)(t)</th>
							
							<th>小时氨产量<br>(含驰放气折算)(t/h)</th>
							<th>吨氨天然气耗<br>(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
							
							<th>吨氨综合消耗<br>(kgce/tNH<sub>3</sub>)</th>
							<th>样本数</th>
						</tr>
						<c:if test="${mouthList !=null}">
							<c:forEach var="day" items="${mouthList}" varStatus="st">
								<tr  <c:if test="${(day.time_FIQ162 > 6000 || day.time_FIQ162 < 0 ) && st.index != st.count-1}"> style = "color: blue"</c:if>>
									<c:if test="${day.data_time != null}">
										<td><fmt:formatDate value="${day.data_time}"pattern="yyyy/MM/dd" /></td>
									</c:if>
									<c:if test="${day.data_time == null}">
										<td>合计</td>
									</c:if>
									<td><fmt:formatNumber value="${day.time_FIQ162+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.time_purge_nh3 + 0.0001}" pattern="##.###" minFractionDigits="3"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.time_FIQ203 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.time_steam_coal + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									
									<td><fmt:formatNumber value="${day.time_NH3/day.orig_id * 6 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.time_FIQ203/day.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									
									<td><fmt:formatNumber value="${(day.time_FIQ203/day.time_NH3)*1.2143+day.time_steam_coal/day.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									<td><fmt:formatNumber value="${day.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber></td>
								</tr>
							</c:forEach>
						</c:if>
						
					</table>
					<table  class="table"  id="ene3">
							<tr>
								<td colspan="10"style="text-align: left;">
								<span class="date_title print_hidden">注：①&nbsp;小时氨产量(含驰放气折算)(t/h)= 日氨产量(含驰放气折算)(t)÷样本数×6；</span> <br>
									<span class="date_title print_hidden">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;②&nbsp;吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)= 日天然气耗(Nm<sup>3</sup>)÷日氨产量(含驰放气折算)(t)；</span><br>
									<span class="date_title print_hidden">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;③&nbsp;吨氨综合消耗(kgce/tNH<sub>3</sub>)= 日蒸汽耗(折标煤)(kgce)÷日氨产量(含驰放气折算)(t)+1.2143(kgce/Nm<sup>3</sup>)×吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)；<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;标煤换算系数：气田天然气：1.2143kgce/Nm<sup>3</sup>，参见《综合能耗计算通则》(GB/T2589—2008)。
									</span>
								</td>
							</tr>
						</table>
					<!--折线图-->
					<button class="fresh">更新图表</button>
					<!-- 吨氨综合消耗 -->
					<div id="lineChart_month_day">
						<center>
							<br>
							<div class="line-chart" id="container_month_day"></div>
						</center>
					</div>
					
					<!-- 吨氨天然气耗 -->
					<div id="lineChart_month_day_2">
						<center>
							<br>
							<div class="line-chart" id="container_month_day_2"></div>
						</center>
					</div>
					<!-- 吨氨蒸汽耗(折标煤) -->
					<div id="lineChart_month_day_3">
						<center>
							<br>
							<div class="line-chart" id="container_month_day_3"></div>
						</center>
					</div>
				</center>
			</div>
			<br> <br> <br>

		</div>
		<!-----------------------按班查看------------------->
		<div class="tab-pane fade menu-third" id="three_c_32">
			<div id="printTable11">
				<center>
					<div class="fmy">
						<h3>
							<div class="col-md-5 col-sm-5 col-xs-5  print_hidden">
								<div class="chart_title_l">
									<form method="post">
										<span class="date_title">考核时间:</span>
										 <input name="mouth_date_begin" class="datainp" id="indate_month_ban1" type="text" value="${edate_begin}" placeholder="选择日期" readonly>
										  <input type="button" id="month_ban_show" class="look" value="查看">
									</form>
								</div>
							</div>
							<div class="col-md-5 col-sm-5 col-xs-5">
								<div class="chart_title_l">月报表--按班查看</div>
							</div>
							<!--打印按钮-->
							<div class="col-md-2 print_hidden">
							</div>
						</h3>
					</div>
					<!--固定表头-->
					<table class="table tbl1 tbl_hd_mb">
						<tr>
							<th>时间段</th>
							<th style="width:60px">班次</th>
							<th>班氨产量<br>(t)</th>
							<th>班驰放气折氨量<br>(t)</th>
							<th>班天然气耗<br>(Nm<sup>3</sup>)</th>
							<th>班蒸汽耗<br>(折标煤)(kgce)</th>
							<th>班氨产量<br>(含驰放气折算)(t)</th>
							
							<th>小时氨产量<br>(含驰放气折算)(t/h)</th>
							<th>吨氨天然气耗<br>(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
							
							<th>吨氨综合消耗<br>(kgce/tNH<sub>3</sub>)</th>
							<th>样本数</th>
						</tr>
						<c:forEach var="mon" items="${mouthClassList}" varStatus="st">
							<c:if test="${st.index<=0 }">
								<tr class="hiden_tr">
									<c:if test="${mon.data_time !=null}">
									<td><fmt:formatDate value="${mon.data_time}" pattern="yyyy/MM/dd" /></td>
									</c:if>
									<c:if test="${mon.data_time ==null}">
									<td>合计</td>
									</c:if>
									<c:if test="${mon.classNumber==1}">
										<td>白班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==2}">
										<td>中班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==3}">
										<td>夜班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==11}">
										<td>1 班</td>
									</c:if>
									<c:if test="${mon.classNumber==12}">
										<td>2 班</td>
									</c:if>
									<c:if test="${mon.classNumber==13}">
										<td>3 班</td>
									</c:if>
									<c:if test="${mon.classNumber==14}">
										<td>4 班</td>
									</c:if>
									<c:if test="${mon.time_FIQ162 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_FIQ162 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ162+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${mon.time_purge_nh3+ 0.0001}" pattern="##.###" minFractionDigits="3"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_FIQ203 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_FIQ203 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ203+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_steam_coal == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_steam_coal != 0}">
										<td><fmt:formatNumber value="${mon.time_steam_coal+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_NH3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_NH3 != 0}">
										<td><fmt:formatNumber value="${mon.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									
									<c:if test="${mon.orig_id == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.orig_id != 0}">
										<td><fmt:formatNumber value="${mon.time_NH3/mon.orig_id * 6 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ203/mon.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${(mon.time_FIQ203/mon.time_NH3)*1.2143+mon.time_steam_coal/mon.time_NH3+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<td><fmt:formatNumber value="${mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber></td>
							</tr>
							</c:if>
						</c:forEach>
					</table>
					<!--数据表格-->
					<table id="energy_month_ban"  class="table tbl1">
						<tr>
							<th>时间段</th>
							<th style="width:60px">班次</th>
							<th>班氨产量<br>(t)</th>
							<th>班驰放气折氨量<br>(t)</th>
							<th>班天然气耗<br>(Nm<sup>3</sup>)</th>
							<th>班蒸汽耗<br>(折标煤)(kgce)</th>
							<th>班氨产量<br>(含驰放气折算)(t)</th>
							
							<th>小时氨产量<br>(含驰放气折算)(t/h)</th>
							<th>吨氨天然气耗<br>(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
							
							<th>吨氨综合消耗<br>(kgce/tNH<sub>3</sub>)</th>
							<th>样本数</th>
						</tr>
						<c:forEach var="mon" items="${mouthClassList}">
							<tr>
								<c:if test="${mon.data_time !=null}">
									<td><fmt:formatDate value="${mon.data_time}" pattern="yyyy/MM/dd" /></td>
									</c:if>
									<c:if test="${mon.data_time ==null}">
									<td>合计</td>
									</c:if>
									<c:if test="${mon.classNumber==1}">
										<td>白班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==2}">
										<td>中班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==3}">
										<td>夜班<c:if test="${mon.shift!=0}">(<fmt:formatNumber value="${mon.shift/mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber>)</td>
									</c:if>
									</c:if>
									<c:if test="${mon.classNumber==11}">
										<td>1 班</td>
									</c:if>
									<c:if test="${mon.classNumber==12}">
										<td>2 班</td>
									</c:if>
									<c:if test="${mon.classNumber==13}">
										<td>3 班</td>
									</c:if>
									<c:if test="${mon.classNumber==14}">
										<td>4 班</td>
									</c:if>
									<c:if test="${mon.time_FIQ162 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_FIQ162 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ162+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${mon.time_purge_nh3+ 0.0001}" pattern="##.###" minFractionDigits="3"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_FIQ203 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_FIQ203 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ203+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_steam_coal == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_steam_coal != 0}">
										<td><fmt:formatNumber value="${mon.time_steam_coal+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_NH3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_NH3 != 0}">
										<td><fmt:formatNumber value="${mon.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									
									<c:if test="${mon.orig_id == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.orig_id != 0}">
										<td><fmt:formatNumber value="${mon.time_NH3/mon.orig_id * 6 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${mon.time_FIQ203/mon.time_NH3 + 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									
									<c:if test="${mon.time_purge_nh3 == 0}">
										<td>--</td>
									</c:if>
									<c:if test="${mon.time_purge_nh3 != 0}">
										<td><fmt:formatNumber value="${(mon.time_FIQ203/mon.time_NH3)*1.2143+mon.time_steam_coal/mon.time_NH3+ 0.0001}" pattern="##.##" minFractionDigits="2"></fmt:formatNumber></td>
									</c:if>
									<td><fmt:formatNumber value="${mon.orig_id}" pattern="##" minFractionDigits="0"></fmt:formatNumber></td>
							</tr>
						</c:forEach>
						
					</table>
					<table  class="table"  id="ene4">
							<tr>
								<td colspan="10"style="text-align: left;">
								<span class="date_title print_hidden">注：①&nbsp;小时氨产量(含驰放气折算)(t/h)= 班氨产量(含驰放气折算)(t)÷样本数×6；</span> <br>
									<span class="date_title print_hidden">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;②&nbsp;吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)= 班天然气耗(Nm<sup>3</sup>)÷班氨产量(含驰放气折算)(t)；</span><br>
									<span class="date_title print_hidden">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;③&nbsp;吨氨综合消耗(kgce/tNH<sub>3</sub>)= 班蒸汽耗(折标煤)(kgce)÷班氨产量(含驰放气折算)(t)+1.2143(kgce/Nm<sup>3</sup>)×吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)；<br>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;标煤换算系数：气田天然气：1.2143kgce/Nm<sup>3</sup>，参见《综合能耗计算通则》(GB/T2589—2008)。
									</span>
								</td>
							</tr>
						</table>
					<!--走势图-->
					<button class="fresh">更新图表</button>
					<div id="lineChart_month_ban_9_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_9_1"></div>
							</center>
						</div>
					<div id="lineChart_month_ban_8_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_8_1"></div>
							</center>
						</div>
					<div id="lineChart_month_ban_7_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_7_1"></div>
							</center>
						</div>
					<div id="lineChart_month_ban_4_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_4_1"></div>
							</center>
						</div>
						<div id="lineChart_month_ban_5_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_5_1"></div>
							</center>
						</div>
						<div id="lineChart_month_ban_6_1">
							<center>
								<br>
								<div class="line-chart"  id="container_month_ban_6_1"></div>
							</center>
						</div>
					
					
					<div id="lineChart_month_ban_1">
						<center>
							<br>
							<div class="line-chart" id="container_month_ban_1"></div>
						</center>
					</div>
					
					<div id="lineChart_month_ban_3">
						<center>
							<br>
							<div class="line-chart" id="container_month_ban_3"></div>
						</center>
					</div>
					<div id="lineChart_month_ban_4">
						<center>
							<br>
							<div class="line-chart" id="container_month_ban_4"></div>
						</center>
					</div>
					
				</center>
			</div>
			<br> <br> <br>
		</div>
	</div>
</c:if>
<c:if test="${fun:length(mouthList) <= 0}">
<div class="tab-content menu_third_page">
	<div class="tab-pane fade in active menu-third" id="three_c_31">
			<!-----------------------打印内容------------------>
			<div id="printTable">
				<center>
					<div class="fmy">
						<h3>
						该时段暂无数据！
						</h3>
					</div>
				</center>
			</div>
	</div>
		</div>				
</c:if>
</body>
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="jedate/jedate.js"></script>
<script type="text/javascript" src="js/jquery.blockUI.js"></script>
<!--折线图-->

<script type="text/javascript" src="js/highcharts1.js"></script>
<script type="text/javascript" src="js/exporting1.js"></script>
<script type="text/javascript" src="js/data_jf.js"></script>
<!-- <script type="text/javascript" src="js/gridlight.js"></script> -->
<script type="text/javascript" src="js/index.js"></script>
<!-- 导出 -->
<!-- <script type="text/javascript" src="js/export/tableExport.js"></script>
<script type="text/javascript" src="js/export/src/pdf.js"></script>
<script type="text/javascript" src="js/export/src/jspdf.js"></script> -->

<script>
	/*时间控件*/
	/*日报表-日*/
	jeDate({
		dateCell : "#indate_month_day1", //isinitVal:true,
		format : "YYYY-MM",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	});
	/*日报表-班*/
	jeDate({
		dateCell : "#indate_month_ban1", //isinitVal:true,
		format : "YYYY-MM",
		isTime : false, //isClear:false,
		minDate : "2014-09-19 00:00:00"
	});
/* 导出 */
		var $exportLink = document.getElementById('export1');
		$exportLink.addEventListener('click', function(e) {
			e.preventDefault();
			if (e.target.nodeName === "A") {
			    tableExport('energy_month_ban', '能耗监测', e.target.getAttribute('data-type'));
			}
		}, false);
	</script>
</html>