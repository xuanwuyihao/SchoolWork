<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 显示界面</title>	
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
		<script type="text/javascript" src="js/zzsc.js"></script>
		<link href="css/icons.css" rel="stylesheet" type="text/css" />

		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		
		<style>
		
		a {
		    text-decoration: none;
		    cursor: pointer;
		    color: #333;
		}
		
		a:hover {
		    text-decoration: none;
		    outline: none
		}
		
		a.ie6:hover {
		text-decoration: none;
		    zoom: 1
		}
		
		a:focus {
		text-decoration: none;
		    outline: none
		}
		
		a:hover,
		a:active {
		text-decoration: none;
		    outline: none
		}
		ul li{
		display: inline;
		}
		.panel-heading:hover {
		background-color: #c3c3c3;
		}
		.panel-group{
		 width:80%;
		background-color: white;
		}
		 .container{
		/* font-family:楷体; */
		background-color: white;
		}
		.container i{
		padding: 0 10px;
		}
		/* .panel-heading{
		font-family:楷体;
		}  */
		@font-face {
		  font-family: 'iconfont';
		  src: url('found/iconfont.eot');
		  src: url('found/iconfont.eot?#iefix') format('embedded-opentype'),
		  url('found/iconfont.woff') format('woff'),
		  url('found/iconfont.ttf') format('truetype'),
		  url('found/iconfont.svg#iconfont') format('svg');
		}
		.iconfont{
		  font-family:"iconfont" !important;
		  font-size:16px;font-style:normal;
		  -webkit-font-smoothing: antialiased;
		  -webkit-text-stroke-width: 0.2px;
		  -moz-osx-font-smoothing: grayscale;
		}
		</style>
	
<script type="text/javascript">
	$(function () { $('#gdbj').collapse({
		toggle: false
	})});
	$(function () { $('#collapseTwo').collapse('show')});
	$(function () { $('#collapseThree').collapse('toggle')});
	$(function () { $('#collapseOne').collapse('hide')});
	$(function () { $('#gdbj').collapse('toggle')});
</script> 
<script type="text/javascript">
function changeFrameHeight(){
    var ifm= document.getElementById("iframepage"); 
    ifm.height=document.documentElement.clientHeight;
}
window.onresize=function(){  
     changeFrameHeight();  
} 
</script>
	</head>

	<body style="background-color: #ebebeb;">

		
	<!--左右边框  -->
				  <div class="containers" style="height: auto;">
				 	<div id="zh" style="height: auto;">
				 	<iframe src="zh.html"  id="myiframe" scrolling="" height="800px;" onload="changeFrameHeight()" frameborder="0"></iframe>
				 	
				 	</div>
				 	<!-- <div id="cyjg" style="height: auto;">
				 	<iframe src="cyjg.html" height="900px;" scrolling="no"></iframe>
				 	</div> -->
				  </div>
				</div>
			</div>
		</div>
<!--end  -->


		
		<!-- bootstrap js -->
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>

</body>
</html>