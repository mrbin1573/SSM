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
</head>
<body
	onLoad="javascript:window.resizeTo(screen.availWidth,screen.availHeight);window.moveTo(0,0) ">

	<div class="tab-content">

		<div class="tab-pane fade in active" id="second_1">
			<div class="tab-content menu-third-content navbar-fixed-top">
				<div class="tab-pane fade in active" id="three_1">
					<!--三级菜单-->
					<ul id="myTab" class="nav nav-tabs menu_rihgt_after">
						<li class="active"><a href="#three_c_1" data-toggle="tab"><img
								src="images/menu_third.png">&nbsp;&nbsp;执行反馈表</a>
						</li>
					</ul>
				</div>
			</div>
			<center>
				<div><br>
					
					<h3>调控指令执行情况甲方信息反馈表</h3>
					<c:if test="${feedback02s == null}">
						暂无数据
					</c:if>
					<c:if test="${feedback02s != null}">
					
					<div style="float:left;margin-left:7.5%;margin-bottom:10px">
						<h4 style="float:left" >调控指令发布时间：</h4>
						<h4 style="float:left" ><fmt:formatDate value="${cdate}" pattern="yyyy年MM月dd日 "></fmt:formatDate></h4>
					</div>
					<table class="table" border="1px">
						<tr>
							<th>序号</th>
							<th>动态调控被动控制变量名</th>
							<th id="colNum" colspan="100">实施调控关联变量名 
							<div class="button_box">
								<button id="rdccol">减少</button>
								<button id="addcol">增加</button>
							</div>
							<!-- <img width="20px" id="rdccol" src="images/reduce.png"> 
							<img width="20px" id="addcol" src="images/add.png"> -->
							</th>

						</tr>
						<c:forEach var="fb" items="${feedback02s}" varStatus="st">				
						<tr id="tdNum" class="addplace datatr">
							<%-- <input id="supid" type="hidden" class="${fb.timid}" /> --%>
							<td class="${fb.id}">${st.index+1}</td>
							<td class="${fb.passivevar}">${fb.passivevar}</td>
							<td class="${fb.timid}" style="display: none;"></td>
							<c:forEach items="${fb.feedback05s}" var="f">
							<td style="padding:0px;">
								<div class="rst_box">
									<input class="rst varname"type="text" value="&nbsp;${f.useractive}">
								</div>
								<div class="slt_box">
									<select class="slt">
										<option>--关联变量名--</option>
												<option>FI100(Nm3/h)</option>
												<option>FC101(t/h)</option>
												<option>FC105(Nm3/h)</option>
												<option>FFY101</option>
												<option>FFY105</option>
												<option>FI203(Nm3/h)</option>
												<option>PC167(mmH2O)</option>
												<option>FI175(m3/h)</option>
												<option>FI172(m3/h)</option>
												<option>FC191(Nm3/h)</option>
												<option>FC133(Nm3/h)</option>
												<option>FI162(t/h)</option>
												<option>FI107(t/h)</option>
												<option>FI207(t/h)</option>
												<option>FI180(t/h)</option>
												<option>FI177(t/h)</option>
												<option>FI9005(t/h)</option>
												<option>FI147(t/h)</option>
												<option>FI199(t/h)</option>
												<option>TI106(℃)</option>
												<option>TI240(℃)</option>
												<option>TI107(℃)</option>
												<option>TI124(℃)</option>
												<option>TI262(℃)</option>
												<option>TI125(℃)</option>
												<option>TI132(℃)</option>
												<option>TC127(℃)</option>
												<option>TI137(℃)</option>
												<option>TI153(℃)</option>
												<option>TI154(℃)</option>
												<option>TI274(℃)</option>
												<option>TI275(℃)</option>
												<option>PI176(MPa)</option>
												<option>PI100(MPa)</option>
												<option>PI109A(MPa)</option>
												<option>PC117(MPa)</option>
												<option>PC123(MPa)</option>
												<option>PI142(MPa)</option>
												<option>PI182A(MPa)</option>
												<option>PC153(MPa)</option>
												<option>PC156(MPa)</option>
												<option>AI113(%)</option>
												<option>AI108(%)</option>
												<option>AI100(%)</option>
												<option>AI101(%)</option>
												<option>AC102(%)</option>
												<option>AI103(%)</option>
												<option>AC111(%)</option>
												<option>TI5301(℃)</option>
												<option>FI153(Nm3/h)</option>
												<option>FI116(t/h)</option>
												<option>FI140(kNm3/h)</option>
												<option>FI09802(t/h)</option>
												<option>FI09803(t/h)</option>
												<option>PC131(MPa)</option>
												<option>TC200(℃)</option>
												<option>TI203F(℃)</option>
												<option>TI208A(℃)</option>
												<option>TI210H(℃)</option>
												<option>TI266A(℃)</option>
												<option>TI268H(℃)</option>
												<option>TI239(℃)</option>
												<option>TC142(℃)</option>
												<option>TC144(℃)</option>
												<option>FI163(Nm3/h)</option>
												<option>FI204(Nm3/h)</option>
												<option>FI240(Nm3/h)</option>
												<option>FI241(Nm3/h)</option>
												<option>FI242(Nm3/h)</option>
												<option>FI146(Nm3/h)</option>
												<option>TI5302(℃)</option>
												<option>PC165(%)</option>
												<option>PC166(%)</option>
												<option>TI104(℃)</option>
												<option>TI113(℃)</option>
												<option>TI109(℃)</option>
												<option>PI7(MPa)</option>
												<option>TI213(℃)</option>
												<option>TI188(℃)</option>
												<option>PC144(MPa)</option>
												<option>PDI137(kPa)</option>
												<option>TC105(℃)</option>
												<option>TI276(℃)</option>
												<option>TI233(℃)</option>
												<option>TI148(℃)</option>
												<option>TI140(℃)</option>
												<option>FI117(m3/h)</option>
												<option>FI118(m3/h)</option>
												<option>P156(%)</option>
									</select>
								</div>
							</td>
							</c:forEach>
						</tr>
						</c:forEach>
					</table>
					<input type="button" id="backtable_sb" class="btn btn-success" value="提交">
					<span style="float:left;margin-left:7%;"><h5>注：实施调控关联变量指此次指令所发布的动态调控被动控制变量实际调控时调控的关联变量，根据具体实施情况填表。</h5></span>
					</c:if>
				</div>
			</center>
			
			
			
			
			
			
			
		</div>
		<!--第一页--原始数据上传over-->
	</div>
	<script src="js/jquery-2.2.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
