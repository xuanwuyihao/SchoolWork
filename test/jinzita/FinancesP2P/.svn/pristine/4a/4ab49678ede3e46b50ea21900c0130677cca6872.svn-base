<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 借款管理</title>
<base href="<%=path%>/">
<!-- 引入页面Logo小图标 -->
<link rel="icon" href="img/Logo.png" type="image/x-icon">
<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/zzsc.css" />

<!-- 分页js和css -->
<link rel="stylesheet" href="css/layui.css" />
<script src="js/layui.js" charset="utf-8"></script>
<script src="js/laypage.js" charset="utf-8"></script>
<script src="js/mobile.js" charset="utf-8"></script>

<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
<link href="css/icons.css" rel="stylesheet" type="text/css" />

<link rel="stylesheet" type="text/css" href="css/jcDate.css" media="all" />

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

<link href="css/responsive.css" rel="stylesheet" type="text/css" />
<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
<script type="text/javascript" src="js/example.js"></script>
<link type="text/css" href="css/jiekuan.css" rel="stylesheet" />

</head>
<body>

<div class="nav-wrap">
	<ul class="group" id="example-one" >
	<!-- <li><div style="width: 120px"></div></li> -->
		<li class="current_page_item">
		<a href="#home" target="_blank" class="btn" data-toggle="tab">借款管理</a></li>
		<li class="current_page_item">
		<a href="#ios" target="_blank" class="btn" data-toggle="tab">还款明细</a></li>
		<li class="current_page_item">
		<a href="#cs" target="_blank" class="btn" data-toggle="tab">借入人审核</a></li>
		<li class="current_page_item">
		<a href="#sh" target="_blank" class="btn" data-toggle="tab">审核记录</a></li>
	</ul>
</div>
	
