/*折线图数据生成*/
$(function(){
		Highcharts.setOptions({
			// 所有语言文字相关配置都设置在 lang 里
			lang : {
				resetZoom : '重置',
				resetZoomTitle : '重置缩放比例'
			},
			plotOptions : {
				series : {
					lineWidth : 3
				}
			},tooltip: {
				backgroundColor: {
	                linearGradient: [0, 0, 0, 60],
	                stops: [
	                    [0, '#FFFFFF'],
	                    [1, '#E0E0E0']
	                ]
	            },
	            borderWidth: 1,
	            borderColor: '#AAA'
	        },
			chart : {
				zoomType : 'x',
				selectionMarkerFill : 'rgba(0,0,0, 0.2)',
				panning : true,
				panKey : 'shift',
				resetZoomButton : {
					// 按钮定位
					position : {
						align : 'right', // by default
						verticalAlign : 'top', // by default
						x : 0,
						y : -30
					},
					// 按钮样式
					theme : {
						fill : 'white',
						stroke : 'silver',
						r : 0,
						states : {
							hover : {
								fill : '#41739D',
								style : {
									color : 'white'
								}
							}
						}
					}
				}
			}
		});

		/*******单位***************/
		 var tooltip1 = "（kgce/tNH<sub>3</sub>）";//提示框单位 吨氨综合消耗（kgce/tNH3)
		 var tooltip2 = "（Nm<sup>3</sup>/tNH<sub>3</sub>）";//提示框单位   吨氨气耗(Nm3/tNH3)
		 var tooltip3 = "（kgce/tNH<sub>3</sub>）";//提示框单位 吨氨净蒸汽耗(kgce/tNH3)
		 var tooltip4 = "（t）";//提示框单位 月氨产量(t)
		 var tooltip5 = "（Nm<sup>3</sup>）";//提示框单位   月气耗(Nm3)
		 var tooltip6 = "（kgce）";//提示框单位 月净蒸汽耗(kgce) 
		 /*********图例*****************/
		 var tuli1 = "吨氨综合消耗"; //图例1
		 var tuli2 = "吨氨气耗";//图例2
		 var tuli3 = "吨氨净蒸汽耗";//图例3
		 var tuli4 = "月氨产量（t）"; //图例1
		 var tuli5 = "月气耗（Nm<sup>3</sup>）";//图例2
		 var tuli6 = "月净蒸汽耗（kgce）";//图例3

		 
		 var title1 = "吨氨综合消耗";
		 var title2 = "吨氨气耗";
		 var title3 = "吨氨净蒸汽耗";
//ajax查询日报表按班请求   
$("#day_class_show").click(function(){
	   var begin_day_class = $("#indate_day_ban1").val();
	   var end_day_class = $("#indate_day_ban2").val();
	   
		 /*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 if(begin_day_class != "" &&  end_day_class != "" ){
		   if(begin_day_class > end_day_class){
			   alert("开始时间晚于结束时间，请重新选择！！");
			   return false;
		   };
		   var url = getRootPath()+"/jy_to_show_day_data_ajax";
		   var args = {"date_begin":begin_day_class,"date_end":end_day_class,"time": new Date()};
		   		$.post(url,args,function(data){
		   			 var data_class = $.parseJSON(data); 
		    	     if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_day_ban tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
		    	    	 if(i%3 == 0){
		    				 var time = data_class[i].时间;
		    				 x_zuobiao.push(renderTime(time.toString(),false)); //时间
		    				 }//时间
		    	    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var racl    = data_class[i].时段氨产量;//日氨产量
		    	    	 var dh      = data_class[i].时段净蒸汽耗;//电耗
		    	    	 var qh      = data_class[i].时段气耗;//气耗
		    	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
		    	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
		    	    	 var dadh    = qh / racl;//吨氨电耗
		    	    	 var daqh    = dh / racl;//吨氨气耗
		    	    	 var ban     = data_class[i].classNumber.toFixed(0);//早中晚班
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true);
		    	    	 switch(ban)
		    	    	 {
		    	    	 case "1":
		    	    		 ban="早班";
		    	    		 data11.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data12.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data13.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 case "2":
		    	    		 ban="中班";
		    	    		 data21.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data22.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data23.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 case "3":
		    	    		 ban="晚班";
		    	    		 data31.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data32.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data33.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 }
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+racl.toFixed(2)+"</td><td>"+dh.toFixed(2)+"</td><td>"+qh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazh.toFixed(2)+"</td><td>"+dadh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 $("#energy_day_ban").append(newTr);
		    	    }
		    	     /*合并行*/
		  		     _w_table_rowspan("#energy_day_ban",1);
		  		     _w_table_rowspan("#energy_month_ban",1);
		    	     chart_ban("container_day_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31);//吨氨综合消耗
		    		 chart_ban("container_day_ban_2",x_zuobiao,title2,tooltip2,data12,data22,data32);//吨氨气耗
		    		 chart_ban("container_day_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33);//吨氨净蒸汽耗
		       });
		       
		       
	   }
		 
	});
//ajax查询日报表按日请求   
$(document).ajaxStart($.blockUI).ajaxStop($.unblockUI);
$("#day_day_show").click(function(){
	   var begin_day_class = $("#indate_day_day1").val();
	   var end_day_class = $("#indate_day_day2").val();
	   
	   var data1 = [];//数据1
	   var data2 = [];//数据2
	   var data3 = [];//数据3
       var x_zuobiao = [];//横坐标 时间字符串转化而来
	   if(begin_day_class != "" &&  end_day_class != "" ){
		   if(begin_day_class > end_day_class){
			   alert("开始时间晚于结束时间，请重新选择！！");
			   return false;
		   };
		   var url = getRootPath()+"/jy_to_show_day_day_ajax";
		   var args = {"date_begin":begin_day_class,"date_end":end_day_class,"time": new Date()};
		   		$.post(url,args,
		    		 function(data){
		    	     var data_class = $.parseJSON(data); 
		    	     if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_day tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
		    	    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var racl    = data_class[i].时段氨产量;//日氨产量
		    	    	 var dh      = data_class[i].时段净蒸汽耗;//电耗
		    	    	 var qh      = data_class[i].时段气耗;//气耗
		    	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
		    	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
		    	    	 var dadh    = qh / racl;//吨氨电耗
		    	    	 var daqh    = dh / racl;//吨氨气耗
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true);
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+racl.toFixed(2)+"</td><td>"+dh.toFixed(2)+"</td><td>"+qh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazh.toFixed(2)+"</td><td>"+dadh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 $("#energy_day").append(newTr);
		    	    	 data1.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    			 data2.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    			 data3.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    			 x_zuobiao.push(renderTime(time.toString(),false)); //时间
		    	    	
		    	     }
		    	     chart_day("container_day",x_zuobiao,"line",tooltip1,data1,tuli1);//吨氨综合消耗
		    		 chart_day("container_day_1",x_zuobiao,"line",tooltip2,data2,tuli2);//吨氨气耗(合计)
		    		 chart_day("container_day_2",x_zuobiao,"line",tooltip3,data3,tuli3);//吨氨天然气耗
		       });
		       
		       
	   }
	
	});
  