<script>
	/* 添加关联变量 */
	$("#addcol").click(function() {
		$(".addplace").append('<td style="padding:0px;"><div class="rst_box">'
									+'<input class="rst varname"type="text">'
								+'</div>'
								+'<div class="slt_box">'
									+'<select class="slt">'
											+'<option>--关联变量名--</option>'
										+'<option>FI100(Nm3/h)</option>'
										+'<option>FC101(t/h)</option>'
										+'<option>FC105(Nm3/h)</option>'
										+'<option>FFY101</option>'
										+'<option>FFY105</option>'
										+'<option>FI203(Nm3/h)</option>'
										+'<option>PC167(mmH2O)</option>'
										+'<option>FI175(m3/h)</option>'
										+'<option>FI172(m3/h)</option>'
										+'<option>FC191(Nm3/h)</option>'
										+'<option>FC133(Nm3/h)</option>'
										+'<option>FI162(t/h)</option>'
										+'<option>FI107(t/h)</option>'
										+'<option>FI207(t/h)</option>'
										+'<option>FI180(t/h)</option>'
										+'<option>FI177(t/h)</option>'
										+'<option>FI9005(t/h)</option>'
										+'<option>FI147(t/h)</option>'
										+'<option>FI199(t/h)</option>'
										+'<option>TI106(℃)</option>'
										+'<option>TI240(℃)</option>'
										+'<option>TI107(℃)</option>'
										+'<option>TI124(℃)</option>'
										+'<option>TI262(℃)</option>'
										+'<option>TI125(℃)</option>'
										+'<option>TI132(℃)</option>'
										+'<option>TC127(℃)</option>'
										+'<option>TI137(℃)</option>'
										+'<option>TI153(℃)</option>'
										+'<option>TI154(℃)</option>'
										+'<option>TI274(℃)</option>'
										+'<option>TI275(℃)</option>'
										+'<option>PI176(MPa)</option>'
										+'<option>PI100(MPa)</option>'
										+'<option>PI109A(MPa)</option>'
										+'<option>PC117(MPa)</option>'
										+'<option>PC123(MPa)</option>'
										+'<option>PI142(MPa)</option>'
										+'<option>PI182A(MPa)</option>'
										+'<option>PC153(MPa)</option>'
										+'<option>PC156(MPa)</option>'
										+'<option>AI113(%)</option>'
										+'<option>AI108(%)</option>'
										+'<option>AI100(%)</option>'
										+'<option>AI101(%)</option>'
										+'<option>AC102(%)</option>'
										+'<option>AI103(%)</option>'
										+'<option>AC111(%)</option>'
										+'<option>TI5301(℃)</option>'
										+'<option>FI153(Nm3/h)</option>'
										+'<option>FI116(t/h)</option>'
										+'<option>FI140(kNm3/h)</option>'
										+'<option>FI09802(t/h)</option>'
										+'<option>FI09803(t/h)</option>'
										+'<option>PC131(MPa)</option>'
										+'<option>TC200(℃)</option>'
										+'<option>TI203F(℃)</option>'
										+'<option>TI208A(℃)</option>'
										+'<option>TI210H(℃)</option>'
										+'<option>TI266A(℃)</option>'
										+'<option>TI268H(℃)</option>'
										+'<option>TI239(℃)</option>'
										+'<option>TC142(℃)</option>'
										+'<option>TC144(℃)</option>'
										+'<option>FI163(Nm3/h)</option>'
										+'<option>FI204(Nm3/h)</option>'
										+'<option>FI240(Nm3/h)</option>'
										+'<option>FI241(Nm3/h)</option>'
										+'<option>FI242(Nm3/h)</option>'
										+'<option>FI146(Nm3/h)</option>'
										+'<option>TI5302(℃)</option>'
										+'<option>PC165(%)</option>'
										+'<option>PC166(%)</option>'
										+'<option>TI104(℃)</option>'
										+'<option>TI113(℃)</option>'
										+'<option>TI109(℃)</option>'
										+'<option>PI7(MPa)</option>'
										+'<option>TI213(℃)</option>'
										+'<option>TI188(℃)</option>'
										+'<option>PC144(MPa)</option>'
										+'<option>PDI137(kPa)</option>'
										+'<option>TC105(℃)</option>'
										+'<option>TI276(℃)</option>'
										+'<option>TI233(℃)</option>'
										+'<option>TI148(℃)</option>'
										+'<option>TI140(℃)</option>'
										+'<option>FI117(m3/h)</option>'
										+'<option>FI118(m3/h)</option>'
										+'<option>P156(%)</option>'
									+'</select>'
								+'</div></td>');/*添加列*/
		var col = parseInt($("#colNum").attr("colspan")) + 1;
		$("#colNum").attr("colspan", col)/*添加合并列*/
	});
	/* 减少关联变量 */
	$("#rdccol").click(function() {
		var tdNum = $("#tdNum td").size();
		
		if (tdNum >= 2) {
			$(".addplace td:last-child").remove();/*减少列*/
			var col = parseInt($("#colNum").attr("colspan")) - 1;
			$("#colNum").attr("colspan", col)/*减少合并列*/
		} else {
			alert("至少一个关联变量!")
		}

	});
	/* 选中关联变量填入text */
	$("body").on("change",".slt",function(){
		var flagaa = false;
		/* 判断选项是否一致 */
		var nowvar = $(this).val().trim();
		$(this).parent().parent().siblings().find(".varname").each(function(){
			if(nowvar == $(this).val().trim()){
				flagaa = true;
				alert("你已经选择了变量:"+nowvar);
				
			}else{
				flagaa = false;
			}
			
		});
		/* 不重复添加新变量 */
		if(flagaa == false){
			var chooseval = $(this).find('option:selected').val();
			if(chooseval == "--关联变量名--"){
					alert("请勿选择此项！");
			}else{
				$(this).parent().parent().find(".rst").val(chooseval);
			}	
		}
	});
	/* 提交数据 */
	
	$("#backtable_sb").on("click",function(){
		var url = "${pageContext.request.contextPath}/jf_updateUserVar.action";
		var datas = [];
		var data1 = "123123";
		$(".datatr").each(function(i){//循环tr
				var data = new Object();
				var beidongvar = $(this).find("td:first-child").attr("class").trim();
			    var beidongname = $(this).find("td:nth-child(2)").attr("class").trim();
			    var supperid = $(this).find("td:nth-child(3)").attr("class").trim();
				var xg = [];
				$(this).find(".varname").each(function(){//循环td
					 xg.push($(this).val().trim());
				});
				data.parName = beidongname;
				data.supid = supperid;
				data.id = beidongvar;
				data.uservar = xg;
				datas.push(data);
				
		});
		 $.ajax({
                 type:"POST",  
                 url: url,
                 contentType:"application/json", // 指定这个协议很重要  
                 data:JSON.stringify(datas),  
                 success:function(data){  
                 	alert("提交成功");
                 },
                 error: function(data){
                 	alert("提交失败");
				}
             });  
	});
</script>

</html>