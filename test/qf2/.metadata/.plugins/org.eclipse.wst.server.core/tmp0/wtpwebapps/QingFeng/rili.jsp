<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 注意：此测试页面已废弃 -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 日历</title>
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.min.js"></script>
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/gray/easyui.css" />
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="script/jquery-easyui-1.5.2/themes/icon.css" />
<script type="text/javascript"
	src="script/jquery-easyui-1.5.2/jquery.easyui.min.js" charset="utf-8"></script>
<script id="others_jquery_easyui_131" type="text/javascript" class="library" src="script/rili/easyui-lang-zh_CN.js"></script>
<script id="others_jquery_easyui_131" type="text/javascript" class="library" src="script/rili/jquery.fullcalendar.js"></script>

<link type="text/css" href="css/shizhong/style.css" />
<script src="script/rili/shizhong/moment.min.js"></script>
<script src="script/rili/shizhong/script.js"></script>

</head>
<body class="easyui-layout">
    <div region="center">
        <div class="easyui-fullCalendar" fit="true"></div>
    </div>
    
</body>
<!-- <link rel="stylesheet" href="css/calendar.css">
<style type="text/css">
html {
	font: 500 14px 'roboto';
	color: #333;
	background-color: #fafafa;
}

a {
	text-decoration: none;
}

ul, ol, li {
	list-style: none;
	padding: 0;
	margin: 0;
}

#demo {
	width: 300px;
	margin: 150px auto;
	float:left;
	height:100px;
	position:relative ;
	top:0;
}

p {
	margin: 0;
}

#dt {
	margin: 30px auto;
	height: 28px;
	width: 200px;
	padding: 0 6px;
	border: 1px solid #ccc;
	outline: none;
}
</style>
</head>
<body>
	<div id="demo" style="height:160px">

		<div id="ca"></div>

		<div id="dd"></div>
	</div>
	<script src="css/jquery.js"></script>
	<script src="script/calendar.js"></script>
	<script>
		$('#ca').calendar({
			width : 320,
			height : 320,
			data : [ {
				date : '2015/12/24',
				value : 'Christmas Eve'
			}, {
				date : '2015/12/25',
				value : 'Merry Christmas'
			}, {
				date : '2016/01/01',
				value : 'Happy New Year'
			} ],
			onSelected : function(view, date, data) {
				console.log('view:' + view)
				alert('date:' + date)
				console.log('data:' + (data || 'None'));
			}
		});

		$('#dd').calendar({
			trigger : '#dt',
			zIndex : 999,
			format : 'yyyy-mm-dd',
			onSelected : function(view, date, data) {
				console.log('event: onSelected')
			},
			onClose : function(view, date, data) {
				console.log('event: onClose')
				console.log('view:' + view)
				console.log('date:' + date)
				console.log('data:' + (data || 'None'));
			}
		});
	</script>
</body> -->
</html>