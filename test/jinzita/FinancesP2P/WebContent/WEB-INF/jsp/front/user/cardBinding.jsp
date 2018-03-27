<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<!-- 		<title>易支付</title> -->
<%-- 		<base href="<%=path%>/"> --%>
<!-- 		<link rel="icon"  href="img/tubiao.png" type="image/x-icon"> -->
	<title>金字塔 - 综合金融服务平台 - 用户个人中心 - 绑定银行卡</title>	
	<base href="<%=path%>/">	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
		<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/bootstrap.js"></script>
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<!-- <link rel="stylesheet" href="css/style.css" type="text/css" /> -->
		<link rel="stylesheet" type="text/css" href="css/zzsc.css" />
		<script type="text/javascript" src="js/zzsc.js"></script>
<!--提示框样式-->
<link type="text/css" rel="stylesheet" href="css/iosOverlay4.css">
		<!--
	作者：383942470@qq.com
	时间：2017-11-08
	描述：图标
-->
		<link href="css/icons.css" rel="stylesheet" type="text/css" />
	
		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="js/area.js"></script>
		<script type="text/javascript" src="js/location.js"></script>
		<script type="text/javascript" src="js/select2.js"></script>
		<script type="text/javascript" src="js/select2_locale_zh-CN.js"></script>

		<link href="css/common.css" rel="stylesheet"/>
		<link href="css/select2.css" rel="stylesheet"/>
		<link href="css/bs.css" rel="stylesheet">
		<link href="css/index.css" rel="stylesheet">

		<link href="css/responsive.css" rel="stylesheet" type="text/css" />
		<!-- <link rel="stylesheet" href="css/style2.css" /> -->
		<script src="https://lab.chinapnr.com/statics/muser/js/vendor/jquery-1.8.2.min.js"></script>
	<style type="text/css">
		#name{
		width: 300px;
		height: 40px;
		margin: 10px 0;
		outline:none;
		text-indent: 10px;
		border: 1px solid #c3c3c3;
		}
		#name:focus{
		 border-style:solid;
   		 border-color:#ecd326;
		}
	
		/* h3{
		color:orange;
		} */
		
		.s {
		    text-decoration: none;
		    cursor: pointer;
		    color: #blue;
		}
		
		.s:hover {
		    text-decoration: none;
		    outline: none;
		    color: orange;
		}
		
		.s.ie6:hover {
		text-decoration: none;
		    zoom: 1;
		    color: orange;
		}
		
		.s:focus {
		text-decoration: none;
		    outline: none;
		    color: orange;
		}
		
		.s:hover,
		.s:active {
		text-decoration: none;
		    outline: none;
		    color: orange;
		}
		.button{
		width: 150px;
		height: 40px;
		background-color: #3399ff;
		outline: none;
		color:white;
		font-size:21px;
		font-family:微软雅黑;
		border: 1px solid #3399ff;
		}
		</style>
		
		<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
		<link href="public/css/city-picker.css" rel="stylesheet" type="text/css" />
	</head>

	<body style="background-color: #c3c3c3;">
