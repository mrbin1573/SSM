<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<meta charset="UTF-8">
<!--[if IE 8]><style>.ie8 .alert-circle,.ie8 .alert-footer{display:none}.ie8 .alert-box{padding-top:75px}.ie8 .alert-sec-text{top:45px}</style><![endif]-->
<title></title>
<link href="css/index.css" rel="stylesheet" type="text/css" />
<style>

.alert-box {
	display: none;
	position: relative;
	margin: 96px auto 0;
	padding: 180px 85px 22px;
	border-radius: 10px 10px 0 0;
	background: #FFF;
	box-shadow: 5px 9px 17px rgba(102,102,102,0.75);
	width: 286px;
	color: #FFF;
	text-align: center
}
.alert-box p {
	margin: 0
}
.alert-circle {
	position: absolute;
	top: -50px;
	left: 111px
}
.alert-sec-circle {
	stroke-dashoffset: 0;
	stroke-dasharray: 735;
	transition: stroke-dashoffset 1s linear
}
.alert-sec-text {
	position: absolute;
	top: 11px;
	left: 190px;
	width: 76px;
	color: #000;
	font-size: 68px
}
.alert-sec-unit {
	font-size: 20px
}
.alert-body {
	margin: 35px 0
}
.alert-head {
	color: #242424;
	font-size: 28px
}
.alert-concent {
	margin: 25px 0 14px;
	color: #7b7b7b;
	font-size: 18px
}
.alert-concent p {
	line-height: 27px
}
.alert-btn {
	display: block;
	border-radius: 10px;
	background-color: #19708E;
	height: 55px;
	line-height: 55px;
	width: 286px;
	color: #FFF;
	font-size: 20px;
	text-decoration: none;
	letter-spacing: 2px
}
.alert-btn:hover {
	background-color: #6BC2FF
}
.alert-footer {
	margin: 0 auto;
	height: 42px;
	width: 120px
}
.alert-footer-icon {
	float: left
}

</style>
</head>
<body class="ie8">
<div id="js-alert-box" class="alert-box"> <svg class="alert-circle" width="234" height="234">
  <circle cx="117" cy="117" r="108" fill="#FFF" stroke="#19708E" stroke-width="17"></circle>
  <circle id="js-sec-circle" class="alert-sec-circle" cx="117" cy="117" r="108" fill="transparent" stroke="#F4F1F1" stroke-width="18" transform="rotate(-90 117 117)"></circle>
  <text class="alert-sec-unit" x="50" y="172" fill="#7b7b7b">秒后返回上一级</text>
  </svg>
  <div id="js-sec-text" class="alert-sec-text"></div>
  <div class="alert-body">
    <div id="js-alert-head" class="alert-head"></div>
    <div class="alert-concent">
      <p>您刚才上传的文件不属于该公司</p>
      <p>请确认无误后重新上传</p>
    </div>
    <a id="js-alert-btn" class="alert-btn" href="guideUpload.action">立即返回</a> </div>

</div>
<script>
function alertSet(e) {
    document.getElementById("js-alert-box").style.display = "block",
    document.getElementById("js-alert-head").innerHTML = e;
    var t = 5,
    n = document.getElementById("js-sec-circle");
    document.getElementById("js-sec-text").innerHTML = t,
    setInterval(function() {
        if (0 == t){
			location.href="guideUpload.action";//#时间到后跳转地址 guideUpload.action
		}else {
            t -= 1,
            document.getElementById("js-sec-text").innerHTML = t;
            var e = Math.round(t / 5 * 735);
            n.style.strokeDashoffset = e - 735;
        }
    },
    1000);
}
</script>
<script>alertSet('上传出错');</script>
</body>
</html>
