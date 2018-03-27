<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 关于我们</title>
<link rel="icon" href="images/logo/logo2.ico" />
<link rel="stylesheet" href="css/aboutus/all.css" />
<link rel="stylesheet" href="css/aboutus/text.css" />
<script type="text/javascript" src="script/jquery.mins.js"></script>
<script type="text/javascript" src="script/aboutus/aboutus1.js"></script>
<script type="text/javascript" src="script/aboutus/aboutus2.js"></script>

</head>
<body id="portfolio" class="sel_portfolio">
<br />
	<div class="container">
		<div class="main" style="">
			<!--ps_box-->
			<div class="ps_box">
				<div class="pics_switch">
					<div class="pb">
						<div class="pic_box">
							<a class="pic_banner_001" target="_blank"></a>
						</div>
						<div class="pic_box">
							<a class="pic_banner_002" target="_blank"></a>
						</div>
						<div class="pic_box">
							<a class="pic_banner_003" target="_blank"></a>
						</div>
						<div class="pic_box">
							<a class="pic_banner_004" target="_blank"></a>
						</div>
					</div>
					<div class="viewArrows prev">上一张</div>
					<div class="viewArrows next">下一张</div>
					<div class="pics_switch_clients">
						<ul>
							<li class="li_1"><span class="current">1</span></li>
							<li class="li_2"><span>2</span></li>
							<li class="li_3"><span>3</span></li>
							<li class="li_4"><span>4</span></li>
						</ul>
					</div>

				</div>
			</div>
			<!--case_box-->
		</div>
	</div>
	
	<div>
		<br />
		<h2 style="font-size: 34px; font-family: '楷体';float:left;">
			
		</h2>
		
		<%-- <jsp:include page="ncb.jsp" flush="true" /> --%>
	</div>
	<div>
		<br />
		<h2 style="font-size: 34px; font-family: '楷体';float:right;">
			
		</h2>
		
	</div>
	<br />
	<br />
	<div>
		<h2 style="font-size: 34px; font-family: '楷体';width:70%;position: absolute;left:18%;">
			<font style="float:left;font-size:34px;">
				<a href="ncb.jsp" title="点击查看-认证" target="_blank">权威认证</a>
			</font>
			发展历程
			<font style="float:right;font-size:34px;">
				<a target="_blank" title="点击查看-团队" href="group.jsp">关于团队</a>
			</font>
		</h2>
		
		<br />
		<br />
		<div style="*display: inline;*zoom: 1;">
			<div style="width:auto;float:center;padding-left:90px;">
			<br /><br />
				<div class="event_wrap clearfix" style="top:128%;">
					<div class="middle_line"></div>
				</div>
			</div>
		</div>
	</div>
	
</body>

<script type="text/javascript" src="script/jquery.js"></script>

<script type="text/javascript" src="script/aboutus/jquery.eventFlow.js"></script>

<script>
	$(function() {
		var bigEvent = [ {
			'year' : '8月份',
			'events' : [ {
				'mouths' : 2,
				'times' : '2017年8月11日',
				'even' : '项目正式启动，制作进入第一阶段，成立开发团队'
			}, {
				'mouths' : 4,
				'times' : '2017年8月22日',
				'even' : '修改项目需求，制作进入第二阶段'
			}, {
				'mouths' : 10,
				'times' : '2017年8月25日',
				'even' : '进行了项目启动之后最大的一次更新，修改及新增了easyUI官方文档，扩展部分功能组件'
			} ]
		}, {
			'year' : '9月份',
			'events' : [ {
				'mouths' : 2,
				'times' : '2017年8月31日',
				'even' : '项目合并，准备进入第三阶段开发'
			}, {
				'mouths' : 4,
				'times' : '2017年9月3日',
				'even' : '项目正式投入运营'
			} ]
		} ];
		$('.event_wrap').eventFlow({
			'events' : bigEvent
		});
	})
</script>
</html>