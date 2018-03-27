<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <title>金字塔 - 综合金融服务后台管理系统</title>
		<!-- 引入页面Logo小图标 -->
		<link rel="icon" href="img/Logo.png" type="image/x-icon">
		<base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
        <link rel="stylesheet" href="./lib/bootstrap/css/bootstrap.css" media="all">
        <link rel="stylesheet" href="./lib/bootstrap/js/bootstrap.min.js" media="all">
    	<style type="text/css">
			a:focus{text-decoration: none}
			a:focus{outline:none;}
			legend { display: block; width:100px; border-bottom:0px; font-family: "Microsoft YaHei","Helvetica Neue";}
			legend a{ color:#666;} legend a:hover{ text-decoration:none;}
			.layui-table{ font-family: "Microsoft YaHei","Helvetica Neue";}
		</style>
    </head>
    <body>
    
        <div class="x-body">
            <blockquote class="layui-elem-quote">
                欢迎使用金字塔后台管理系统！<span class="f-14">v1.0</span> 
            </blockquote>
<div class="row">
            <div class="col-xs-6 col-sm-4 col-md-3">
                <section class="panel">
                    <div class="symbol bgcolor-blue"> <i class="fa fa-address-card"></i>
                    </div>
                    <div class="value tab-menu" bind="1">
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="机构总数"><i class="iconfont " data-icon=""></i>
                            <h1>${Elist[0] }</h1>
                        </a>

                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="机构总数"> <i class="iconfont " data-icon=""></i><span>所有用户</span></a>

                    </div>
                </section>
            </div>
            <div class="col-xs-6 col-sm-4 col-md-3">
                <section class="panel">
                    <div class="symbol bgcolor-commred"> <i class="fa fa-handshake-o"></i>
                    </div>
                    <div class="value tab-menu" bind="1">
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="今日新增"> <i class="iconfont " data-icon=""></i>
                            <h1>${Elist[1] }</h1>
                        </a>

                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="今日新增"> <i class="iconfont " data-icon=""></i><span>借款用户</span></a>

                    </div>
                </section>
            </div>

            <div class="col-xs-6 col-sm-4 col-md-3">
                <section class="panel">
                    <div class="symbol bgcolor-dark-green"> <i class="fa fa-bar-chart"></i>
                    </div>
                    <div class="value tab-menu" bind="1">
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="订单总数"> <i class="iconfont " data-icon=""></i>
                            <h1>${Elist[2] }</h1>
                        </a>
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="订单总数"> <i class="iconfont " data-icon=""></i><span>投资用户</span></a>
                    </div>
                </section>
            </div>

            <div class="col-xs-6 col-sm-4 col-md-3">
                <section class="panel">
                    <div class="symbol bgcolor-yellow-green"> <i class="fa fa-cubes"></i>
                    </div>
                    <div class="value tab-menu" bind="1">
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="今日新增"> <i class="iconfont " data-icon=""></i>
                            <h1><c:if test="${Elist[3]!=0 }">
                            	<fmt:formatNumber value='${Elist[3] }' pattern='#,###.00'/>
                            	</c:if>
                            	<c:if test="${Elist[3]==0 }">
                            	0
                            	</c:if>
                            </h1>
                        </a>
                        <a href="javascript:;" data-url="user-info.jsp" data-parent="true" data-title="今日新增"> <i class="iconfont " data-icon=""></i><span>盈利金额</span></a>
                    </div>
                </section>
            </div>

        </div>
            
            <fieldset class="layui-elem-field layui-field-title site-title">
              <legend><a name="default">信息统计</a></legend>
            </fieldset>
             
        <!--相关统计-->
        <div class="row">
        <div class="col-sm-6">
         <section class="panel">
                    <div class="panel-heading">区域统计</div>
                    <div class="panel-body">
                        <div class="echarts" id="area" style="height:300px; height:350px"></div>
                    </div>
                </section>
        </div>
        <div class="col-sm-6">
         <section class="panel">
                    <div class="panel-heading">标的类型统计</div>
                    <div class="panel-body">
                        <div class="echarts" id="main" style="height:300px; height:350px"></div>
                    </div>
                </section>
        </div>
        <div class="col-sm-6">
         <section class="panel">
                    <div class="panel-heading">年度统计</div>
                    <div class="panel-body">
                        <div class="echarts" id="years" style="height:300px; height:350px"></div>
                    </div>
                </section>
        </div>
        <div class="col-sm-6">
         <section class="panel">
                    <div class="panel-heading">公司进账详情统计</div>
                    <div class="panel-body">
                        <div class="echarts" id="product" style="height:300px; height:350px"></div>
                    </div>
                </section>
        </div>
        </div>
    
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
<!--         <script src="./js/index.js"></script> -->
        <script src="./js/echarts.min.js"></script>
<!--         <script src="./js/echart.js"></script> -->

<script type="text/javascript">

function option2() {
	var re=[];
	var myStringArray = ${list4};
	var myStringArray2 = ${list3};
	for (var i in myStringArray) { 
	  re[i]=myStringArray[i];
	}  
return re;
}

function option3() {
	var rr=[];
	var myStringArray = ${list4};
	var myStringArray2 = ${list3};// array uses [] not {} 
	

	for (var i in myStringArray) { 
		 rr.push({                    
             value: myStringArray2[i],
             name: myStringArray[i]
         });
	}  
return rr;
}

function TXoption(){
	var rr=[];
	var myStringArray = ${Tlist};
	for (var i in myStringArray) { 
		  rr[i]=myStringArray[i];
		}  
	return rr;
}
function XXoption2(){
	var rr=[];
	var myStringArray = ${Xlist};
	for (var i in myStringArray) { 
		  rr[i]=myStringArray[i];
		}  
	return rr;
}

function YZoption() {
	var rr=[];
	var myStringArray = ${Ulist2};
	var myStringArray2 =['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'];// array uses [] not {} 
	

	for (var i in myStringArray) { 
		 rr.push({                    
             value: myStringArray[i],
             name: myStringArray2[i]
         });
	}  
return rr;
}

function BToption() {
	var rr=[];
	var myStringArray = ${Blist2};
	var myStringArray2 =['用户借款利息', '标的融资管理', '用户提现管理费'];// array uses [] not {} 
	

	for (var i in myStringArray) { 
		 rr.push({                    
             value: myStringArray[i],
             name: myStringArray2[i]
         });
	}  
return rr;
}
</script>
        <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        var TX=[];
        var XX2=[];
        TX=TXoption();
        XX2=XXoption2();
   
        // 指定图表的配置项和数据
        var option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['信用贷','抵押贷']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: ['六月','七月','八月','九月','十月','十一月','十二月']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'信用贷',
                    type:'line',
                    stack: '总量',
                    data:XX2
//                     	[120, 132, 101, 134, 90, 230, 210]
                },
                {
                    name:'抵押贷',
                    type:'line',
                    stack: '总量',
                    data:TX
//                     	[220, 182, 191, 234, 290, 330, 310]
                }

            ]
        };


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
    <script type="text/javascript">
        // 指定图表的配置项和数据
       var myChart = echarts.init(document.getElementById('area'));

       var  tt=[];
       var  tt2=[];
       tt=option2();
       tt2=option3();
       
        // 指定图表的配置项和数据
    var option = {
        title: {
            text: '用户地区分布',
            subtext: '',
            x: 'center'
        },
        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: tt
        },
        series: [{
            name: '地区会员数量',
            type: 'pie',
            radius: '55%',
            center: ['50%', '60%'],
            data: tt2,
//             	[
//                 { value: 63355, name: '赣州市' },
//                 { value: 4310, name: '上饶2市' },
//                 { value: 2310, name: '南昌市' },
//                 { value: 3310, name: '吉安市' },
//                 { value: 9310, name: '九江市' }
//             ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }]
    };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('years'));

        var YZ=YZoption();
       
        // 指定图表的配置项和数据
        var option = {
            title: {
            text: '年度借款统计',
            subtext: '',
            x: 'center'
        },
        color: ['#3398DB'],
        tooltip: {
            trigger: 'axis',
            axisPointer: { // 坐标轴指示器，坐标轴触发有效
                type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
            }
        },toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis: [{
            type: 'category',
            data: ['一月','二月','三月','四月','五月','六月','七月','八月','九月','十月','十一月','十二月'],
            axisTick: {
                alignWithLabel: true
            }
        }],
        yAxis: [{
            type: 'value'
        }],
        series: [{
            name: '活跃度',
            type: 'bar',
            barWidth: '60%',
            data: YZ
//             	[{ value: 63355, name: '一月' },
//                 { value: 4310, name: '二月' },
//                 { value: 2310, name: '三月' },
//                 { value: 3310, name: '四月' },
//                 { value: 9310, name: '五月' },
//                 { value: 63355, name: '六月' },
//                 { value: 4310, name: '七月' },
//                 { value: 2310, name: '八月' },
//                 { value: 3310, name: '九月' },
//                 { value: 9310, name: '十月' },
//                 { value: 3310, name: '十一月' },
//                 { value: 9310, name: '十二月' }]
        }]
    };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('product'));

        var BT=BToption();
        // 指定图表的配置项和数据
        var option = {
             title: {
                text: '公司进账详情',
                subtext: '',
                x: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['用户借款利息', '标的融资管理', '用户提现管理费']
            },
            series: [{
                name: '访问来源',
                type: 'pie',
                radius: '55%',
                center: ['50%', '60%'],
                data: BT,
//                 	[
//                     { value: 1335, name: '车贷' },
//                     { value: 310, name: '房贷' }
//                 ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }]
        };


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
            
        </div>
        <div class="layui-footer footer footer-demo">
            <div class="layui-main">
                <p>
                    <a href="/">
                        Copyright ©2017 17sucai.com All Rights Reserved.
                    </a>
                </p>
                
            </div>
        </div>
        
    </body>
</html>