<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="home">
		<div class="jkgl">
		<center>
			<div class="ljjk">
				<div style="width: 95%">
				 <ul>
				 	 <li style="display: inline;float: left;">
					 	 <div style="height: 40px;border-bottom: 1px solid #e0e0e0;" align="left">
					 	 	<font>累计借款:</font>
					 	 	<font style="font-size: 20px;" color="red">
					 	 	￥0.00
					 	 	</font>
					 	 </div>
				 	 <div>
				 	 	<ul>
				 	 		<li style="display: inline;float: left;">
				 				<div class="echarts" id="main" style="width: 120px;height: 120px;margin-top: 10px;"></div>
				 			</li>
				 			<li style="display: inline;float: right;margin: 30px 20px;">
				 				<div style="height: 30px;">
				 					<ul>
				 					<li style="display: inline;float: left;margin-top: 5px;margin-left: 30px;">
				 					<div class="xfk2"></div>
				 					</li>
				 					<li style="display: inline;float: right;margin-left: 10px;">
				 					<font color="#c3c3c3">投标中借款:</font>
				 					<font color="gray" style="margin-left: 10px;">￥0.00</font>
				 					</li>
				 					</ul>
				 				</div>
				 				<div>
				 					<ul>
				 					<li style="display: inline;float: left;margin-top: 5px;margin-left: 30px">
				 					<div class="xfk3"></div>
				 					</li>
				 					<li style="display: inline;float: right;margin-left: 10px;">
				 					<font color="#c3c3c3">已完成借款:</font>
				 					<font color="gray" style="margin-left: 10px;">￥0.00</font>
				 					</li>
				 					</ul>
				 				</div>
				 			</li>
				 		</ul>
				 	</div>
				 	</li>
				 	<li style="display: inline;float: right;">
				 		<div>
				 		 <div style="height: 40px;border-bottom: 1px solid #e0e0e0;" align="left">
					 	 	<font>累计利息:</font>
					 	 	<font style="font-size: 20px;" color="red">
					 	 	￥0.00
					 	 	</font>
					 	 </div>
				 	 	<ul>
				 	 		<li style="display: inline;float: left;">
				 				<div class="echarts" id="main2" style="width: 120px;height: 120px;margin-top: 10px;"></div>
				 			</li>
				 			<li style="display: inline;float: right;margin: 30px 20px;">
				 				<div style="margin-left: 30px;height: 30px;">
				 					<ul>
				 					<li style="display: inline;float: left;margin-top: 5px;">
				 					<div class="xfk4"></div>
				 					</li>
				 					<li style="display: inline;float: right;margin-left: 10px;">
				 					<font color="#c3c3c3">待付利息:</font>
				 					<font color="gray" style="margin-left: 10px;">￥0.00</font>
				 					</li>
				 					</ul>
				 				</div>
				 				<div style="height: 30px;">
				 					<ul>
				 					<li style="display: inline;float: left;margin-top: 5px;margin-left: 30px;">
				 					<div class="xfk5"></div>
				 					</li>
				 					<li style="display: inline;float: right;margin-left: 10px;">
				 					<font color="#c3c3c3">已付利息:</font>
				 					<font color="gray" style="margin-left: 10px;">￥0.00</font>
				 					</li>
				 					</ul>
				 				</div>
				 			</li>
				 		</ul>
				 	</div>
				 	</li>
				 </ul>
				 </div>
			</div>
			<!-- 下 -->
			<div class="ss">
			 <div class="nTab">
					 <div class="TabTitle">
					  <ul id="myTab">
					  <li class="active" onclick="nTabs(this,0);">进行中的借款</li>
					  <li class="normal" onclick="nTabs(this,1);">已完成的借款</li>
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
										<td style="height: 40px;width:auto ;color: gray;font-size: 13px;">
										借款标题
										</td>
										<td style="color: gray;font-size: 13px;">
										类型
										</td>
										<td style="color: gray;font-size: 13px;">
										借款金额
										</td>
										<td style="color: gray;font-size: 13px;">
										已借入	
										</td>
										<td style="color: gray;font-size: 13px;">
										年利率
										</td>
										<td style="color: gray;font-size: 13px;">
										借款期限			
										</td>
										<td style="color: gray;font-size: 13px;">
										发布时间			
										</td>
										<td style="color: gray;font-size: 13px;">
										状态		
										</td>
										</tr>
										<tr class="tr3">
											<td colspan="8">
												您还没有借款，没有数据......
											</td>
										</tr> 
									</table>
									<br>
								</div>
							</div>
						</div>
						<!--...  -->
						<div id="myTab_Content1" class="none">
							<div id="myTabContents" class="tab-content">
								<div style="margin-top: 20px;">
									<table style="width: 100%" border="0">
										<tr class="t1">
										<td style="height: 40px;width:auto ;color: gray;font-size: 13px;">
										借款标题
										</td>
										<td style="color: gray;font-size: 13px;">
										类型
										</td>
										<td style="color: gray;font-size: 13px;">
										借款金额
										</td>
										<td style="color: gray;font-size: 13px;">
										年化利率
										</td>
										<td style="color: gray;font-size: 13px;">
										借款期限
										</td>
										<td style="color: gray;font-size: 13px;">
										发布日期		
										</td>
										<td style="color: gray;font-size: 13px;">
										状态		
										</td>
										<tr class="tr3">
											<td colspan="8">
												您还没有借款，没有数据......
											</td>
										</tr> 
									</table>
									<br>
								</div>
							</div>
						<!--/?  -->
					</div>
				</div>
				<!--//////  -->
			</div>
			</div>
		</center>
		</div>
		</div>
	<div class="tab-pane fade" id="ios">
		<center>
			<div class="mx" style="width: 95%;">
				<div class="center">
				<ul>
					<li style="display: inline;float: left;width: 400px">
					<div class="ze">
						<div align="left" style="color: gray">
						待收本息总额：</div>
						<div align="left" style="margin-top: 5px;color: gray">
							<font style="font-size: 20px;color: red">
							￥0.00
							</font>
							<font style="color:black;">
							/ 0笔 
							</font>
						</div>
						<div align="left" style="margin-top: 5px;color: gray">
							本金￥0.00 + 利息￥0.00</div>
					</div>
					</li>
					<li style="display: inline;float: left;margin: 35px 20px;">
						<div align="left"style="color: gray" >
							近期回款日：
						</div>
						<div style="margin-top: 10px;"align="left">
							您还没有还款记录
						</div>
					</li>
				</ul>
				</div>
				<div class="buttom">
					<div>
						<table>
							<tr class="tr1">
							<td>还款日期</td>
							<td>扣款时间</td>
							<td>回款金额（本金+利息）</td>
							<td>还款状态</td>
							</tr>
							
							<tr class="tr3">
								<td colspan="4">
									您还没有进行借款，没有查询到相应数据......
								</td>
							</tr>
						</table>
						<br>
					</div>
				</div>
			</div>
			</center>
	</div>
		
		<!-- 借入审核 -->
		<div class="tab-pane fade" id="cs" style="width: 848px">
			<center>
				<div style="width: 90%">
					<div align="left">
						<img src="img/jrsh.png" width="20px" height="20px"
							style="margin-top: -5px;"> <font size="4px"
							style="margin-left: 5px;" face="黑体"> 通过提交您的详细资料，金字塔将进行初步审核
						</font>
					</div>
					</div>
		<br>
		<!-- 资料填写 -->
				<div class="jie" style="width: 90%">
					<div class="jiekuan">
						<br>
						<div class="gr">个人资料</div>
					</div>
					<br>
					<!-- 资料填写 -->
					<div class="table" style="width: 95%">
						<form action="user/exanmineApply">
						<input type="hidden" name=userId value="${userInfo.userId }" />
						<input type="hidden" name=username value="${user.phone }" />
							<table class="zl">
								<tr class="c1">
									<td height="50px;">
										<c:if test="${userInfo.nativeplace=='' || userInfo.nativeplace==null }">
											<ul class="szd">
											<li class="dq">所在地区:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" value="北京" name="nativeplace" <c:if test="${userInfo.nativeplace=='北京' }">checked</c:if> >北京 
												<input type="radio" style="margin-left: 5px;" value="上海" name="nativeplace" <c:if test="${userInfo.nativeplace=='上海' }">checked</c:if> >上海
												<input type="radio" style="margin-left: 5px;" value="天津" name="nativeplace" <c:if test="${userInfo.nativeplace=='天津' }">checked</c:if> >天津
												<input type="radio" style="margin-left: 5px;" value="重庆" name="nativeplace" <c:if test="${userInfo.nativeplace=='重庆' }">checked</c:if> >重庆
												<input type="radio" style="margin-left: 5px;" value="深圳" name="nativeplace" <c:if test="${userInfo.nativeplace=='深圳' }">checked</c:if> >深圳
												<input type="radio" style="margin-left: 5px;" value="广东" name="nativeplace" <c:if test="${userInfo.nativeplace=='广东' }">checked</c:if> >广东
											</li>
											<li class="dq" style="margin-top: 5px;">
												<font color="orange" size="2" face="微软雅黑"> 提示：其他地区暂未开通贷款业务</font>
											</li>
										</ul>
										</c:if>
										<c:if test="${userInfo.nativeplace!='' && userInfo.nativeplace!=null }">	 
											<input type="hidden" name="nativeplace" value="${userInfo.nativeplace }" />
											<ul class="szd">
												<li class="dq">所在地区:</li>
												<li class="dq"><font size="3" color="gray">${userInfo.nativeplace }</font></li>
											</ul>
										</c:if>
									</td>
								</tr>
								<tr class="c2">
									<td height="50px;">
									<c:if test="${userInfo.realname=='' || userInfo.realname==null }">
										<ul class="szd">
											<li class="dq" style="margin-top: 5px;">真实姓名:</li>
											<li class="dq"><input type="text" class="sr" name="realname" ></li>
										</ul>
									</c:if>
									<c:if test="${userInfo.realname!='' && userInfo.realname!=null }">	 
										<input type="hidden" name="realname" value="${userInfo.realname }" />
										<ul class="szd">
											<li class="dq">真实姓名:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.realname }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c1">
									<td height="50px;">
									<c:if test="${userInfo.idcard=='' || userInfo.idcard==null }">
										<ul class="szd">
											<li class="dq" style="margin-top: 5px;">证件号码:</li>
											<li class="dq"><input type="text" class="sr" name="idcard" ></li>
										</ul>
									</c:if>
									<c:if test="${userInfo.idcard!='' && userInfo.idcard!=null }">	 
										<input type="hidden" name="idcard" value="${userInfo.idcard }" />
										<ul class="szd">
											<li class="dq">证件号码:</li>
											<li class="dq"><font size="3" color="gray">****${fn:substring(userInfo.idcard, 4, 7)}*********</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c2">
									<td height="50px;">
									<c:if test="${userInfo.sex=='' || userInfo.sex==null }">
										<ul class="szd" style="margin-left: 60px;">
											<li class="dq">性别:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" value="男" name="sex" <c:if test="${userInfo.sex=='男' }">checked</c:if>>男 
												<input type="radio" style="margin-left: 5px;" value="女" name="sex" <c:if test="${userInfo.sex=='女' }">checked</c:if>>女
											</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.sex!='' && userInfo.sex!=null }">	 
										<input type="hidden" name="sex" value="${userInfo.sex }" />
										<ul class="szd">
											<li class="dq">证件号码:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.sex }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c1">
									<td height="50px;">
									<c:if test="${userInfo.marriage=='' || userInfo.marriage==null }">
										<ul class="szd">
											<li class="dq">婚姻状况:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" name="marriage" value="未婚" <c:if test="${userInfo.marriage=='未婚' }">checked</c:if>>未婚 
												<input type="radio" style="margin-left: 5px;" name="marriage" value="已婚" <c:if test="${userInfo.marriage=='已婚' }">checked</c:if>>已婚
											</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.marriage!='' && userInfo.marriage!=null }">	 
										<input type="hidden" name="marriage" value="${userInfo.marriage }" />
										<ul class="szd">
											<li class="dq">婚姻状况:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.marriage }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c2">
									<td height="50px;">
									<c:if test="${userInfo.children=='' || userInfo.children==null }">
										<ul class="szd" style="margin-left: 15px;">
											<li class="dq">是否有子女:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" name="children" value="有" <c:if test="${userInfo.children=='有' }">checked</c:if>>有
												<input type="radio" style="margin-left: 5px;" name="children" value="无" <c:if test="${userInfo.children=='无' }">checked</c:if>>无
											</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.children!='' && userInfo.children!=null }">	 
										<input type="hidden" name="children" value="${userInfo.children }" />
										<ul class="szd">
											<li class="dq">是否有子女:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.children }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c1">
									<td height="50px;">
									<c:if test="${userInfo.education=='' || userInfo.education==null }">
										<ul class="szd">
											<li class="dq">最高学历:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" name="education" value="高中以下" <c:if test="${userInfo.education=='高中以下' }">checked</c:if>>高中以下 
												<input type="radio" style="margin-left: 5px;" name="education" value="大专或本科 " <c:if test="${userInfo.education=='大专或本科' }">checked</c:if>>大专或本科 
												<input type="radio" style="margin-left: 5px;" name="education" value="硕士或硕士以上" <c:if test="${userInfo.education=='硕士或硕士以上' }">checked</c:if>>硕士或硕士以上</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.education!='' && userInfo.education!=null }">	 
										<input type="hidden" name="education" value="${userInfo.education }" />
										<ul class="szd">
											<li class="dq">最高学历:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.education }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c2">
									<td height="50px;">
										<ul class="szd">
											<li class="dq" style="margin-top: 5px;">贷款金额:</li>
											<li class="dq"><input type="text" class="sr" name="applylimit"></li>
											<li class="dq" style="margin-top: 5px;"><font color="orange" size="2" face="微软雅黑"> 提示：输入贷款金额</font></li>
										</ul>
									</td>
								</tr>
								<tr class="c1">
									<td height="50px;">
									<c:if test="${userInfo.whethercar=='' || userInfo.whethercar==null }">
										<ul class="szd">
											<li class="dq">是否有车:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" name="whethercar" value="无" <c:if test="${userInfo.whethercar=='无' }">checked</c:if>>无 
												<input type="radio" style="margin-left: 5px;" name="whethercar" value="有" <c:if test="${userInfo.whethercar=='有' }">checked</c:if>>有
											</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.whethercar!='' && userInfo.whethercar!=null }">	 
										<input type="hidden" name="whethercar" value="${userInfo.whethercar }" />
										<ul class="szd">
											<li class="dq">最高学历:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.whethercar }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr class="c2">
									<td height="50px;">
									<c:if test="${userInfo.whetherhouse=='' || userInfo.whetherhouse==null }">
										<ul class="szd">
											<li class="dq">是否有房:</li>
											<li class="dq">
												<input type="radio" style="margin-left: 5px;" name="whetherhouse" value="无" <c:if test="${userInfo.whetherhouse=='无' }">checked</c:if>>无 
												<input type="radio" style="margin-left: 5px;" name="whetherhouse" value="有" <c:if test="${userInfo.whetherhouse=='有' }">checked</c:if>>有
											</li>
										</ul>
									</c:if>
									<c:if test="${userInfo.whetherhouse!='' && userInfo.whetherhouse!=null }">	 
										<input type="hidden" name="whetherhouse" value="${userInfo.whetherhouse }" />
										<ul class="szd">
											<li class="dq">最高学历:</li>
											<li class="dq"><font size="3" color="gray">${userInfo.whetherhouse }</font></li>
										</ul>
									</c:if>
									</td>
								</tr>
								<tr>
									<td height="50px;"><input type="submit" value="保存"
										class="baocun" style="width: 60px;"></td>
								</tr>
							</table>
						</form>
					</div>
					</div>
			</center>
			</div>
					<!--  //////////-->
					<div class="tab-pane fade" id="sh" style="width:848px">
					<center>
						<div style="width: 90%">
							<div align="left">
							<img  src="img/jrsh.png" width="20px" height="20px" style="margin-top: -5px;">
							<font size="4px" style="margin-left: 5px;" face="黑体">
							通过提交您的详细资料，金字塔将进行初步审核
							</font>
							</div>
							<div class="sod" style="margin-top: 20px;">
								<table style="width: 90%;margin-top: 30px;">
								<thead>
									<tr class="sa">
									<td height="33px;">
											序号
										</td>
									<td height="33px;">
										申请额度
										</td>
										<td height="33px;">
										申请时间
										</td>
										<td height="33px;">
										审核额度
										</td>
										<td height="33px;">
										审核通过时间
										</td>
										<td height="33px;">
										审核状态
										</td>
										<td height="33px;">
										审核结果
										</td>
									</tr>
									</thead>
									<!--、、、、、、、、、、、、、、、、  -->
									<tbody>
									<c:set var="i" value="1"></c:set>
									<c:forEach items="${list}" var="list" >
									<tr class="sa2"  id="${i }">
									<td align="center">
											${i }
										</td>
									<td height="33px;">
										${list.applylimit }
										</td>
										 <td height="33px;">
										 <fmt:formatDate value="${list.applytime }" pattern="yyyy-MM-dd HH:mm:ss"/>
										 </td>
										<td height="33px;">
										${list.examinelimit }
										</td>
										<td height="33px;">
										<fmt:formatDate value="${list.examinetime }" pattern="yyyy-MM-dd HH:mm:ss"/>
										</td>
										<td height="33px;">
										${list.status }
										</td>
										<td height="33px;">
										${list.result }
										</td>
									</tr>
									<c:set var="i" value="${i+1 }"></c:set>
									</c:forEach>
									<input type="hidden" id="zy" value="${zy}" />
									<input type="hidden" id="dq" value="${dq}" />
									<input type="hidden" id="ea" value="${ea}" />
									</tbody>
									<!--/////////////////////////  -->
								</table>
									<div id="demo5"></div>	
								
								
							</div>
						</div>
					</center>
			</div>
				
		<!--end  -->
	</div>
	<script type="text/javascript" src="js/jquery.min1.js"></script>