//ajax查询月报表按日请求   
$("#month_day_show").click(function(){
	   var begin_month_class = $("#indate_month_day1").val();
	   var data1 = [];//数据1
	   var data2 = [];//数据2
	   var data3 = [];//数据3
	   var x_zuobiao = [];//横坐标 时间字符串转化而来
	   if(begin_month_class != ""){
		   var url = getRootPath()+"/jy_to_show_month_data_ajax";
		   var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
		        $.post(url,args,function(data){
		    	     var data_class = $.parseJSON(data); 
		    	     if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_month_day tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
		    	    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var racl    = data_class[i].时段氨产量;//日氨产量
		    	    	 var dh      = data_class[i].时段净蒸汽耗;//电耗
		    	    	 var qh      = data_class[i].时段气耗;//气耗
		    	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
		    	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
		    	    	 var dadh    = qh / racl;//吨氨电耗
		    	    	 var daqh    = dh / racl;//吨氨气耗
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true);
		    	    	 //alert(racl);
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+racl.toFixed(2)+"</td><td>"+dh.toFixed(2)+"</td><td>"+qh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazh.toFixed(2)+"</td><td>"+dadh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 $("#energy_month_day").append(newTr);
		    	    	 data1.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    			 data2.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    			 data3.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    			 x_zuobiao.push(renderTime(time.toString(),false)); //时间
		    	    	
		    	     }
		    	     chart_day("container_month_day",x_zuobiao,"line",tooltip1,data1,tuli1);//吨氨综合消耗
		    		 chart_day("container_month_day_1",x_zuobiao,"line",tooltip2,data2,tuli2);//吨氨气耗
		    		 chart_day("container_month_day_2",x_zuobiao,"line",tooltip3,data3,tuli3);//吨氨净蒸汽耗(
		    		 
		       });
		 }
	
	});

