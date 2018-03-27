<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 投资管理</title>	
	<base href="<%=path%>/">	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
		<script type="text/javascript" src="js/zzsc.js"></script>

		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
		<script type="text/javascript" src="js/example.js"></script>
		<link type="text/css" href="css/touzi.css" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" href="css/jcDate.css" media="all" />
		<link rel="stylesheet" href="css/normalize2.css" />
	
	<style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>
<body>
<div class="nav-wrap" >
	<ul class="group" id="example-one">
	<!-- <li><div style="width: 120px"></div></li> -->
		<li class="current_page_item">
		<a href="#home" target="_blank" class="btn" data-toggle="tab">投资管理</a></li>
		<li class="current_page_item">
		<a href="#ios" target="_blank" class="btn" data-toggle="tab">收款明细</a></li>
	</ul>
</div>
	
<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="home">
			<div class="tzgl">
			<center>
				<div class="leiji">
					<ul >
					<li class="d" style="width: 400px">
					<div style="width: 90%;margin-top: 20px;" align="left">
					<p>累计投资:
						<font size="5"class="z" style="margin-left: 10px;" color="orange">
							￥</font>
						<font size="5" class="z" id="f1" color="orange" style="margin-left: -5px;">
							<fmt:formatNumber value="${sum[0].answergold }" pattern="#,###.00" />
						</font>
					</p>
					</div>
					<div style="width: 90%;margin-top: -10px;">
						<hr style="border-top: 1px solid #e0e0e0;height: 1px">
					</div>
					<div style="width: 90%;" align="left">
						<ul>
							<li style="display: inline;float: left;width: 40%">
								<div class="echarts" id="main" style="width: 120px;height: 120px;margin-top: 10px;"></div>
							</li>
							<li style="display: inline;float: right;width: 60%">
								<div style="height: 10px">
									<ul>
										<li style="display: inline;float: left;margin-top: 6px;">
											<div class="xfk1"></div>
										</li>
										<li style="display: inline;float: left;">
											<font color="gray" class="c">回款中资金:</font>
											<font class="c">￥</font>
											<font class="c" id="f2" style="margin-left: -5px;">
												
											</font>
										</li>
									</ul>
								</div>
								<br>
								<div style="height: 10px">
									<ul>
										<li style="display: inline;float: left;margin-top: 6px;">
											<div class="xfk2"></div>
										</li>
										<li style="display: inline;float: left;">
											<font color="gray" class="c">已完成投资:</font>
											<font class="c">￥</font>
											<font class="c" id="f3" style="margin-left: -5px;">
												${sum[0].hasgold }
											</font>
										</li>
									</ul>
								</div>
							</li>
						</ul>
					</div>
					</li>
					<!-- 2.////////////////////////// -->
					<li class="d" style="width: 400px;">
					<div >
						<div style="width: 90%;margin-top: 20px;" align="left">
						<p>累计收益:
							<font size="5"class="z" style="margin-left: 10px;" color="orange">
								￥</font>
