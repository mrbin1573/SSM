<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>

<body onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">

        <div class="tab-content">
            <!--第一页--原始数据上传-->
            <div class="tab-pane fade in active" id="second_1">
                <!--上传原始数据-->
                <div class="tab-content menu-third-content">
                    <div class="tab-pane fade in active" id="three_1">
                   
                        <!--上传原始数据 第一个三级菜单-->
                        <ul id="myTab" class="nav nav-tabs menu_rihgt_after">
                            <li class="active">
                                <a href="#three_c_1" data-toggle="tab"><img src="images/menu_third.png">&nbsp;&nbsp;上传原始数据</a>
                            </li>
                        </ul>
                        </div>
                </div>
                        <!--文件上传-->
                        <div class="tab-content menu_third_page">
                            <!-----------------------上传------------------>
                            <div class="tab-pane fade in active menu-third container" id="three_c_1">
                                <!--上传按钮-->
                                <div class="upload_icon">
                                    <!--上传图标-->
                                    <div class="upload"><img width="200px" src="images/upload2.png"></div>
                                    <br>
                                     <form action="jyfileUpload.action" method="post"	enctype="multipart/form-data">
                                    <div class="upload">
                                        <a href="javascript:;" class="file">选择 excel 文件
                                                <input type="file" name="file" id="uploadList"  onchange="fileList()" accept="application/vnd.ms-excel" multiple>
                                        </a>
                                       
                                    </div>
                                    <div id="addList">
                                        <br>
                                        <hr class='line' />
                                        <!--进度条生成位置-->
                                    </div>
                                    <!--上传取消按钮-->
                                    <div>
                                        <button class="up_btn"  onclick="progressGo()">全部上传</button>
                                        <button class="up_btn up_clean" onclick="upClean()">清除全部</button>
                                    </div>
                                    </form>
                                </div>
                                <br>
                                <br>
                                <br>
                            </div>
                        </div>
                    
            </div>
            <!--第一页--原始数据上传over-->
        </div>
   
</body>
<script>
    /*获取上传的文件*/
    function fileList() {
        $(".up_btn").show(); /*显示全部上传和清除全部按钮*/
        var q = document.getElementById("uploadList").files; /*获得文件数组*/
        /*alert(q[0].name);*/
        for (i = 0; i <= q.length; i++) { /*添加文件显示信息*/
            $("#addList").append("<div class='col-md-12 list_padding'><div class='col-md-2 list_padding'><div class='progress progress-striped active'><div class='progress-bar progress-bar-success' role='progressbar' aria-valuenow='60' aria-valuemin='0' aria-valuemax='100' time=" + (q[i].size) + " style='width: 0%;'></div></div></div><div class='fileName col-md-2'><div>大小：" + "<span class='fileSize'>" + Math.round((q[i].size) / 1000) + "</span>" + "KB</div></div><div class='fileName col-md-4'><div>文件名：" + q[i].name + "</div></div></div><hr class='line col-md-12'/></div>");
        }
    }

    /*清除上传文件*/
    function upClean() {
        location.reload();
    }
    /*点击上传进度条走*/
    function progressGo() {
        var p = $(".progress-bar"); /*获取进度条*/

        p.each(function () {

            $(this).animate({
                width: "100%"
            }, parseInt(10000 * Math.random()))
        })
    }
</script>

</html>