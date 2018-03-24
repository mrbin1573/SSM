<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>

<head>
<meta charset="utf-8">
<!--网页头部图片-->
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
<link rel="Bookmark" href="favicon.ico">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/index.css" rel="stylesheet" type="text/css">
<script src="js/jquery-2.2.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style type="text/css">
.zl_line_img {
	width: 100%;
	height: 100px;
	padding: 30px 20px 0px
}

.zl_line {
	width: 100%;
	height: 45px;
	background: ;
	padding: 0px 20px;
	over-flow: hidden
}

.zl_line_img div,.zl_line div {
	float: left;
	margin: 0px 10px
}

.zl_title {
	width: 150px;
	background: #fff;
	text-align: right
}

.zl_input input {
	width: 300px;
	margin: 8px 0px;
	text-indent: 5px
}

.submit input {
	width: 80px;
	height: 30px;
	margin-top:20px;
}

.file_up input {
	margin-top: 6px
}

.hden {
	position: absolute;
	left: 140px;
	opacity: 0;
	width:100px;z-index:100;
}
.hden input{width:100px}
.img_up {
	width: 100px;
	height: 100px;
	margin-top: -30px;
	border-radius:50px;

}
.danxuan input{
	margin-top:15px;
}
.ck{
	color:red;visibility:hidden;
}
.img_advs{position:absolute;margin-top:10px;color:red;margin-left:10px}
#old_pass{display:none}
.yzm div{width:100px;height:40px;border:none;margin-left:0px;background:#39AFE6;line-height:40px; font-size:25px;color:#fff;text-align: center;letter-spacing: 5px}
#nosb{color:#ddd}
#oksb{display:none}
/* .login_yzm{border:solid 1px #b7b7b7;height:50px;width:55%;background:url(/pic/images/yzm.png) #fff left no-repeat; background-size:35px;padding-left:40px}
 */
</style>
</head>

<body
	onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">

	<div class="tab-content">
		<!--第一页--原始数据上传-->
		<div class="tab-pane fade in active" id="second_1">
			<!--上传原始数据-->
			<div class="tab-content menu-third-content">
				<div class="tab-pane fade in active" id="three_1">

					<!--上传原始数据 第一个三级菜单-->
					<ul id="myTab" class="nav nav-tabs menu_rihgt_after">
						<li class="active"><a href="#three_c_1" data-toggle="tab"><img
								src="images/menu_third.png">&nbsp;&nbsp;密码修改</a></li>
					</ul>
				</div>
			</div>
			<div class="tab-content"><br>
				<!-----------------------上传------------------>
				<form>
					<div>
						<!-- 原始密码 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4>原始密码： </h4>
							</div>
							<div class="zl_input">
								<input class="old_input" type="text" onfocus="this.type='password'" onkeyup="ck_old()"required>
								<input id="old_pass" type="password"value="${user.uloginpass}">
								<span id="old_tishi" class="ck">密码不能为空！</span>
							</div>
						</div>
						<!-- 新密码 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4>新密码：</h4>
							</div>
							<div class="zl_input">
								<input type="text"class="new_pass" onfocus="this.type='password'" onkeyup="ch_new_old()"required >
								<span id="new_new" class="ck">新密码不能为空！</span>
							</div>
						</div>
						<!-- 确认新密码 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4>确认新密码：</h4>
							</div>
							<div class="zl_input">
								<input type="text" id="uloginPassword" onfocus="this.type='password'" name="uloginPassword" required class="ck_new_pass" onkeyup="ck_pass()">
								<span id="new_tishi" class="ck"  >新密码不能为空！</span>
							</div>
						</div>
						<!-- 验证码 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4>验证码：</h4>
							</div>
							<div class="zl_input">
								<input onkeyup="ck_yzm()" class="login_yzm"placeholder="不区分大小写" >
                                <span id="yzm_tishi" class="ck"  >请填写验证码！</span>
							</div>
						</div>
						<!-- 验证码图片 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4></h4>
							</div>
							<div class="yzm">
								<div readonly="readonly"title="点击刷新"></div>
								<span>点击图片刷新</span>
							</div>
						</div>
						<!-- 提交按钮 -->
						<div class="zl_line">
							<div class="zl_title">
								<h4></h4>
							</div>
							<div class="submit">
								<input type="button" id="oksb" value="确认">
								<input type="button" id="nosb" value="确认">&nbsp;<span class="oktishi">所有验证通过才能提交！</span>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
		<!--第一页--原始数据上传over-->
	</div>

</body>
<script>
	var flgops = false;//旧密码
	var flgnps = false;//新密码
	var flgyzm = false;//验证码
	$(function(){
		yanZM();
		allck();
	});
	/***************** 验证新旧密码是否相同 ******************/
	function ch_new_old(){
		var old = $("#old_pass").val().trim();//原始密码
		var len = old.length;//原始密码长度
		var newPass = $(".new_pass").val().trim();//新密码
		var newP_len = newPass.length;//新输入密码长度
		if(len >= 0){
			if(old == newPass){
				$("#new_new").css("visibility","visible").text("新密码与旧密码相同，建议修改！");
			}else{
				$("#new_new").css("visibility","hidden");
			}
		}
		allck()
	}
	/******************判断验证码是否正确 *******************/
    function ck_yzm(){
    	var yzm = $(".yzm div").html().trim().toUpperCase();//原始验证码
    	var yzm_len = yzm.length;//原始验证码长度
    	var new_yam = $(".login_yzm").val().trim().toUpperCase();//用户输入验证码
    	var new_len = new_yam.length;//用户输入验证码长度
    	if(new_len >= yzm_len){
    		if(yzm != new_yam){
    			$("#yzm_tishi").css("visibility","visible").text("验证码输入错误，请重新输入！");
    			flgyzm = false;
    		}else{
    			$("#yzm_tishi").css("visibility","visible").text("验证码正确！");
    			flgyzm = true;
    		}
    	}else{
    		$("#yzm_tishi").css("visibility","hidden").text("新密码不能为空！");
    	}
    	allck()
    }
 
   /**************************为空判断******************** */
    $(".zl_input input").blur(function(){
    	var len = $(this).val().trim().length;
    	
    	if(len <= 0){
    		$(this).parent().find("span").css("visibility","hidden");
    	}else{
    		$(this).parent().find("span").css("visibility","visibility");
    	}
    	allck()
    });
   /************检验  新密码是否一致 ***************/
    function ck_pass(){
		var newPass = $(".new_pass").val().trim();//新密码
		var ckPass = $(".ck_new_pass").val().trim();//再次输入的新密码
		if(ckPass.length >= 0){
			if(newPass != ckPass){
				$("#new_tishi").css("visibility","visible").text("两次密码不一致！");
				flgnps = false;
			}else{
				$("#new_tishi").css("visibility","visible").text("两次密码一致，通过验证！");
				flgnps = true;
			}
		}else{
				$("#new_tishi").css("visibility","hidden").text("新密码不能为空！");
				flgnps = false;
		}
		allck()
	};
	/*********************验证  原始密*码是否正确*******/
	function ck_old(){
		var old = $("#old_pass").val().trim();//原始密码
		var len = old.length;//原始密码长度
		var old_input = $(".old_input").val().trim();//用户输入原始密码
		var old_len = old_input.length;//用户输入原始密码长度
		//alert(old+":"+old_input)
		if(old_len >= 0){
			if(old != old_input){
				$("#old_tishi").css("visibility","visible").text("密码输入错误，请重新输入！");
				flgops = false;
			}else{
				$("#old_tishi").css("visibility","visible").text("密码正确！");
				flgops = true;
			};
		}else{
			$("#old_tishi").css("visibility","hidden").text("密码不能为空！");
			flgops = false;
		};
		allck()
	};
	/************************生成 验证码***********/
 function yanZM(){
        var yzm = "";//验证码
        var codeLength = 4;//验证码的长度  
        var Random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',  
         'S','T','U','V','W','X','Y','Z');
        for(var i = 0; i < codeLength; i++) {//循环操作  
            var index = Math.floor(Math.random()*36);//取得随机数的索引（0~35）  
            yzm += Random[index];//根据索引取得随机数加到code上  
        }  
        $(".yzm div").html(yzm);
        
    };
    /* 点击刷新 验证码 */
    $(".yzm div").click(function(){
    	yanZM();
    });
    
   /*  所有验证是否通过 */
   function allck(){
   	if(flgops==true && flgnps==true && flgyzm==true){
   
   		$("#oksb").css("display","block");
   		$("#nosb").css("display","none");
   		$(".oktishi").css("display","none");
   	}
   }
   
   $("#oksb").click(function(){
  
   		var newpsd = $("#uloginPassword").val();
   		var url = "${pageContext.request.contextPath}/jf_doUpPassIfo.action";
   		var args = {"uloginPassword":newpsd,"time":new Date()};
   		$.post(url,args,function(data){
   			
   				alert("密码修改成功！");
   				window.parent.document.getElementById("loginout").click();
   			
   		})
   });
</script>

</html>