//ajax查询月报表按班请求   
$("#month_ban_show").click(function(){
	   var begin_month_class = $("#indate_month_ban1").val();
	   	/*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 if(begin_month_class != ""){
		   var url = getRootPath()+"/jy_to_show_month_class_ajax";
		   var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
		   		$.post(url,args,function(data){
		    	     var data_class = $.parseJSON(data); 
		    	     if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_month_ban tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
		    	    	 if(i%3 == 0){
		    				 var time = data_class[i].时间;
		    				 x_zuobiao.push(renderTime(time.toString(),false)); //时间
		    				 }//时间
		    	    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var racl    = data_class[i].时段氨产量;//日氨产量
		    	    	 var dh      = data_class[i].时段净蒸汽耗;//电耗
		    	    	 var qh      = data_class[i].时段气耗;//气耗
		    	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
		    	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
		    	    	 var dadh    = qh / racl;//吨氨电耗
		    	    	 var daqh    = dh / racl;//吨氨气耗
		    	    	 var ban     = data_class[i].classNumber.toFixed(0);//早中晚班
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true);
		    	    	 switch(ban)
		    	    	 {
		    	    	 case "1":
		    	    		 ban="早班";
		    	    		 data11.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data12.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data13.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 case "2":
		    	    		 ban="中班";
		    	    		 data21.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data22.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data23.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 case "3":
		    	    		 ban="晚班";
		    	    		 data31.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    	    		 data32.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    	    		 data33.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    	    		 break;
		    	    	 }
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+racl.toFixed(2)+"</td><td>"+dh.toFixed(2)+"</td><td>"+qh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazh.toFixed(2)+"</td><td>"+dadh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 $("#energy_month_ban").append(newTr);
		    	     }
		    	     /*合并行*/
		  		     _w_table_rowspan("#energy_day_ban",1);
		  		     _w_table_rowspan("#energy_month_ban",1);
		    	     chart_ban("container_month_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31);//吨氨综合消耗
		    		 chart_ban("container_month_ban_2",x_zuobiao,title2,tooltip2,data12,data22,data32);//吨氨气耗
		    		 chart_ban("container_month_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33);//吨氨净蒸汽耗
		   		});
		}
		 
	});