<script type="text/javascript" src="js/jQuery-jcDate.js"></script>
		<script>
		
		var zrs=$("#ea").val();
		
		for(var i=9;i<=zrs;i++){
			
			$("#"+i).hide();
		}
	
	
		
		
					layui.use(['laypage', 'layer'], function(){
					  var laypage = layui.laypage
					  ,layer = layui.layer;
					 
					  //开启HASH
					  laypage.render({
					    elem: 'demo5'
					    ,count:$("#ea").val()
					     ,first: 1
					     ,limit: 8
					     ,last:$("#zy").val()
					    ,curr:1
					    ,jump:function(obj,first){
					    
		                
		                	if(!first){
		                		
		                		var curr=obj.curr;
		                		
		                		
		                		var fir=(curr-1)*8+1;//开头
		                   	    var las=fir+7;//结尾
		                   	    
		                   	    for(var i=1;i<=zrs;i++){//先所有隐藏
		                   	    	
		                   	    	$("#"+i).hide();	
		                         	
		                         }
		                   	    
		                   	    if(zrs<=las){//如果最后一个小于算出来的
		                   	    	
		                   	    	las=zrs;
		                   	    }
		                   	
		                   	    for(var i=fir;i<=las;i++){//显示要显示的
		                       	
		                       	   
		                       	    $("#"+i).show();
		                       	
		                         } 
		                			
		                	}
		                		
		                	}
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
 </script>
<script src="js/echarts.min.js"></script>
<script type="text/javascript">
	/* 第一个饼图 */
	 var myChart = echarts.init(document.getElementById('main'));
	/*  var f2 = ${sum[0].hasallmoney};
	 var f3 = ${sum[0].hasgold}; */
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
			                {value:0},
			                {value:0},
			                {value:100}
			            ],
			           
			        }
			    ]
			};
	 				myChart.setOption(option);
	</script>
	<script type="text/javascript">
	/* 第二个饼图 */
	 var myChart = echarts.init(document.getElementById('main2'));
	 /* var f5 = ${sum[0].answerfine }-${sum[0].hasmoney };
	 var f6 = ${sum[0].hasmoney}; */
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
			            color:['#80c1f7','#8a88d0'],
			            animation: false,
			            radius : '100%',
			            data:[
			                {value:100},
			                {value:0},
			            ],
			           
			        }
			    ]
			};
	 				myChart.setOption(option);
	</script>
</body>
</html>