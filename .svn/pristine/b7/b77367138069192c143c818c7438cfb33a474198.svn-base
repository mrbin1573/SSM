<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>成都赛特优化节能平台</title>
<!--时间控件-->
<link rel="stylesheet" type="text/css" href="stylesheets/normalize.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/stylesheet.css" media="screen">
<link rel="stylesheet" type="text/css" href="stylesheets/github-light.css" media="screen">
<script type="text/javascript" src="jedate/jedate.js"></script>
<link type="text/css" rel="stylesheet" href="jedate/skin/jedate.css">


<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

<link href="css/index.css" rel="stylesheet" type="text/css">
</head>
<body onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">
<!--返回按钮-->

        <div style="padding-top:5px;background:#fff" class="tab-content navbar-fixed-top print_hidden">
            <!--右边二级菜单-->
                <ul id="myTab" class="nav nav-tabs menu_rihgt">
                   <li class="active"><a class="31" href="jy_to_show_day_data.action" >日 报 表</a></li>
                   
                    <li><a href="jy_do_select_Mouth.action" >月 报 表</a></li>
                    <li><a href="jy_do_select_Quarter.action">季度报表</a></li>
                    <li><a href="jy_do_select_Year.action">年度报表</a></li>
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
                        </ul>
                        
                    </div>


                </div>
        </div>
             <!--能耗分期日考核日报表--->
             
                        <div class="tab-content menu_third_page">
                            <!-----------------------按日查看------------------>
                            <div class="tab-pane fade in active menu-third" id="three_c_31">
                                <!-----------------------打印内容------------------>
                                <div id="printTable">
                                    <center>
                                        <div class="fmy">
                                            <h3>
                                                <div class="col-md-5 col-sm-5 col-xs-5  ">
                                                	<div class="chart_title_l">
	                                                <form  method="post">
	                                                      <span class="date_title print_hidden">请选择</span>
	                                                      <input name="date_begin" class="datainp" id="indate_day_day1" type="text" value="${edate_begin}" placeholder="开始日期"  readonly>
	                                                      - <input name="date_end"  class="datainp" id="indate_day_day2" type="text" value="${edate_end}" placeholder="结束日期"  readonly>
	                                                      <input type="button" class="look print_hidden" id="day_day_show" value="查看">
													</form>
													</div>
                                                </div>
                                                <div class="col-md-5 col-sm-5 col-xs-5"><div class="chart_title_l">日报表--按日查看</div></div>

                                                <!--打印按钮-->
                                                <div class="col-md-2 col-sm-2 col-xs-2 print_hidden">
                                                	<div class="chart_title_r">
                                                        <img width="30px" src="images/print.png">
                                                        <input class="btn_print" type="button"  onclick="javascript:window.print();" value="打印" /> 
                                                	</div>
                                                </div>
                                            </h3>
                                        </div>
                                        
                                        <!--滚动固定表头-->
                                        <table class="table tbl_hd_dd">
                                            <tr> 
                                                <th>时间段</th>
                                                
                                                <th>日氨产量(t)</th>
                                                <th>日净蒸汽耗(kgce)</th>
                                                <th>日气耗(Nm<sup>3</sup>)</th>
                                                <th>小时氨产量(t/h)</th>
                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
                                                 <th>吨氨净蒸汽耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>样本数</th>
                                            </tr>
                                             <c:if test="${dayList !=null}">
                                            	<c:forEach var="day" items="${dayList}" varStatus="st">
                                            		<c:if test="${st.index<=0  }">
	                                            		<tr class="hiden_tr">
			                                                <td><fmt:formatDate value="${day.时间}" pattern="yyyy/MM/dd"/></td>
			                                                
			                                                <td><fmt:formatNumber value="${day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
			                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.时段气耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                
			                                                <td><fmt:formatNumber value="${day.时段氨产量/day.累积氨产量*6  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                              
			                                                <td><fmt:formatNumber value="${1.2143*day.时段气耗/day.时段氨产量+day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.时段气耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
			                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
			                                            </tr>
		                                            </c:if>
                                            	</c:forEach>
                                            </c:if>
                                        </table>
                                        
                                        <!--表格和折线图-->
                                        <table id="energy_day" border="1" class="table">
                                            <tr>
                                                <th>时间段</th>
                                                
                                                <th>日氨产量(t)</th>
                                                <th>日净蒸汽耗(kgce)</th>
                                                <th>日气耗(Nm<sup>3</sup>)</th>
                                                <th>小时氨产量(t/h)</th>
                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
                                                 <th>吨氨净蒸汽耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>样本数</th>
                                            </tr>
                                             <c:if test="${dayList !=null}">
                                            	<c:forEach var="day" items="${dayList}">
                                            		<tr>
                                                <td><fmt:formatDate value="${day.时间}" pattern="yyyy/MM/dd"/></td>
                                                
                                                <td><fmt:formatNumber value="${day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                <td><fmt:formatNumber value="${day.时段气耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                
                                                <td><fmt:formatNumber value="${day.时段氨产量/day.累积氨产量*6  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                              
                                                <td><fmt:formatNumber value="${1.2143*day.时段气耗/day.时段氨产量+day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                <td><fmt:formatNumber value="${day.时段气耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
                                            </tr>
                                            	</c:forEach>
                                            </c:if>
                                        </table>
                                       
                                        <!--折线图-->
                                        <div id="lineChart_day">
                                            <div class="line-chart" id="container_day"></div>
                                        </div><br>
                                        <div id="lineChart_day_1">
                                            <div class="line-chart" id="container_day_1"></div>
                                        </div><br>
                                        <div id="lineChart_day_2">
                                            <div class="line-chart" id="container_day_2"></div>
                                        </div>
                                    </center>
                                </div>
                                
                                
                                <br>
                                <br>
                                <br>

                            </div>
                            <!-----------------------按班查看------------------->
                            <div class="tab-pane fade menu-third" id="three_c_32">
                                <div id="printTable11">
                                    <center>
                                        <div class="fmy">
                                            <h3>
                                                <div class="col-md-5 col-sm-5 col-xs-5  ">
                                                	<div class="chart_title_l">
                                                    <span class="date_title print_hidden">请选择</span>
                                                      <input name="date_begin" class="datainp" id="indate_day_ban1" type="text"  value="${edate_begin}" placeholder="开始日期"  readonly>
                                                      - <input name="date_end"  class="datainp" id="indate_day_ban2" type="text" value="${edate_end}" placeholder="结束日期"  readonly>
                                                      <input type="button" class="look print_hidden" id="day_class_show" value="查看">
</div>
                                                </div>
                                                <div class="col-md-5 col-sm-5 col-xs-5 ">
                                                	<div class="chart_title_l">日报表--按班查看</div>
                                                </div>
                                                <!--打印按钮-->
                                                <div class="col-md-2 print_hidden">
	                                                <div class="chart_title_r">
	                                                    <img width="30px" src="images/print.png">
	                                                    <input class="btn_print" id="" type="button" value="打印" onclick="javascript:window.print();">
                                                    </div>
                                                </div>
                                            </h3>
                                        </div><br>
                                        <!--固定表头-->
                                        
                                        <table class="table tbl1 tbl_hd_db">
                                            <tr>
                                            
                                                <th>时间段</th>
                                                
                                                 <th>班次</th>
                                                 	
                                                <th>日氨产量(t)</th>
                                                <th>日净蒸汽耗(kgce)</th>
                                                <th>日气耗(Nm<sup>3</sup>)</th>
                                                <th>小时氨产量(t/h)</th>
                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
                                                 <th>吨氨净蒸汽耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>样本数</th>
                                            </tr>
                                             <c:forEach var="day" items="${monList}" varStatus="st">
                                             <c:if test="${st.index<=0 }">
                                           		<tr  class="hiden_tr">
                                             		<td><fmt:formatDate value="${day.时间}" pattern="yyyy/MM/dd"/></td>
	                                                  <c:if test="${day.classNumber==1}">
	                                                <td>
	                                              		早班
	                                                </td>
	                                                </c:if>
	                                                <c:if test="${day.classNumber==2}">
	                                                <td>
	                                              		中班
	                                                </td>
	                                                </c:if>
	                                                <c:if test="${day.classNumber==3}">
	                                                <td>
	                                              		晚班
	                                                </td>
	                                               
	                                                </c:if>
	                                                 <c:if test="${day.时段氨产量 != 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段氨产量+0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
	                                                </c:if>
	                                                 <c:if test="${day.时段氨产量 == 0.0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                <c:if test="${day.时段净蒸汽耗 == 0.0}">
	                                                 <td>--</td>
	                                            	</c:if>
	                                            	 <c:if test="${day.时段净蒸汽耗 != 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                <c:if test="${day.时段气耗 == 0.0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                 <c:if test="${day.时段气耗 != 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段气耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                <c:if test="${day.时段氨产量 != 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段氨产量/day.累积氨产量*6  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                 <c:if test="${day.时段氨产量 == 0.0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                <c:if test="${day.时段气耗 != 0.0}">
	                                                <td><fmt:formatNumber value="${1.2143*day.时段气耗/day.时段氨产量+day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                                </c:if>
	                                                 <c:if test="${day.时段气耗 == 0.0}">
	                                                <td>--</td>
	                                                </c:if>
	                                                 <c:if test="${day.时段气耗!= 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段气耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                               </c:if>
	                                                <c:if test="${day.时段气耗 == 0.0}">
	                                                 <td>--</td>
	                                               </c:if>
	                                                <c:if test="${day.时段净蒸汽耗 != 0.0}">
	                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
	                                            	</c:if>
	                                            	<c:if test="${day.时段净蒸汽耗 == 0.0}">
	                                                 <td>--</td>
	                                            	</c:if>
	                                            	<c:if test="${day.classNumber==3}">
	                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
	                                            	</c:if>
	                                            	<c:if test="${day.classNumber==2}">
	                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
	                                            	</c:if>
	                                            	<c:if test="${day.classNumber==1}">
	                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
	                                            	</c:if>
	                                            </tr>
	                                            </c:if>
                                              </c:forEach>
                                            
                                        </table>
                                        <!--数据表格-->
                                        <table id="energy_day_ban" border="1" class="table tbl1">
                                            <tr>
                                            
                                                <th>时间段</th>
                                                
                                                 <th>班次</th>
                                                 	
                                                <th>日氨产量(t)</th>
                                                <th>日净蒸汽耗(kgce)</th>
                                                <th>日气耗(Nm<sup>3</sup>)</th>
                                                <th>小时氨产量(t/h)</th>
                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
                                                 <th>吨氨净蒸汽耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>样本数</th>
                                            </tr>
                                             <c:forEach var="day" items="${monList}">
                                           
                                         
                                            <tr>
                                             
                                                <td><fmt:formatDate value="${day.时间}" pattern="yyyy/MM/dd"/></td>
                                                  <c:if test="${day.classNumber==1}">
                                                <td>
                                              		早班
                                                </td>
                                                </c:if>
                                                <c:if test="${day.classNumber==2}">
                                                <td>
                                              		中班
                                                </td>
                                                </c:if>
                                                <c:if test="${day.classNumber==3}">
                                                <td>
                                              		晚班
                                                </td>
                                               
                                                </c:if>
                                                 <c:if test="${day.时段氨产量 != 0.0}">
                                                <td><fmt:formatNumber value="${day.时段氨产量+0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber>   </td>
                                                </c:if>
                                                 <c:if test="${day.时段氨产量 == 0.0}">
                                                <td>--</td>
                                                </c:if>
                                                <c:if test="${day.时段净蒸汽耗 == 0.0}">
                                                 <td>--</td>
                                            	</c:if>
                                            	 <c:if test="${day.时段净蒸汽耗 != 0.0}">
                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                </c:if>
                                                <c:if test="${day.时段气耗 == 0.0}">
                                                <td>--</td>
                                                </c:if>
                                                 <c:if test="${day.时段气耗 != 0.0}">
                                                <td><fmt:formatNumber value="${day.时段气耗  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                </c:if>
                                                <c:if test="${day.时段氨产量 != 0.0}">
                                                <td><fmt:formatNumber value="${day.时段氨产量/day.累积氨产量*6  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                </c:if>
                                                 <c:if test="${day.时段氨产量 == 0.0}">
                                                <td>--</td>
                                                </c:if>
                                                <c:if test="${day.时段气耗 != 0.0}">
                                                <td><fmt:formatNumber value="${1.2143*day.时段气耗/day.时段氨产量+day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                                </c:if>
                                                 <c:if test="${day.时段气耗 == 0.0}">
                                                <td>--</td>
                                                </c:if>
                                                 <c:if test="${day.时段气耗!= 0.0}">
                                                <td><fmt:formatNumber value="${day.时段气耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                               </c:if>
                                                <c:if test="${day.时段气耗 == 0.0}">
                                                 <td>--</td>
                                               </c:if>
                                                <c:if test="${day.时段净蒸汽耗 != 0.0}">
                                                <td><fmt:formatNumber value="${day.时段净蒸汽耗/day.时段氨产量  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	</c:if>
                                            	<c:if test="${day.时段净蒸汽耗 == 0.0}">
                                                 <td>--</td>
                                            	</c:if>
                                            	<c:if test="${day.classNumber==3}">
                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
                                            	</c:if>
                                            	<c:if test="${day.classNumber==2}">
                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
                                            	</c:if>
                                            	<c:if test="${day.classNumber==1}">
                                            	<td><fmt:formatNumber value="${day.累积氨产量}" pattern="##" minFractionDigits="0" ></fmt:formatNumber></td>
                                            	</c:if>
                                            </tr>
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
                                        
                                    </center>
                                </div>
                                <br>
                                <br>
                                <br>
                            </div>
                        </div>
        
	


</body>
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>


<!--折线图-->
<script type="text/javascript" src="js/highcharts1.js"></script>
<script type="text/javascript" src="js/exporting1.js"></script>
<script type="text/javascript" src="js/data_jy.js"></script><!--折线图数据位置-->
<script>

    /*时间控件*/
    /*日报表-日*/
    jeDate({
        dateCell: "#indate_day_day1", //isinitVal:true,
        format: "YYYY-MM-DD",
        isTime: false, //isClear:false,
        minDate: "2014-09-19 00:00:00"
    })
    jeDate({
        dateCell: "#indate_day_day2", //isinitVal:true,
        format: "YYYY-MM-DD",
        isTime: false, //isClear:false,
        minDate: "2014-09-19 00:00:00"
    })
    
    /*日报表-班*/
    jeDate({
        dateCell: "#indate_day_ban1", //isinitVal:true,
        format: "YYYY-MM-DD",
        isTime: false, //isClear:false,
        minDate: "2014-09-19 00:00:00"
    })
    jeDate({
        dateCell: "#indate_day_ban2", //isinitVal:true,
        format: "YYYY-MM-DD",
        isTime: false, //isClear:false,
        minDate: "2014-09-19 00:00:00"
    })


        

</script>

</html>