//ajax查询季度报表 
$("#season_show").click(function(){
	var begin_season_year = $("#indate_year").val();
	var begin_season_season = $("#indate_season_season").val();
	var hj_yacl= 0;//合计月氨产量(t)
	var hj_yjzqh= 0;//月净蒸汽耗(kgce)
	var hj_yqh= 0;//合计月气耗
	var hj_xsacl = 0;//合计小时氨产量
	var hj_dazhxh= 0;//合计吨氨综合消耗
	var hj_daqh= 0;//合计吨氨气耗
	var hj_dajzqh= 0;//合计吨氨净蒸汽耗
	var hj_ybs= 0;//合计样本数
	var tuli4 = "月氨产量(t)"; //图例1
	var tuli5 = "月气耗(Nm3)";//图例2
	var tuli6 = "月净蒸汽耗(kgce)";//图例3

	 var data1 = [];//数据1
	 var data2 = [];//数据2
	 var data3 = [];//数据3
	 
	 var data4 = [];//数据3
	 var data5 = [];//数据3
	 var data6 = [];//数据3

	 var x_zuobiao = [];//横坐标 时间字符串转化而来
	 
	   if(begin_season_year != ""&& begin_season_season != ""){
		   var url = getRootPath()+"/jy_do_select_Quarter_ajax";
		   var args = {"Quarter_year":begin_season_year,"Quarter":begin_season_season,"time": new Date()};
			   $.post(url,args,function(data){
		    	   //alert(data)
		    	     var data_class = $.parseJSON(data); 
		    	     if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_season tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
		    	    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var yacl    = data_class[i].时段氨产量;//月氨产量
		    	    	 var sdjzqh      = data_class[i].时段净蒸汽耗;//月净蒸汽耗
		    	    	 var sdqh      = data_class[i].时段气耗;//月气耗
		    	    	 var xsacl   = yacl / orig_id * 6;//小时氨产量
		    	    	 var dazhxh    = 1.2143 * sdqh / yacl + sdjzqh / yacl;//吨氨综合消耗
		    	    	 var daqh    = sdqh / yacl;//吨氨气耗
		    	    	 var dajzqh    = sdjzqh / yacl;//吨氨净蒸汽耗
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true).substring(0, 8);;
		    	    	 hj_ybs += orig_id;
		    	    	 hj_yacl += yacl;
		    	    	 hj_yjzqh += sdjzqh;
		    	    	 hj_yqh += sdqh;
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+yacl.toFixed(2)+"</td><td>"+sdjzqh.toFixed(2)+"</td><td>"+sdqh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+dajzqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 $("#energy_season").append(newTr);
		    	    	 data1.push(Math.round(dazhxh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    			 data2.push(Math.round(daqh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    			 data3.push(Math.round(dajzqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
		    			 
		    			 data4.push([renderTime(time.toString(),true).substring(0, 8),Math.round(yacl*100)/100]) ;        //数据2  月氨产量(t)
		    			 data5.push([renderTime(time.toString(),true).substring(0, 8),Math.round(sdqh*100)/100]) ;       //数据2  月气耗(Nm3)
		    			 data6.push([renderTime(time.toString(),true).substring(0, 8),Math.round(sdjzqh*100)/100]) ;       //数据2  月净蒸汽耗(kgce)
		    			 x_zuobiao.push(renderTime(time.toString(),true).substring(0, 8)); //时间
		    		 
		    	    	
		    	     }
		    	     //合计
		    	     hj_xsacl = hj_yacl/hj_ybs *6;//小时氨产量
		    	     hj_dazhxh = hj_yjzqh/hj_yacl + hj_yqh/hj_yacl*1.2143//吨氨综合消耗
		    	     hj_daqh = hj_yqh/hj_yacl;
		    	     hj_dajzqh = hj_yjzqh/hj_yacl;
		    	     //alert(hj_ybs)
		    	     var newTrHj = "<tr style='color:red'><td>合计</td><td>"+hj_yacl.toFixed(2)+"</td><td>"+hj_yjzqh.toFixed(2)+"</td><td>"+hj_yqh.toFixed(2)+"</td><td>"+hj_xsacl.toFixed(2)+"</td><td>"+hj_dazhxh.toFixed(2)+"</td><td>"+hj_daqh.toFixed(2)+"</td><td>"+hj_dajzqh.toFixed(2)+"</td><td>"+hj_ybs.toFixed(0)+"</td></tr>";
		    	     $("#energy_season").append(newTrHj);
		    	     chart_day("container_season",x_zuobiao,"column",tooltip1,data1,tuli1);//吨氨综合消耗
		    		 chart_day("container_season_1",x_zuobiao,"column",tooltip2,data2,tuli2);//吨氨气耗(合计)
		    		 chart_day("container_season_2",x_zuobiao,"column",tooltip3,data3,tuli3);//吨氨天然气耗

		    		 chart_day("container_season_r",x_zuobiao,"pie",tooltip4,data4,tuli4);//月氨产量(t)
		    		 chart_day("container_season_r1",x_zuobiao,"pie",tooltip5,data5,tuli5);//月气耗(Nm3)
		    		 chart_day("container_season_r2",x_zuobiao,"pie",tooltip6,data6,tuli6);//月净蒸汽耗(kgce) 	
		    		 
		       });
		       
		       
	   }
	
	});

//ajax查询年报表 
$("#year_show").click(function(){
	var begin_year = $("#indate_year").val();
	var hj_yacl= 0;//合计月氨产量(t)
	var hj_yjzqh= 0;//月净蒸汽耗(kgce)
	var hj_yqh= 0;//合计月气耗
	var hj_xsacl = 0;//合计小时氨产量
	var hj_dazhxh= 0;//合计吨氨综合消耗
	var hj_daqh= 0;//合计吨氨气耗
	var hj_dajzqh= 0;//合计吨氨净蒸汽耗
	var hj_ybs= 0;//合计样本数
	var data1 = [];//数据1
	var data2 = [];//数据2
	var data3 = [];//数据3
	var x_zuobiao = [];//横坐标 时间字符串转化而来
	if(begin_year != ""){
		   var url = getRootPath()+"/jy_do_select_year_ajax";
		   var args = {"Year_data_begin":begin_year,"time": new Date()};
		   $.post(url,args,function(data){
		    	   var data_class = $.parseJSON(data); 
		    	   if(data_class.length <= 0){
						   alert("该时间段暂无数据，请重新选择！！");
						   return false;
					   };
		    	     $("#energy_year tr").not(":first").remove();
		    	     for(var i = 0; i < data_class.length; i++){
			    	 var orig_id = data_class[i].累积氨产量;//样本数
		    	    	 var time    = data_class[i].时间;//时间
		    	    	 var yacl    = data_class[i].时段氨产量;//月氨产量
		    	    	 var sdjzqh      = data_class[i].时段净蒸汽耗;//月净蒸汽耗
		    	    	 var sdqh      = data_class[i].时段气耗;//月气耗
		    	    	 var xsacl   = yacl / orig_id * 6;//小时氨产量
		    	    	 var dazhxh    = 1.2143 * sdqh / yacl + sdjzqh / yacl;//吨氨综合消耗
		    	    	 var daqh    = sdqh / yacl;//吨氨气耗
		    	    	 var dajzqh    = sdjzqh / yacl;//吨氨净蒸汽耗
		    	    	 var newdate = new Date();
		    	    	 var n_time  = renderTime(time.toString(),true).substring(0, 8);


		    	    	 hj_ybs += orig_id;
		    	    	 
		    	    	 hj_yacl += yacl;
		    	    	 hj_yjzqh += sdjzqh;
		    	    	 hj_yqh += sdqh;
		    	    	 
		    	    	 var newTr = "<tr><td>"+n_time+"</td><td>"+yacl.toFixed(2)+"</td><td>"+sdjzqh.toFixed(2)+"</td><td>"+sdqh.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+daqh.toFixed(2)+"</td><td>"+dajzqh.toFixed(2)+"</td><td>"+orig_id.toFixed(0)+"</td></tr>";
		    	    	 //alert(newTr)
		    	    	 $("#energy_year").append(newTr);
		    	    	 data1.push(Math.round(dazhxh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
		    			 data2.push(Math.round(daqh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
		    			 data3.push(Math.round(dajzqh*100)/100) ;    
		    			 x_zuobiao.push(renderTime(time.toString(),true).substring(0, 8)); //时间
		    				
		    	     }
		    	     //合计
		    	     hj_xsacl = hj_yacl/hj_ybs *6;//小时氨产量
		    	     hj_dazhxh = hj_yjzqh/hj_yacl + hj_yqh/hj_yacl*1.2143//吨氨综合消耗
		    	     hj_daqh = hj_yqh/hj_yacl;
		    	     hj_dajzqh = hj_yjzqh/hj_yacl;
		    	     //alert(hj_ybs)
		    	     var newTrHj = "<tr style='color:red'><td>合计</td><td>"+hj_yacl.toFixed(2)+"</td><td>"+hj_yjzqh.toFixed(2)+"</td><td>"+hj_yqh.toFixed(2)+"</td><td>"+hj_xsacl.toFixed(2)+"</td><td>"+hj_dazhxh.toFixed(2)+"</td><td>"+hj_daqh.toFixed(2)+"</td><td>"+hj_dajzqh.toFixed(2)+"</td><td>"+hj_ybs.toFixed(0)+"</td></tr>";
		    	     $("#energy_year").append(newTrHj);
		    	     chart_day("container_year",x_zuobiao,"column",tooltip1,data1,tuli1);//吨氨综合消耗
		    		 chart_day("container_year_1",x_zuobiao,"column",tooltip2,data2,tuli2);//吨氨气耗
		    		 chart_day("container_year_2",x_zuobiao,"column",tooltip3,data3,tuli3);//吨氨净蒸汽耗(
		    		 
		       });
		       
		       
	   }
	
	});
/***************日报表 按班查看***********************/
ajax_ban("jy_to_show_day_data_ajax");
/***************月报表 按班查看***********************/
ajax_ban("jy_to_show_month_class_ajax");

/***************按班查看函数***********************/
function ajax_ban(url){
	 var new_url = getRootPath()+"/"+url;//请求地址
	 var args = {"isdate":"1","time": new Date()};
	 /*******数据***************/
	 var data11 = [];//数据1
	 var data12 = [];//数据2
	 var data13 = [];//数据3
	 
	 var data21 = [];//数据1
	 var data22 = [];//数据2
	 var data23 = [];//数据3
	 
	 var data31 = [];//数据1
	 var data32 = [];//数据2
	 var data33 = [];//数据3
	 

	 
	 var x_zuobiao = [];//横坐标 时间字符串转化而来
	 
	 
	 $.post(new_url,args,function(data){
		 data = $.parseJSON(data);
		 for(var i = 0; i < data.length; i++){
			 var orig_id = data[i].累积氨产量;//样本数
			 if(i%3 == 0){
				 var time = data[i].时间;
				 x_zuobiao.push(renderTime(time.toString(),false)); //时间
				 }//时间
	    	 var racl    = data[i].时段氨产量;//日氨产量
	    	 var dh      = data[i].时段净蒸汽耗;//电耗
	    	 var qh      = data[i].时段气耗;//气耗
	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
	    	 var dadh    = qh / racl;//吨氨电耗
	    	 var daqh    = dh / racl;//吨氨气耗
	    	 var ban     = data[i].classNumber.toFixed(0);//早中晚班
	    	 
	    	 //alert(racl)
	    	 switch(ban)
	    	 {
	    	 case "1":
	    		 ban="早班";
	    		 data11.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
	    		 data12.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
	    		 data13.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
	    		 break;
	    	 case "2":
	    		 ban="中班";
	    		 data21.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
	    		 data22.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
	    		 data23.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
	    		 break;
	    	 case "3":
	    		 ban="晚班";
	    		 data31.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
	    		 data32.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
	    		 data33.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
	    		 break;
	    	 }
			 
		 }

		 /*highchart参数顺序 
		 *id 横坐标 标题  弹窗单位 数据一 图例一  数据和图例可以为空
		 *实际函数中多了一个X轴间隔interval无需传入*/
		 // chart_ban(id,x_zuobiao,title,tooltip1,data11,data12,data13)//吨氨综合消耗
		 //alert(data13)function chart_ban(id,x_zuobiao,title,tooltip,data1)
		 if(url == "jy_to_show_day_data_ajax"){
			 chart_ban("container_day_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31);//吨氨综合消耗
			 chart_ban("container_day_ban_2",x_zuobiao,title2,tooltip2,data12,data22,data32);//吨氨气耗
			 chart_ban("container_day_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33);//吨氨净蒸汽耗
		 }else if(url == "jy_to_show_month_class_ajax"){
			 chart_ban("container_month_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31);//吨氨综合消耗
			 chart_ban("container_month_ban_2",x_zuobiao,title2,tooltip2,data12,data22,data32);//吨氨气耗
			 chart_ban("container_month_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33);//吨氨净蒸汽耗

		 }
	});
}

/***************月报表 按日查看***********************/
ajax_day("jy_to_show_month_data_ajax");
/***************日报表 按日查看***********************/
ajax_day("jy_to_show_day_day_ajax");
/***************季度报表***********************/
ajax_day("jy_do_select_Quarter_ajax");
/***************年报表***********************/
ajax_day("jy_do_select_year_ajax");

/***************按日查看函数***********************/
function ajax_day(url){
	 var new_url = getRootPath()+"/"+url;//请求地址
	 var args = {"isdate":"1","time": new Date()};
	 var data1 = [];//数据1
	 var data2 = [];//数据2
	 var data3 = [];//数据3
	 if(url == "jy_do_select_Quarter_ajax"){//季度报表 柱状图数据
		 var data4 = [];//数据3
		 var data5 = [];//数据3
		 var data6 = [];//数据3
	 }
	 var x_zuobiao = [];//横坐标 时间字符串转化而来
	 $.post(new_url,args,function(data){
		 data = $.parseJSON(data);
		 for(var i = 0; i < data.length; i++){
			 var orig_id = data[i].累积氨产量;//样本数
	    	 var time    = data[i].时间;//时间
	    	 var racl    = data[i].时段氨产量;//日氨产量
	    	 var dh      = data[i].时段净蒸汽耗;//电耗
	    	 var qh      = data[i].时段气耗;//气耗
	    	 var xsacl   = racl / orig_id * 6;//小时氨产量
	    	 var dazh    = 1.2143 * qh / racl + dh / racl;//吨氨综合消耗
	    	 var dadh    = qh / racl;//吨氨电耗
	    	 var daqh    = dh / racl;//吨氨气耗
	    	 data1.push(Math.round(dazh*100)/100);            //数据1      吨氨综合消耗(kgce/tNH3)
			 data2.push(Math.round(dadh*100)/100) ;          //数据2   吨氨气耗(Nm3/tNH3)
			 data3.push(Math.round(daqh*100)/100) ;           //数据2吨氨净蒸汽耗(kgce/tNH3)
			 
			 if(url == "jy_do_select_Quarter_ajax"){//季度报表 柱状图数据
			 data4.push([renderTime(time.toString(),true).substring(0, 8),Math.round(racl*100)/100]) ;        //数据2  月氨产量(t)
			 data5.push([renderTime(time.toString(),true).substring(0, 8),Math.round(qh*100)/100]) ;       //数据2  月气耗(Nm3)
			 data6.push([renderTime(time.toString(),true).substring(0, 8),Math.round(dh*100)/100]) ;       //数据2  月净蒸汽耗(kgce)
			 }
			 x_zuobiao.push(renderTime(time.toString(),false)); //时间
		 }

		 /*highchart参数顺序 
		 *id 横坐标 标题  弹窗单位 数据一 图例一  数据和图例可以为空
		 *实际函数中多了一个X轴间隔interval无需传入*/
		 //chart("test_test",x_zuobiao,tooltip1,data1,tuli1);//吨氨综合消耗
		 if(url == "jy_to_show_day_day_ajax"){//日报表
			 
			 chart_day("container_day",x_zuobiao,"line",tooltip1,data1,tuli1);//吨氨综合消耗
			 chart_day("container_day_1",x_zuobiao,"line",tooltip2,data2,tuli2);//吨氨气耗(合计)
			 chart_day("container_day_2",x_zuobiao,"line",tooltip3,data3,tuli3);//吨氨天然气耗
		 }else if(url == "jy_to_show_month_data_ajax"){//月报表
			 
			 chart_day("container_month_day",x_zuobiao,"line",tooltip1,data1,tuli1);//吨氨综合消耗
			 chart_day("container_month_day_1",x_zuobiao,"line",tooltip2,data2,tuli2);//吨氨气耗
			 chart_day("container_month_day_2",x_zuobiao,"line",tooltip3,data3,tuli3);//吨氨净蒸汽耗
		 }else if(url == "jy_do_select_Quarter_ajax"){//季度报表
			 
			 chart_day("container_season",x_zuobiao,"column",tooltip1,data1,tuli1);//吨氨综合消耗
			 chart_day("container_season_1",x_zuobiao,"column",tooltip2,data2,tuli2);//吨氨气耗(合计)
			 chart_day("container_season_2",x_zuobiao,"column",tooltip3,data3,tuli3);//吨氨天然气耗

			 chart_day("container_season_r",x_zuobiao,"pie",tooltip4,data4,tuli4);//月氨产量(t)
			 chart_day("container_season_r1",x_zuobiao,"pie",tooltip5,data5,tuli5);//月气耗(Nm3)
			 chart_day("container_season_r2",x_zuobiao,"pie",tooltip6,data6,tuli6);//月净蒸汽耗(kgce) 	
		 }else if(url == "jy_do_select_year_ajax"){//年报表
			 
			 chart_day("container_year",x_zuobiao,"column",tooltip1,data1,tuli1);//吨氨综合消耗
			 chart_day("container_year_1",x_zuobiao,"column",tooltip2,data2,tuli2);//吨氨气耗
			 chart_day("container_year_2",x_zuobiao,"column",tooltip3,data3,tuli3);//吨氨净蒸汽耗(
		}

	 });
}

/*highcharts按 日   查看统一设置值函数*/
function chart_day(id,x_zuobiao,type,tooltip,data1,tuli1){
	/*设置横坐标间隔 X坐标最多放20个*/
	var dateLength = x_zuobiao.length;
	var itv = 1;
	for(var i = 20; i < dateLength; i++){
		itv = Math.ceil(i/20);//对20向上取整，所以interval最大值为20
    		//alert(interval)
	   };
	var chart = {
			type: type
	};
	var title = {
	       text: tuli1   
	   };
   var subtitle = {
		useHTML: true,
        text: '最高值：' + Math.max.apply(null, data1) + tooltip + '，最低值：'
		+ Math.min.apply(null, data1) + tooltip};
   var xAxis = {
       categories: x_zuobiao,
       tickInterval:itv
   };
   var credits= {
           enabled: false
       };
   var yAxis = {
      title: {
         text: ' '
      },
      plotLines: [{
         value: 0,
         width: 1,
         color: '#808080'
      }]
   };   
   var tooltip = {
	  valueSuffix: tooltip,
      useHTML: true,
      crosshairs: [{
        width: 1,
        color: 'red'
      }, {
        width: 1,
        color: 'red'
      }]
   };
   if(type == 'pie'){//饼图设置百分比
	   tooltip.pointFormat = '{series.name}: <b>{point.percentage:.1f}%</b>';
	   subtitle.text = " ";
   };
   if(type == 'column'){//柱图设置Y坐标最小值
	   yAxis.min = Math.min.apply(null,data1)-1;
   };
   var series =  [
		      {
		         name: tuli1,
		         data: data1
		      }
		   ];
   var plotOptions = {
		series : {
			events : {
				legendItemClick : function(e) {
					if(data2.length == 0){
						return false; // 直接 return false 即可禁用图例点击事件
					}else{
						return true;
					}						
				}
			},
			maxPointWidth : 100//最大宽度
		}
	}
   var json = {};
   json.title = title;
   json.subtitle = subtitle;
   json.xAxis = xAxis;
   json.yAxis = yAxis;
   json.tooltip = tooltip;
   json.series = series;
   json.plotOptions = plotOptions;
   json.credits = credits;
   json.chart = chart;
   $('#' + id).highcharts(json);
}


/*highcharts按班查看统一设置值函数*/
/*("container_day_ban_1",x_zuobiao,title1,tooltip1,data11,data12,data13)*/
function chart_ban(id,x_zuobiao,title,tooltip,data1,data2,data3){
	/*设置横坐标间隔 X坐标最多放20个*/
	var dateLength = x_zuobiao.length;
	var itv = 1;
	for(var i = 20; i < dateLength; i++){
		itv = Math.ceil(i/20);//对20向上取整，所以interval最大值为20
    		//alert(interval)
	   }
	var title = {
		       text: title   
		   };
		   var xAxis = {
		       categories: x_zuobiao,
		       tickInterval:itv
		   };
	       var credits= {
	           enabled: false
	       };
		   var yAxis = {
		      title: {
		         text: ' '
		      },
		      plotLines: [{
		         value: 0,
		         width: 1,
		         color: '#808080'
		      }]
		   };   
		   var tooltip = {
			  
		      valueSuffix: tooltip,
		      useHTML: true,
		      shared:true,
		      crosshairs: [{
                width: 1,
                color: 'red'
		      }]
		   };
		   var series =  [
				      {
				         name: "早班",
				         data: data1
				      },
				      {
				         name: "中班",
				         data: data2
				      },
				      {
				         name: "晚班",
				         data: data3
				      }
				   ];
		   var plotOptions = {
				series : {
					events : {
						legendItemClick : function(e) {
							if(data2.length == 0){
								return false; // 直接 return false 即可禁用图例点击事件
							}else{
								return true;
							}						
						}
					},
					maxPointWidth : 100//最大宽度
				}
			}
		   var json = {};
		   json.title = title;
		   json.xAxis = xAxis;
		   json.yAxis = yAxis;
		   json.tooltip = tooltip;
		   json.series = series;
		   json.plotOptions = plotOptions;
		   json.credits = credits;
		   $('#' + id).highcharts(json);
}

	//日期转化
	function renderTime(date,ifyear) {
		var da = new Date(parseInt(date.replace("/Date(", "").replace(")/", "")
				.split("+")[0]));
		var year = da.getFullYear();
		var month = da.getMonth() + 1 < 10 ? "0" + (da.getMonth() + 1) : da
				.getMonth() + 1;
		var date = da.getDate() < 10 ? "0" + da.getDate() : da.getDate();
		var hour = da.getHours() < 10 ? "0" + da.getHours() : da.getHours();
		var minute = da.getMinutes() < 10 ? "0" + da.getMinutes() : da
				.getMinutes();
		var second = da.getSeconds() < 10 ? "0" + da.getSeconds() : da
				.getSeconds();
		if(ifyear == true){
			return year + "年" + month + "月" + date + "日";
		}else{
			return month + "月" + date + "日";
		}
	};
  //获取项目根路径
  function getRootPath(){
	    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp  
	    var curWwwPath=window.document.location.href;  
	    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp  
	    var pathName=window.document.location.pathname;  
	    var pos=curWwwPath.indexOf(pathName);  
	    //获取主机地址，如： http://localhost:8083  
	    var localhostPaht=curWwwPath.substring(0,pos);  
	    //获取带"/"的项目名，如：/uimcardprj  
	    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);  
	    return(localhostPaht+projectName);  
	};  
	/*合并行*/
	_w_table_rowspan("#energy_day_ban",1);
	_w_table_rowspan("#energy_month_ban",1);

});


/*合并行*/
function _w_table_rowspan(_w_table_id,_w_table_colnum){
   _w_table_firsttd = "";
   _w_table_currenttd = "";
   _w_table_SpanNum = 0;
   _w_table_Obj = $(_w_table_id + " tr td:nth-child(" + _w_table_colnum + ")");
   _w_table_Obj.each(function(i){
       if(i==0){
           _w_table_firsttd = $(this);
           _w_table_SpanNum = 1;
       }else{
           _w_table_currenttd = $(this);
           if(_w_table_firsttd.text()==_w_table_currenttd.text()){
               _w_table_SpanNum++;
               _w_table_currenttd.hide(); //remove();
               _w_table_firsttd.attr("rowSpan",_w_table_SpanNum);
           }else{
               _w_table_firsttd = $(this);
               _w_table_SpanNum = 1;
           }
       }
   }); 
}


