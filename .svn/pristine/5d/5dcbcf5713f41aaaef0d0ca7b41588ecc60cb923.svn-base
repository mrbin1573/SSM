/*建峰折线图数据生成*/
$(function() {

	data();
	/*获取表格数据加载到折线图*/
	/*自动填写折线图*/
	//获取表格行数
	function data() {
		var row_day_day_length = $("#energy_day tr").length; //日报表-日
		var row_day_ban_length = $("#energy_day_ban tr").length; //日报表-班
		var row_month_day_length = $("#energy_month_day tr").length; //月报表-日
		var row_month_ban_length = $("#energy_month_ban tr").length; //月报表-班
		var row_year_length = $("#energy_year tr").length; //年报表
		var row_season_length = $("#energy_season tr").length; //季节报表
		//************************获取表格************************
		var tbl_day_day = document.getElementById("energy_day"); //日报表-日
		var tbl_day_ban = document.getElementById("energy_day_ban"); //日报表-班
		var tbl_month_day = document.getElementById("energy_month_day"); //月报表-日
		var tbl_month_ban = document.getElementById("energy_month_ban"); //月报表-班
		var tbl_year = document.getElementById("energy_year"); //年
		var tbl_season = document.getElementById("energy_season"); //季节报表

		//**************************x轴数组*************************
		var dd_x_arr = []; //日报表-日
		var db_x_arr = []; //日报表-班
		var md_x_arr = []; //月报表-日
		var mb_x_arr = []; //月报表-班
		var y_x_arr = []; //年报表
		var s_x_arr = []; //季节报表

		//*********************日报表 按班查看************************
		var dd_data = []; //日报表-日 吨氨综合消耗
		var dd_data_1 = []; //日报表-日 吨氨气耗(合计)
		var dd_data_2 = [];//日报表-日 吨氨天然气耗
		var dd_data_3 = []; //日报表-日 吨氨蒸汽耗(折标煤)
		var dd_data_4 = []; //日报表-日 吨氨蒸汽耗(折天然气)

		//*********************日报表 早中晚************************
		var db_data_m_zh = []; //日报表-早班 吨氨综合消耗
		var db_data_n_zh = []; //日报表-中班 吨氨综合消耗
		var db_data_e_zh = []; //日报表-晚班 吨氨综合消耗

		var db_data_m_daqh = []; //日报表-早班 吨氨气耗(合计)
		var db_data_n_daqh = []; //日报表-中班 吨氨气耗(合计)
		var db_data_e_daqh = []; //日报表-晚班 吨氨气耗(合计)

		var db_data_m_datrqh = []; //日报表-早班 吨氨天然气耗
		var db_data_n_datrqh = []; //日报表-中班 吨氨天然气耗
		var db_data_e_datrqh = []; //日报表-晚班 吨氨天然气耗

		var db_data_m_zbm = []; //日报表-早班 吨氨蒸汽耗(折标煤)
		var db_data_n_zbm = []; //日报表-中班 吨氨蒸汽耗(折标煤)
		var db_data_e_zbm = []; //日报表-晚班 吨氨蒸汽耗(折标煤)

		var db_data_m_ztrq = []; //日报表-早班 吨氨蒸汽耗(折天然气)
		var db_data_n_ztrq = []; //日报表-中班 吨氨蒸汽耗(折天然气)
		var db_data_e_ztrq = []; //日报表-晚班 吨氨蒸汽耗(折天然气)

		var md_data = []; //月报表-日 吨氨综合消耗
		var md_data_1 = []; //月报表-日  吨氨气耗(合计)
		var md_data_2 = []; //月报表-日 吨氨天然气耗
		var md_data_3 = []; //月报表-日 吨氨蒸汽耗(折标煤)
		var md_data_4 = []; //月报表-日 吨氨蒸汽耗(折天然气)

		//*********************月报表 早中晚************************
		var mb_data_m_zh = []; //月报表-早班 吨氨综合消耗
		var mb_data_n_zh = []; //月报表-中班 吨氨综合消耗
		var mb_data_e_zh = []; //月报表-晚班 吨氨综合消耗

		var mb_data_m_daqh = []; //月报表-早班 吨氨气耗(合计)
		var mb_data_n_daqh = []; //月报表-中班 吨氨气耗(合计)
		var mb_data_e_daqh = []; //月报表-晚班 吨氨气耗(合计)

		var mb_data_m_datrqh = []; //月报表-早班 吨氨天然气耗
		var mb_data_n_datrqh = []; //月报表-中班 吨氨天然气耗
		var mb_data_e_datrqh = []; //月报表-晚班 吨氨天然气耗

		var mb_data_m_zbm = []; //月报表-早班 吨氨蒸汽耗(折标煤)
		var mb_data_n_zbm = []; //月报表-中班 吨氨蒸汽耗(折标煤)
		var mb_data_e_zbm = []; //月报表-晚班 吨氨蒸汽耗(折标煤)

		var mb_data_m_ztrq = []; //月报表-早班 吨氨蒸汽耗(折天然气)
		var mb_data_n_ztrq = []; //月报表-中班 吨氨蒸汽耗(折天然气)
		var mb_data_e_ztrq = []; //月报表-晚班 吨氨蒸汽耗(折天然气)

		//*********************年报表 ************************
		var y_data = []; //年报表   吨氨综合消耗
		var y_data_1 = []; //年报表 吨氨气耗(合计)
		var y_data_2 = []; //年报表 吨氨天然气耗
		var y_data_3 = []; //年报表 吨氨蒸汽耗(折标煤)
		var y_data_4 = []; //年报表 吨氨蒸汽耗(折天然气)

		//*********************季度报表************************
		var s_data = []; //季节报表 吨氨综合消耗
		var s_data_1 = []; //季节报表 吨氨气耗(合计)
		var s_data_2 = []; //季节报表 吨氨天然气耗
		var s_data_3 = []; //季节报表 吨氨蒸汽耗(折标煤)
		var s_data_4 = []; //季节报表 吨氨蒸汽耗(折天然气)

		var s_data_yacl = []; //季节报表 月氨产量
		var s_data_ytrqh = []; //季节报表 月天然气耗
		var s_data_yzqh_zbm = []; //季节报表 月蒸汽耗(折标煤)
		var s_data_yzqh_ztrq = []; //季节报表 月蒸汽耗(折天然气)

		var pie_yacl = [];//季节报表 饼图月氨产量
		var pie_ytrqh = [];//季节报表 饼图月天然气耗
		var pie_yzqh_zbm = [];//季节报表 饼图月月蒸汽耗(折标煤)
		var pie_yzqh_ztrq = [];//季节报表 饼图月月蒸汽耗(折天然气)
		
		//******************循环赋值 日-日*******************************
		for ( var i = 1; i < row_day_day_length; i++) { //从第二行非表头开始循环
			
			dd_x_arr.push(tbl_day_day.rows[i].cells[0].innerHTML.substr(5, 6)); //x轴 存入截取后的数据到数组
			dd_data.push(parseFloat(tbl_day_day.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组 综合消耗
			dd_data_1.push(parseFloat(tbl_day_day.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨气耗(合计)
			dd_data_2.push(parseFloat(tbl_day_day.rows[i].cells[6].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨天然气耗
			dd_data_3.push(parseFloat(tbl_day_day.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨蒸汽耗(折标煤)
			dd_data_4.push(parseFloat(tbl_day_day.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨蒸汽耗(折天然气)
			
		}

		//******************循环赋值 日-班 早中晚*******************************
		/*日报表 早班*/
		for ( var i = 1; i < row_day_ban_length; i += 3) { //从第二行非表头开始循环
			db_x_arr.push(tbl_day_ban.rows[i].cells[0].innerHTML.substr(5, 6)); //x轴 存入截取后的数据到数组

			db_data_m_zh
					.push(parseFloat(tbl_day_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         早 综合
			db_data_m_daqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    早 吨氨气耗(合计)
			db_data_m_datrqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  早 吨氨天然气耗
			db_data_m_zbm
					.push(parseFloat(tbl_day_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组          早 吨氨蒸汽耗(折标煤)
			db_data_m_ztrq
					.push(parseFloat(tbl_day_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      早 吨氨蒸汽耗(天然气)
		}
		/*日报表中班*/
		for ( var i = 2; i < row_day_ban_length; i += 3) { //从第二行非表头开始循环
			db_data_n_zh
					.push(parseFloat(tbl_day_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         中 综合
			db_data_n_daqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    中 吨氨气耗(合计)
			db_data_n_datrqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  中 吨氨天然气耗
			db_data_n_zbm
					.push(parseFloat(tbl_day_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组          中 吨氨蒸汽耗(折标煤)
			db_data_n_ztrq
					.push(parseFloat(tbl_day_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      中 吨氨蒸汽耗(天然气)
		}
		/*日报表晚班*/
		for ( var i = 3; i < row_day_ban_length; i += 3) { //从第二行非表头开始循环
			db_data_e_zh
					.push(parseFloat(tbl_day_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         晚  综合
			db_data_e_daqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    晚 吨氨气耗(合计)
			db_data_e_datrqh
					.push(parseFloat(tbl_day_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  晚 吨氨天然气耗
			db_data_e_zbm
					.push(parseFloat(tbl_day_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组         晚  吨氨蒸汽耗(折标煤)
			db_data_e_ztrq
					.push(parseFloat(tbl_day_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      晚 吨氨蒸汽耗(天然气)
		}

		//******************循环赋值月 -日*******************************
		//循环赋值 月-日
		for ( var i = 1; i < row_month_day_length; i++) { //从第二行非表头开始循环
			md_x_arr
					.push(tbl_month_day.rows[i].cells[0].innerHTML.substr(5, 6)); //x轴 存入截取后的数据到数组
			md_data.push(parseFloat(tbl_month_day.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组 综合消耗
			md_data_1
					.push(parseFloat(tbl_month_day.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨气耗(合计)
			md_data_2
					.push(parseFloat(tbl_month_day.rows[i].cells[6].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨天然气耗
			md_data_3
					.push(parseFloat(tbl_month_day.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨蒸汽耗(折标煤)
			md_data_4
					.push(parseFloat(tbl_month_day.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组 吨氨蒸汽耗(折天然气)

		}

		//******************循环赋值月 -早中晚*******************************
		/*月报表 早班*/
		for ( var i = 1; i < row_month_ban_length; i += 3) { //从第二行非表头开始循环
			mb_x_arr
					.push(tbl_month_ban.rows[i].cells[0].innerHTML.substr(5, 6)); //x轴 存入截取后的数据到数组

			mb_data_m_zh
					.push(parseFloat(tbl_month_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         早 综合
			mb_data_m_daqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    早 吨氨气耗(合计)
			mb_data_m_datrqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  早 吨氨天然气耗
			mb_data_m_zbm
					.push(parseFloat(tbl_month_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组          早 吨氨蒸汽耗(折标煤)
			mb_data_m_ztrq
					.push(parseFloat(tbl_month_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      早 吨氨蒸汽耗(天然气)

		}
		/*月报表中班*/
		for ( var i = 2; i < row_month_ban_length; i += 3) { //从第二行非表头开始循环
			mb_data_n_zh
					.push(parseFloat(tbl_month_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         中 综合
			mb_data_n_daqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    中 吨氨气耗(合计)
			mb_data_n_datrqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  中 吨氨天然气耗
			mb_data_n_zbm
					.push(parseFloat(tbl_month_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组          中 吨氨蒸汽耗(折标煤)
			mb_data_n_ztrq
					.push(parseFloat(tbl_month_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      中 吨氨蒸汽耗(天然气)
		}
		/*月报表晚班*/
		for ( var i = 3; i < row_month_ban_length; i += 3) { //从第二行非表头开始循环
			mb_data_e_zh
					.push(parseFloat(tbl_month_ban.rows[i].cells[11].innerHTML)); //表格数据 存入转化为int型的数据到数组         晚  综合
			mb_data_e_daqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[10].innerHTML)); //表格数据 存入转化为int型的数据到数组    晚 吨氨气耗(合计)
			mb_data_e_datrqh
					.push(parseFloat(tbl_month_ban.rows[i].cells[7].innerHTML)); //表格数据 存入转化为int型的数据到数组  晚 吨氨天然气耗
			mb_data_e_zbm
					.push(parseFloat(tbl_month_ban.rows[i].cells[8].innerHTML)); //表格数据 存入转化为int型的数据到数组         晚 吨氨蒸汽耗(折标煤)
			mb_data_e_ztrq
					.push(parseFloat(tbl_month_ban.rows[i].cells[9].innerHTML)); //表格数据 存入转化为int型的数据到数组      晚 吨氨蒸汽耗(天然气)

		}

		//********************************循环赋值 年*******************************
		for ( var i = 1; i < row_year_length; i++) { //从第二行非表头开始循环

			y_x_arr.push(tbl_year.rows[i].cells[0].innerHTML); //存入截取后的数据到数组
			if (tbl_year.rows[i].cells[0].innerHTML != "合计") {
				y_data.push(parseFloat(tbl_year.rows[i].cells[10].innerHTML)); //存入转化为int型的数据到数组   吨氨综合消耗
				y_data_1.push(parseFloat(tbl_year.rows[i].cells[9].innerHTML)); //存入转化为int型的数据到数组 吨氨气耗(合计)
				y_data_2.push(parseFloat(tbl_year.rows[i].cells[6].innerHTML)); //存入转化为int型的数据到数组 吨氨天然气耗
				y_data_3.push(parseFloat(tbl_year.rows[i].cells[7].innerHTML)); //存入转化为int型的数据到数组 吨氨蒸汽耗(折标煤)
				y_data_4.push(parseFloat(tbl_year.rows[i].cells[8].innerHTML)); //存入转化为int型的数据到数组 吨氨蒸汽耗(折天然气)
				
			}
		}
		//*****************************循环赋值 季节***********************

		for ( var i = 1; i < row_season_length; i++) { //从第二行非表头开始循环
			s_x_arr.push(tbl_season.rows[i].cells[0].innerHTML); //横坐标

			if (tbl_season.rows[i].cells[0].innerHTML != "合计") {

				s_data_yacl
						.push(parseFloat(tbl_season.rows[i].cells[1].innerHTML)); //存入转化为int型的数据到数组 月氨产量
				s_data_ytrqh
						.push(parseFloat(tbl_season.rows[i].cells[2].innerHTML)); //存入转化为int型的数据到数组 月天然气耗
				s_data_yzqh_zbm
						.push(parseFloat(tbl_season.rows[i].cells[3].innerHTML)); //存入转化为int型的数据到数组月蒸汽耗(折标煤)
				s_data_yzqh_ztrq
						.push(parseFloat(tbl_season.rows[i].cells[4].innerHTML)); //存入转化为int型的数据到数组 季节报表 月蒸汽耗(折天然气)

				pie_yacl.push([ s_x_arr[i - 1], s_data_yacl[i - 1] ]);//饼状图 月氨产量
				pie_ytrqh.push([ s_x_arr[i - 1], s_data_ytrqh[i - 1] ]);//饼状图 月天然气耗
				pie_yzqh_zbm.push([ s_x_arr[i - 1], s_data_yzqh_zbm[i - 1] ]);//饼状图 月蒸汽耗(折标煤)
				pie_yzqh_ztrq.push([ s_x_arr[i - 1], s_data_yzqh_ztrq[i - 1] ]);//饼状图 月蒸汽耗(折天然气)

				s_data.push(parseFloat(tbl_season.rows[i].cells[10].innerHTML)); //存入转化为int型的数据到数组  吨氨综合消耗
				s_data_1
						.push(parseFloat(tbl_season.rows[i].cells[9].innerHTML)); //存入转化为int型的数据到数组 吨氨气耗（合计）
				s_data_2
						.push(parseFloat(tbl_season.rows[i].cells[6].innerHTML)); //存入转化为int型的数据到数组 吨氨天然气耗
				s_data_3
						.push(parseFloat(tbl_season.rows[i].cells[7].innerHTML)); //存入转化为int型的数据到数组 吨氨蒸汽耗（折标煤）
				s_data_4
						.push(parseFloat(tbl_season.rows[i].cells[8].innerHTML)); //存入转化为int型的数据到数组 吨氨蒸汽耗（折天然气）
			}
		}

		/**********************************能耗分期日考核日报表--按日查看******************************/
		var tb_day_day = $("#energy_season"); //获取日报表-按日查看表格

		var title_day_day = tb_day_day.find("th:nth-child(6)").text(); //获得指定第六个的标题

		/*日报表--按日查看*/
		/*设置横坐标间隔 X坐标最多放20个*/
		var dateLength = dd_x_arr.length;
		if(db_x_arr){
			dateLength = mb_x_arr.length;
		}else if (md_x_arr.length) {
			dateLength = md_x_arr.length;
		}else if(mb_x_arr){
			dateLength = mb_x_arr.length;
		}
		var interval = 1;
		for ( var i = 20; i < dateLength; i++) {
			interval = Math.ceil(i / 20);//对20向上取整，所以interval最大值为20
			//alert(interval)
		}
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
		/*吨氨综合消耗*/
		$('#container_day').highcharts(
				{

					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值 ' + Math.max.apply(null, dd_data) + '，最低值 '
								+ Math.min.apply(null, dd_data) + ''
					},
					xAxis : {
						categories : dd_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, dd_data),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kgce/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨综合消耗',
						data : dd_data
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨气耗(合计)*/
		$('#container_day_1').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, dd_data_1) + '，最低值'
								+ Math.min.apply(null, dd_data_1) + ''
					},
					xAxis : {
						categories : dd_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, dd_data_1),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kWh/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨气耗(合计)',
						data : dd_data_1
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_day_2').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, dd_data_2) + '，最低值'
								+ Math.min.apply(null, dd_data_2) + ''
					},
					xAxis : {
						categories : dd_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, dd_data_2),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨天然气耗',
						data : dd_data_2
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折标煤)*/
		$('#container_day_3').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, dd_data_3) + '，最低值'
								+ Math.min.apply(null, dd_data_3) + ''
					},
					xAxis : {
						categories : dd_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, dd_data_3),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折标煤)',
						data : dd_data_3
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折天然气)*/
		$('#container_day_4').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, dd_data_4) + '，最低值'
								+ Math.min.apply(null, dd_data_4) + ''
					},
					xAxis : {
						categories : dd_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, dd_data_4),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折天然气)',
						data : dd_data_4
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/**********日报表--按班查看*************************************************/
		/*吨氨综合消耗*/
		$('#container_day_ban_1').highcharts(
				{
					chart : {
						type : 'line',

					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : db_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kgce/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : db_data_m_zh,
						marker : {
							symbol : "url(./images/1.png)"
						},
						lineWidth : 2

					}, {
						name : '中班',
						data : db_data_n_zh,
						marker : {
							symbol : "url(./images/2.png)"
						},
						lineWidth : 2
					}, {
						name : '晚班',
						data : db_data_e_zh,
						marker : {
							symbol : "url(./images/3.png)"
						},
						lineWidth : 2,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return true; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨气耗(合计)*/
		$('#container_day_ban_2').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : db_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kWh/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : db_data_m_daqh
					}, {
						name : '中班',
						data : db_data_n_daqh
					}, {
						name : '晚班',
						data : db_data_e_daqh,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_day_ban_3').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : db_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : db_data_m_datrqh
					}, {
						name : '中班',
						data : db_data_n_datrqh
					}, {
						name : '晚班',
						data : db_data_e_datrqh,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/*吨氨蒸汽耗(折标煤)*/
		$('#container_day_ban_4').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : db_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : db_data_m_zbm
					}, {
						name : '中班',
						data : db_data_n_zbm
					}, {
						name : '晚班',
						data : db_data_e_zbm,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/*吨氨蒸汽耗(折天然气)*/
		$('#container_day_ban_5').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : db_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : db_data_m_ztrq
					}, {
						name : '中班',
						data : db_data_n_ztrq
					}, {
						name : '晚班',
						data : db_data_e_ztrq,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/*******************************月报表--按日查看***********************************/
		/*吨氨综合消耗*/
		$('#container_month_day').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, md_data) + '，最低值'
								+ Math.min.apply(null, md_data) + ''
					},
					xAxis : {
						categories : md_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, md_data),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kgce/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨综合消耗',
						data : md_data
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨气耗(合计)*/
		$('#container_month_day_1').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, md_data_1) + '，最低值'
								+ Math.min.apply(null, md_data_1) + ''
					},
					xAxis : {
						categories : md_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, md_data_1),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kWh/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨气耗(合计)',
						data : md_data_1
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_month_day_2').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, md_data_2) + '，最低值'
								+ Math.min.apply(null, md_data_2) + ''
					},
					xAxis : {
						categories : md_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, md_data_2),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨天然气耗',
						data : md_data_2
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折标煤)*/
		$('#container_month_day_3').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, md_data_3) + '，最低值'
								+ Math.min.apply(null, md_data_3) + ''
					},
					xAxis : {
						categories : md_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, md_data_3),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折标煤)',
						data : md_data_3
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折天然气)*/
		$('#container_month_day_4').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, md_data_4) + '，最低值'
								+ Math.min.apply(null, md_data_4) + ''
					},
					xAxis : {
						categories : md_x_arr,
						tickInterval : interval
					},
					yAxis : {
						min : Math.min.apply(null, md_data_4),
						title : {
							text : ' '
						}
					},
					tooltip : {
						enabled : true,
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折天然气)',
						data : md_data_4
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/*******************************************月报表--按班查看************************************/
		/*吨氨综合消耗*/
		$('#container_month_ban_1').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : mb_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kgce/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : mb_data_m_zh
					}, {
						name : '中班',
						data : mb_data_n_zh
					}, {
						name : '晚班',
						data : mb_data_e_zh,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨气耗(合计)*/
		$('#container_month_ban_2').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : mb_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kWh/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : mb_data_m_daqh
					}, {
						name : '中班',
						data : mb_data_n_daqh
					}, {
						name : '晚班',
						data : mb_data_e_daqh,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_month_ban_3').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : mb_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : mb_data_m_datrqh
					}, {
						name : '中班',
						data : mb_data_n_datrqh
					}, {
						name : '晚班',
						data : mb_data_e_datrqh,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折标煤)*/
		$('#container_month_ban_4').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : mb_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : mb_data_m_zbm
					}, {
						name : '中班',
						data : mb_data_n_zbm
					}, {
						name : '晚班',
						data : mb_data_e_zbm,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});
		/*吨氨蒸汽耗(折天然气)*/
		$('#container_month_ban_5').highcharts(
				{
					chart : {
						type : 'line'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
					/*text: '最高值' + Math.max.apply(null, db_data_m) + '，最低值' + Math.min.apply(null, db_data_m) + ''*/
					},
					xAxis : {
						categories : mb_x_arr,
						tickInterval : interval
					},
					yAxis : {
						title : {
							text : ' '
						}
					},
					tooltip : {
						shared:true,
						enabled : true,
						/*formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}*/
					},
					plotOptions : {
						line : {
							dataLabels : {
								enabled : false
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '早班',
						data : mb_data_m_ztrq
					}, {
						name : '中班',
						data : mb_data_n_ztrq
					}, {
						name : '晚班',
						data : mb_data_e_ztrq,
						dashStyle : 'shortdot'
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							}
						}
					}
				});

		/*********************************年报表*****************************/
		/*吨氨综合消耗*/
		$('#container_year').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, y_data) + '，最低值'
								+ Math.min.apply(null, y_data) + ''
					},
					xAxis : {
						categories : y_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, y_data),
						title : {
							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kgce/tNH3)';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨综合消耗',
						data : y_data
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});
		/*吨氨气耗(合计)*/
		$('#container_year_1').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, y_data_1) + '，最低值'
								+ Math.min.apply(null, y_data_1) + ''
					},
					xAxis : {
						categories : y_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, y_data_1),
						title : {
							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(kWh/tNH3)';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨气耗(合计)',
						data : y_data_1
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_year_2').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, y_data_2) + '，最低值'
								+ Math.min.apply(null, y_data_2) + ''
					},
					xAxis : {
						categories : y_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, y_data_2),
						title : {
							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨天然气耗',
						data : y_data_2
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});

		/*吨氨蒸汽耗(折标煤)*/
		$('#container_year_3').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, y_data_3) + '，最低值'
								+ Math.min.apply(null, y_data_3) + ''
					},
					xAxis : {
						categories : y_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, y_data_3),
						title : {
							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折标煤)',
						data : y_data_3
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});
		/*吨氨蒸汽耗(折天然气)*/
		$('#container_year_4').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, y_data_4) + '，最低值'
								+ Math.min.apply(null, y_data_4) + ''
					},
					xAxis : {
						categories : y_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, y_data_4),
						title : {
							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '(Nm3/tNH3)';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : false
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折天然气)',
						data : y_data_4
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});

		/*******************************************************季度报表柱状体********************************************/
		/*吨氨综合消耗*/
		$('#container_season').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨综合消耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, s_data) + '，最低值'
								+ Math.min.apply(null, s_data) + ''
					},
					xAxis : {
						categories : s_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, s_data),
						title : {

							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '（kgce/tNH3）';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : true
						}
					},
					series : [ {
						name : '吨氨综合消耗',
						data : s_data,
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});

		/*吨氨气耗（合计）*/
		$('#container_season_1').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨气耗(合计)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, s_data_1) + '，最低值'
								+ Math.min.apply(null, s_data_1) + ''
					},
					xAxis : {
						categories : s_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, s_data_1),
						title : {

							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '（kWh/tNH3）';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : true
						}
					},
					series : [ {
						name : '吨氨气耗(合计)',
						data : s_data_1,
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});
		/*吨氨天然气耗*/
		$('#container_season_2').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨天然气耗'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, s_data_2) + '，最低值'
								+ Math.min.apply(null, s_data_2) + ''
					},
					xAxis : {
						categories : s_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, s_data_2),
						title : {

							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '（Nm3/tNH3）';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : true
						}
					},
					series : [ {
						name : '吨氨天然气耗',
						data : s_data_2,
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});

		/*吨氨蒸汽耗(折标煤)*/
		$('#container_season_3').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨蒸汽耗(折标煤)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, s_data_3) + '，最低值'
								+ Math.min.apply(null, s_data_3) + ''
					},
					xAxis : {
						categories : s_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, s_data_3),
						title : {

							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '（Nm3/tNH3）';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : true
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折标煤)',
						data : s_data_3,
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});
		/*吨氨蒸汽耗(折天然气)*/
		$('#container_season_4').highcharts(
				{
					chart : {
						type : 'column'
					},
					title : {
						text : '吨氨蒸汽耗(折天然气)'
					},
					credits : {
						enabled : false
					},
					subtitle : {
						text : '最高值' + Math.max.apply(null, s_data_4) + '，最低值'
								+ Math.min.apply(null, s_data_4) + ''
					},
					xAxis : {
						categories : s_x_arr
					},
					yAxis : {
						min : Math.min.apply(null, s_data_4),
						title : {

							text : ' '
						}
					},
					tooltip : {
						formatter : function() {
							return '<b>' + this.series.name + '</b><br/>'
									+ this.x + ': ' + this.y + '（Nm3/tNH3）';
						}
					},
					plotOptions : {
						column : {
							dataLabels : {
								enabled : true
							},
							enableMouseTracking : true
						}
					},
					series : [ {
						name : '吨氨蒸汽耗(折天然气)',
						data : s_data_4,
					} ],
					plotOptions : {
						series : {
							events : {
								legendItemClick : function(e) {
									return false; // 直接 return false 即可禁用图例点击事件
								}
							},
							maxPointWidth : 100
						}
					}
				});

		/***********************季度报表饼状体**************************/
		/*月氨产量*/

		var chart = $('#container_season_r')
				.highcharts(
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false
							},
							title : {
								text : '月氨产量'
							},
							credits : {
								enabled : false
							},
							tooltip : {
								pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
							},
							plotOptions : {
								pie : {
									allowPointSelect : true,
									cursor : 'pointer',
									dataLabels : {
										enabled : true,
										format : '<b>{point.name}</b>: {point.percentage:.1f} %',
										style : {
											color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
													|| 'black'
										}
									}
								}
							},
							series : [ {
								type : 'pie',
								name : '百分比',
								data : pie_yacl
							} ],
							plotOptions : {
								series : {
									events : {
										legendItemClick : function(e) {
											return false; // 直接 return false 即可禁用图例点击事件
										}
									}
								}
							}
						});
		/*月天然气耗*/

		$('#container_season_r1')
				.highcharts(
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false
							},
							title : {
								text : '月天然气耗'
							},
							tooltip : {
								pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
							},
							plotOptions : {
								pie : {
									allowPointSelect : true,
									cursor : 'pointer',
									dataLabels : {
										enabled : true,
										format : '<b>{point.name}</b>: {point.percentage:.1f} %',
										style : {
											color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
													|| 'black'
										}
									}
								}
							},
							series : [ {
								type : 'pie',
								name : '百分比',
								data : pie_ytrqh
							} ],
							plotOptions : {
								series : {
									events : {
										legendItemClick : function(e) {
											return false; // 直接 return false 即可禁用图例点击事件
										}
									}
								}
							}
						});

		/*月蒸汽耗(折标煤)*/

		$('#container_season_r2')
				.highcharts(
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false
							},
							title : {
								text : '月蒸汽耗(折标煤)'
							},
							tooltip : {
								pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
							},
							plotOptions : {
								pie : {
									allowPointSelect : true,
									cursor : 'pointer',
									dataLabels : {
										enabled : true,
										format : '<b>{point.name}</b>: {point.percentage:.1f} %',
										style : {
											color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
													|| 'black'
										}
									}
								}
							},
							series : [ {
								type : 'pie',
								name : '百分比',
								data : pie_yzqh_zbm
							} ],
							plotOptions : {
								series : {
									events : {
										legendItemClick : function(e) {
											return false; // 直接 return false 即可禁用图例点击事件
										}
									}
								}
							}
						});

		/*月蒸汽耗(折天然气)*/

		$('#container_season_r3')
				.highcharts(
						{
							chart : {
								plotBackgroundColor : null,
								plotBorderWidth : null,
								plotShadow : false
							},
							title : {
								text : '月蒸汽耗(折天然气)'
							},
							tooltip : {
								pointFormat : '{series.name}: <b>{point.percentage:.1f}%</b>'
							},
							plotOptions : {
								pie : {
									allowPointSelect : true,
									cursor : 'pointer',
									dataLabels : {
										enabled : true,
										format : '<b>{point.name}</b>: {point.percentage:.1f} %',
										style : {
											color : (Highcharts.theme && Highcharts.theme.contrastTextColor)
													|| 'black'
										}
									}
								}
							},
							series : [ {
								type : 'pie',
								name : '百分比',
								data : pie_yzqh_ztrq
							} ],
							plotOptions : {
								series : {
									events : {
										legendItemClick : function(e) {
											return false; // 直接 return false 即可禁用图例点击事件
										}
									}
								}
							}
						});

	}

	//更新图表
	$(".fresh").click(function() {
		data();
		_w_table_rowspan("#energy_day_ban", 1);
		_w_table_rowspan("#energy_month_ban", 1);
	});

	//ajax查询日报表按班请求   
	$("#day_class_show").click(function(){

	 var begin_day_class = $("#indate_day_ban1").val();
	 var end_day_class = $("#indate_day_ban2").val();
	
	 if(begin_day_class != "" &&  end_day_class != "" ){
	 if(begin_day_class > end_day_class){
	 alert("开始时间晚于结束时间，请重新选择！！");
	 return false;
	 };
	 var url = getRootPath()+"/jf_to_show_day_data_ajax";
	 var args = {"date_begin":begin_day_class,"date_end":end_day_class,"time": new Date()};
	
	 $.post(url,args,function(data){
	
	 var data_class = $.parseJSON(data); 
	 if(data_class.length <= 0){
	 alert("该时间段暂无数据，请重新选择！！");
	 return false;
	 };
	 $("#energy_day_ban tr").not(":first").remove();
	 for(var i = 0; i < data_class.length; i++){
		 
	 var time = data_class[i].jf_data_time;//时间
	 var ybs=data_class[i].time_FIQ180;//样本数
	 var racl = data_class[i].time_FIQ162 ;  //日氨产量(t)
	 var rtrqh=data_class[i].time_FIQ203 ;   //日天然气耗(Nm3)
	 var rzqh_zbm=data_class[i].time_steam_coal;//日蒸汽耗(折标煤)(kgce)
	 var rzqh_ztrq=data_class[i].time_steam_gas;//日蒸汽耗(折天然气)(Nm3)
	 var ban = data_class[i].classNumber.toFixed(0);//早中晚班
	 var xsacl=racl * 6 / ybs;//小时氨产量(t/h)
	 var datrqh=rtrqh * 1000 / racl;//吨氨天然气耗(Nm3/3)
	 var dazqh_zbm=rzqh_zbm / racl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
	 var dazqh_ztrq=rzqh_ztrq / racl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
	 var daqh_hj=rtrqh / racl + rzqh_ztrq / racl;//吨氨气耗(合计)(Nm3/tNH3)
	 var dazhxh=daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)

	
	
	 var newdate = new Date();
	 var n_time  = renderTime(time.toString());

	
	
	 switch(ban)
	 {
	 case "1":
	 ban="早班";
	 break;
	 case "2":
	 ban="中班";
	 break;
	 case "3":
	 ban="晚班";
	 break;
	 }
	 if(racl != 0){
		 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+racl.toFixed(2)+"</td><td>"+rtrqh.toFixed(3)+"</td><td>"+rzqh_zbm.toFixed(2)+"</td><td>"+rzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
		 $("#energy_day_ban").append(newTr);
	 }else{
		 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
		
		 $("#energy_day_ban").append(newTr);
	 }
	
	 }
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });
	//ajax查询日报表按日请求   
	$(document).ajaxStart($.blockUI).ajaxStop($.unblockUI);
	 $("#day_day_show").click(function(){
	 var begin_day_class = $("#indate_day_day1").val();
	 var end_day_class = $("#indate_day_day2").val();
	
	 if(begin_day_class != "" &&  end_day_class != "" ){
	 if(begin_day_class > end_day_class){
	 alert("开始时间晚于结束时间，请重新选择！！");
	 return false;
	 };
	 var url = getRootPath()+"/jf_to_show_day_day_ajax";
	 var args = {"date_begin":begin_day_class,"date_end":end_day_class,"time": new Date()};
	 var vv = [];
	 $.post(url,args,function(data){
	
	 var data_class = $.parseJSON(data); 
	 for(var i = 0; i < data_class.length; i++){
		 vv.push(data_class[i].time_FIQ180);
	 }
	 
	 newHighchart(vv,"test_test");
	 
	 if(data_class.length <= 0){
	 alert("该时间段暂无数据，请重新选择！！");
	 return false;
	 };
	 $("#energy_day tr").not(":first").remove();
	 for(var i = 0; i < data_class.length; i++){
	
		 var time = data_class[i].jf_data_time;//时间
		 var ybs=data_class[i].time_FIQ180;//样本数
		 var racl = data_class[i].time_FIQ162 ;  //日氨产量(t)
		 var rtrqh=data_class[i].time_FIQ203 ;   //日天然气耗(Nm3)
		 var rzqh_zbm=data_class[i].time_steam_coal;//日蒸汽耗(折标煤)(kgce)
		 var rzqh_ztrq=data_class[i].time_steam_gas;//日蒸汽耗(折天然气)(Nm3)

		 var xsacl=racl * 6 / ybs;//小时氨产量(t/h)
		
		 var datrqh=rtrqh * 1000 / racl;//吨氨天然气耗(Nm3/3)
		
		 var dazqh_zbm=rzqh_zbm / racl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
		
		 var dazqh_ztrq=rzqh_ztrq / racl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
		
		 var daqh_hj=rtrqh / racl + rzqh_ztrq / racl;//吨氨气耗(合计)(Nm3/tNH3)
		
		 var dazhxh = data_class[i].hxh=daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)
	

	 var newdate = new Date();
	 var n_time  = renderTime(time.toString());
	
	
	 var newTr = "<tr><td>"+n_time+"</td><td>"+racl.toFixed(2)+"</td><td>"+rtrqh.toFixed(3)+"</td><td>"+rzqh_zbm.toFixed(2)+"</td><td>"+rzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
		
	 $("#energy_day").append(newTr);
	
	
	 }
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });

	//ajax查询月报表按日请求   
	$("#month_day_show").click(function(){
	 var begin_month_class = $("#indate_day_day1").val();
	
	 if(begin_month_class != ""){
	 var url = getRootPath()+"/jf_to_show_month_data_ajax";
	 var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
	
	 $.post(url,args,function(data){
	
	 var data_class = $.parseJSON(data); 
	 if(data_class.length <= 0){
	 alert("该时间段暂无数据，请重新选择！！");
	 return false;
	 };
	 $("#energy_month_day tr").not(":first").remove();
	 for(var i = 0; i < data_class.length; i++){
		 var time = data_class[i].jf_data_time;//时间
		 var ybs=data_class[i].time_FIQ180;//样本数
		 var racl = data_class[i].time_FIQ162 ;  //日氨产量(t)
		 var rtrqh=data_class[i].time_FIQ203 ;   //日天然气耗(Nm3)
		 var rzqh_zbm=data_class[i].time_steam_coal;//日蒸汽耗(折标煤)(kgce)
		 var rzqh_ztrq=data_class[i].time_steam_gas;//日蒸汽耗(折天然气)(Nm3)

		 var xsacl=racl * 6 / ybs;//小时氨产量(t/h)
		
		 var datrqh=rtrqh * 1000 / racl;//吨氨天然气耗(Nm3/3)
		
		 var dazqh_zbm=rzqh_zbm / racl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
		
		 var dazqh_ztrq=rzqh_ztrq / racl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
		
		 var daqh_hj=rtrqh / racl + rzqh_ztrq / racl;//吨氨气耗(合计)(Nm3/tNH3)
		
		 var dazhxh = data_class[i].hxh=daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)
		 

	 var newdate = new Date();
	 var n_time  = renderTime(time.toString());
	 //alert(data_class);
	 var newTr = "<tr><td>"+n_time+"</td><td>"+racl.toFixed(2)+"</td><td>"+rtrqh.toFixed(3)+"</td><td>"+rzqh_zbm.toFixed(2)+"</td><td>"+rzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
		
	 $("#energy_month_day").append(newTr);
	
	
	 }
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });

	//ajax查询月报表按班请求   
	$("#month_ban_show").click(function(){
	 var begin_month_class = $("#indate_day_ban1").val();
	
	 if(begin_month_class != ""){
	
	 var url = getRootPath()+"/jf_to_show_month_class_ajax";
	 var args = {"mouth_date_begin":begin_month_class,"time": new Date()};
	
	 $.post(url,args,function(data){
	
	 var data_class = $.parseJSON(data); 
	 if(data_class.length <= 0){
	 alert("该时间段暂无数据，请重新选择！！");
	 return false;
	 };
	 $("#energy_month_ban tr").not(":first").remove();
	 for(var i = 0; i < data_class.length; i++){
	
		 var time = data_class[i].jf_data_time;//时间
		 var ybs=data_class[i].time_FIQ180;//样本数
		 var racl = data_class[i].time_FIQ162 ;  //日氨产量(t)
		 var rtrqh=data_class[i].time_FIQ203 ;   //日天然气耗(Nm3)
		 var rzqh_zbm=data_class[i].time_steam_coal;//日蒸汽耗(折标煤)(kgce)
		 var rzqh_ztrq=data_class[i].time_steam_gas;//日蒸汽耗(折天然气)(Nm3)
		 var ban = data_class[i].classNumber.toFixed(0);//早中晚班
		 var xsacl=racl * 6 / ybs;//小时氨产量(t/h)
		
		 var datrqh=rtrqh * 1000 / racl;//吨氨天然气耗(Nm3/3)
		
		 var dazqh_zbm=rzqh_zbm / racl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
		
		 var dazqh_ztrq=rzqh_ztrq / racl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
		
		 var daqh_hj=rtrqh / racl + rzqh_ztrq / racl;//吨氨气耗(合计)(Nm3/tNH3)
		
		 var dazhxh = data_class[i].hxh=daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)
		 

	 var newdate = new Date();
	 var n_time  = renderTime(time.toString());
	
	 switch(ban)
	 {
	 case "1":
	 ban="早班";
	 break;
	 case "2":
	 ban="中班";
	 break;
	 case "3":
	 ban="晚班";
	 break;
	 }
	 
	if(racl!=0){
		 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+racl.toFixed(2)+"</td><td>"+rtrqh.toFixed(3)+"</td><td>"+rzqh_zbm.toFixed(2)+"</td><td>"+rzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
		 $("#energy_month_ban").append(newTr);	 
	}else{
			 var newTr = "<tr><td>"+n_time+"</td><td>"+ban+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+"--"+"</td><td>"+ybs.toFixed(0)+"</td></tr>";
				
			 $("#energy_month_ban").append(newTr);
		 }
	 
	
	
	 }
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });

	//ajax查询季度报表 
	$("#season_show").click(function(){
	 var begin_season_year = $("#indate_season_year").val();
	 var begin_season_season = $("#indate_season_season").val();
	 var hj_yacl= 0;//合计月按产量
	 var hj_ytrqh= 0;//合计月天然气耗
	 var hj_yzqh_zbm= 0;//合计月蒸气耗折标煤
	 var hj_yzqh_ztrq = 0;//合计月蒸气耗折天然气
	 var hj_xsacl= 0;//合计小时氨产量
	 var hj_datrqh= 0;//合计吨氨天然气耗
	 var hj_dazqh_zbm= 0;//合计吨氨蒸汽耗折标煤
	 var hj_dazqh_ztrq= 0;//合计吨氨蒸汽耗折天然气
	 var hj_daqh_hj= 0;//合计吨氨气耗合计
	 var hj_dazhxh= 0;//合计吨氨综合消耗
	 var hj_ybs= 0;//合计样本数
	 if(begin_season_year != ""&& begin_season_season != ""){

	 var url = getRootPath()+"/jf_do_select_Quarter_ajax";
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
	
		 var time = data_class[i].jf_data_time;//时间
		 var ybs=data_class[i].time_FIQ180;//样本数
		 var yacl = data_class[i].time_FIQ162 ;  //月氨产量(t)
		 var ytrqh=data_class[i].time_FIQ203 ;   //月天然气耗(Nm3)
		 var yzqh_zbm=data_class[i].time_steam_coal;//月蒸汽耗(折标煤)(kgce)
		 var yzqh_ztrq=data_class[i].time_steam_gas;//月蒸汽耗(折天然气)(Nm3)
		 var xsacl=yacl * 6 / ybs;//小时氨产量(t/h)
		
		 var datrqh=ytrqh * 1000 / yacl;//吨氨天然气耗(Nm3/3)
		
		 var dazqh_zbm=yzqh_zbm / yacl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
		
		 var dazqh_ztrq=yzqh_ztrq / yacl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
		
		 var daqh_hj=ytrqh / yacl + yzqh_ztrq / yacl;//吨氨气耗(合计)(Nm3/tNH3)
		
		 var dazhxh =daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)
		 var newdate = new Date();
		 var n_time  = renderTime(time.toString()).substring(0,8);
		 
		 hj_ybs += ybs;
		 hj_yacl += yacl;
		 hj_ytrqh += ytrqh;
		 hj_yzqh_zbm += yzqh_zbm;
		 hj_yzqh_ztrq += yzqh_ztrq;

	 var newTr = "<tr><td>"+n_time+"</td><td>"+yacl.toFixed(2)+"</td><td>"+ytrqh.toFixed(3)+"</td><td>"+yzqh_zbm.toFixed(2)+"</td><td>"+yzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";

	 $("#energy_season").append(newTr);
	
	
	 }
	 //合计
	 hj_xsacl = hj_yacl/hj_ybs *6;//小时氨产量
	 hj_datrqh = hj_ytrqh*1000/hj_yacl;//吨氨天然气耗消耗sum1*1000/sum
	 hj_dazqh_zbm = hj_yzqh_zbm/hj_yacl;//吨氨蒸汽耗折标煤sum2/sum
	 hj_dazqh_ztrq = hj_yzqh_ztrq/hj_yacl;//吨氨蒸汽耗折天然气sum2/sum
	 hj_daqh_hj = hj_yzqh_ztrq / hj_yacl + hj_ytrqh / hj_yacl;//吨氨气耗合计sum3/sum+sum1/sum
	 hj_dazhxh = 1.2143 * hj_daqh_hj;//吨氨综合消耗1.2143*(sum3/sum+sum1/sum)
	 //alert(hj_ybs)
	 var newTrHj = "<tr style='color:red'><td>合计</td><td>"+hj_yacl.toFixed(2)+"</td><td>"+hj_ytrqh.toFixed(3)+"</td><td>"+hj_yzqh_zbm.toFixed(2)+"</td><td>"+hj_yzqh_ztrq.toFixed(2)+"</td><td>"+hj_xsacl.toFixed(2)+"</td><td>"+hj_datrqh.toFixed(2)+"</td><td>"+hj_dazqh_zbm.toFixed(2)+"</td><td>"+hj_dazqh_ztrq.toFixed(2)+"</td><td>"+hj_daqh_hj.toFixed(2)+"</td><td>"+hj_dazhxh.toFixed(2)+"</td><td>"+hj_ybs.toFixed(0)+"</td></tr>";
	 $("#energy_season").append(newTrHj);
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });
	
	
	/******************************测试***********************/

	$(function(){
		 var url = getRootPath()+"/jf_to_show_day_day_ajax_test";
		 var args = {"time": new Date()};
		 var aa = [];
		 $.post(url,args,function(data){
			 data = $.parseJSON(data);
			 for(var i = 0; i < data.length; i++){
				 aa.push(data[i].time_FIQ180);
			 }
			newHighchart(aa,"test_test");
		});
	});

    /*highcharts统一设置值函数*/
	function newHighchart(data,id){
		 $('#'+id).highcharts({
		        title: {
		            text: 'Monthly Average Temperature',
		            x: -20 //center
		        },
		        subtitle: {
		            text: 'Source: WorldClimate.com',
		            x: -20
		        },
		        xAxis: {
		            categories: data
		        },
		        yAxis: {
		            title: {
		                text: 'Temperature (°C)'
		            },
		            plotLines: [{
		                value: 0,
		                width: 1,
		                color: '#808080'
		            }]
		        },
		        tooltip: {
		            valueSuffix: '°C'
		        },
		        legend: {
		            layout: 'vertical',
		            align: 'right',
		            verticalAlign: 'middle',
		            borderWidth: 0
		        },
		        series: [{
		            name: 'Tokyo',
		            data: data
		        }]
		    });
	 }
	
	
	
	
	
	
	
	//ajax查询年报表 
	$("#year_show").click(function(){
		var begin_year = $("#Year_data_begin").val();
		var hj_yacl= 0;//合计月按产量
		 var hj_ytrqh= 0;//合计月天然气耗
		 var hj_yzqh_zbm= 0;//合计月蒸气耗折标煤
		 var hj_yzqh_ztrq = 0;//合计月蒸气耗折天然气
		 var hj_xsacl= 0;//合计小时氨产量
		 var hj_datrqh= 0;//合计吨氨天然气耗
		 var hj_dazqh_zbm= 0;//合计吨氨蒸汽耗折标煤
		 var hj_dazqh_ztrq= 0;//合计吨氨蒸汽耗折天然气
		 var hj_daqh_hj= 0;//合计吨氨气耗合计
		 var hj_dazhxh= 0;//合计吨氨综合消耗
		 var hj_ybs= 0;//合计样本数
	 if(begin_year != ""){
	
	 var url = getRootPath()+"/jf_do_select_year_ajax";
	 var args = {"Year_data_begin":begin_year,"time": new Date()};
	
	 $.post(url,args,function(data){
	
	 var data_class = $.parseJSON(data); 
	 if(data_class.length <= 0){
	 alert("该时间段暂无数据，请重新选择！！");
	 return false;
	 };

	 $("#energy_year tr").not(":first").remove();
	 for(var i = 0; i < data_class.length; i++){
	
		 var time = data_class[i].jf_data_time;//时间
		 var ybs=data_class[i].time_FIQ180;//样本数
		 var yacl = data_class[i].time_FIQ162 ;  //月氨产量(t)
		 var ytrqh=data_class[i].time_FIQ203 ;   //月天然气耗(Nm3)
		 var yzqh_zbm=data_class[i].time_steam_coal;//月蒸汽耗(折标煤)(kgce)
		 var yzqh_ztrq=data_class[i].time_steam_gas;//月蒸汽耗(折天然气)(Nm3)
		 var xsacl=yacl * 6 / ybs;//小时氨产量(t/h)
		
		 var datrqh=ytrqh * 1000 / yacl;//吨氨天然气耗(Nm3/3)
		
		 var dazqh_zbm=yzqh_zbm / yacl;//吨氨蒸汽耗(折标煤)(kgce/tNH3)
		
		 var dazqh_ztrq=yzqh_ztrq / yacl;//吨氨蒸汽耗(折天然气)(Nm3/tNH3)
		
		 var daqh_hj=ytrqh / yacl + yzqh_ztrq / yacl;//吨氨气耗(合计)(Nm3/tNH3)
		
		 var dazhxh =daqh_hj * 1.2143;//吨氨综合消耗(kgce/tNH3)
	 var newdate = new Date();
	 var n_time  = renderTime(time.toString()).substring(0,8);
	
	 hj_ybs += ybs;
	 hj_yacl += yacl;
	 hj_ytrqh += ytrqh;
	 hj_yzqh_zbm += yzqh_zbm;
	 hj_yzqh_ztrq += yzqh_ztrq;
	
	 var newTr = "<tr><td>"+n_time+"</td><td>"+yacl.toFixed(2)+"</td><td>"+ytrqh.toFixed(3)+"</td><td>"+yzqh_zbm.toFixed(2)+"</td><td>"+yzqh_ztrq.toFixed(2)+"</td><td>"+xsacl.toFixed(2)+"</td><td>"+datrqh.toFixed(2)+"</td><td>"+dazqh_zbm.toFixed(2)+"</td><td>"+dazqh_ztrq.toFixed(2)+"</td><td>"+daqh_hj.toFixed(2)+"</td><td>"+dazhxh.toFixed(2)+"</td><td>"+ybs.toFixed(0)+"</td></tr>";

	 $("#energy_year").append(newTr);
	
	
	 }
	 //合计
	 hj_xsacl = hj_yacl/hj_ybs *6;//小时氨产量
	 hj_datrqh = hj_ytrqh*1000/hj_yacl;//吨氨天然气耗消耗sum1*1000/sum
	 hj_dazqh_zbm = hj_yzqh_zbm/hj_yacl;//吨氨蒸汽耗折标煤sum2/sum
	 hj_dazqh_ztrq = hj_yzqh_ztrq/hj_yacl;//吨氨蒸汽耗折天然气sum2/sum
	 hj_daqh_hj = hj_yzqh_ztrq / hj_yacl + hj_ytrqh / hj_yacl;//吨氨气耗合计sum3/sum+sum1/sum
	 hj_dazhxh = 1.2143 * hj_daqh_hj;//吨氨综合消耗1.2143*(sum3/sum+sum1/sum)
	 //alert(hj_ybs)
	 var newTrHj = "<tr style='color:red'><td>合计</td><td>"+hj_yacl.toFixed(2)+"</td><td>"+hj_ytrqh.toFixed(3)+"</td><td>"+hj_yzqh_zbm.toFixed(2)+"</td><td>"+hj_yzqh_ztrq.toFixed(2)+"</td><td>"+hj_xsacl.toFixed(2)+"</td><td>"+hj_datrqh.toFixed(2)+"</td><td>"+hj_dazqh_zbm.toFixed(2)+"</td><td>"+hj_dazqh_ztrq.toFixed(2)+"</td><td>"+hj_daqh_hj.toFixed(2)+"</td><td>"+hj_dazhxh.toFixed(2)+"</td><td>"+hj_ybs.toFixed(0)+"</td></tr>";
	 $("#energy_year").append(newTrHj);
	 $(".fresh").trigger("click"); 
	 });
	
	
	 }
	
	 });
	//日期转化
	function renderTime(date) {
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
		return year + "年" + month + "月" + date + "日";
	}
	//获取项目根路径
	function getRootPath() {
		//获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp  
		var curWwwPath = window.document.location.href;
		//获取主机地址之后的目录，如： uimcardprj/share/meun.jsp  
		var pathName = window.document.location.pathname;
		var pos = curWwwPath.indexOf(pathName);
		//获取主机地址，如： http://localhost:8083  
		var localhostPaht = curWwwPath.substring(0, pos);
		//获取带"/"的项目名，如：/uimcardprj  
		var projectName = pathName.substring(0,
				pathName.substr(1).indexOf('/') + 1);
		return (localhostPaht + projectName);
	}

});

/*合并行*/
_w_table_rowspan("#energy_day_ban", 1);
_w_table_rowspan("#energy_month_ban", 1);

function _w_table_rowspan(_w_table_id, _w_table_colnum) {
	_w_table_firsttd = "";
	_w_table_currenttd = "";
	_w_table_SpanNum = 0;
	_w_table_Obj = $(_w_table_id + " tr td:nth-child(" + _w_table_colnum + ")");
	_w_table_Obj.each(function(i) {
		if (i == 0) {
			_w_table_firsttd = $(this);
			_w_table_SpanNum = 1;
		} else {
			_w_table_currenttd = $(this);
			if (_w_table_firsttd.text() == _w_table_currenttd.text()) {
				_w_table_SpanNum++;
				_w_table_currenttd.hide(); //remove();
				_w_table_firsttd.attr("rowSpan", _w_table_SpanNum);
			} else {
				_w_table_firsttd = $(this);
				_w_table_SpanNum = 1;
			}
		}
	});
}














