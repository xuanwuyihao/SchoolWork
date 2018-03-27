<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<base href="<%=path%>/">
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" />
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<link rel="stylesheet" href="css/style.css" type="text/css" />
	<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
	<script type="text/javascript" src="js/zzsc.js"></script>


	<link href="css/icons.css" rel="stylesheet" type="text/css" />

	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

	<link href="css/responsive.css" rel="stylesheet" type="text/css" />
	<link type="text/css" href="css/lrtk.css" rel="stylesheet" />
	<link type="text/css" href="css/accounts.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.color-rgba-patch.js"></script>
	<script type="text/javascript" src="js/example.js"></script>
</head>
<body>
	<div class="nav-wrap" >
	<ul class="group" id="example-one">
		<li class="current_page_item"><a href="#xx" target="_blank" class="btn" data-toggle="tab">账户总览</a></li>
	</ul>
</div>
	<div>
		
	</div>	
<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="xx">
	<center>
	<div class="s">
		<div class="s1">
			<ul>
				<li class="a1">
					<ul>
						<li class="a2">
						<img src="${user.face}" width="120px" height="120px;" class="img-circle">
						</li>
						<li class="a2" style="margin-left: 20px;margin-top: 20px;">
						<div style="height: 10px;">
						<font size="4px;" color="#000033" face="Consolas">
						${user.phone}
						</font>
						</div>
						<br>
						<div style="height: 10px;">
						<B style="color: gray">
						安 全 等 级：中
						</B>
						</div>
						<br>
						<img alt="" src="images/ca23a4c4094e80c005cf2cddd361118a.png" width="32px" height="32px">
						<img alt="" src="images/aaea3518c2dca30399e69a9547dec97f.png" width="32px" height="32px" style="margin-left: 30px">
						</li>
					</ul>
				</li>
				<li class="a1" style="margin-left: 80px;width:215px">
						<div style="height: 10px;margin-top:10px" align="left">
								<font size="6px;" color="#ff0000;" face="Consolas">
								<span >${userMoney.needmoney}</span>
						
						<font size="3px" color="#ff0000;" face="Consolas" style="margin-left: -16px">
						元
						</font>
						</font>
						</div>
						<div style="height: 10px;margin-top: 25px;" align="left">
						<font size="2px;" color=" #ff0000" face="Consolas" >
						<i class="color2"></i>可用余额
						</font>
						</div>
						<div style="margin-top: 20px;margin-left:-40px">
						<a href="${pageContext.request.contextPath }/finance/bankcard/openRecharge.action">
							<button style="background-color: red;color: white;">
							充值
							</button>
						</a>
						<a href="${pageContext.request.contextPath }/finance/bankcard/openWithdrawals.action">
							<button style="background-color: rgba(0,0,0,0) ;color: red;margin-left: 10px;">
							提现
							</button>
						</a>
						</div>
				</li>
				<li class="a1" style="width:220px">
					<div style="margin-top:10px;">
						<font size="6px;" color="#ff0000;" face="Consolas">
						${userMoney.allmoney}
						<font size="3px" color="#ff0000;" face="Consolas" style="margin-left: -16px">
						元
						</font>
						</font>
					</div>
					<div style="margin-left:60px" align="left">
						<font size="2px;" color=" #292929" face="Consolas" >
						总资产
						</font>
					</div>
					<div align="center" style="margin-top: 10px;">
						<font size="2px;" color="#c3c3c3" face="Consolas" >
						理财收益天天算
						<br>
						 §(*￣▽￣*)§
						</font>
					</div>
				</li>
			</ul>
		</div>
		<div class="s2">
				<ul>
				<li class="a3" style="margin-left: 40px;">
				<div>
					<font size="3px;" color="gray">
					<i class="color0"></i>
					收益总额:${userMoney.gathermoney}
					</font>
				</div>
				</li>
				<li class="a3">
				<div>
					<font size="3px;" color="gray">
					<i class="color1"></i>
					投资总额:${userMoney.investmoney}
					</font>
				</div>
				</li>
				<li class="a3">
					<font size="3px;" color="gray">
					<i class="color2"></i>
					冻结金额:${userMoney.frozenmoney}
					</font>
				</li>
				<li class="a3">
					<font size="3px;" color="gray">
					<i class="color3"></i>
					代收总额:${userMoney.stillmoney}
					</font>
				</li>
				</ul>
		</div>
	</div>
	<!-- ................下半部分.................. -->
		<div class="ss">
			<div style="width: 96%;" align="left">
				<div class="r" align="center">
				个人信息
				<div class="hr"></div>
				</div>
				<hr style="margin-top: -1px;">
			</div>
			<div class="ts">
			 	<ul>
			 	<li style="display: inline;float: left;margin: 10px 10px;">
				<img  src="img/dj.png" width="20px" height="20px">
				</li>
				<li style="display: inline;float: left;margin-top: 10px;">
				温馨提示：亲爱的用户，为了节约您的宝贵时间，请认真准确填写以下信息，方便您在金字塔借款和礼品的收取！
				</li>
				</ul>
			</div>
				<div class="q">
					<form action="user/saveUserInfo">
						<input type="hidden" name=userId value="${userInfo.userId }" />
						<input type="hidden" name=oyh1 value="${userInfo.oyh1 }" />
						<div style="height: 40px;width: 96%;font-size: 16px;color: gray">
							<ul>
							<li style="display: inline;float: left;margin-left:3px">
							<c:if test="${userInfo.realname=='' || userInfo.realname==null }">
								真实姓名:<input type="text" class="k1" name="realname"/>
							</c:if>
							<c:if test="${userInfo.realname!='' && userInfo.realname!=null }">
								<input type="hidden" name="realname" value="${userInfo.realname }" />	
								真实姓名：<font size="3" color="gray">${userInfo.realname }</font>
							</c:if>
							</li>
							<li style="display: inline;">
								<c:if test="${userInfo.nativeplace=='' || userInfo.nativeplace==null }">
									所在地区:
									<select class="k2" name="nativeplace">
									<option value="">请选择</option>
									<option value="北京">北京</option>
									<option value="上海">上海</option>
									<option value="天津">天津</option>
									<option value="重庆">重庆</option>
									<option value="深圳">深圳</option>
									<option value="广东">广东</option>
									</select>
								</c:if>
								<c:if test="${userInfo.nativeplace!='' && userInfo.nativeplace!=null }">	 
									<input type="hidden" name="nativeplace" value="${userInfo.nativeplace }" />
									所在地区：<font size="3" color="gray">${userInfo.nativeplace }</font>
								</c:if>
							</li>
							</ul>
						</div>
						<!-- ！！！！！！！！！！！！！！！！！！！ -->
						<div style="height: 40px;width: 96%;font-size: 16px;color: gray;margin-top: 20px;">
							<ul>
							<li style="display: inline;float: left;margin-left:32px">
								<c:if test="${userInfo.sex=='' || userInfo.sex==null }">
									性别:
									<select class="k2" name="sex">
									<option value="">请选择</option>
									<option value="男">男</option>
									<option value="女">女</option>
									</select>
								</c:if>
								<c:if test="${userInfo.sex!='' && userInfo.sex!=null }">	 
									<input type="hidden" name="sex" value="${userInfo.sex }" />
									性别：<font size="3" color="gray">${userInfo.sex }</font>
								</c:if>
							</li>
							<li style="display: inline;">
								<c:if test="${userInfo.marriage=='' || userInfo.marriage==null }">
									婚姻状况:
									<select class="k2" name="marriage">
									<option value="">请选择</option>
									<option value="未婚">未婚</option>
									<option value="已婚">已婚</option>
									</select>
								</c:if>
								<c:if test="${userInfo.marriage!='' && userInfo.marriage!=null }">
									<input type="hidden" name="marriage" value="${userInfo.marriage }" />
									婚姻状况：<font size="3" color="gray">${userInfo.marriage }</font> 
								</c:if>
							</li>
							</ul>
						</div>
						<!-- !!!!!!!!!!!!!!!!!!!!!!!! -->
						<div style="height: 40px;width: 96%;font-size: 16px;color: gray;margin-top: 20px;">
							<ul>
							<li style="display: inline;float: left;">
								<c:if test="${userInfo.education=='' || userInfo.education==null }">
									最高学历:
									<select class="k2" name="education">
									<option value="">请选择</option>
									<option value="高中以下">高中以下</option>
									<option value="大专或本科">大专或本科</option>
									<option value="硕士或硕士以上">硕士或硕士以上</option>
									</select>
								</c:if>
								<c:if test="${userInfo.education!='' && userInfo.education!=null }">	 
									<input type="hidden" name="education" value="${userInfo.education }" />
									最高学历：<font size="3" color="gray">${userInfo.education }</font>
								</c:if>
							</li>
							<li style="display: inline;">
								<c:if test="${userInfo.whethercar=='' || userInfo.whethercar==null }">
									是否有车:
									<select class="k2" name="whethercar">
									<option value="">请选择</option>
									<option value="有">有</option>
									<option value="无">没有</option>
								</select>
								</c:if>
								<c:if test="${userInfo.whethercar!='' && userInfo.whethercar!=null }">	 
									<input type="hidden" name="whethercar" value="${userInfo.whethercar }" />
									是否有车：<font size="3" color="gray">${userInfo.whethercar }</font>
								</c:if>
							</li>
							
							</ul>
						</div>
						<!--！！！！！！！！！！！！！！！！  -->
						<div style="height: 40px;width: 96%;font-size: 16px;color: gray;margin-top: 20px;">
							<ul>
							<li style="display: inline;">
								<c:if test="${userInfo.whetherhouse=='' || userInfo.whetherhouse==null }">
									是否有房:
									<select class="k2" name="whetherhouse">
									<option value="">请选择</option>
									<option value="有">有</option>
									<option value="无">没有</option>
									</select>
								</c:if>
								<c:if test="${userInfo.whetherhouse!='' && userInfo.whetherhouse!=null }">	 
									<input type="hidden" name="whetherhouse" value="${userInfo.whetherhouse }" />
									是否有房：<font size="3" color="gray">${userInfo.whetherhouse }</font>
								</c:if>
							</li>
							<li style="display: inline;float: left;">
								<c:if test="${userInfo.children=='' || userInfo.children==null }">
									是否有子女:
									<select class="k2" name="children">
									<option value="">请选择</option>
									<option value="有">有</option>
									<option value="无">无</option>
									</select>
								</c:if>
								<c:if test="${userInfo.children!='' && userInfo.children!=null }">	 
									<input type="hidden" name="children" value="${userInfo.children }" />
									是否有子女：<font size="3" color="gray">${userInfo.children }</font>
								</c:if>
							</li>
							</ul>
						</div>
						<!-- !!!!!!!!!!!!!!!!!! -->
						<div style="height: 40px;width: 96%;font-size: 16px;margin-top: 20px;">
							<input type="submit" onclick="but();" value="保存" class="button" style="width: 100px;"/>
						</div> 
					</form>
				</div>
		</div>
	</center>
	</div>
	</div>
	
	<script>
		function but(){
		
			 parent.location.reload();
		}
	</script>
	
</body>
</html>