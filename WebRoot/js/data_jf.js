/*折线图数据生成*/
$(function(){	
	 
		Highcharts.setOptions({
			// 所有语言文字相关配置都设置在 lang 里
			lang : {
				resetZoom : '重置',
				resetZoomTitle : '重置缩放比例',
				printChart:"打印图表",
			    downloadJPEG: "下载JPEG 图片（白色背景）",
			    downloadPDF: "下载PDF 文档",
			    downloadPNG: "下载PNG 图片（透明背景）",
			    downloadSVG: "下载SVG 矢量图",
			    exportButtonTitle: "导出图片" 
			},
			plotOptions : {
				series : {
					lineWidth : 3,
					shadow: {
		                color: '#ddd',
		                width: 10,
		                offsetX: 5,
		                offsetY: 5
		            },
		            marker: {
		                radius: 6,
		                fillColor: '#FFFFFF',
		                lineWidth: 3,
		                lineColor:  null, // inherit from series
		            }
				}
			},tooltip: {
				backgroundColor: {
					linearGradient: [0, 0, 0, 60],
	                stops: [
	                    [0, '#2FBAF1'],
	                    [1, '#007AFF']
	                ]
	            },
	            borderWidth: 1,
                borderColor: '#ccc',
	            shadow: true,                 // 是否显示阴影
	            animation: true,               // 是否启用动画效果
	            style: {                      // 文字内容相关样式
	                color: '#fff',
	                fontSize: "14px",
	                fontWeight: "blod",
	                fontFamily: "microsoft yahei"
	            }
	        },
			chart : {
				type: 'line',
				zoomType : 'x',
				selectionMarkerFill : 'rgba(0,0,0, 0.2)',
				panning : true,
				/*数据边框颜色*/
				plotBorderColor: 'gray',
	            plotBorderWidth: 1,
				panKey : 'shift',
				resetZoomButton : {
					// 按钮定位
					position : {
						align : 'right', // by default
						verticalAlign : 'top', // by default
						x : 0,
						y : 0
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

		
		/*******提示框单位***************/
		 var tooltip1 = "(kgce/tNH<sub>3</sub>)";//吨氨综合消耗
		 var tooltip2 = "(Nm<sup>3</sup>/tNH<sub>3</sub>)";//吨氨天然气耗 (含蒸汽耗)(kgce/tNH3)
		 var tooltip3 = "(Nm<sup>3</sup>/tNH<sub>3</sub>)";//吨氨天然气耗
		 var tooltip4 = "(t/h)";// 小时氨产量 (含稀氨水折算)(t/h)
		 var tooltip5 = "(Nm<sup>3</sup>)";//班天然气耗(含蒸汽耗)(Nm3)
		 var tooltip6 = "(t)";//班氨产量(t)
		 var tooltip7 = "(Nm<sup>3</sup>)"//班天然气耗(Nm3)
		 var tooltip8 = "(t)"//班稀氨水(折氨量)(t)
		 /*********图例*****************/
		 var tuli1 = "吨氨综合消耗(kgce/tNH<sub>3</sub>)"; //图例1
		 var tuli2 = "吨氨天然气耗(含蒸汽耗)";//图例2
		 var tuli3 = "吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)";//图例3
		 var tuli4 = "小时氨产量(含驰放气折算)(t/h)"; //图例1
		 /*饼状图*/
		 var tuli5 = "月天然气耗<br>(含蒸汽耗)";//图例2
		 var tuli6 = "月氨产量";//图例3
		 var tuli7 = "月天然气耗";//图例3
		 var tuli8 = "月氨产量<br>(含驰放气折算)";//图例3
		 /***********按班查看图例***********/
		 var title1 = "吨氨综合消耗(kgce/tNH<sub>3</sub>)";
		 var title2 = "吨氨天然气耗(含蒸汽耗)";
		 var title3 = "吨氨天然气耗(Nm<sup>3</sup>/tNH<sub>3</sub>)";
		 var title4 = "小时氨产量(含驰放气折算)(t/h)";
		 /*数据项颜色*/
		 var datacolor_colum = {//柱状图颜色 蓝色到浅渐变
	        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
	        	  stops: [
	        	      [0, '#1AD6FD'],
	        	      [1, '#1D62F0']
	        	  ]
	        	};
		 var datacolor_line1 = {//柱状图颜色 青色到浅渐变
	        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
	        	  stops: [
	        	      [0, '#52EDC7'],
	        	      [1, '#5AC8FB']
	        	  ]
	        	};
		 
		 var datacolor_line2 = {//柱状图颜色 绿色到浅渐变
	        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
	        	  stops: [
	        	      [0, '#87FC70'],
	        	      [1, '#0BD318']
	        	  ]
	        	};
		 var datacolor_line3 = {//柱状图颜色 红色到浅渐变
	        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
	        	  stops: [
	        	      [0, '#FF5E3A'],
	        	      [1, '#FF2A68']
	        	  ]
	        	}
		 var datacolor_line4 = {//柱状图颜色 红色到浅渐变
	        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
	        	  stops: [
	        	      [0, '#4facfe'],
	        	      [1, '#00f2fe']
	        	  ]
	        	}
		 
		 /*柱状图专用颜色*/
			var columred = {//柱状图颜色红色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#FF5E3A'],
		        	      [1, '#FF2A68']
		        	  ]
		        	};
			var columylow = {//柱状图颜色 黄色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#FFDB4C'],
		        	      [1, '#FFCD02']
		        	  ]
		        	};
			var columblu = {//柱状图颜色 蓝色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#1AD6FD'],
		        	      [1, '#1D62F0']
		        	  ]
		        	};
			var columgren = {//柱状图颜色 绿色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#87FC70'],
		        	      [1, '#0BD318']
		        	  ]
		        	};
			 var columqing = {//柱状图颜色 青色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#52EDC7'],
		        	      [1, '#5AC8FB']
		        	  ]
		        	};
			 
			 
			 var columprple = {//柱状图颜色 紫色到浅渐变
		        	  linearGradient: { x1: 0, x2: 0, y1: 0, y2: 1 },
		        	  stops: [
		        	      [0, '#C644FC'],
		        	      [1, '#5856D6']
		        	  ]
		        	};
		 	/*饼状图专用颜色*/
			var piered = {//柱状图颜色红色到浅渐变
					  radialGradient: { cx: 0.5, cy: 0.5, r: 1 },
		        	  stops: [
		        	      [0, '#FF5E3A'],
		        	      [1, '#FF2A68']
		        	  ]
		        	};
			var pieylow = {//柱状图颜色 黄色到浅渐变
					  radialGradient: { cx: 0.5, cy: 0.5, r: 1 },
		        	  stops: [
		        	      [0, '#FFDB4C'],
		        	      [1, '#FFCD02']
		        	  ]
		        	};
			var pieblu = {//柱状图颜色 蓝色到浅渐变
					  radialGradient: { cx: 0.5, cy: 0.5, r: 1 },
		        	  stops: [
		        	      [0, '#1AD6FD'],
		        	      [1, '#1D62F0']
		        	  ]
		        	};
			var piegren = {//柱状图颜色绿色到浅渐变
					  radialGradient: { cx: 0.5, cy: 0.5, r: 1 },
		        	  stops: [
		        	      [0, '#87FC70'],
		        	      [1, '#0BD318']
		        	  ]
		        	};
			var pieqing = {//柱状图颜色 青色到浅渐变
					  radialGradient: { cx: 0.5, cy: 0.5, r: 1 },
		        	  stops: [
		        	      [0, '#52EDC7'],
		        	      [1, '#5AC8FB']
		        	  ]
		        	};
		var column_color1 = [columblu,columred,columgren,columylow,columqing,columprple,
		                     columblu,columred,columgren,columylow,columqing,columprple];
		var column_color2 = [columprple,columblu,columred,columgren,columylow,columqing,
		                     columprple,columblu,columred,columgren,columylow,columqing];
		var column_color3 = [columqing,columprple,columblu,columred,columgren,columylow,
		                     columqing,columprple,columblu,columred,columgren,columylow];
		var column_color4 = [columylow,columqing,columprple,columblu,columred,columgren,
			                     columylow,columqing,columprple,columblu,columred,columgren];
		 /*饼状图颜色数组*/
		 var pie_color1 = [piered,pieblu,pieylow,piegren,pieqing];
		 var pie_color2 = [pieblu,piegren,piered,pieqing,pieylow];
		 var pie_color3 = [pieylow,pieblu,piegren,piered,pieqing];
		 var pie_color4 = [piegren,pieblu,piered,pieqing,pieylow];
		 /*********************打开页面，时加载折线、柱状图、饼状图**************************************/
		 /***************日报表 按日查看***********************/
		 ajax_day("jf_loadDayDataForDayByAjax.action");
		 /***************日报表 按班查看***********************/
		 ajax_ban("jf_loadDayDataForClassByAjax.action");
		 //ajax_ban_two("jf_loadDayDataForClassByAjax.action");
		
		 ajax_ban_three("jf_loadDayDataForClassByAjax.action")
		 
		 /***************月报表 按日查看***********************/
		 ajax_day("jf_loadMouthDataForDayByAjax.action");
		 /***************月报表 按班查看***********************/
		 ajax_ban("jf_loadMouthDataForClassByAjax.action");
		 //ajax_ban_two("jf_loadMouthDataForClassByAjax.action");
		 ajax_ban_three("jf_loadMouthDataForClassByAjax.action");
		
		 ajax_ban_four("selectMothNoCount.action",0,"1");
		
		 
		 /***************季度报表***********************/
		 ajax_day("jf_loadQuarterDataForMouthByAjax.action");
		 /***************年报表***********************/
		 ajax_day("jf_loadYearDataForMouthByAjax.action");
		 
		 
		//ajax查询日报表按日请求   
		 $(document).ajaxStart($.blockUI).ajaxStop($.unblockUI);
		 $("#day_day_show").click(function(){
			 click_dayday();
		 	});
		//ajax查询日报表按班请求   
			$("#day_class_show").click(function(){
				click_dayban();
				});
		//ajax查询月报表按日请求   
		$("#month_day_show").click(function(){
				click_monthday();
			});
		//ajax查询月报表按班请求   
		$("#month_ban_show").click(function(){
			click_monthban();
			});
		//ajax查询季度报表 
		$("#season_show").click(function(){
				click_season();
			});
		//ajax查询年报表 
		$("#year_show").click(function(){
				click_year();
			});
		
		
		
		 /*点击查看ajax 日-日 函数*/
		 function click_dayday(){
			 
			   var begin_day_class = $("#indate_day_day1").val();
		 	   var end_day_class = $("#indate_day_day2").val();
		 	  /*******数据***************/
		 	   var data1 = [];//数据1
		 	   var data2 = [];//数据2
		 	   var data3 = [];//数据3
		 	   var data4 = [];//数据2
		 	   var data5 = [];//数据3
		       var x_zuobiao = [];//横坐标 时间字符串转化而来
		 	   if(begin_day_class != "" &&  end_day_class != "" ){
		 		   if(begin_day_class > end_day_class){
		 			   alert("开始时间晚于结束时间，请重新选择！！");
		 			   return false;
		 		   };
		 		   var url = getRootPath()+"/jf_loadDayDataForDayByAjax.action";
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
		 		    	    	 var ybs         = data_class[i].orig_id;//样本数ok
		 		    	    	 if(data_class[i].data_time){
		 		    	    		 var time    = data_class[i].data_time;//时间段
		 		    	    	 }
		 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
		 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
		 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
		 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
		 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
		 		    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
		 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
		 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗ok
		 		    	    	 //var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
		 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
		 		    	    	 var n_time      = renderTime(time.toString(),true);
		 		    	    	 //alert(rtrqh+"=="+data_class[i].Time_FIQ203+"++"+data_class[i].Time_steam_gas+"++"+rtrqh_hzqh)
		 		    	    	 //alert("时间："+n_time)
		 		    	    	
		 		    	    	 if(i == data_class.length - 1){
		 		    	    		//alert(rtrqh_hzqh+"=="+rtrqh_hzqh.toFixed(2))
		 		    	    		 
			 		    	    	var newTr = "<tr><td>"
			 		    	    		+ "合计" +"</td><td>"//时间
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
			 		    	    	//alert(newTr)
			 		    	    	$("#energy_day").append(newTr);
		 		    	    	 }else{
		 		    	    		 var isflage='';
		 		    	    		 
		 		    	    		 if(racl > 6000 || racl < 0){
		 		    	    			isflage = "<tr style='color:blue'><td>"
			 		    	    			+ n_time +"</td><td>"//时间
			 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
			 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
			 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
					 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
					 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
					 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
					 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
					 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
					 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		 		    	    		 }else{
		 		    	    			isflage =  "<tr><td>"
				 		    	    			+ n_time +"</td><td>"//时间
				 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
				 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
				 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
						 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
						 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
						 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
						 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
						 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
						 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		 		    	    		 }
		 		    	    		
		 		    	    		$("#energy_day").append(isflage);
		 		    	    	 }

		 		    	    	 if(i < data_class.length - 1){//图表不添加合计
		 		    	    		 if(racl<8000 && racl > 0){
		 		    	    		 data1.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
		 				    		 data3.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
		 				    		 data4.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			 		    			 x_zuobiao.push(renderTime(time.toString(),true)); //时间
		 		    	    		  }
		 		    	    		 }
		 		    	     };
		 		    	     chart_day("container_day",x_zuobiao,"line",tooltip1,data1,tuli1,datacolor_colum);//吨氨综合消耗
		 		    		
		 		    		 chart_day("container_day_2",x_zuobiao,"line",tooltip3,data3,tuli3,datacolor_line2);//吨氨天然气耗
		 		    		 chart_day("container_day_3",x_zuobiao,"line",tooltip4,data4,tuli4,datacolor_line3);//吨氨天然气耗
		 		       });
		 	   	  };
		 };
		 
	/*点击查看ajax 日-班 函数*/
	function click_dayban(){
		   var begin_day_class = $("#indate_day_ban1").val();
		   var end_day_class = $("#indate_day_ban2").val();
		   
			 /*******数据***************/
			 var data11 = [];//数据1
			 var data12 = [];//数据2
			 var data13 = [];//数据3
			 var data14 = [];//数据2
			 var data15 = [];//数据3
			 
			 var data21 = [];//数据1
			 var data22 = [];//数据2
			 var data23 = [];//数据3
			 var data24 = [];//数据1
			 var data25 = [];//数据2
			 
			 var data31 = [];//数据1
			 var data32 = [];//数据2
			 var data33 = [];//数据3
			 var data34 = [];//数据2
			 var data35 = [];//数据3
			 
			 var data1_1 = [];
			 var data1_2 = [];
			 var data1_3 = [];
			 
			 var data2_1 = [];
			 var data2_2 = [];
			 var data2_3 = [];
			 
			 var data3_1 = [];
			 var data3_2 = [];
			 var data3_3 = [];
			 
			 var data4_1 = [];
			 var data4_2 = [];
			 var data4_3 = [];
			 
			 var i_1 = 0;
			 var i_2 = 0;
			 var i_3 = 0;
			 var i_4 = 0;
			 var total_1 = 0;
			 var total_2 = 0;
			 var total_3 = 0;
			 var total_4 = 0;
			 var averdnzhxh = 0;
			 var averdntrqh = 0;
			 var averxsacl = 0;
			 
			 var x_zuobiao = [];//横坐标 时间字符串转化而来
			 if(begin_day_class != "" &&  end_day_class != "" ){
			   if(begin_day_class > end_day_class){
				   alert("开始时间晚于结束时间，请重新选择！！");
				   return false;
			   };
			   var url = getRootPath()+"/jf_loadDayDataForClassByAjax.action";
			   var args = {"date_begin":begin_day_class,"date_end":end_day_class,"time": new Date()};
			  
			   		$.post(url,args,function(data){
			   			 var data_class = $.parseJSON(data);
			   			 var toltrqh = 0;
						 var tolzqh = 0;
						 var tolncl = 0;
						 var tolybs = 0;
						 for(var k = data_class.length - 4; k < data_class.length; k++){
							 toltrqh += data_class[k].time_FIQ203;
							 tolzqh += data_class[k].time_steam_coal;
							 tolncl += data_class[k].time_NH3;
							 tolybs += data_class[k].orig_id;
							
						 }
						 averdnzhxh = toltrqh / tolncl *1.2143+tolzqh/tolncl;
						 averdntrqh = toltrqh / tolncl;
						 averxsacl = tolncl / tolybs * 6;
				   			for(var j = 0 ; j <  data_class.length - 4; j++){
								 var ybs1 = data_class[j].orig_id;//样本数
								 var ban1     = data_class[j].shift;//早中晚班
								 var newban1 = ban1/ybs1;
								 switch(newban1){
						    	 case 1:
						    		 total_1++;
						    		 break;
						    	 case 2:
						    		 total_2++;
						    		 break;
						    	 case 3:
						    		 total_3++;
						    		 break;
						    	 case 4:
						    		 total_4++;
						    		 break;
						    	 }
							 }
				   		 
			    	     if(data_class.length <= 0){
							   alert("该时间段暂无数据，请重新选择！！");
							   return false;
						   };
			    	     $("#energy_day_ban tr").not(":first").remove();
			    	     for(var i = 0; i < data_class.length; i++){
			    	    	 
			    	    	 if(i%3 == 0 && data_class[i].data_time){
			    	    		 var time = data_class[i].data_time;//时间段
		 		    	    	 x_zuobiao.push(renderTime(time.toString(),true)); //时间
			    			 }//时间
			    	    	 var ybs         = data_class[i].orig_id;//样本数ok
	 		    	    	 if(data_class[i].data_time){
	 		    	    		 var time    = data_class[i].data_time;//时间段
	 		    	    	 }
	 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
	 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
	 		    	    	 var n_time      = renderTime(time.toString(),true);
	 		    	    	 var ban        = data_class[i].classNumber;
	 		    	    	 var class_number = 0;
	 		    	    	 if(data_class[i].shift != '0' && ybs != '0'){
	 		    	    		class_number = parseInt(data_class[i].shift/ybs);//123
	 		    	    	 }
	 		    	    	
	 		    	    	 ban = parseInt(ban);
	 		    	    	 var ban1 = data_class[i].shift;
	 		    	    	 var newban = ban1/ybs;
			    	    	 if(i < data_class.length-4){
			    	    		 switch(ban)//折线图数据
				    	    	 {
					    	    	 case 1:
					    	    		 
					    	    		 ban="白班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 data11.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	  
							    		 data13.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data14.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
							    		 break;
					    	    	 case 2:
					    	    		 
					    	    		 ban="中班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 data21.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	   
							    		 data23.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data24.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
							    		 break;
					    	    	 case 3:
					    	    		
					    	    		 ban="夜班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 data31.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	    
							    		 data33.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data34.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
							    		 break;
					    	    	 }
			    	    		
						    	 switch(newban)
				    	    	 {
				    	    	 case 1:
				    	    		 if(racl < 1000 && racl > 0){
				    	    		 var a1 = (Math.round(dazhxh*100)/100);
				    	    		 var a2 = (Math.round(datrqh*100)/100);
				    	    		 var a3 = (Math.round(xsacl_hxaszs*100)/100);
						    		 i_1++;
						    		 data1_1.push([i_1,a1])
						    		 data1_2.push([i_1,a2]) ;           
						    		 data1_3.push([i_1,a3]); 
				    	    		 }
				    	    		 break;
				    	    	 case 2:
				    	    		 if(racl < 1000 && racl > 0){
						    	     var b2 = Math.round(dazhxh*100)/100;
						    	     var b3 =Math.round(datrqh*100)/100;
						    	     var b4 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_2++;
						    		 data2_1.push([total_1+i_2,b2])
						    		 data2_2.push([total_1+i_2,b3]) ;            // 吨氨天然气耗
						    		 data2_3.push([total_1+i_2,b4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 case 3:
				    	    		 if(racl < 1000 && racl > 0){
						    	     var c1 = Math.round(dazhxh*100)/100;
						    	     var c2 = Math.round(datrqh*100)/100;
						    	     var c3 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_3++;
						    		 data3_1.push([total_1+total_2+i_3,c1])
						    		 data3_2.push([total_1+total_2+i_3,c2]) ;            // 吨氨天然气耗
						    		 data3_3.push([total_1+total_2+i_3,c3]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 case 4:
				    	    		
				    	    		 if(racl < 1000 && racl > 0){
						    	     var e1 = Math.round(dazhxh*100)/100;
						    	     var e2 = Math.round(datrqh*100)/100;
						    	     var e3 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_4++;
						    		 data4_1.push([total_1+total_2+total_3+i_4,e1])
						    		 data4_2.push([total_1+total_2+total_3+i_4,e2]) ;            // 吨氨天然气耗
						    		 data4_3.push([total_1+total_2+total_3+i_4,e3]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 }
						    	 var newTr = '';
						    	 if(racl > 1000 || racl < 0){
				    	    		 newTr = "<tr style='color:blue'><td>"
				    	    			+n_time+"</td><td>"
				    	    			+ban+"</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
						    	 }else{
						    		newTr = "<tr><td>"
				    	    			+n_time+"</td><td>"
				    	    			+ban+"</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
						    	 }
			    	    		 
			 		    	     if(racl.toFixed(0) == 0){
		 		    	    		newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"
			 		    	    	 +"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"
			 		    	    	 +"0"+"</td></tr>";
			 		    	    }
				    	    	$("#energy_day_ban").append(newTr);
			    	    	 }else{
			    	    		 var newTr = "<tr><td>"
			    	    			+ "合计"+"</td><td>"
			    	    			+ (ban%10)+" 班</td><td>"
	 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
	 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
	 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
			 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
			 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
			 		    	    	
			 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
			 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
			 		    	    	
			 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
			 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		    	    		 	if(racl.toFixed(0) == 0){
		 		    	    		var newTr = "<tr><td>"+"合计"+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"
			 		    	    	 +"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"
			 		    	    	 +"0"+"</td></tr>";
			 		    	    }
				    	    	$("#energy_day_ban").append(newTr);
			    	    	 }
			    	    	 
			    	    }
			    	     /*合并行*/
			  		     _w_table_rowspan("#energy_day_ban",1);
			  		     _w_table_rowspan("#energy_month_ban",1);
			  		     
			  		    /* chart_ban_two("container_day_ban_21",x_zuobiao,title1,tooltip1,data1_1,data2_1,data3_1,data4_1,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨综合消耗
						 chart_ban_two("container_day_ban_31",x_zuobiao,title3,tooltip3,data1_2,data2_2,data3_2,data4_2,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨净蒸汽耗
						 chart_ban_two("container_day_ban_41",x_zuobiao,title4,tooltip4,data1_3,data2_3,data3_3,data4_3,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨净蒸汽耗
*/						 
						 chart_ban_three("container_day_ban_4_1",x_zuobiao,title1,tooltip1,data1_1,data2_1,data3_1,data4_1,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,1017);//吨氨综合消耗
						 chart_ban_three("container_day_ban_5_1",x_zuobiao,title3,tooltip3,data1_2,data2_2,data3_2,data4_2,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);//吨氨净蒸汽耗
						 chart_ban_three("container_day_ban_6_1",x_zuobiao,title4,tooltip4,data1_3,data2_3,data3_3,data4_3,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);//吨氨净蒸汽耗
			    	     chart_ban("container_day_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨综合消耗
			    	   
			    		 chart_ban("container_day_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨净蒸汽耗
			    		 chart_ban("container_day_ban_4",x_zuobiao,title4,tooltip4,data14,data24,data34,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨气耗
			         
			   		});
			    };
			};
	  
	/*点击查看ajax 月-日 函数*/
	function click_monthday(){
		   var begin_month_class = $("#indate_month_day1").val();
		   var data1 = [];//数据1
		   var data2 = [];//数据2
		   var data3 = [];//数据3
		   var data4 = [];//数据2
		   var data5 = [];//数据3
		   var x_zuobiao = [];//横坐标 时间字符串转化而来
		   if(begin_month_class != ""){
			   var url = getRootPath()+"/jf_loadMouthDataForDayByAjax.action";
			   var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
			        $.post(url,args,function(data){
			    	     var data_class = $.parseJSON(data); 
			    	     if(data_class.length <= 0){
							   alert("该时间段暂无数据，请重新选择！！");
							   return false;
						   };
			    	     $("#energy_month_day tr").not(":first").remove();
			    	     for(var i = 0; i < data_class.length; i++){
			    	    	 var ybs         = data_class[i].orig_id;//样本数ok
	 		    	    	 if(data_class[i].data_time){
	 		    	    		 var time    = data_class[i].data_time;//时间段
	 		    	    	 }
	 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
	 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	 		    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗ok
	 		    	    	// var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
	 		    	    	 var n_time      = renderTime(time.toString(),true);
	 		    	    	
	 		    	    	if(i == data_class.length - 1){
	 		    	    		//alert(rtrqh_hzqh+"=="+rtrqh_hzqh.toFixed(2))
		 		    	    	var newTr = "<tr><td>"
		 		    	    		+ "合计" +"</td><td>"//时间
	 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
	 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
	 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
			 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
			 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
			 		    	    	
			 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
			 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
			 		    	    
			 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
			 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		 		    	    	//alert(newTr)
		 		    	    	$("#energy_month_day").append(newTr);
	 		    	    	 }else{
	 		    	    		 var isflage='';
	 		    	    		 
	 		    	    		 if(racl > 6000 || racl < 0){
	 		    	    			isflage = "<tr style='color:blue'><td>"
		 		    	    			+ n_time +"</td><td>"//时间
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
	 		    	    		 }else{
	 		    	    			isflage =  "<tr><td>"
			 		    	    			+ n_time +"</td><td>"//时间
			 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
			 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
			 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
					 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
					 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
					 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
					 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
					 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
					 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
	 		    	    		 }
	 		    	    		/*var newTr = "<tr><td>"
	 		    	    			+ n_time +"</td><td>"//时间
	 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
	 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
	 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
			 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
			 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
			 		    	    
			 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
			 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
			 		    	    	
			 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
			 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
*/	 		    	    		//alert(newTr)
	 		    	    		$("#energy_month_day").append(isflage);
	 		    	    	 }
	 		    	    	if(i < data_class.length - 1){
	 		    	    		 if(racl<8000 && racl > 0){
	 		    	    			 data1.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
		 				    		 data3.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
		 				    		 data4.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    			 x_zuobiao.push(renderTime(time.toString(),true)); //时间
	 		    	    		 }
	 		    	    		
	 		    	    	}
			    	     };
			    	     chart_day("container_month_day",x_zuobiao,"line",tooltip1,data1,tuli1,datacolor_colum);//吨氨综合消耗
			    	    
			    		 chart_day("container_month_day_2",x_zuobiao,"line",tooltip3,data3,tuli3,datacolor_line2);//吨氨净蒸汽耗(
			    		 chart_day("container_month_day_3",x_zuobiao,"line",tooltip4,data4,tuli4,datacolor_line3);//吨氨气耗
			    		 //chart_day("container_month_day_4",x_zuobiao,"line",tooltip5,data5,tuli5,datacolor_line1);//吨氨净蒸汽耗(
			    		 
			       });
			 };
		};
		
	/*点击查看ajax 月-班 函数*/
	function click_monthban(){
		   var begin_month_class = $("#indate_month_ban1").val();
		   /*******数据***************/
			 var data11 = [];//数据1
			 var data12 = [];//数据2
			 var data13 = [];//数据3
			 var data14 = [];//数据2
			 var data15 = [];//数据3
			 
			 var data21 = [];//数据1
			 var data22 = [];//数据2
			 var data23 = [];//数据3
			 var data24 = [];//数据1
			 var data25 = [];//数据2
			 
			 var data31 = [];//数据1
			 var data32 = [];//数据2
			 var data33 = [];//数据3
			 var data34 = [];//数据2
			 var data35 = [];//数据3
			 
			 var data1_1 = [];
			 var data1_2 = [];
			 var data1_3 = [];
			 
			 var data2_1 = [];
			 var data2_2 = [];
			 var data2_3 = [];
			 
			 var data3_1 = [];
			 var data3_2 = [];
			 var data3_3 = [];
			 
			 var data4_1 = [];
			 var data4_2 = [];
			 var data4_3 = [];
			 var i_1 = 0;
			 var i_2 = 0;
			 var i_3 = 0;
			 var i_4 = 0;
			 var total_1 = 0;
			 var total_2 = 0;
			 var total_3 = 0;
			 var total_4 = 0;
			 
			 var averdnzhxh = 0;
			 var averdntrqh = 0;
			 var averxsacl = 0;
			 
			
			 var x_zuobiao = [];//横坐标 时间字符串转化而来
			 if(begin_month_class != ""){
			   var url = getRootPath()+"/jf_loadMouthDataForClassByAjax.action";
			   var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
			   ajax_ban_four("selectMothNoCount.action",1,begin_month_class);
			   		$.post(url,args,function(data){
			    	     var data_class = $.parseJSON(data); 
			    	     var toltrqh = 0;
						 var tolzqh = 0;
						 var tolncl = 0;
						 var tolybs = 0;
						 for(var k = data_class.length - 4; k < data_class.length; k++){
							 toltrqh += data_class[k].time_FIQ203;
							 tolzqh += data_class[k].time_steam_coal;
							 tolncl += data_class[k].time_NH3;
							 tolybs += data_class[k].orig_id;
							
						 }
						 averdnzhxh = toltrqh / tolncl *1.2143+tolzqh/tolncl;
						 averdntrqh = toltrqh / tolncl;
						 averxsacl = tolncl / tolybs * 6;
			    	     for(var j = 0 ; j <  data_class.length - 4; j++){
							 var ybs1 = data_class[j].orig_id;//样本数
							 var ban1     = data_class[j].shift;//早中晚班
							 var newban1 = ban1/ybs1;
							 switch(newban1){
					    	 case 1:
					    		 total_1++;
					    		 break;
					    	 case 2:
					    		 total_2++;
					    		 break;
					    	 case 3:
					    		 total_3++;
					    		 break;
					    	 case 4:
					    		 total_4++;
					    		 break;
					    	 }
						 }
			    	     if(data_class.length <= 0){
							   alert("该时间段暂无数据，请重新选择！！");
							   return false;
						   };
			    	     $("#energy_month_ban tr").not(":first").remove();
			    	     for(var i = 0; i < data_class.length; i++){
			    	    	 if(i%3 == 0 && data_class[i].data_time){
			    	    		 var time = data_class[i].data_time;//时间段
		 		    	    	 x_zuobiao.push(renderTime(time.toString(),true)); //时间
			    			 }//时间
			    	    	 var ybs         = data_class[i].orig_id;//样本数ok
	 		    	    	 if(data_class[i].data_time){
	 		    	    		 var time    = data_class[i].data_time;//时间段
	 		    	    	 }
	 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
	 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	 		    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	 		    	    	 //var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
	 		    	    	 var n_time      = renderTime(time.toString(),true);
	 		    	    	 var ban        = data_class[i].classNumber;
	 		    	    	 var class_number = 0;
	 		    	    	 if(data_class[i].shift != '0' && ybs != '0'){
	 		    	    		class_number = parseInt(data_class[i].shift/ybs);//123
	 		    	    	 }
	 		    	    	 
			    	    	 ban = parseInt(ban);
			    	    	 var ban1 = data_class[i].shift;
	 		    	    	 var newban = ban1/ybs;
			    	    	 if(i < data_class.length-4){//除去后四条合计
			    	    		 switch(ban)//折线图数据
				    	    	 {
					    	    	 case 1:
					    	    		 ban="白班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 data11.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	    
							    		 data13.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data14.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
							    		 break;
					    	    	 case 2:
					    	    		 ban="中班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 
					    	    		 data21.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	     
							    		 data23.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data24.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
							    		 break;
					    	    	 case 3:
					    	    		 ban="夜班("+class_number+")";
					    	    		 if(racl < 1000 && racl > 0){
					    	    		 data31.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
							    	   
							    		 data33.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
							    		 data34.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
					    	    		 }
					    	    		 break;
					    	    	 }
			    	    		 switch(newban)
				    	    	 {
				    	    	 case 1:
				    	    		 if(racl < 1000 && racl > 0){
				    	    		 var a1 = (Math.round(dazhxh*100)/100);
				    	    		 var a2 = (Math.round(datrqh*100)/100);
				    	    		 var a3 = (Math.round(xsacl_hxaszs*100)/100);
						    		 i_1++;
						    		 data1_1.push([i_1,a1])
						    		 data1_2.push([i_1,a2]) ;           
						    		 data1_3.push([i_1,a3]); 
				    	    		 }
						    		 break;
				    	    	 case 2:
				    	    		 if(racl < 1000 && racl > 0){
						    	     var b2 = Math.round(dazhxh*100)/100;
						    	     var b3 =Math.round(datrqh*100)/100;
						    	     var b4 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_2++;
						    		 data2_1.push([total_1+i_2,b2])
						    		 data2_2.push([total_1+i_2,b3]) ;            // 吨氨天然气耗
						    		 data2_3.push([total_1+i_2,b4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 case 3:
				    	    		 if(racl < 1000 && racl > 0){
						    	     var c1 = Math.round(dazhxh*100)/100;
						    	     var c2 = Math.round(datrqh*100)/100;
						    	     var c3 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_3++;
						    		 data3_1.push([total_1+total_2+i_3,c1])
						    		 data3_2.push([total_1+total_2+i_3,c2]) ;            // 吨氨天然气耗
						    		 data3_3.push([total_1+total_2+i_3,c3]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 case 4:
				    	    		 if(racl < 1000 && racl > 0){
						    	     var e1 = Math.round(dazhxh*100)/100;
						    	     var e2 = Math.round(datrqh*100)/100;
						    	     var e3 = Math.round(xsacl_hxaszs*100)/100;
						    		 i_4++;
						    		 data4_1.push([total_1+total_2+total_3+i_4,e1])
						    		 data4_2.push([total_1+total_2+total_3+i_4,e2]) ;            // 吨氨天然气耗
						    		 data4_3.push([total_1+total_2+total_3+i_4,e3]) ;            //小时氨产量 (含稀氨水折算)(t/h)
				    	    		 }
						    		 break;
				    	    	 }
			    	    		 var newTr = '';
						    	 if(racl > 1000 || racl < 0){
				    	    		 newTr = "<tr style='color:blue'><td>"
				    	    			+n_time+"</td><td>"
				    	    			+ban+"</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
						    	 }else{
						    		newTr = "<tr><td>"
				    	    			+n_time+"</td><td>"
				    	    			+ban+"</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
						    	 }
			    	    		 /*
			    	    		 var newTr = "<tr><td>"
				    	    			+n_time+"</td><td>"
				    	    			+ban+"</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
*/				 		    	     if(racl.toFixed(0) == 0){
			 		    	    		newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"
				 		    	    	 +"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"
				 		    	    	 +"0"+"</td></tr>";
				 		    	    }
					    	    	$("#energy_month_ban").append(newTr);
				    	    	 }else{
				    	    		 var newTr = "<tr><td>"
				    	    			+ "合计"+"</td><td>"
				    	    			+ (ban%10)+" 班</td><td>"
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
			    	    		 	if(racl.toFixed(0) == 0){
			 		    	    		var newTr = "<tr><td>"+"合计"+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"
				 		    	    	 +"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"
				 		    	    	 +"0"+"</td></tr>";
				 		    	    }
					    	    	$("#energy_month_ban").append(newTr);
				    	    	 }
			    	     }
			    	     /*合并行*/
			  		     _w_table_rowspan("#energy_day_ban",1);
			  		     _w_table_rowspan("#energy_month_ban",1);
			  		     
			  		      chart_ban_three("container_month_ban_4_1",x_zuobiao,title1,tooltip1,data1_1,data2_1,data3_1,data4_1,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,1017);//吨氨综合消耗
			  		      chart_ban_three("container_month_ban_5_1",x_zuobiao,title3,tooltip3,data1_2,data2_2,data3_2,data4_2,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);//吨氨净蒸汽耗
			  		      chart_ban_three("container_month_ban_6_1",x_zuobiao,title4,tooltip4,data1_3,data2_3,data3_3,data4_3,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);//吨氨气耗
			  		     
			    	     chart_ban("container_month_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨综合消耗
			    	    
			    		 chart_ban("container_month_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨净蒸汽耗
			    		 chart_ban("container_month_ban_4",x_zuobiao,title4,tooltip4,data14,data24,data34,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨气耗
			   		});
			};
		}; 
		
	/*点击查看ajax 季度函数*/
	function click_season(){
		var begin_season_year = $("#indate_year").val();
		var begin_season_season = $("#indate_season_season").val();
		
		 var data1 = [];//数据1
		 var data2 = [];//数据2
		 var data3 = [];//数据3
		 var data4 = [];//数据3
		 var data5 = [];//数据3
		 var data6 = [];//数据3
		 var data7 = [];//数据3
		 var data8 = [];//数据3
	
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 
		 
		   if(begin_season_year != ""&& begin_season_season != ""){
			   var url = getRootPath()+"/jf_loadQuarterDataForMouthByAjax.action";
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
			    	    	 var ybs        = data_class[i].orig_id;//样本数
	 		    	    	 if(data_class[i].data_time){
	 		    	    		 var time       = data_class[i].data_time;//时间段
	 		    	    	 }
	 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
	 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	 		    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	 		    	    	 //var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
			    	    	 var n_time     = renderTime(time.toString(),true).substring(0, 7);
			    	    	
	 		    	    	//alert(data_class.length)
			    	    	 if(i == data_class.length - 1){
		 		    	    		var newTr = "<tr><td>"
			 		    	    		+ "合计" +"</td><td>"//时间
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    	
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
			 		    	    	//alert(newTr)
			 		    	    	$("#energy_season").append(newTr);
			 		    	    	
			 		    	    	
					    			
		 		    	    	 }else{
		 		    	    		 //alert(i)
		 		    	    		var newTr = "<tr><td>"
		 		    	    			+ n_time +"</td><td>"//时间
		 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
		 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
		 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
				 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
				 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
				 		    	    	
				 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
				 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
				 		    	    
				 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
				 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		 		    	    		 data1.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
						    	   
						    		 data3.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
						    		 data4.push(Math.round(xsacl_hxaszs*100)/100) ;    //小时氨产量 (含稀氨水折算)(t/h)
					    			 
						    		
					    			 data6.push([renderTime(time.toString(),true).substring(0, 7),Math.round(racl*100)/100]) ; 
					    			 data7.push([renderTime(time.toString(),true).substring(0, 7),Math.round(rtrqh*100)/100]) ;        //数据2  月氨产量(t)
					    			 data8.push([renderTime(time.toString(),true).substring(0, 7),Math.round(racl_hxaszal*100)/100]) ; //数据2  月天然气耗(Nm3)
					    			 x_zuobiao.push(renderTime(time.toString(),true).substring(0, 7)); //时间
		 		    	    		//alert(newTr)
		 		    	    		$("#energy_season").append(newTr);
		 		    	    		
		 		    	    	 }
		 		    	     
			    	    	 
			    			 
			    		 }
			    	    
			    	     
			    	     chart_day("container_season",x_zuobiao,"column",tooltip1,data1,tuli1,column_color1);//吨氨综合消耗
			    	   
			    		 chart_day("container_season_2",x_zuobiao,"column",tooltip3,data3,tuli3,column_color3);//吨氨天然气耗
			    		 chart_day("container_season_3",x_zuobiao,"column",tooltip4,data4,tuli4,column_color4);//吨氨气耗(合计)
			    		 
			    		// chart_day("container_season_r",x_zuobiao,"pie",tooltip5,data6,tuli5,pie_color1);//月氨产量(t)
			    		 chart_day ("container_season_r1",x_zuobiao,"pie",tooltip6,data6,tuli6,pie_color2);//月气耗(Nm3)
			    		 chart_day("container_season_r2",x_zuobiao,"pie",tooltip7,data7,tuli7,pie_color3);//月氨产量(t)
			    		 chart_day("container_season_r3",x_zuobiao,"pie",tooltip8,data8,tuli8,pie_color4);//月气耗(Nm3)
			    		
			    	});
			};
		};
		
	/*点击查看ajax 年函数*/
	function click_year(){
		var begin_year = $("#indate_year").val();
	
		var data1 = [];//数据1
		var data2 = [];//数据2
		var data3 = [];//数据3
		var data4 = [];//数据3
		var data5 = [];//数据3
		var data6 = [];//数据3
		var data7 = [];//数据3
		var x_zuobiao = [];//横坐标 时间字符串转化而来
		if(begin_year != ""){
			   var url = getRootPath()+"/jf_loadYearDataForMouthByAjax.action";
			   var args = {"Year_data_begin":begin_year,"time": new Date()};
			   $.post(url,args,function(data){
			    	   var data_class = $.parseJSON(data); 
			    	   if(data_class.length <= 0){
							   alert("该时间段暂无数据，请重新选择！！");
							   return false;
						   };
			    	     $("#energy_year tr").not(":first").remove();
			    	     for(var i = 0; i < data_class.length; i++){
			    	    	 var ybs        = data_class[i].orig_id;//样本数
	 		    	    	 if(data_class[i].data_time){
	 		    	    		 var time       = data_class[i].data_time;//时间段
	 		    	    	 }
	 		    	    	 var racl        = data_class[i].time_FIQ162;//日氨产量
	 		    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	 		    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	 		    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	 		    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	 		    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	 		    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	 		    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	 		    	    	// var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	 		    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
	 		    	    	 var n_time  = renderTime(time.toString(),true).substring(0, 7);
			    	    	 

	 		    	    	if(i == data_class.length - 1){
	 		    	    		var newTr = "<tr><td>"
		 		    	    		+ "合计" +"</td><td>"//时间
	 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
	 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
	 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
			 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
			 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
			 		    	    	
			 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
			 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
			 		    	    	
			 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
			 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
		 		    	    	//alert(newTr)
		 		    	    	$("#energy_year").append(newTr);
		 		    	    	
		 		    	    	
	 		    	    	 }else{
	 		    	    		 //alert(i)
	 		    	    		var newTr = "<tr><td>"
	 		    	    			+ n_time +"</td><td>"//时间
	 		    	    			+ racl.toFixed(2) +"</td><td>"//日氨产量ok
	 		    	    			+ rxas_zal.toFixed(3) +"</td><td>"//日稀氨水(折氨量)(t)ok
	 		    	    			+ rtrqh.toFixed(2) +"</td><td>"//日天然气耗(Nm3)ok
			 		    	    	+ rzqh_zbm.toFixed(2) +"</td><td>"//日蒸汽耗(折标煤)(kgce)ok
			 		    	    	+ racl_hxaszal.toFixed(2) +"</td><td>"//日氨产量(含稀氨水折氨量)ok
			 		    	    	
			 		    	    	+ xsacl_hxaszs.toFixed(2) +"</td><td>"//小时氨产量ok
			 		    	    	+ datrqh.toFixed(2) +"</td><td>"//吨氨天然气耗ok
			 		    	    
			 		    	    	+ dazhxh.toFixed(2) +"</td><td>"//吨氨综合消耗ok
			 		    	    	+ parseInt(ybs) +"</td></tr>";//样本数
	 		    	    		//alert(newTr)
	 		    	    		$("#energy_year").append(newTr);
	 		    	    		data1.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
		 			    	    
		 			    		 data3.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
		 			    		 data4.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    			 
				    			 /*data6.push([renderTime(time.toString(),true).substring(0, 7),Math.round(racl*100)/100]) ;        //数据2  月氨产量(t)
				    			 data7.push([renderTime(time.toString(),true).substring(0, 7),Math.round(rtrqh_hzqh*100)/100]) ;       //数据2  月天然气耗(Nm3)
				    			 */
				    			 x_zuobiao.push(renderTime(time.toString(),true).substring(0, 7)); //时间
	 		    	    	 }
	 		    	    	
	 		    	    	
		    		 }
			    	     
			    	     chart_day("container_year",x_zuobiao,"column",tooltip1,data1,tuli1,column_color1);//吨氨综合消耗
			    	    
			    		 chart_day("container_year_2",x_zuobiao,"column",tooltip3,data3,tuli3,column_color3);//吨氨净蒸汽耗(
			    		 chart_day("container_year_3",x_zuobiao,"column",tooltip4,data4,tuli4,column_color4);//吨氨气耗
			    		 
			    	});
			};
		};
	
	
	/***************按班查看函数***********************/
	function ajax_ban(url){
		 var new_url = getRootPath()+"/"+url;//请求地址
		 var args = {"isdate":"1","time": new Date()};
		 /*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data14 = [];//数据2
		 
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data24 = [];//数据2
		 
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var data34 = [];//数据2
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 $.post(new_url,args,function(data){
			 data_class = $.parseJSON(data);
			 for(var i = 0; i < data_class.length - 1; i++){
				 
				 var ybs = data_class[i].orig_id;//样本数
				 if(i%3 == 0){
					 if(data_class[i].data_time){
		    	    		 var time       = data_class[i].data_time;//时间段
		    	    	 }
					 x_zuobiao.push(renderTime(time.toString(),true)); //时间
					 }//时间
				 
					 var racl        = data_class[i].time_FIQ162;//日氨产量
	    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	    	    	// var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
			    	 var ban     = data_class[i].classNumber;//早中晚班
			    	 ban = parseInt(ban);
			    	 switch(ban)
	    	    	 {
	    	    	 case 1:
	    	    		 ban="白班";
	    	    		 data11.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data13.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data14.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
	    	    		 break;
	    	    	 case 2:
	    	    		 ban="中班";
	    	    		 data21.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data23.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data24.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 break;
	    	    	 case 3:
	    	    		 ban="夜班";
	    	    		 data31.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data33.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data34.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
	    	    		 break;
	    	    	 }
			    	
			    	 
			 }
	
			 /*highchart参数顺序 
			 *id 横坐标 标题  弹窗单位 数据一 图例一  数据和图例可以为空
			 *实际函数中多了一个X轴间隔interval无需传入*/
			 // chart_ban(id,x_zuobiao,title,tooltip1,data11,data12,data13)//吨氨综合消耗
			 //alert(data13)function chart_ban(id,x_zuobiao,title,tooltip,data1)
			 
			 if(url == "jf_loadDayDataForClassByAjax.action"){
				 chart_ban("container_day_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨综合消耗
				
				 chart_ban("container_day_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨净蒸汽耗
				 chart_ban("container_day_ban_4",x_zuobiao,title4,tooltip4,data14,data24,data34,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨净蒸汽耗
			 }else if(url == "jf_loadMouthDataForClassByAjax.action"){
				 chart_ban("container_month_ban_1",x_zuobiao,title1,tooltip1,data11,data21,data31,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨综合消耗
				 chart_ban("container_month_ban_2",x_zuobiao,title2,tooltip2,data12,data22,data32,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨气耗
				 chart_ban("container_month_ban_3",x_zuobiao,title3,tooltip3,data13,data23,data33,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨净蒸汽耗
				 chart_ban("container_month_ban_4",x_zuobiao,title4,tooltip4,data14,data24,data34,datacolor_colum,datacolor_line3,datacolor_line2);//吨氨气耗
	
			 }
		});
	}
	/***************第二种按班查看函数***********************/
	function ajax_ban_two(url){
		 var new_url = getRootPath()+"/"+url;//请求地址
		 var args = {"isdate":"1","time": new Date()};
		 /*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data14 = [];//数据2
		 
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data24 = [];//数据2
		 
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var data34 = [];//数据2
		 
		 var data41 = [];//数据1
		 var data42 = [];//数据2
		 var data43 = [];//数据3
		 var data44 = [];//数据2
		 
		 var i1 = 0;
		 var i2 = 0;
		 var i3 = 0;
		 var i4 = 0;
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 $.post(new_url,args,function(data){
			 data_class = $.parseJSON(data);
			
			 for(var i = 0; i < data_class.length - 4; i++){
				 
				 var ybs = data_class[i].orig_id;//样本数
				 /*if(i%3 == 0){
					 x_zuobiao.push(i); //时间
					 }//时间
*/				 
					 var racl        = data_class[i].time_FIQ162;//日氨产量
	    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
			    	 var ban     = data_class[i].shift;//早中晚班
	    	    	 
			    	 ban = parseInt(ban);
			    	 var newban = ban/ybs;
			    	
			    	 switch(newban)
	    	    	 {
	    	    	 case 1:
	    	    		 ban="1班";
	    	    		 data11.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data13.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data14.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 i1++;
	    	    		 break;
	    	    	 case 2:
	    	    		 ban="2班";
	    	    		 data21.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data23.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data24.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 i2++;
			    		 break;
	    	    	 case 3:
	    	    		 ban="3班";
	    	    		 data31.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data33.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data34.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 i3++;
			    		 break;
	    	    	 case 4:
	    	    		 ban="4班";
	    	    		 data41.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
			    	    
			    		 data43.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
			    		 data44.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 i4++;
			    		 break;
	    	    	 }
			    	
			    	 
			 }
			var t =  Math.max(i1,i2,i3,i4);
			 for(var i = 1 ; i < t ;i++){
				 x_zuobiao.push(i); //时间
			 }
				
			 
			 /*highchart参数顺序 ==
			 *id 横坐标 标题  弹窗单位 数据一 图例一  数据和图例可以为空
			 *实际函数中多了一个X轴间隔interval无需传入*/
			 // chart_ban(id,x_zuobiao,title,tooltip1,data11,data12,data13)//吨氨综合消耗
			 //alert(data13)function chart_ban(id,x_zuobiao,title,tooltip,data1)
			 
			 if(url == "jf_loadDayDataForClassByAjax.action"){
				 chart_ban_two("container_day_ban_21",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨综合消耗
				 chart_ban_two("container_day_ban_31",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨净蒸汽耗
				 chart_ban_two("container_day_ban_41",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨净蒸汽耗
			 }else if(url == "jf_loadMouthDataForClassByAjax.action"){
				 chart_ban_two("container_month_ban_21",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨综合消耗
				 chart_ban_two("container_month_ban_31",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨净蒸汽耗
				 chart_ban_two("container_month_ban_41",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4);//吨氨气耗
	
			 }
		});
	}
	/***************第三种按班查看函数***********************/
	function ajax_ban_three(url){
		 var new_url = getRootPath()+"/"+url;//请求地址
		 var args = {"isdate":"1","time": new Date()};
		 /*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data14 = [];//数据2
		 
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data24 = [];//数据2
		 
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var data34 = [];//数据2
		 
		 var data41 = [];//数据1
		 var data42 = [];//数据2
		 var data43 = [];//数据3
		 var data44 = [];//数据2
		 
		 var i1 = 0;
		 var i2 = 0;
		 var i3 = 0;
		 var i4 = 0;
		 var total1 = 0;
		 var total2 = 0;
		 var total3 = 0;
		 var total4 = 0;
		 var averdnzhxh = 0;
		 var averdntrqh = 0;
		 var averxsacl = 0;
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 $.post(new_url,args,function(data){
			 data_class = $.parseJSON(data);
			 var toltrqh = 0;
			 var tolzqh = 0;
			 var tolncl = 0;
			 var tolybs = 0;
			 for(var k = data_class.length - 4; k < data_class.length; k++){
				 toltrqh += data_class[k].time_FIQ203;
				 tolzqh += data_class[k].time_steam_coal;
				 tolncl += data_class[k].time_NH3;
				 tolybs += data_class[k].orig_id;
				
			 }
			 averdnzhxh = toltrqh / tolncl *1.2143+tolzqh/tolncl;
			 averdntrqh = toltrqh / tolncl;
			 averxsacl = tolncl / tolybs * 6;
			 for(var j = 0 ; j <  data_class.length - 4; j++){
				 var ybs1 = data_class[j].orig_id;//样本数
				 var ban1     = data_class[j].shift;//早中晚班
				 var newban1 = ban1/ybs1;
				 switch(newban1){
		    	 case 1:
		    		 total1++;
		    		 break;
		    	 case 2:
		    		 total2++;
		    		 break;
		    	 case 3:
		    		 total3++;
		    		 break;
		    	 case 4:
		    		 total4++;
		    		 break;
		    	 }
			 }
			
			 for(var i = 0; i < data_class.length - 4; i++){
				 
				 var ybs = data_class[i].orig_id;//样本数
				 if(i%3 == 0){
					 x_zuobiao.push(i); //时间
					 }//时间
						 if(data_class[i].data_time){
		    	    		 var time       = data_class[i].data_time;//时间段
		    	    	 }
					// x_zuobiao.push(renderTime(time.toString(),true)); //时间
					 var racl        = data_class[i].time_FIQ162;//日氨产量
	    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
			    	 var ban     = data_class[i].shift;//早中晚班
			    	 ban = parseInt(ban);
			    	 var newban = ban/ybs;
			    	 
			    	
			    	 switch(newban)
	    	    	 {
	    	    	 case 1:
	    	    		 ban="1班";
	    	    		 var a1 = (Math.round(dazhxh*100)/100);
	    	    		 var a3 = (Math.round(datrqh*100)/100);
	    	    		 var a4 = (Math.round(xsacl_hxaszs*100)/100);
			    		 i1++;
			    		 data13.push([i1,a3]) ;           
			    		 data14.push([i1,a4]); 
			    		 data11.push([i1,a1])
			    		
	    	    		 break;
	    	    	 case 2:
	    	    		 ban="2班";
			    	     var b2 = Math.round(dazhxh*100)/100;
			    	     var b3 = Math.round(datrqh*100)/100;
			    	     var b4 = Math.round(xsacl_hxaszs*100)/100;
			    		 i2++;
			    		 data21.push([total1+i2,b2])
			    		 data23.push([total1+i2,b3]) ;            // 吨氨天然气耗
			    		 data24.push([total1+i2,b4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 break;
	    	    	 case 3:
	    	    		 ban="3班";
			    	     var c1 = Math.round(dazhxh*100)/100;
			    	     var c3 = Math.round(datrqh*100)/100;
			    	     var c4 = Math.round(xsacl_hxaszs*100)/100;
			    		 i3++;
			    		 data31.push([total1+total2+i3,c1])
			    		 data33.push([total1+total2+i3,c3]) ;            // 吨氨天然气耗
			    		 data34.push([total1+total2+i3,c4]) ;    
			    		 break;
	    	    	 case 4:
	    	    		 ban="4班";
			    	     var e1 = Math.round(dazhxh*100)/100;
			    	     var e3 = Math.round(datrqh*100)/100;
			    	     var e4 = Math.round(xsacl_hxaszs*100)/100;
			    		
			    		 i4++;
			    		 data41.push([total1+total2+total3+i4,e1])
			    		 data43.push([total1+total2+total3+i4,e3]) ;            // 吨氨天然气耗
			    		 data44.push([total1+total2+total3+i4,e4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 break;
	    	    	 }
			    	
			    	 
			 }
			var t =  Math.max(i1,i2,i3,i4);
			 for(var i = 1 ; i < t ;i++){
				 x_zuobiao.push(i); //时间
			 }
			
			 if(url == "jf_loadDayDataForClassByAjax.action"){
				chart_ban_three("container_day_ban_4_1",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,1017);//吨氨综合消耗
				chart_ban_three("container_day_ban_5_1",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);//吨氨净蒸汽耗
				chart_ban_three("container_day_ban_6_1",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);//吨氨净蒸汽耗
			 }else if(url == "jf_loadMouthDataForClassByAjax.action"){
				chart_ban_three("container_month_ban_4_1",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,0);//吨氨综合消耗
				chart_ban_three("container_month_ban_5_1",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);//吨氨净蒸汽耗
				chart_ban_three("container_month_ban_6_1",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);//吨氨气耗
	
			 }
		});
	}
	/***************第三种按班查看函数***********************/
	function ajax_ban_four(url,isargs,mouth_date_begin){
		
		 var new_url = getRootPath()+"/"+url;//请求地址
		 if(isargs == 0){
			 var args = {"isdate":"1","time": new Date()};
		 }else{
			  var args = {"mouth_date_begin":mouth_date_begin,"time": new Date()};
		 }
		
		 /*******数据***************/
		 var data11 = [];//数据1
		 var data12 = [];//数据2
		 var data13 = [];//数据3
		 var data14 = [];//数据2
		 
		 var data21 = [];//数据1
		 var data22 = [];//数据2
		 var data23 = [];//数据3
		 var data24 = [];//数据2
		 
		 var data31 = [];//数据1
		 var data32 = [];//数据2
		 var data33 = [];//数据3
		 var data34 = [];//数据2
		 
		 var data41 = [];//数据1
		 var data42 = [];//数据2
		 var data43 = [];//数据3
		 var data44 = [];//数据2
		 
		 var i1 = 0;
		 var i2 = 0;
		 var i3 = 0;
		 var i4 = 0;
		 var total1 = 0;
		 var total2 = 0;
		 var total3 = 0;
		 var total4 = 0;
		 var averdnzhxh = 0;
		 var averdntrqh = 0;
		 var averxsacl = 0;
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 $.post(new_url,args,function(data){
			 var data_class = $.parseJSON(data);
			 var toltrqh = 0;
			 var tolzqh = 0;
			 var tolncl = 0;
			
			 for(var k = 0; k < data_class.length; k++){
				
				 toltrqh += data_class[k].time_FIQ203;
				 tolzqh += data_class[k].time_steam_coal;
				 tolncl += data_class[k].time_NH3;
				 
			 }
			
			 averdnzhxh = toltrqh / tolncl *1.2143+tolzqh/tolncl;
			 averdntrqh = toltrqh / tolncl;
			 averxsacl = tolncl /data_class.length * 6;
			 
			 for(var j = 0 ; j <  data_class.length; j++){
				 var ban1     = data_class[j].shift;//早中晚班
				 switch(ban1){
		    	 case 1:
		    		 total1++;
		    		 break;
		    	 case 2:
		    		 total2++;
		    		 break;
		    	 case 3:
		    		 total3++;
		    		 break;
		    	 case 4:
		    		 total4++;
		    		 break;
		    	 }
			 }
			
			 for(var i = 0; i < data_class.length ; i++){
					 var racl        = data_class[i].time_FIQ162;//日氨产量
	    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	    	    	 var xsacl_hxaszs= data_class[i].time_NH3  * 6;//小时氨产量
	    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
			    	 var ban     = data_class[i].shift;//早中晚班
			    	 ban = parseInt(ban);
			    	 switch(ban)
	    	    	 {
	    	    	 case 1:
	    	    		 ban="1班";
	    	    		 var a1 = (Math.round(dazhxh*100)/100);
	    	    		 var a3 = (Math.round(datrqh*100)/100);
	    	    		 var a4 = (Math.round(xsacl_hxaszs*100)/100);
			    		 i1++;
			    		 data13.push([i1,a3]) ;           
			    		 data14.push([i1,a4]); 
			    		 data11.push([i1,a1])
			    		
	    	    		 break;
	    	    	 case 2:
	    	    		 ban="2班";
			    	     var b2 = Math.round(dazhxh*100)/100;
			    	     var b3 = Math.round(datrqh*100)/100;
			    	     var b4 = Math.round(xsacl_hxaszs*100)/100;
			    		 i2++;
			    		 data21.push([total1+i2,b2])
			    		 data23.push([total1+i2,b3]) ;            // 吨氨天然气耗
			    		 data24.push([total1+i2,b4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 break;
	    	    	 case 3:
	    	    		 ban="3班";
			    	     var c1 = Math.round(dazhxh*100)/100;
			    	     var c3 = Math.round(datrqh*100)/100;
			    	     var c4 = Math.round(xsacl_hxaszs*100)/100;
			    		 i3++;
			    		 data31.push([total1+total2+i3,c1])
			    		 data33.push([total1+total2+i3,c3]) ;            // 吨氨天然气耗
			    		 data34.push([total1+total2+i3,c4]) ;    
			    		 break;
	    	    	 case 4:
	    	    		 ban="4班";
			    	     var e1 = Math.round(dazhxh*100)/100;
			    	     var e3 = Math.round(datrqh*100)/100;
			    	     var e4 = Math.round(xsacl_hxaszs*100)/100;
			    		
			    		 i4++;
			    		 data41.push([total1+total2+total3+i4,e1])
			    		 data43.push([total1+total2+total3+i4,e3]) ;            // 吨氨天然气耗
			    		 data44.push([total1+total2+total3+i4,e4]) ;            //小时氨产量 (含稀氨水折算)(t/h)
			    		 break;
	    	    	 }
			    	
			    	 
			 }
			var t =  Math.max(i1,i2,i3,i4);
			 for(var i = 1 ; i < t ;i++){
				 x_zuobiao.push(i); //时间
			 }
			
			 if(url == "jf_loadDayDataForClassByAjax.action"){
				
			 }else if(url == "selectMothNoCount.action"){
				
				 chart_ban_three("container_month_ban_7_1",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);
				 chart_ban_three("container_month_ban_9_1",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,0);//吨氨综合消耗
			     chart_ban_three("container_month_ban_8_1",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);
				
				 
				 /*chart_ban_three("container_month_ban_4_1",x_zuobiao,title1,tooltip1,data11,data21,data31,data41,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdnzhxh,0);//吨氨综合消耗
				chart_ban_three("container_month_ban_5_1",x_zuobiao,title3,tooltip3,data13,data23,data33,data43,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averdntrqh,0);//吨氨净蒸汽耗
				chart_ban_three("container_month_ban_6_1",x_zuobiao,title4,tooltip4,data14,data24,data34,data44,datacolor_colum,datacolor_line3,datacolor_line2,datacolor_line4,averxsacl,0);//吨氨气耗
*/	
			 }
		});
	}
	/***************按日查看函数***********************/
	function ajax_day(url){
		 var new_url = getRootPath()+"/"+url;//请求地址
		 var args = {"isdate":"1","time": new Date()};
		 var data1 = [];//数据1
		 var data2 = [];//数据2
		 var data3 = [];//数据3
		 var data4 = [];//数据3
		 var data5 = [];//数据3
		 if(url == "jf_loadQuarterDataForMouthByAjax.action"){//季度报表 柱状图数据
			 var data6 = [];//数据3
			 var data7 = [];//数据3
			 var data8 = [];//数据3
			 var data9 = [];//数据3
		 }
		 var x_zuobiao = [];//横坐标 时间字符串转化而来
		 var x_zuobiao_s = [];//季度X
		 var x_zuobiao_y = [];//年X
		 
		 $.post(new_url,args,function(data){
			 data_class = $.parseJSON(data);
			 /*年度季度没有最后一行合计数据，所以不减一*/
			 
				 for(var i = 0; i < data_class.length-1; i++){
					 var ybs        = data_class[i].orig_id;//样本数
	    	    	 if(data_class[i].data_time){
	    	    		 var time       = data_class[i].data_time;//时间段
	    	    	 }
					 var racl        = data_class[i].time_FIQ162;//日氨产量
	    	    	 var rxas_zal    = data_class[i].time_purge_nh3;//日稀氨水(折氨量)(t)
	    	    	 var rtrqh       = data_class[i].time_FIQ203;//日天然气耗(Nm3)
	    	    	 var rzqh_zbm    = data_class[i].time_steam_coal ;//日蒸汽耗(折标煤)(kgce)
	    	    	 var racl_hxaszal= data_class[i].time_NH3;//日氨产量(含稀氨水折氨量)
	    	    	// var rtrqh_hzqh  = data_class[i].time_FIQ203 + data_class[i].time_steam_gas;//日天然气耗(含蒸汽耗)(Nm3)
	    	    	 var xsacl_hxaszs= data_class[i].time_NH3 / ybs * 6;//小时氨产量
	    	    	 var datrqh      = data_class[i].time_FIQ203/ data_class[i].time_NH3;//吨氨天然气耗
	    	    	 //var datrqh_hzqh = rtrqh_hzqh / racl_hxaszal;//吨氨天然气耗(含蒸汽耗)(kgce/tNH3)
	    	    	 var dazhxh      = datrqh * 1.2143+rzqh_zbm/racl_hxaszal//吨氨综合消耗 
	    	    	 
	    	    	 
	    	    	 
	    	    	 
	    	    	 data1.push(Math.round(dazhxh*100)/100);             //吨氨综合消耗
		    	   //  data2.push(Math.round(datrqh_hzqh*100)/100) ;            //吨氨天然气耗(含蒸汽耗)
		    		 data3.push(Math.round(datrqh*100)/100) ;            // 吨氨天然气耗
		    		 data4.push(Math.round(xsacl_hxaszs*100)/100) ;            //小时氨产量 (含稀氨水折算)(t/h)
		    		 x_zuobiao.push(renderTime(time.toString(),true)); //时间
		    		 if(url == "jf_loadQuarterDataForMouthByAjax.action"){//季度报表 柱状图数据
						 x_zuobiao_s.push(renderTime(time.toString(),true).substring(0, 7)); //季度时间
						 data7.push([renderTime(time.toString(),true).substring(0, 7),Math.round(racl*100)/100]) ;        //数据2  月氨产量(t)
		    			
		    			 data8.push([renderTime(time.toString(),true).substring(0, 7),Math.round(rtrqh*100)/100]) ;        //数据2  月氨产量(t)
		    			 data9.push([renderTime(time.toString(),true).substring(0, 7),Math.round(racl_hxaszal*100)/100]) ;       //数据2  月天然气耗(Nm3)
					 }
					 if(url == "jf_loadYearDataForMouthByAjax.action"){
						 x_zuobiao_y.push(renderTime(time.toString(),true).substring(0, 7)); //年时间
					 }
				 
				 }
			
			 

			 /*highchart参数顺序 
			 *id 横坐标 标题  弹窗单位 数据一 图例一  数据和图例可以为空
			 *实际函数中多了一个X轴间隔interval无需传入*/
			 //chart("test_test",x_zuobiao,tooltip1,data1,tuli1);//吨氨综合消耗
			 if(url == "jf_loadDayDataForDayByAjax.action"){//日报表
				 chart_day("container_day"  ,x_zuobiao,"line",tooltip1,data1,tuli1,datacolor_colum);//吨氨综合消耗
				
				 chart_day("container_day_2",x_zuobiao,"line",tooltip3,data3,tuli3,datacolor_line2);//吨氨天然气耗
				 chart_day("container_day_3",x_zuobiao,"line",tooltip4,data4,tuli4,datacolor_line3);//吨氨气耗(合计)
			 }else if(url == "jf_loadMouthDataForDayByAjax.action"){//月报表
				 chart_day("container_month_day"  ,x_zuobiao,"line",tooltip1,data1,tuli1,datacolor_colum);//吨氨综合消耗
				
				 chart_day("container_month_day_2",x_zuobiao,"line",tooltip3,data3,tuli3,datacolor_line2);//吨氨净蒸汽耗
				 chart_day("container_month_day_3",x_zuobiao,"line",tooltip4,data4,tuli4,datacolor_line3);//吨氨气耗
			 }else if(url == "jf_loadQuarterDataForMouthByAjax.action"){//季度报表
				 chart_day("container_season"  ,x_zuobiao_s,"column",tooltip1,data1,tuli1,column_color1);//吨氨综合消耗
				 //chart_day("container_season_1",x_zuobiao_s,"column",tooltip2,data2,tuli2,column_color2);//吨氨气耗(合计)
				 chart_day("container_season_2",x_zuobiao_s,"column",tooltip3,data3,tuli3,column_color3);//吨氨天然气耗
				 chart_day("container_season_3",x_zuobiao_s,"column",tooltip4,data4,tuli4,column_color4);//吨氨气耗(合计)
	
				 //chart_day("container_season_r" ,x_zuobiao,"pie",tooltip5,data6,tuli5,pie_color1);//月氨产量(t)
				 chart_day("container_season_r1",x_zuobiao,"pie",tooltip6,data7,tuli6,pie_color2);//月气耗(Nm3)
				 chart_day("container_season_r2" ,x_zuobiao,"pie",tooltip7,data8,tuli7,pie_color3);//月氨产量(t)
				 chart_day("container_season_r3",x_zuobiao,"pie",tooltip8,data9,tuli8,pie_color4);//月气耗(Nm3)
			 }else if(url == "jf_loadYearDataForMouthByAjax.action"){//年报表
				 chart_day("container_year",x_zuobiao_y,"column",tooltip1,data1,tuli1,column_color1);//吨氨综合消耗
				
				 chart_day("container_year_2",x_zuobiao_y,"column",tooltip3,data3,tuli3,column_color3);//吨氨净蒸汽耗(
				 chart_day("container_year_3",x_zuobiao_y,"column",tooltip4,data4,tuli4,column_color4);//吨氨气耗
			 }
	
		 });
	}
	
	/*highcharts按 日   查看统一设置值函数*/
	function chart_day(id,x_zuobiao,type,tooltip,data1,tuli1,datacolor){
		
		/*设置横坐标间隔 X坐标最多放15个*/
		var dateLength = x_zuobiao.length;
		var itv = 1;
		for(var i = 15; i < dateLength; i++){
			itv = Math.ceil(i/15);//对15向上取整，所以interval最大值为15
	    		//alert(interval)
		   };
		var chart = {
				type: type
		};
		var title = {
				 useHTML: true,
		       text: tuli1,
		       style:{
					fontWeight: 'bold',
					fontSize: '18px',
					fontFamily: 'YouYuan'
				}
		   };
	   var subtitle = {
	
			useHTML: true,
	        /*text: '最高值：' + Math.max.apply(null, data1) + tooltip + '，最低值：'
			+ Math.min.apply(null, data1) + tooltip,*/
			style:{
				fontWeight: 'bold',
				fontSize: '14px',
				fontFamily: 'YouYuan',
				color:'gray'
			}
	   };
	   var xAxis = {
		   /*坐标内容*/
	       categories: x_zuobiao,
	       /*坐标间隔*/
	       tickInterval:itv,
	       /*网格样式*/
	       gridLineWidth: 1,
	       gridLineColor: '#ccc',
	       /*刻度样式*/
	       tickColor: 'gray',
           tickWidth: 2,
           /*坐标轴样式*/
           lineColor: 'gray',
           lineWidth: 2
	   };
	   var credits= {
	           enabled: false
	       };
	   var yAxis = {
		   title: {
		         text: ' '
		      },
	      /*plotLines: [{
	         value: 0,
	         width: 1,
	         color: '#808080'
	      }]*/
		  /*坐标轴样式*/
	      lineColor: 'gray',
          lineWidth: 2,
          /*刻度样式*/
	      tickColor: 'gray',
          tickWidth: 2,
          /*网格样式*/
	      gridLineWidth: 1,
	      gridLineColor: '#ccc'
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
	   
	  
	   if(type == 'column'){//柱图设置Y坐标最小值
		   yAxis.min = Math.min.apply(null,data1)-1;
	   };
	   var series =  [
			      {
			         name: tuli1,
			        
			         data: data1,
			         color : datacolor
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
				maxPointWidth : 100,//最大宽度
				
			},
			column: {//柱状图颜色
                colorByPoint:true,
				colors: datacolor
			},
			pie: {//柱状图颜色
				innerSize: '70%',
                colorByPoint:true,
				colors: datacolor
			}
		}
	   if(type == 'pie'){//饼图设置百分比
		   tooltip.pointFormat = '{series.name}: <b>{point.percentage:.1f}%</b>';
		   plotOptions.pie.dataLabels={
				   enabled: true,
                   format: '<b>{point.name}</b><br> ({point.percentage:.1f} %)',  
		   };
		   subtitle.text = " ";
		   chart.plotBackgroundColor = '#fff';
		   chart.plotBorderWidth = '0';
		   title.y = 190;
		   
	   };
	   var json = {};
	   json.title = title;
	   
	   json.xAxis = xAxis;
	   json.yAxis = yAxis;
	   json.tooltip = tooltip;
	   json.series = series;
	   json.plotOptions = plotOptions;
	   json.credits = credits;
	   json.chart = chart;
	   json.subtitle = subtitle;
	   $('#' + id).highcharts(json);
	}
	
	
	/*highcharts按班查看统一设置值函数*/
	function chart_ban(id,x_zuobiao,title,tooltip,data1,data2,data3,ban_color1,ban_color2,ban_color3){
		/*设置横坐标间隔 X坐标最多放15个*/
		
		var dateLength = x_zuobiao.length;
		var itv = 1;
		for(var i = 15; i < dateLength; i++){
			itv = Math.ceil(i/15);//对15向上取整，所以interval最大值为15
	    		//alert(interval)
		   }
			var title = {
				 useHTML: true,
			       text: title,
			       style:{
						fontWeight: 'bold',
						fontSize: '18px',
						fontFamily: 'YouYuan'
					}
			   };
			var chart = {
					type: 'line'
			   };
			   var xAxis = {
			       categories: x_zuobiao,
			       tickInterval:itv,
			       /*网格样式*/
			       gridLineWidth: 1,
			       gridLineColor: '#ccc',
			       /*刻度样式*/
			       tickColor: 'gray',
		           tickWidth: 2,
		           /*坐标轴样式*/
		           lineColor: 'gray',
		           lineWidth: 2
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
			      }],
			      /*网格样式*/
			       gridLineWidth: 1,
			       gridLineColor: '#ccc',
			       /*坐标轴样式*/
			      lineColor: 'gray',
		          lineWidth: 2,
		          /*刻度样式*/
			      tickColor: 'gray',
		          tickWidth: 2
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
					         name: "白班",
					         data: data1,
					         dashStyle: 'longdash',
					         color: ban_color1
					      },
					      {
					         name: "中班",
					         data: data2,
					         dashStyle: 'shortdot',
					         color: ban_color2
					      },
					      {
					         name: "夜班",
					         data: data3,
					         color: ban_color3
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
			   json.chart = chart;
			   json.xAxis = xAxis;
			   json.yAxis = yAxis;
			   json.tooltip = tooltip;
			   json.series = series;
			   json.plotOptions = plotOptions;
			   json.credits = credits;
			   $('#' + id).highcharts(json);
	}
	/*第二种分班查看*/
	function chart_ban_two(id,x_zuobiao,title,tooltip,data1,data2,data3,data4,ban_color1,ban_color2,ban_color3,ban_color4){
		/*设置横坐标间隔 X坐标最多放15个*/
		
		var dateLength = x_zuobiao.length;
		var itv = 1;
		for(var i = 15; i < dateLength; i++){
			itv = Math.ceil(i/15);//对15向上取整，所以interval最大值为15
	    		//alert(interval)
		   }
			var title = {
				 useHTML: true,
			       text: title,
			       style:{
						fontWeight: 'bold',
						fontSize: '18px',
						fontFamily: 'YouYuan'
					}
			   };
			var chart = {
					type: 'line'
			   };
			   var xAxis = {
					  /* visible:false,*/
			       categories: x_zuobiao,
			       tickInterval:itv,
			       /*网格样式*/
			       gridLineWidth: 1,
			       gridLineColor: '#ccc',
			       /*刻度样式*/
			       tickColor: 'gray',
		           tickWidth: 2,
		           /*坐标轴样式*/
		           lineColor: 'gray',
		           lineWidth: 2
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
			      }],
			      /*网格样式*/
			       gridLineWidth: 1,
			       gridLineColor: '#ccc',
			       /*坐标轴样式*/
			      lineColor: 'gray',
		          lineWidth: 2,
		          /*刻度样式*/
			      tickColor: 'gray',
		          tickWidth: 2
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
					         name: "1班",
					         data: data1,
					         /*dashStyle: 'longdash',*/
					         color: ban_color1
					      },
					      {
					         name: "2班",
					         data: data2,
					       /*  dashStyle: 'shortdot',*/
					         color: ban_color2
					      },
					      {
					         name: "3班",
					         data: data3,
					         color: ban_color3
					      },
					      {
					         name: "4班",
					         data: data4,
					         color: ban_color4
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
			   json.chart = chart;
			   json.xAxis = xAxis;
			   json.yAxis = yAxis;
			   json.tooltip = tooltip;
			   json.series = series;
			   json.plotOptions = plotOptions;
			   json.credits = credits;
			   $('#' + id).highcharts(json);
	}
	/*第三种分班查看*/
	function chart_ban_three(id,x_zuobiao,title,tooltip,data1,data2,data3,data4,ban_color1,ban_color2,ban_color3,ban_color4,average,flx){
		var dateLength = x_zuobiao.length;
		var itv = 1;
		for(var i = 15; i < dateLength; i++){
			itv = Math.ceil(i/15);//对15向上取整，所以interval最大值为15
	    		//alert(interval)
		   }
		
		$('#'+id).highcharts({
	        chart: {
	            type: 'scatter',
	            lineWidth: 0,
	            zoomType: 'xy'
	        },
	        title: {
	        	useHTML: true,
			       text: title,
			       style:{
						fontWeight: 'bold',
						fontSize: '18px',
						fontFamily: 'YouYuan'
					}
	        },
	       tooltip : {
					  
				      valueSuffix: tooltip,
				      useHTML: true,
				      shared:true,
				      formatter: function () {
			                return this.series.name +'<br>'+
			                    title+'：' +'<b>'+ this.y+'</b>' + tooltip;
			            },
				      crosshairs: [{
		                width: 1,
		                color: 'red'
				      }]
				   },
	        xAxis: {
	            title: {
	                enabled: true,
	                text: ''
	            },
	            min: 0,
	            startOnTick: true,
	            endOnTick: true,
	            showLastLabel: true
	        },
	        yAxis: {
	            title: {
	                text: ""
	            },
	            plotLines: [{
	                color: 'blue',
	                dashStyle: 'Solid',
	                width: 1,
	                value: average,
	                label: {
	                    rotation: 0,
	                    useHTML: true,
	                    align: 'right',
	                    x:-30,
	                    y: -15,
	                    style: {
	                        fontStyle: 'italic'
	                    },
	                    text: '均值线：'+'<b><font style="color:red">'+Math.round(average*100)/100+'</font></b>'+tooltip
	                },
	                zIndex: 3
	            },{
	                color: 'red',
	                dashStyle: 'Solid',
	                width: 1,
	                value: flx,
	                label: {
	                    rotation: 0,
	                    useHTML: true,
	                    align: 'right',
	                    x:-30,
	                    y: -15,
	                    style: {
	                        fontStyle: 'italic'
	                    },
	                    text: '分类限：'+'<b><font style="color:red">'+flx+'</font></b>'+tooltip
	                },
	                zIndex: 3
	            }]
	        },
	        legend: {
	            layout: 'horizontal',
	            align: 'center',
	            verticalAlign: 'bottom',
	         
	        },
	        credits: {
			           enabled: false
			       },
	        plotOptions: {
	        	series : {
					lineWidth : 0,
					shadow: {
		                color: '#ddd',
		                width: 10,
		                offsetX: 5,
		                offsetY: 5
		            },
		            marker: {
		                radius: 6,
		                fillColor: '#FFFFFF',
		                lineWidth: 3,
		                lineColor:  null, // inherit from series
		            }
				},
	            scatter: {
	                marker: {
	                    radius: 5,
	                    states: {
	                        hover: {
	                            enabled: true,
	                            lineColor: 'rgb(100,100,100)'
	                        }
	                    }
	                },
	                states: {
	                    hover: {
	                        marker: {
	                            enabled: false
	                        }
	                    }
	                },
	                /*tooltip: {
		   			      useHTML: true,
		   			      shared:true,
		   			      crosshairs: [{
		   	                width: 1,
		   	                color: 'red'
		   			      }],
	                    headerFormat: '<b>{series.name}</b><br>',
	                    pointFormat: title+':'+'{point.y}'+tooltip
	                }*/
	            }
	        },
	        series: [{
	            name: '1班',
	            color: ban_color1,
	            marker: {
	               /* symbol: 'url(images/number1.png)'*/
	                symbol: 'url(images/number1.png)'
	            },
	            data: data1
	        }, {
	            name: '2班',
	            color: ban_color2,
	            marker: {
	                symbol: 'url(images/number2.png)'
	            },
	            data: data2
	        }, {
	            name: '3班',
	            color: ban_color3,
	            marker: {
	                symbol: 'url(images/number3.png)'
	            },
	            data: data3
	        }, {
	            name: '4班',
	            color: ban_color4,
	            marker: {
	                symbol: 'url(images/number4.png)'
	            },
	            data: data4
	        }]
	    });
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
			return year + "/" + month + "/" + date;
		}else{
			return month + "/" + date;
		}
	}
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
	}  
  
  
  
  /*滚动固定导航栏*/
  var win = $(window);
  var doc = $(document);
  var fl = true;
  win.scroll(function() {
	  myScroll("tbl_hd_dd","energy_day");
	  myScroll("tbl_hd_db","energy_day_ban");
	  myScroll("tbl_hd_md","energy_month_day");
	  myScroll("tbl_hd_mb","energy_month_ban");
  });
  
  
  //页面滚动时的函数
  function myScroll(tbl_hd,rel_tbl) {
	var realL = $("#"+rel_tbl).find("tr").length;
	
	maxH = 30 * (realL) + 90;
	
  	if (doc.scrollTop() >= 90) { //大于头部高度
  		$("."+tbl_hd).css("visibility","visible");
  	} else if (doc.scrollTop() <= 90) { //相反
  		$("."+tbl_hd).css("visibility","hidden");
  	};
  	if (doc.scrollTop() >= maxH) { //大于表哥格高度
  		$("."+tbl_hd).css("visibility","hidden");
  	};
  }
  


  

});

    /*合并行*/
   _w_table_rowspan("#energy_day_ban",1);
   _w_table_rowspan("#energy_month_ban",1);
   
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
	};
   
	Number.prototype.toFixed = function(s)  
	{  
	    var f = Math.round(this * Math.pow( 10, s ))/ Math.pow( 10, s );  
        var s = f.toString();    
        var rs = s.indexOf('.');    
        if (rs < 0) {    
            rs = s.length;    
            s += '.';    
        }    
        while (s.length <= rs + 2) {    
            s += '0';    
        }    
        return s;  
	}  
