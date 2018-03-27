<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 关于我们</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<base href="<%=path%>/">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=kCFjWnw2IQPhHNAGDGsQapr0CmepkvWY"></script>
	<style type="text/css">
	td{
	font-size: 10px;
	}
	#allmap {width: 800px;height: 400px;overflow: hidden;margin-left:20px;font-family:"微软雅黑";}
	</style>
</head>
<body>
		<div class="nav-wrap" >
			<ul class="group" id="example-one">
			<!-- <li><div style="width: 120px"></div></li> -->
				<li class="current_page_item">
				<a href="front/lianxi" target="_blank" class="btn" data-toggle="tab">联系我们</a></li>
			</ul>
		</div>
		<!-- 
			标题
		 -->
		 <h3 style="margin-left:20px">金字塔总部</h3>
		<!-- 
			地图
		 -->
		<div id="allmap" style="margin-top:30px"></div>
		
		
		
		<!-- 联系 -->
			<div style="margin-top:30px;margin-left:30px;">
					<div style="float:left;width:100%">
					<div style="float:left;">
						<p style="font-size:18px;margin-left:5px">联系方式</p>
						<p><img alt="" src="images/phone.png" width="80px" height="80px"></p>
					</div>
						<div style="float:left; margin-top:30px;font-size:13px; margin-left:10px;">
							<p>公司地址：江西省赣州市章贡区沙石镇赣州技师学院</p>
							<p>公司电话： 0797-2190888</p>
							<p>邮政编码：341000</p>
					</div>
			</div>
			<div style="float:left;margin-top:30px;">
				<p style="font-size:18px;margin-left:5px">客服服务</p>
				<p><img alt="" src="images/service.png" width="80px" height="80px"></p>
			</div>
				<div style="float:left; margin-top:70px;font-size:13px; margin-left:10px;">
							<p>客服电话： 400-606-2079</p>
							<p>客服邮件：fuying.zhang@pujinziben.com</p>
							<p>服务时间： 周一至周六08:30-17:30</p>
				</div>
			</div>
<!-- 		<div style="margin-left:30px;"> -->
<!-- 			<div style="float:left;width:100%;margin-top:30px;"> -->
<!-- 				<p style="font-size:20px;margin-left:10px;">商务合作</p> -->
<!-- 				<p><img alt="" src="images/process.png" width="100px" height="100px"></p> -->
<!-- 			</div> -->
<!-- 			<div style="float:right;width:100%;margin-top:30px;"> -->
<!-- 				<p style="font-size:20px;margin-left:10px;">关注我们</p> -->
<!-- 				<p><img alt="" src="images/bussiness-man.png" width="100px" height="100px"></p> -->
<!-- 			</div> -->
<!-- 		</div> -->
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");    // 创建Map实例
	map.centerAndZoom(new BMap.Point(114.949222,25.804045), 18);  // 初始化地图,设置中心点坐标和地图级别
	//添加地图类型控件
	map.addControl(new BMap.MapTypeControl({
		mapTypes:[
            BMAP_NORMAL_MAP,
            BMAP_HYBRID_MAP
        ]}));	  
	map.setCurrentCity("赣州");          // 设置地图显示的城市 此项是必须设置的
	map.enableScrollWheelZoom(true);  //开启鼠标滚轮缩放
	
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(114.949222,25.804045);
	var marker = new BMap.Marker(point);  // 创建标注
	map.addOverlay(marker);              // 将标注添加到地图中
	map.centerAndZoom(point, 18);
	var opts = {
	  width : 200,     // 信息窗口宽度
	  height: 100,     // 信息窗口高度
	  title : "金字塔金融" , // 信息窗口标题
	  enableMessage:true,//设置允许信息窗发送短息
	}
	var infoWindow = new BMap.InfoWindow("地址：江西赣州章贡区沙石镇楼梯岭矮塔下88号 ", opts);  // 创建信息窗口对象 
	marker.addEventListener("click", function(){          
		map.openInfoWindow(infoWindow,point); //开启信息窗口
	});
	
	
	 // 添加带有定位的导航控件
  var navigationControl = new BMap.NavigationControl({
    // 靠左上角位置
    anchor: BMAP_ANCHOR_TOP_LEFT,
    // LARGE类型
    type: BMAP_NAVIGATION_CONTROL_LARGE,
    // 启用显示定位
    enableGeolocation: true
  });
  map.addControl(navigationControl);
  // 添加定位控件
  var geolocationControl = new BMap.GeolocationControl();
  geolocationControl.addEventListener("locationSuccess", function(e){
    // 定位成功事件
    var address = '';
    address += e.addressComponent.province;
    address += e.addressComponent.city;
    address += e.addressComponent.district;
    address += e.addressComponent.street;
    address += e.addressComponent.streetNumber;
    alert("当前定位地址为：" + address);
  });
  geolocationControl.addEventListener("locationError",function(e){
    // 定位失败事件
    alert(e.message);
  });
  map.addControl(geolocationControl);
  map.enableScrollWheelZoom(true);
</script>

</body>
</html>
