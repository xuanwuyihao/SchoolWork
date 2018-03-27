<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=path%>/">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 投资排行榜</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<link rel="stylesheet" href="css/normalize.css" />
	</head>
	<body background="img/bg3.png">
<!-- 		<div style="margin-top: 14px;margin-left: 9px;"> -->
<!-- 			<a href="front/index" title="金字塔 - 综合金融服务平台"> -->
<!-- 				<img src="img/Logo2.png" /> -->
<!-- 			</a> -->
<!-- 		</div> -->
		<div style="height: 1009px;">
		<div><a href="front/index" title="金字塔 - 综合金融服务平台" style="position:absolute;top:0px;left:0px;width:420px;height:100px"></a></div>
		<div class="rongyu-table">
			<ul class="rongyu-ul" >
				<li class="rongyu-li" >
					<p class="rongyu-p1">排名</p>
					<p class="rongyu-p2">用户名</p>
					<p class="rongyu-p3">投资金额（元）</p>
				</li>
				<c:if test="${count==0 }">
				<li class="rongyu-li">
					<p style="float: left;width: 100%;font-family: 微软雅黑;font-size: 18px;">还没有用户进行投资，暂无数据......</p>
				</li>
				</c:if>
				<c:if test="${count>0 }">
					<c:if test="${list[0]!=null&&list[0]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1"><img src="img/huangguan1.png" style="position: absolute;width: 60px;height: 60px;margin-left: -28px;"/>&nbsp;</p>
						<p class="rongyu-p2">${fn:substring(list[0].username, 0, 3)}****${fn:substring(list[0].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[0].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[1]!=null&&list[1]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1"><img src="img/huangguan2.png" style="position: absolute;width: 60px;height: 60px;margin-left: -28px;"/>&nbsp;</p>
						<p class="rongyu-p2">${fn:substring(list[1].username, 0, 3)}****${fn:substring(list[1].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[1].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[2]!=null&&list[2]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1"><img src="img/huangguan3.png" style="position: absolute;width: 60px;height: 60px;margin-left: -28px;"/>&nbsp;</p>
						<p class="rongyu-p2">${fn:substring(list[2].username, 0, 3)}****${fn:substring(list[2].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[2].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[3]!=null&&list[3]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">4</p>
						<p class="rongyu-p2">${fn:substring(list[3].username, 0, 3)}****${fn:substring(list[3].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[3].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[4]!=null&&list[4]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">5</p>
						<p class="rongyu-p2">${fn:substring(list[4].username, 0, 3)}****${fn:substring(list[4].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[4].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[5]!=null&&list[5]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">6</p>
						<p class="rongyu-p2">${fn:substring(list[5].username, 0, 3)}****${fn:substring(list[5].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[5].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[6]!=null&&list[6]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">7</p>
						<p class="rongyu-p2">${fn:substring(list[6].username, 0, 3)}****${fn:substring(list[6].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[6].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[7]!=null&&list[7]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">8</p>
						<p class="rongyu-p2">${fn:substring(list[7].username, 0, 3)}****${fn:substring(list[7].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[7].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[8]!=null&&list[8]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">9</p>
						<p class="rongyu-p2">${fn:substring(list[8].username, 0, 3)}****${fn:substring(list[8].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[8].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
					<c:if test="${list[9]!=null&&list[9]!='' }">
					<li class="rongyu-li">
						<p class="rongyu-p1">10</p>
						<p class="rongyu-p2">${fn:substring(list[9].username, 0, 3)}****${fn:substring(list[9].username, 7, 11)}</p>
						<p class="rongyu-p3"><fmt:formatNumber value="${list[9].investmoney }" pattern="###,###.00"/></p>
					</li>
					</c:if>
				</c:if>
			</ul>
		</div>
		</div>
	</body>
</html>