<!--CENTER  -->
			<div class="container" style="margin-top: 10px">
				<div class="row clearfix">
					<div class="col-md-12 column" style="background-color: white;height:auto;">
					<div style="height: 20px;"></div>
					<img src="img/logos.png" style="margin-left:40px;">
					<div style="height: 00px;"></div>
					<div style="border: 1px solid #dce08d;height: auto;width: 90%;margin-left: 50px;">
					<div style="height: 50px;background-color:#dce08d ">
					<div style="height: 19px;"></div>
						<div style="margin-top: 0px;margin-left: 30px;">
						<font color="gray" >平台名称：金字塔</font>
						<font color="gray" style="margin-left: 20px;">公司名称：金字塔运营（赣州）有限公司</font>
						</div>
					</div>
					<!--//////////////////////////////////////////  -->
					<div style="height: 100px;">
					<div style="height: 30px;"></div>
					<div style="margin-left: 110px;font-family: 微软雅黑">
						<font color="gray" size="3">
						真实姓名:<font style="font-weight: bold;margin-left: 30px;">${userInfo.realname}</font>
						</font>
						<br>
						<div style="height: 20px;"></div>
						<font color="gray" size="3">
						证件号码:<font style="font-weight: bold;margin-left: 30px;">${userInfo.idcard}</font>
						</font>
					</div>
					</div>
					<!-- 22222222222222222222222222222222222222222222 -->
					<div>
					<hr style="border: 1px dashed #f3f3f3;width: 94%;margin-left: 30px;">
					</div>
					<!--------------------------------------------  -->
					     
              <!--账户余额开始-->
             <form id="frm" action="finance/bankcard/binding" method="post">
				<table style="width:460px;margin-left:100px">
					<tr>
						<td>选择银行:</td>
						<td class="border-none td_bot">
							<div class="position-rel" style="margin-left:16px;">
								<div class="position-rel">
									<input type="text" id="chose_input" name="placebank" style="height:40px;" class="form-control" placeholder="--储蓄卡--"/>
									
									<div class="bank_xljt">
									<img class="jt_xz" style="margin-top:10px;" width="20" src="images/jtx.png" alt=""/></div>
									<div id="chose_bank" class="bank_xljt1"></div>
								</div>
								<div class="bank_xl" style="display: none" >
									<ul>
										<li class="hotBank-list" >
											<ul>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国农业银行">
												<img src="images/zs1.png" width="150" alt=""/>
											</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国建设银行">
												<img src="images/zs2.png" width="150" alt=""/>
											</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国工商银行">
												<img src="images/zs3.png" width="150" alt=""/>
											</a>
											</li>
											</ul>
										</li>
										<li class="hotBank-list">
											<ul>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国银行">
												<img src="images/zs4.png" width="150" alt=""/>
											</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国光大银行">
												<img src="images/zs5.png" width="150" alt=""/>
											</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="华夏银行">
												<img src="images/zs6.png" width="150" alt=""/>
											</a>
											</li>
											</ul>
										</li>
										<li class="hotBank-list">
										<ul>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="中国民生银行">
												<img src="images/zs7.png" width="150" alt=""/>
											</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="平安银行">
													<img src="images/zs8.png" width="150" alt=""/>
												</a>
											</li>
											<li style="display: inline;float: left;">
											<a href="javascript:" class="hotBank-list-ico "  title="兴业银行">
												<img src="images/zs9.png" width="150" alt=""/>
											</a>
											</li>
											</ul>
										</li>
									</ul>
								</div>
							</div>
					   </td>
					</tr>
			
				</table>
			
			
             <!--////////  -->
             <div style="margin-top: 10px;">
					<input type="hidden" name="userinfoid" value="${userInfo.id}">
		      		<font face="微软雅黑" style="margin-left: 100px;">银行卡号：</font>
		      		<input id="name" style="margin-left: 45px;width:333px;" type="text" name="bankcard" placeholder="输入银行卡号" onfocus="this.placeholder=''" onblur="this.placeholder='输入银行卡号'" />
		      		</div>
		      		<!--联动  -->
		      		<div style="margin-top: 10px;">
		      		<ul>
		      		<li style="float:left;display:inline;margin-left:70px;margin-top:15px;">
		      		<font face="微软雅黑" style="margin-left: 0px;">银行卡所属地：</font>
		      		</li>
		      		<li style="float:left;display:inline;">
					<div class="docs-methods">
						<div id="distpicker">
						
							<div class="form-group" style="margin-left: 25px;">
								<div style="position: relative;margin-left: 25px;">
									<input id="city-picker3"  style="width: 333px;" class="form-control" type="text" placeholder="输入银行卡所属地" data-toggle="city-picker">
								</div>
							</div>
						</div>
					</div>
					</li>
					</ul>
					</div>
					<!-- end -->
					<!-- 支付密码 -->
					<br>
					<div style="margin-top: 30px;margin-left:80px;">
					<font face="微软雅黑" >易支付密码：</font>
		      		<input id="name"  style="margin-left: 50px;width: 333px;" type="password" name="pwd" placeholder="易支付密码" onfocus="this.placeholder=''" onblur="this.placeholder='易支付密码'" />
		      		<a class="s" href="#">忘记易支付?</a>
		      		</div>
		      		<div  style="margin-top: 20px;margin-left: 250px;">
		      		<input type="checkbox" checked ='checked'/>
		      		<font face="微软雅黑" style="margin-left: 20px;">将此卡设置为默认取现卡</font>
		      		</div>
		      		<hr style="border: 1px dashed #c3c3c3;width: 94%;margin-left: 30px;">
		      		<input onclick="test();" id="tj" class="button"style="margin-left: 280px;" type="button" value="确认">
		      		<div style="height: 10px;"></div>
 <!-- end -->
			</form>
		      		
					</div>
				</div>
				</div>
				</div>
<!-- 下拉框 -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bs.js"></script>
<script>
$(function(){

//        下拉银行卡

	$(".hotBank-list-ico").bind('click',function(){
	   $('#chose_input').val($(this).attr('title'));
		$('.bank_xl').hide();
		$("#chose_bank").parent('div').find('img').addClass('jt_xz');
	});
	$("#chose_bank").click(function(){
		$('.bank_xl').show();
		$("#chose_bank").parent('div').find('img').removeClass('jt_xz');
	});
//        下拉银行卡

})
</script>
<script>
if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
	var msViewportStyle = document.createElement('style')
	msViewportStyle.appendChild(
			document.createTextNode(
					'@-ms-viewport{width:auto!important}'
			)
	)
	document.querySelector('head').appendChild(msViewportStyle)
}

</script>
			<!--
            	作者：383942470@qq.com
            	时间：2017-11-10
            	描述：锚点
            -->

		<!-- 提示框 -->
	<script type="text/javascript" src="js/iosOverlay.js"></script>
	<script type="text/javascript" src="js/spin.min.js"></script>
		<script type="text/javascript">
			function test(){
				var chose_input = $("#chose_input").val();
				var name = $("#name").val();
				var city_picker3 = $("#city-picker3").val();
				var name1 = $("pwd").val();
				
				if(chose_input==''){
					iosOverlay({
						text: "请选择所属银行",
						duration: 2e3,		
					});
					return;	
				}
				if(isNaN(name)||name.length>16||name.length<16){
					iosOverlay({
						text: "请输入正确的银行卡号",
						duration: 2e3,		
					});
					return;
				}
				
				if(city_picker3==''){
					iosOverlay({
						text: "请输入银行卡所属地",
						duration: 2e3,		
					});
					return;	
				}
				if(name1==''){
					iosOverlay({
						text: "请输入易支付密码",
						duration: 2e3,		
					});
					return;	
				}
				$("#tj").attr("disabled", false);
				$("#frm").submit();
			}
		</script>

		
		<!-- bootstrap js -->
		<script src="public/js/city-picker.data.js"></script>
		<script src="public/js/city-picker.js"></script>
		<script src="public/js/main.js"></script>
		
		<script type="text/javascript" src="js/jquery2.1.4.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
	</body>
</html>