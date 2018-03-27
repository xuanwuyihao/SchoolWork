<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script src="js/jquery-1.8.2.min.js"></script>
<script src="js/common.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  <table width="80%" align="center">
  <tr></tr>
  <tr>
  <td width="10%"></td>
  <td width="5%"><img src="images/onshop.jpg"></td>
  <td>
  <div style="width:20px;margin:1px auto;valign=middle">
<div class="search_box">
<span class="left l_bg"></span>
<span class="right r_bg"></span>
    <div class="search">
    <form name=search_form onSubmit="return bottomForm(this);" target="_blank" method=post>
        <div id="pt1" class="select">
        <a id="s0">全站搜索</a>
        <div style="display:none;" id="pt2" class="part"> 
            <p>
            <a id="s1">最新优惠</a>
            <a id="s2">超值大礼</a>
            <a id="s3">团购特价</a>
            <a id="s4">销量优先</a>
            <a id="s5">评价优先</a>
            <a id="s6">精美礼品</a>
            <a id="s7">限时抢购</a>
            <a id="s8">厂家促销</a>
            <a id="s9">疯狂甩卖</a>
            <a id="s10">国外进口</a>
            <a id="s11">本页推荐</a>
            <a id="s12">限时发货</a>
            </p>
        </div>
        </div> 
    <input id="catid" name="catid" type="hidden" value="7">
    <input id="q" class="enter" name="infos" onFocus="if(this.value=='站长素材…'){this.value='';}else{this.select();}this.style.color='black';"  value="站长素材…">
    <input class="sb" name="Input" type="submit" value="">
    </form>
    </div>
</div>
</div>
</td>
<td width="60%"></td>
  </tr>
  </table>
   
  </body>
</html>