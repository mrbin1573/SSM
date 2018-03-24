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
                    <li class="active"><a class="31" href="#" data-toggle="tab">指导文件</a></li>
                    
                </ul>
                <!--右边二级菜单结束-->
                <!--历史记录-->
                <div class="tab-content menu-third-content">
                    
                    <div class="tab-pane fade in active">
                      
                        <ul id="myTab" class="nav nav-tabs menu_rihgt_after">
                            <li class="active">
                                <a href="#" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;历史记录</a>
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
                                                <div class="col-md-12">历史记录</div>
                                            </h3>
                                        </div>
                                        <!--表格和折线图-->
                                        <table id="energy_day" border="1" class="table">
                                            <tr>
                                                <th>推送者</th>
                                                <th>推送时间</th>
                                                <th>文件名</th>
                                                <th>操作</th>
                                            </tr>
                                           <c:forEach items="${adminguideifos}" var="guide">
						            			<c:if test="${guide.id != 1}">
						            		<c:set var="names" value="${guide.oldname}"></c:set>
						            		 <tr>
						                   
						                    <td>${guide.upperson}</td>
						                    <td>${guide.uptime}</td>
						                    <td>${fn:substring(names, 0,4)}</td>
						                   <%--  <td>${guide.newname}</td> --%>
						                    
						                    <td><a href="jy_showg.action?gid=${guide.id}" class="tablelink">查看</a> </td>
						                </tr>
						                </c:if>
						            	</c:forEach>
                                        </table>
                                    </center>
                                   
    
                                </div>
                                
                               
	
                            </div>
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
                        </div>
                        

</body>
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</html>

<%-- 
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">指导数据操作</a></li>
    <li><a href="#">历史记录</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <!--<div class="tools">
    
    	<ul class="toolbar">
            <li class="click"><span><img src="images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="images/t02.png" /></span>修改</li>
            <li><span><img src="images/t03.png" /></span>删除</li>
        </ul>
        
        
        
    
    </div>-->
    
    
        <table class="tablelist">
            <thead>
                <tr>
                    <th>
                        <input name="" type="checkbox" value="" checked="checked" />
                    </th>
                    <th>推送者</th>
                    <th>推送时间</th>
                    <th>文件名</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
            	<c:forEach items="${adminguideifos}" var="guide">
            		<c:set var="names" value="${guide.oldname}"></c:set>
            		 <tr>
                    <td>
                        <input name="" type="checkbox" value="" />
                    </td>
                    <td>${guide.upperson}</td>
                    <td>${guide.uptime}</td>
                    <td>${fn:substring(names, 0,4)}</td>
                    <td>${guide.newname}</td>
                    
                    <td><a href="showguidehis.action?gid=${guide.id}" class="tablelink">查看</a> </td>
                </tr>
            	</c:forEach>
               
             
            </tbody>
        </table>
    
   
   <div class="pagin">
    	<div class="message">共<i class="blue">${count}</i>条记录，当前显示第&nbsp;<i class="blue">${page}&nbsp;</i>页</div>
        <ul class="paginList">
        <c:set var="pages"  value="${pages}"/>
        <c:if test="${page>1}">
        <li class="paginItem"><a href="showguidehist.action?page=${page-1}"><span class="pagepre"></span></a></li>
        </c:if>
        <li class="paginItem current"><a href="javascript:;">1</a></li>
        <li class="paginItem "><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
       
      	<c:if test="${page<pages}">
        <li class="paginItem"><a href="showguidehist.action?page=${page+1}"><span class="pagenxt"></span></a></li>
       </c:if>
        </ul>
    </div>
    
    <div class="tip">
    	<div class="tiptop"><span>用户注册</span></div>
        
      <div class="tipinfo">
        <span><img src="images/ticon.png" /></span>
        <div class="tipright">
        <center  class="add_input">
            <h4>用户名：<input type="text"></h4>
            <h4>密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text"></h4>
            <h4>权&nbsp;&nbsp;&nbsp;&nbsp;限：
                <select>
                    <option>董事长</option>
                    <option>总经理</option>
                    <option>技术总监</option>
                    <option>班主</option>
                </select>
            </h4>
        </center>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
    
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
 --%>