<!-- 							<font size="5"class="z" id="f4" color="orange"> -->
<%-- 								<fmt:formatNumber value="${sum[0].answergold }" pattern="#,###.00" /> --%>
<!-- 							</font> -->
								<font size="5" class="z" id="f4" style="margin-left: -5px;" color="orange">
								
								</font>
						</p>
						</div>
						<div style="width: 90%;margin-top: -10px;">
							<hr style="border-top: 1px solid #e0e0e0;height: 1px">
						</div >
						<div style="width: 90%" align="left">
						<ul>
							<li style="width: 40%;display: inline;float: left;">
							<div class="echarts" id="main2" style="width: 120px;height: 120px;margin-top: 10px;"></div>
							</li>
							<li style="width: 60%;display: inline;float: right;">
								<div style="height: 10px;">
									<ul>
										<li style="display: inline;float: left;margin-top: 6px;">
											<div class="xfk3"></div>
										</li>
										<li style="display: inline;float: left;">
											<font color="gray" class="c">待收利息:</font>
											<font class="c">￥</font>
											<font class="c" id="f5" style="margin-left: -5px;">
												
											</font>
										</li>
									</ul>
								</div>
								<br>
								<div style="height: 10px;">
									<ul>
										<li style="display: inline;float: left;margin-top: 6px;">
											<div class="xfk4"></div>
										</li>
										<li style="display: inline;float: left;">
											<font color="gray" class="c">已赚利息:</font>
											<font class="c">￥</font>
											<font class="c" id="f6" style="margin-left: -5px;">
												${sum[0].hasmoney }
											</font>
										</li>
									</ul>
								</div>
							</li>
						</ul>
						</div>
					</div>
					</li>
					</ul>
				</div>
			</center>
			<!-- 下半部分 -->
			<center>
					<div class="xbn">	
					<!-- 开 -->
					 <div class="nTab">
					 <div class="TabTitle">
					  <ul id="myTab">
					  <li class="active" onclick="nTabs(this,0);">进行中的投资</li>
					  <li class="normal" onclick="nTabs(this,1);">已完成的投资</li>
					  </ul>
					  <br>
					  <hr style="margin-top: 17px">
					 </div>
					 <div class="TabContent" align="left" style="margin-top: -20px;">
					 <div id="myTab_Content0">
							<div id="myTabContents" class="tab-content">
								<div style="margin-top: 20px;">
									<table style="width: 100%" border="0">
										<tr class="t1">
										<td style="height: 40px;color: gray;font-size: 13px;">
										投资日期
										</td>
										<td style="color: gray;font-size: 13px;">
										借款标号
										</td>
										<td style="color: gray;font-size: 13px;">
										投资金额
										</td>
										<td style="color: gray;font-size: 13px;">
										利率
										</td>
										<td style="color: gray;font-size: 13px;">
										借款期限	
										</td>
										<td style="color: gray;font-size: 13px;">
										回款期数	
										</td>
										<td style="color: gray;font-size: 13px;">
										状态
										</td>
										</tr>
										<c:forEach items="${userlist}" var="list">
											<!-- 2 -->
											<tr class="t2">
											<td style="height: 40px;color: gray;font-size: 13px;">
											<fmt:formatDate value="${list.stilldtate }" pattern="yyyy-MM-dd HH:mm:ss" />
											</td>
											<td style="color: gray;font-size: 13px;">
											${list.billcode }
											</td>
											<td style="color: gray;font-size: 13px;">
											${list.answergold }
											</td>
											<td style="color: gray;font-size: 13px;">
											${list.monthrate }%
											</td>
											<td style="color: gray;font-size: 13px;">
											${list.lendtime }个月	
											</td>
											<td style="color: gray;font-size: 13px;">
											${list.hasstage }/${list.stage }	
											</td>
											<td style="color: gray;font-size: 13px;">
											还款中
											</td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</div>
							<!-- 。。。。。。。。。。。。。。。。。。。。。。。。。。。 -->
					  </div>
					  <!--结束  -->
					  <div id="myTab_Content1" class="none">
					  <div style="margin-top: 20px;">
							<table style="width: 100%">
								<tr class="t1">
									<td style="height: 40px;color: gray;font-size: 13px;">
									投资日期
									</td>
									<td style="color: gray;font-size: 13px;">
									借款标号
									</td>
									<td style="color: gray;font-size: 13px;">
									投资金额
									</td>
									<td style="color: gray;font-size: 13px;">
									利率
									</td>
									<td style="color: gray;font-size: 13px;">
									借款期限	
									</td>
									<td style="color: gray;font-size: 13px;">
									回款期数	
									</td>
									<td style="color: gray;font-size: 13px;">
									状态
									</td>
								</tr>
								<c:forEach items="${userlist2}" var="list2">
									<!-- 2 -->
									<tr class="t2">
										<td style="height: 40px;color: gray;font-size: 13px;">
										<fmt:formatDate value="${list2.stilldtate }" pattern="yyyy-MM-dd HH:mm:ss" />
										</td>
										<td style="color: gray;font-size: 13px;">
										${list2.billcode }
										</td>
										<td style="color: gray;font-size: 13px;">
										${list2.answergold }
										</td>
										<td style="color: gray;font-size: 13px;">
										${list2.monthrate }%
										</td>
										<td style="color: gray;font-size: 13px;">
										${list2.lendtime }个月	
										</td>
										<td style="color: gray;font-size: 13px;">
										${list2.hasstage }/${list2.stage }	
										</td>
										<td style="color: gray;font-size: 13px;">
										已还完
										</td>
									</tr>
								</c:forEach>
							</table>
					  </div>
					 </div>
					 </div>
					 <!--  结束-->		
					</div>
					</div>	
			</center>
			</div>
	</div>
	<div class="tab-pane fade" id="ios">
	<center>
	<div class="mx" style="width: 95%;">
