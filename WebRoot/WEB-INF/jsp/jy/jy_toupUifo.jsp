<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta charset="utf-8">
<!--网页头部图片-->
<link rel="icon" href="favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
<link rel="Bookmark" href="favicon.ico">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/index.css" rel="stylesheet" type="text/css">
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
	width: 50px;
	height: 30px
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
								src="images/menu_third.png">&nbsp;&nbsp;个人信息填写（修改）</a></li>
					</ul>
				</div>
			</div>
			<div class="tab-content"><br>
				<!-----------------------上传------------------>
				<form  enctype="multipart/form-data">
					<div>
						<div class="zl_line_img">
							<div class="zl_title">
								<h4>头像：</h4>
							</div>

							<div class="file_up">
								<input value="选择图片" type="button">
							</div>
							<div class="file_up hden">
								<input value="选择图片" id="file" name="file" type="file" onchange="changImg(event)" accept = "image/*">
							</div>
							<div>
								<img class="img_up" id="myImg"src="/pic/images/${user.headimage}">
								<!-- <span class="img_advs">建议上传正方形图片</span> -->
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4>登陆账号：</h4>
							</div>
							<div class="zl_input">
								<input id="usercode" name="uloginname" value="${user.uloginname}" type="text"required oninvalid="setCustomValidity('请填写账号！');" oninput="setCustomValidity('');">
								<span id="message" class="ck">账号不能为空！</span>
								
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4>真实姓名：</h4>
								
							</div>
							<div class="zl_input">
								<input id="utruename" name="utruename" value="${user.utruename}" type="text"required oninvalid="setCustomValidity('请填写姓名！');" oninput="setCustomValidity('');">
								<span class="ck">姓名不能为空！</span>
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4>性别：</h4>
							</div>
							<div class="danxuan">
								<input class="sex" name="sex" value="先生" checked="checked" type="radio">&nbsp;先生&nbsp;&nbsp;&nbsp;&nbsp;
								<input class="sex" name="sex" value="女士"type="radio">&nbsp;女士
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4>联系电话：</h4>
							</div>
							<div class="zl_input">
								<input id="uphone" name="uphone" value="${user.uphone}" type="text"pattern="^1[345678][0-9]{9}$" required oninvalid="setCustomValidity('电话格式不正确');" oninput="setCustomValidity('');" >
								<span class="ck"  >联系电话不能为空！</span>
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4>邮箱：</h4>
							</div>
							<div class="zl_input">
								<input id="email" name="email" value="${user.email}" type="email" required oninvalid="setCustomValidity('邮箱格式不正确');" oninput="setCustomValidity('');" >
								<span class="ck">用于找回密码，不能为空！</span>
							</div>
						</div>
						<div class="zl_line">
							<div class="zl_title">
								<h4></h4>
							</div>
							<div class="submit">
								<input id="updateUinfo" onclick="filup()" type="button" value="确认">
								<input type="button" id="updateUinfono" value="确认">
							</div>完善所有信息才能修改！
						</div>

					</div>
				</form>
			</div>

		</div>
		<!--第一页--原始数据上传over-->
	</div>
	<script src="js/jquery-2.2.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/ajaxfileupload.js"></script>

</body>

 <script type="text/javascript">
   
      
    
    //AJAX验证用户名可不可用
    $(function(){
    	 
		$(":input[name='uloginname']").keyup(function(){
		
			var val = $(this).val();
			val = $.trim(val);
			if(val != ""){
			
				var url = "${pageContext.request.contextPath}/checkvaliateUserCode.action";
				var args = {"userName":val,"time": new Date()};
				$.post(url,args,function(data){
					$("#message").css("visibility","visible").html(data);
				});
			}
		});
	});
   
	//文件上传
function filup(){
		var usercode = $("#usercode").val();
   		var utruename = $("#utruename").val();
   		var sex = $('input:radio[name="sex"]:checked').val();
   		var uphone = $("#uphone").val();
   		var email = $("#email").val();
   		
		$.ajaxFileUpload({  
		    type: "POST",  
		    url: "${pageContext.request.contextPath}/jf_doUponlyIfo.action",  
		    data:{"usercode":usercode,"uphone":uphone,"email":email,"utruename":utruename,"sex":sex,"time":new Date()},//要传到后台的参数，没有可以不写  
		    secureuri : false,//是否启用安全提交，默认为false  
		    fileElementId:'file',//文件选择框的id属性  
		   
		    async : false,  
		    success: function(data){  
		         alert("信息修改成功！");
   				 window.parent.document.getElementById("loginout").click();
		    },  
		    error: function (data, status, e){  
		        //coding  
		    }  
		});
	
	}



    /* 上传图片后回显 */
    function changImg(e){  
        for (var i = 0; i < e.target.files.length; i++) {  
            var file = e.target.files.item(i);  
            if (!(/^image\/.*$/i.test(file.type))) {  
                continue; //不是图片 就跳出这一次循环  
            }  
            //实例化FileReader API  
            var freader = new FileReader();  
            freader.readAsDataURL(file);  
            freader.onload = function(e) {  
                $("#myImg").attr("src",e.target.result);  
            };
        }  
    }  
    /*验证信息为空 */
    $(".zl_input input").keyup(function(){
    	var len = $(this).val().trim().length;
    	if(len <= 0){
    		$(this).parent().find("span").css("visibility","visible").html("不能为空！");
    	}else{
    		$(this).parent().find("span").css("visibility","hidden");
    	};
    	cknull();
    });
    function cknull(){
		$(".zl_input input").each(function(){
			if($(this).val() != ""){
				$("#updateUinfo").css("display","block");
				$("#updateUinfono").css("display","none");
			}else{
				$("#updateUinfo").css("display","none");
				$("#updateUinfono").css("display","block");
			}
		});
	}
</script>

</html>