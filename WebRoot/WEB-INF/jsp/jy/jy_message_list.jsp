<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">

<link href="css/index.css" rel="stylesheet" type="text/css">




</head>


<body>
 <div class="navbar-fixed-top" style="background:rgba(255, 255, 255, 0.95);">
            <!--右边二级菜单-->
                <ul id="myTab" class="nav nav-tabs menu_rihgt">
                    <li class="active"><a class="31" href="#" data-toggle="tab">消息列表</a></li>
                    
                </ul>
                <!--右边二级菜单结束-->
                <!--历史记录-->
                <div class="tab-content menu-third-content">
                    
                    <div class="tab-pane fade in active">
                      
                        <ul id="myTab" class="nav nav-tabs menu_rihgt_after">
                            <li class="active">
                                <a href="#" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;消息列表</a>
                            </li>
                            
                        </ul>
                        
                    </div>


                </div>
                
        </div>
       
                        <div class="tab-content menu_third_page">
                            <!-----------------------按日查看------------------>
                            <div class="tab-pane fade in active menu-third" id="three_c_31">
                                <!-----------------------打印内容------------------>
                                <div id="printTable">
                                    <center>
                                        <div class="fmy">
                                            <h3>
                                                <div class="col-md-12">消息记录</div>
                                            </h3>
                                        </div>
                                        <!--表格和折线图-->
                                        <table id="energy_day" border="1" class="table">
                                            <tr>
                                                
                                                <th>消息内容</th>
                                                 <th>作者</th>
                                                 <th>公司</th>
                                                <th>时间</th>
                                                <th>状态</th>
                                                
                                            </tr>
                                           <c:forEach items="${messageList}" var="guide">
						            	
						            		 <tr>
						                   
						                  
						                    <td>${guide.message}</td>
						                     <td>${guide.author}</td>
						                     <td><!--${guide.company}  -->成都赛特工信科技有限公司</td>
						                    <td>${guide.time}</td>
						                    <td>${guide.type}</td>
						                    
						                </tr>
						            	</c:forEach>
                                        </table>
                                    </center>
                                   
    
                                </div>
                                
                               
	
                            </div>
                            <center>
                        <div class="end_page">
					    	<div class="message">共<i class="blue">${count}</i> 条记录，当前显示第&nbsp;<i class="blue">${page}&nbsp;</i>页</div>
					        <div class="message">
					        <ul class="paginList">
					        <c:set var="pages"  value="${pages}"/>
					        <c:if test="${page>1}">
					        <li class="paginItem"><a href="jy_showguidehist.action?page=${page-1}"><span class="pagepre">上一页</span></a></li>
					        </c:if>
					       
					       
					      	<c:if test="${page<pages}">
					        <li class="paginItem"><a href="jy_showguidehist.action?page=${page+1}"><span class="pagenxt">下一页</span></a></li>
					       </c:if>
					        </ul>
					        </div>
				    	</div>
     				</center>
                        </div>
                       
                        

</body>
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</html>