<!-- 		<div class="top"> -->
<!-- 			<ul> -->
<!-- 				<li class="mx1" style="display: inline;float: left;"> -->
<!-- 				<div style="margin-top: 10px;"> -->
<!-- 					<ul > -->
<!-- 						<li style="display:inline;float:left;"> -->
<%-- 							<input type="radio" name="radio" checked="checked" data-labelauty="未来一月<br>￥0.00"> --%>
<!-- 							</li> -->
<!-- 						<li style="display:inline;float:left;margin-left:5px;"> -->
<%-- 							<input type="radio" name="radio" data-labelauty="未来三月<br>￥0.00"> --%>
<!-- 							</li> -->
<!-- 						<li style="display:inline;float:left;margin-left:5px;"> -->
<%-- 							<input type="radio" name="radio" data-labelauty="未来半年<br>￥0.00"> --%>
<!-- 							</li> -->
<!-- 						<li style="display:inline;float:left;margin-left:5px;"> -->
<%-- 							<input type="radio" name="radio" data-labelauty="全部<br>￥0.00"> --%>
<!-- 							</li> -->
<!-- 					</ul> -->
<!-- 					</div> -->
<!-- 				</li> -->
<!-- 				<li class="mx1" style="display: inline;float: right;"> -->
<!-- 				<div style="color: gray;margin-top: 7px;" align="left"> -->
<!-- 				自定义查询: -->
<!-- 				</div> -->
<!-- 				<div style="margin-top: 5px;"> -->
<!-- 				  <input class="jcDate" style="width:100px;height:25px;line-height:20px;padding:4px;border: 1px solid gray;outline: none;" /> -->
<!-- 				  至 -->
<!-- 				  <input class="jcDate" style="width:100px;height:25px;line-height:20px;padding:4px;border: 1px solid gray;outline: none;" /> -->
<!-- 				  <button style="width: 50px;height: 25px" class="ck">查看</button> -->
<!-- 				</div> -->
<!-- 				</li>				 -->
<!-- 			</ul> -->
<!-- 		</div> -->
		<div class="center">
		<ul>
			<li style="display: inline;float: left;width: 400px">
			<div class="ze">
				<div align="left" style="color: gray">
				待收本息总额：</div>
				<div align="left" style="margin-top: 5px;color: gray">
					<font style="font-size: 20px;color: red">
					￥${sum[0].hasallmoney }
					</font>
					<font style="font-size: 20px;color:black">
					/
					</font>
					<font style="color:black;" id="stage">
					 
					</font>
					<font style="font-size: 20px;color:black">
					笔
					</font>
				</div>
				<div align="left" style="margin-top: 5px;color: gray">
					本金￥<font id="f11"></font> + 利息￥<font id="f12"></font></div>
			</div>
			</li>
			<li style="display: inline;float: left;margin: 35px 20px;">
				<div align="left"style="color: gray" >
					最近回款日期：
				</div>
				<div style="margin-top: 10px;"align="left">
					<fmt:formatDate value="${sum[0].stilldtate }" pattern="yyyy-MM-dd HH:mm:ss" />
				</div>
			</li>
		</ul>
		</div>
		<div class="buttom">
			<div>
				<table>
					<tr class="tr1">
					<td>回款日期</td>
					<td>回款金额（本金+利息+奖金）</td>
					<td>回款笔数</td>
					<td>回款状态</td>
					</tr>
					<c:forEach items="${userlist3}" var="list">
						<tr class="t2">
						<td style="height: 40px;color: gray;font-size: 13px;">
						<fmt:formatDate value="${list.stilldtate }" pattern="yyyy-MM-dd HH:mm:ss" />
						</td>
						<td style="color: gray;font-size: 13px;">
						${list.hasgold }+${list.hasmoney }+${list.recommendmoney }	
						</td>
						<td style="color: gray;font-size: 13px;">
						${list.hasstage }
						</td>
						<td style="color: gray;font-size: 13px;">
							<c:if test="${list.hasstage ==list.stage }">已还完</c:if>
							<c:if test="${list.hasstage !=list.stage }">还款中</c:if>
						</td>
						</tr>
					</c:forEach>
				</table>
				<br>
			</div>
		</div>
	</div>
	</center>
	</div>
	</div>

	
	<script src="./js/echarts.min.js"></script>
	<script type="text/javascript">
	/* 第一个饼图 */
	 var myChart = echarts.init(document.getElementById('main'));
	 var f=${sum[0].answerfine }-${sum[0].hasmoney };
	 var f2 = ${sum[0].answergold }-${sum[0].hasgold };
	 var f3 = ${sum[0].hasgold};
	 option = {

			    series : [
			        {
			            name: '访问来源',
			            type: 'pie',
			            label:{
			            	normal:{
			            	show:false ,
			            	position : 'outside'
			            	},
			            	},
			            color:['#70fe94','#ffcc00','#c7e9f8'],
			            animation: false,
			            radius : '100%',
			            data:[
			                {value:f2},
			                {value:f3}
			            ],
			           
			        }
			    ]
			};
	 				myChart.setOption(option);
	</script>
	<script type="text/javascript">
	/* 第二个饼图 */
	 var myChart = echarts.init(document.getElementById('main2'));
	 var f5 = ${sum[0].answerfine }-${sum[0].hasmoney };
	 var f6 = ${sum[0].hasmoney};
	 option = {

			    series : [
			        {
			            name: '访问来源',
			            type: 'pie',
			            label:{
			            	normal:{
			            	show:false ,
			            	position : 'outside'
			            	},
			            	},
			            color:['#80c1f7','#8a88d0','#c7e9f8'],
			            animation: false,
			            radius : '100%',
			            data:[
			                {value:f5},
			                {value:f6}
			            ],
			           
			        }
			    ]
			};
	 				myChart.setOption(option);
	</script>
	<!-- tab切换 -->
	<script>
		$(function(){
			$("#hear li").click(function(){
				$(this).css({
					borderBottom: "2px solid orange",
					height:"43px"
				}).siblings().css({
					borderBottom: "none",
					height:"43px"
				});
			});					
				
			$("#hear li").click(function(){
				$(this).addClass("action").siblings().removeClass("action");
				var index = $(this).index();
				$("#contentop li").eq(index).css("display","block").siblings().css("display","none");
			});
		});
