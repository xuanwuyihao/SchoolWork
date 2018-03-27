<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 财务报表管理</title>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="css/image_body.css" />
<link type="text/css" href="css/finance/style.css" />

<!-- <script type="text/javascript" src="../script/finance/modernizr.js"></script> -->
<script type="text/javascript" src="script/echarts.min.js"></script>

<style type="text/css">
html, body {
	margin: 0 auto;
	padding: 0 auto;
	font-family: "Times New Roman", arial, Verdana;
	color: #817a53;
	background: #fffffe;
}
</style>

<script type="text/javascript">
$(function() {
	$.ajax({
		async : true,
		cache : true,
		url : 'GetBaoBiao.action',
		type : 'post',
		data : {
			'id' : 25,
		},
		dataType : 'json',
		success : function(data) {
/////////////////////////////////////////////////////////////////////////////////////////
			
			
			var arr = new Array();
			$.each(data.stpList, function(index, content) {
				arr[index] = content.value;
			});
			// 基于准备好的dom，初始化echarts实例
			var myChart = echarts.init(document.getElementById('main'));

			var myDergi = echarts.init(document.getElementById('ddd'));
			
			var zfpay = echarts.init(document.getElementById('zfpay'));
			// 指定图表的配置项和数据
			var dss = {
				title : {
					text : '缴费报表'
				},
				tooltip : {},
				legend : {
					data : [ '增长' ]
				},
				xAxis : {
					data : [ "成考缴费", "艺考缴费", "会计缴费", "国家大学缴费", "远程教育缴费" ]
				},
				yAxis : {},
				series : [ {
					name : '数值',
					type : 'bar',
					data : data.bb
				} ]
			};
			
			var pay = {
					title : {
						text : '支付统计'
					},
					tooltip : {},
					legend : {
						data : [ '增长' ]
					},
					xAxis : {
						data : [ "支付宝", "微信", "银行转账", "现金" ]
					},
					yAxis : {},
					series : [ {
						name : '数值',
						type : 'bar',
						data : data.zfpay
					} ]
				};

			var option = {
				title : {
					text : '报名报表',
					subtext : '纯属虚构',
					x : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					left : 'right',
					data : [ '成人高考', '艺考', '远程教育', '会计', '国家大学' ]
				},
				series : [ {
					name : '访问来源',
					type : 'pie',
					radius : '55%',
					center : [ '50%', '60%' ],
					data : [{ "name" : "成人高考",
						"value" : arr[0] },{ "name" : "艺考",
							"value" :  2 },{ "name" : "远程教育",
							"value" :  4 },{ "name" : "会计",
							"value" : 1 },{ "name" : "国家大学",
							"value" :  1 }] ,
					itemStyle : {
						emphasis : {
							shadowBlur : 10,
							shadowOffsetX : 0,
							shadowColor : 'rgba(0, 0, 0, 0.5)'
						}
					}
				} ]
			};

			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
			zfpay.setOption(pay);
			myDergi.setOption(dss);
			
			
			//////////////////////////////////////////////////////////////////////////
			

		},
		error : function(XMLHttpRequest, textStatus) {
			alert("系统繁忙,请稍候再试!");
		}
	});

});


</script>

</head>
<body>

	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
	<div style="width: 100%; height: 100%;">
		<div id="main"
		style="width: 500px; height: 400px; float: right; position: initial; right: 10%; top: 110px;">
		</div>
		
		<div id="ddd"
		style="width: 600px; height: 400px; float: left; position: initial; left: 2%; top: 110px;">
		</div>
		
		<div id="zfpay"
		style="width: 400px; height: 400px; float: left; position: initial; left: 5%; top: 110px;">
		</div>
	</div>
	<script type="text/javascript">
		
	
		
	
	</script>

</body>
</html>