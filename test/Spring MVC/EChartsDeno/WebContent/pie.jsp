<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>饼图</title>
<script src="js/echarts.min.js"></script>

</head>
<body>

<!-- 为echarts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width:600px;height:400px;"></div>
<script type="text/javascript">
//基于准备好的dom，初始化echarts实例
var myChart=echarts.init(document.getElementById('main'));

//指定图标的配置和数据

		option = {
				title:{
					text:'Echarts第二个例子',
					subtext:'逸浩制作',
					x:'center'
					
				},
				tooltip:{
					trigger:'item',
					formatter:"{a} <br/>{b} : {c} ({d}%)"
				},
				legend:{
					orient:'vertical',
					left:'left',
					data:['视频广告','联盟广告','邮件营销','直接访问','搜索引擎']
				},
				
			    series : [
			        {
			            name: '访问来源',
			            type: 'pie',
			            radius: '55%',
			            center:['50%','60%'],
			            data:[
			                {value:235, name:'视频广告'},
			                {value:274, name:'联盟广告'},
			                {value:310, name:'邮件营销'},
			                {value:335, name:'直接访问'},
			                {value:400, name:'搜索引擎'}
			            ],
			            itemStyle:{
			            	emphasis:{
			            		shadowBlue:10,
			            		shadowOffsetX:0,
			            		shadowColor:'rgba(0,0,0,0.5)'
			            	}
			            }
			        }
			    ]
			};
		


myChart.setOption(option);

</script>

</body>
</html>