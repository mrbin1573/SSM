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
<link type="text/css" rel="stylesheet" href="jedate/skin/jedate.css">


<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/index.css" rel="stylesheet" type="text/css">


</head>
<body onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">

        <div style="padding-top:5px;background:#fff" class="tab-content navbar-fixed-top print_hidden">
            <!--右边二级菜单-->
                <ul id="myTab" class="nav nav-tabs menu_rihgt">
                      <li ><a class="31" href="jy_to_show_day_data.action" >日 报 表</a></li>
                   
                    <li ><a href="jy_do_select_Mouth.action" >月 报 表</a></li>
                    <li class="active"><a href="jy_do_select_Quarter.action">季度报表</a></li>
                    <li><a href="jy_do_select_Year.action">年度报表</a></li>
                </ul>
                <!--右边二级菜单结束-->
                
                <div class="tab-content menu-third-content">
                    <!--日报表三级菜单-->
                    <div class="tab-pane fade in active">
                        <!--日报表--按班查看---按日查看菜单------>
                        <ul id="myTab" class="nav nav-tabs menu_rihgt_after">
                            <li class="active">
                                <a href="#three_c_31" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;按月查看</a>
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
                                                <div class="col-md-5 col-sm-5 col-xs-5">
		                                            <div class="chart_title_l">
		                                                 <form  method="post">
		                                                      <span class="date_title print_hidden print_hidden">请选择</span>
		                                                      <input name="Quarter_year" class="datainp" id="indate_year" type="text" value="${year_text}" placeholder="选择年份"  readonly>
		                                                      <select class="datainp" id="indate_season_season" name="Quarter" value="${quarter_text}" >
		                                                         <option>第一季度</option>
		                                                         <option>第二季度</option>
		                                                         <option>第三季度</option>
		                                                         <option>第四季度</option>
		                                                     </select>
		                                                      <input type="button" class="look print_hidden" id="season_show" value="查看">
														</form>
													</div>
                                                </div>
                                                <div class="col-md-5 col-sm-5 col-xs-5">
                                            		<div class="chart_title_l">季度报表</div>
                                            		</div>

                                                <!--打印按钮-->
                                                <div class="col-md-2">
                                                <div class="chart_title_r print_hidden">
                                                        <img width="30px" src="images/print.png">
                                                        <input class="btn_print" id="" type="button" value="打印" onclick="javascript:window.print();">
                                                </div>
                                                </div>
                                            </h3>
                                        </div>
                                        
                                        <!--表格和折线图-->
                                        <table id="energy_season" border="1" class="table">
                                             <tr>
                                                <th>时间段</th>
                                                <th>月氨产量(t)</th>
                                                <th>月净蒸汽耗(kgce)</th>
                                                <th>月气耗(Nm<sup>3</sup>)</th>
                                                <th>小时氨产量(t/h)</th>
                                                <th>吨氨综合消耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>吨氨气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)</th>
                                                 <th>吨氨净蒸汽耗(kgce/tNH<sub>3</sub>)</th>
                                                <th>样本数</th>
                                            </tr>
                                            <c:if test="${quaryList !=null}" >
                                            	<c:forEach var="day" items="${quaryList}">
                                            	<c:set var="sum">${sum+day.时段氨产量}</c:set>
                                            	<c:set var="sum1">${sum1+day.时段净蒸汽耗}</c:set>
                                            	<c:set var="sum2">${sum2+day.时段气耗}</c:set>
                                            	<c:set var="sum3">${sum3+day.时段氨产量/day.累积氨产量*6}</c:set>
                                            	<c:set var="sum4">${sum4+1.2143*day.时段气耗/day.时段氨产量+day.时段净蒸汽耗/day.时段氨产量}</c:set>
                                            	<c:set var="sum5">${sum5+day.时段气耗/day.时段氨产量}</c:set>
                                            	<c:set var="sum6">${sum6+day.时段净蒸汽耗/day.时段氨产量}</c:set>
                                            	<c:set var="sum7">${sum7+day.累积氨产量}</c:set>
                                            		<tr>
                                                <td><fmt:formatDate value="${day.时间}" pattern="yyyy/MM"/></td>
                                                
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
                                             <tr style="color: red">
                                            	<td>合计</td>
                                            	<td><fmt:formatNumber value="${sum  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum1  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum2  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum/sum7*6  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum1/sum+sum2/sum*1.2143  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum2/sum  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	<td><fmt:formatNumber value="${sum1/sum  + 0.0001}" pattern="##.##" minFractionDigits="2" ></fmt:formatNumber></td>
                                            	
                                            	<td><fmt:formatNumber value="${sum7}" pattern="##"  ></fmt:formatNumber></td>
                                            </tr>
                                        </table>
                                        <!--折线图-->
                                        <button class="fresh">更新图表</button>
                                        <!--吨氨综合消耗-->
                                        <div id="lineChart_season">
                                            <center>
                                                <br>
                                                <div  class="line-chart-season">
                                                    <div class="season_left" style="width:60%;float:left" id="container_season"></div>
                                                    <div class="season_right" style="width:40%;float:left" id="container_season_r"></div>
                                                </div>
                                            </center>
                                        </div>
                                        <!--吨氨电耗-->
                                        <div id="lineChart_season_1">
                                            <center>
                                                <br>
                                                <div  class="line-chart-season">
                                                    <div class="season_left" style="width:60%;float:left" id="container_season_1"></div>
                                                    <div class="season_right" style="width:40%;float:left" id="container_season_r1"></div>
                                                </div>
                                            </center>
                                        </div>
                                        <!--吨氨气耗-->
                                        <div id="lineChart_season_2">
                                            <center>
                                                <br>
                                                <div  class="line-chart-season">
                                                    <div class="season_left" style="width:60%;float:left" id="container_season_2"></div>
                                                    <div class="season_right"  style="width:40%;float:left" id="container_season_r2"></div>
                                                </div>
                                            </center>
                                        </div>
                                    </center>
                                </div>
<br><br><br>

                            </div>
                            <!-----------------------按班查看------------------->
                        </div>
                   
 

</body>
<script src="js/jquery-2.2.4.min.js"></script>

<script src="js/jquery-migrate-1.1.0.js"></script><!--打印辅助-->
<script src="js/jquery.jqprint-0.3_1.js"></script><!--打印-->
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="jedate/jedate.js"></script>
<!--折线图-->
<script type="text/javascript" src="js/highcharts1.js"></script>
<script type="text/javascript" src="js/exporting1.js"></script>
<script type="text/javascript" src="js/data_jy.js"></script><!--折线图数据位置-->
<script>
    /*打印表格*/
    function printTable() {
        $("#printTable").jqprint();
    }

    /*生成折线图*/
    function lineChart() {
        $("#lineChart_season").jqprint();
    }



    /*时间控件*/

    jeDate({
        dateCell: "#indate_year", //isinitVal:true,
        format: "YYYY",
        isTime: false, //isClear:false,
        minDate: ""
    })
        

</script>

</html>