</script>
<script type="text/javascript">
 function nTabs(thisObj, Num) {
  if (thisObj.className == "active") return;
  var tabObj = thisObj.parentNode.id;//赋值指定节点的父节点的id名字
  var tabList = document.getElementById(tabObj).getElementsByTagName("li");
  for (i = 0; i < tabList.length; i++) {//点击之后，其他tab变成灰色，内容隐藏，只有点击的tab和内容有属性
	  if (i == Num) {
		   thisObj.className = "active";
		   document.getElementById(tabObj + "_Content" + i).style.display = "block";
	  } else {
		   tabList[i].className = "normal";
		   document.getElementById(tabObj + "_Content" + i).style.display = "none";
	  }
  }
 }
 var m=${sum[0].answergold }-${sum[0].hasgold };
	$("#f2").text(m+".00");
	$("#f11").text(m+".00");
 var x=${sum[0].hasmoney }+${sum[0].recommendmoney };
 	$("#f4").text(x+".00");
 var a=${sum[0].answerfine }-${sum[0].hasmoney };
	$("#f5").text(a+".00");
	$("#f12").text(a+".00");
 var stage=${sum[0].stage }-${sum[0].hasstage };
    $("#stage").text(stage);
//  var x=${sum[0].hasmoney }+${sum[0].recommendmoney };
//     $("#f4").text(x+".00");
 </script>
 <script type="text/javascript" src="js/jquery.min1.js"></script>
<script type="text/javascript" src="js/jQuery-jcDate.js"></script>
 <script type="text/javascript">
$(function (){
	$("input.jcDate").jcDate({					       
		IcoClass : "jcDateIco",
		Event : "click",
		Speed : 100,
		Left : 0,
		Top : 28,
		format : "-",
		Timeout : 100
	});
});

$(document).ready(function(){
	$("#aa").css("background-color","orange");
	$("#aa").css("border-radius","4px");
	$("#aa").css("color","white");
	  $("button.m").click(function(){
		$("button.m").css("background","white");
		$("button.m").css("color","black");
		$(this).css("background-color","orange");
		$(this).css("border-radius","4px");
		$(this).css("color","white");
	}); 
 /* 	$("#aa").click(function(){
		$(this).css("background-color","orange");
		$(this).css("border-radius","4px");
		$(this).css("color","white");
	})
	
	$("#bb").click(function(){
		$(this).css("background-color","orange");
		$(this).css("border-radius","4px");
		$(this).css("color","white");
		
	}) */
})
</script>
<script src="js/jquery-labelauty.js"></script>
		<script>
			$(function(){
				$(':input').labelauty();
			});
		</script>
</body>
</html>