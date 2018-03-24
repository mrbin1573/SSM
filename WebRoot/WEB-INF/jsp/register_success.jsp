<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit"> 
<title>成都赛特优化节能平台重置密码</title>
<link href="/pic/css/bootstrap.min.css" rel="stylesheet" type="text/css">

<style>
/*右边iframe的body*/

* {
    outline: none
}


.index_body {
    overflow: hidden;
    background-repeat: no-repeat;
    background-size: 100%;
    background-position:bottom;
}
.head {
    background: #39AFE6;
    height: 75px;
    width: 100%;
}


.logo {
    margin-top: 7px;
}


.body_right {
    min-height: 1000px;
    position: fixed;
    top: 85px;
    left: 0%;/* 17.2%; */
    padding-right: 0px;
    padding-left: 0px;
}

body {
	margin:0; height:100%;
    
    padding: 0px;
    margin: 0px;
    font-family: microsoft yahei;
    /*娓愬彉*/
    background-repeat:repeat-x;
}


.login_login{width:100%;height:10%;border-left:5px solid #39AFE6;margin-top:15px;padding-left:30px;color:1b627b;line-height: 200%}
.login_login b{color:#1799D5}
.login_input{width:100%;height:10%;;border:1px solid #fff;margin-top:5%;padding:0px 35px;}
.login_submit{
    border:none;height:50px;width:100%;line-height:40px;color:#fff;
    background:-webkit-linear-gradient(#39AFE6,#2181a3); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient(#39AFE6,#2181a3); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(#39AFE6,#2181a3); /* Firefox 3.6 - 15 */
    background: linear-gradient(#39AFE6,#2181a3); /* 标准的语法 */
}
.login_submit:hover{
	background:-webkit-linear-gradient(#2181a3, #39AFE6); /* Safari 5.1 - 6.0 */
    background: -o-linear-gradient(#2181a3, #39AFE6); /* Opera 11.1 - 12.0 */
    background: -moz-linear-gradient(#2181a3, #39AFE6); /* Firefox 3.6 - 15 */
    background: linear-gradient(#2181a3, #39AFE6); /* 标准的语法 */
    
}
.login_ts{height:50px;width:100%;padding-left:5px;border:solid 1px #FF5E3A;color:#FF5E3A;}
.psWord{border:solid 1px #b7b7b7;height:50px;width:100%;background:url(/pic/images/psd.png) #fff left no-repeat; background-size:35px;padding-left:40px}
.login_yzm{border:solid 1px #b7b7b7;height:50px;width:55%;background:url(/pic/images/yzm.png) #fff left no-repeat; background-size:35px;padding-left:40px}
.head_left{width:1000px;margin:0 auto}
.yzm_txt{background:#39AFE6;width:40%;height:50px;float:right;line-height:50px; font-size:25px;color:#fff;text-align: center;letter-spacing: 5px}
.body_right{height:100%;margin-top:0px}
.login_left{width:40%;height:100%;float:left;padding:10px 20px 10px 80px}
.login_center{width:1100px;background:#fff;margin:0 auto}
.login_right{width:40%;height:95%;float:left;margin-top:30px}
.login_box{width:90%;height:95%;background:#fff;border:1px solid #ddd;box-shadow:0px 0px 2px #ccc;font-size:24px;}
.login_footer{background:#e3e3e3;width:100%;height:100%;margin-top:10px;padding-top:30px}
.login_input input:focus{border: 1px solid #1799D5;}
.login_down{height:100%;background:#fff;padding-top:2%}
.forget_pass{float:right;margin-right:35px}   
</style>
</head>
<body class="index_body">
	
	<!-----------------------------------------------头部------------------------------------------------------------>
    <div class="head navbar-fixed-top">
        <!--左边logo-->
        <div class="head_left">
            <div class="col-md-1 col-sm-1 col-xs-1 logo">
                <img width="650px" src="/pic/images/logo_web_before.gif">
            </div>

        </div>

    </div>
	
	<!---------------------------------------------头部结束------------------------------------------------------------>


	<!------------------------------------------------中间----------------------------------------------------------->
    <div class="col-md-12 col-sm-12 col-xs-12 body_right">
        	<center><h3 style="margin-top:100px">账号邮箱验证成功，请到邮箱中点击链接重置密码！</h3></center>
    </div>
</body>
<script src="/pic/js/jquery-2.2.4.min.js"></script>
<script src="/pic/js/bootstrap.min.js"></script>
<script src="/pic/js/new_login.js"></script>
</html>

