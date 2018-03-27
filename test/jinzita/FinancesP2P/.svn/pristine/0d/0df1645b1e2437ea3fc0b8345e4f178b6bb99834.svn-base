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
	<link rel="stylesheet" type="text/css" href="demo.css" />
	<link rel="stylesheet" type="text/css" href="css/gdbj.css" />
<style type="text/css">
.jp-container{width:auto;height:600px;position:relative;background:#fff;border:0px solid #D8DFEA;float:left;}
</style>
<link rel="stylesheet" type="text/css" href="css/jscrollpane1.css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<!-- the mousewheel plugin -->
<script type="text/javascript" src="js/jquery.mousewheel.js"></script>
<!-- the jScrollPane script -->
<script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="js/scroll-startstop.events.jquery.js"></script>
</head>
<body >
<div class="nav-wrap" >
	<ul class="group" id="example-one">
	<!-- <li><div style="width: 120px"></div></li> -->
		<li class="current_page_item">
		<a href="#" target="_blank" class="btn" data-toggle="tab">基本信息</a></li>
	</ul>
</div>

<div id="myTabContents" class="tab-content">
	<div class="tab-pane fade in active" id="home">
	<center>
		<div class="g">
			<ul>
				<li class="g1">
					<div class="gy1">
						<div style="background-image: url('img/head1.jpg');background-size: 163px 160px;">
						</div>
					</div>
				</li>
				<li class="g2">
					<div>
						<font class="gf1">哆啦A梦</font>
						<font class="gf2">铜锣卫门</font>
					</div>
					<div class="gf3">
						<p>
						心肠好，乐于助人，做事很拼命，但却心肠软。每次大雄遇到困难，他总会帮大雄。但有时会用愚蠢的方法来帮助大雄。当它吃不到铜锣烧或人们叫他狸猫时，脾气会非常暴躁。
						他原来是和妹妹一样.
						</p>
					</div>
				</li>
			</ul>
		</div>
			<div class="g-1">
			<ul>
				<li class="g1">
					<div class="gy1">
						<div style="background-image: url('img/head2.jpg');background-size: 155px 160px;">
						</div>
					</div>
				</li>
				<li class="g2">
					<div>
						<font class="gf1">野原新之助</font>
						<font class="gf2">副总</font>
					</div>
					<div class="gf3">
						<p>
						美伢、广志之子，小葵之兄。
						住在春日部郊区某住宅区一栋二层小平房。B型。喜欢漂亮的姐姐和辣妹。
						性格是我行我素。擅长的技能是“屁股外星人”“大象”。
						</p>
					</div>
				</li>
			</ul>
		</div>
	</center>
	</div>
	</div>
	<script type="text/javascript">
		$(function() {
		
			// the element we want to apply the jScrollPane
			var $el					= $('#jp-container').jScrollPane({
				verticalGutter 	: -16
			}),
					
			// the extension functions and options 	
				extensionPlugin 	= {
					
					extPluginOpts	: {
						// speed for the fadeOut animation
						mouseLeaveFadeSpeed	: 500,
						// scrollbar fades out after hovertimeout_t milliseconds
						hovertimeout_t		: 1000,
						// if set to false, the scrollbar will be shown on mouseenter and hidden on mouseleave
						// if set to true, the same will happen, but the scrollbar will be also hidden on mouseenter after "hovertimeout_t" ms
						// also, it will be shown when we start to scroll and hidden when stopping
						useTimeout			: true,
						// the extension only applies for devices with width > deviceWidth
						deviceWidth			: 980
					},
					hovertimeout	: null, // timeout to hide the scrollbar
					isScrollbarHover: false,// true if the mouse is over the scrollbar
					elementtimeout	: null,	// avoids showing the scrollbar when moving from inside the element to outside, passing over the scrollbar
					isScrolling		: false,// true if scrolling
					addHoverFunc	: function() {
						
						// run only if the window has a width bigger than deviceWidth
						if( $(window).width() <= this.extPluginOpts.deviceWidth ) return false;
						
						var instance		= this;
						
						// functions to show / hide the scrollbar
						$.fn.jspmouseenter 	= $.fn.show;
						$.fn.jspmouseleave 	= $.fn.fadeOut;
						
						// hide the jScrollPane vertical bar
						var $vBar			= this.getContentPane().siblings('.jspVerticalBar').hide();
						
						/*
						 * mouseenter / mouseleave events on the main element
						 * also scrollstart / scrollstop - @James Padolsey : http://james.padolsey.com/javascript/special-scroll-events-for-jquery/
						 */
						$el.bind('mouseenter.jsp',function() {
							
							// show the scrollbar
							$vBar.stop( true, true ).jspmouseenter();
							
							if( !instance.extPluginOpts.useTimeout ) return false;
							
							// hide the scrollbar after hovertimeout_t ms
							clearTimeout( instance.hovertimeout );
							instance.hovertimeout 	= setTimeout(function() {
								// if scrolling at the moment don't hide it
								if( !instance.isScrolling )
									$vBar.stop( true, true ).jspmouseleave( instance.extPluginOpts.mouseLeaveFadeSpeed || 0 );
							}, instance.extPluginOpts.hovertimeout_t );
							
							
						}).bind('mouseleave.jsp',function() {
							
							// hide the scrollbar
							if( !instance.extPluginOpts.useTimeout )
								$vBar.stop( true, true ).jspmouseleave( instance.extPluginOpts.mouseLeaveFadeSpeed || 0 );
							else {
							clearTimeout( instance.elementtimeout );
							if( !instance.isScrolling )
									$vBar.stop( true, true ).jspmouseleave( instance.extPluginOpts.mouseLeaveFadeSpeed || 0 );
							}
							
						});
						
						if( this.extPluginOpts.useTimeout ) {
							
							$el.bind('scrollstart.jsp', function() {
							
								// when scrolling show the scrollbar
							clearTimeout( instance.hovertimeout );
							instance.isScrolling	= true;
							$vBar.stop( true, true ).jspmouseenter();
							
						}).bind('scrollstop.jsp', function() {
							
								// when stop scrolling hide the scrollbar (if not hovering it at the moment)
							clearTimeout( instance.hovertimeout );
							instance.isScrolling	= false;
							instance.hovertimeout 	= setTimeout(function() {
								if( !instance.isScrollbarHover )
										$vBar.stop( true, true ).jspmouseleave( instance.extPluginOpts.mouseLeaveFadeSpeed || 0 );
								}, instance.extPluginOpts.hovertimeout_t );
							
						});
						
							// wrap the scrollbar
							// we need this to be able to add the mouseenter / mouseleave events to the scrollbar
						var $vBarWrapper	= $('<div/>').css({
							position	: 'absolute',
							left		: $vBar.css('left'),
							top			: $vBar.css('top'),
							right		: $vBar.css('right'),
							bottom		: $vBar.css('bottom'),
							width		: $vBar.width(),
							height		: $vBar.height()
						}).bind('mouseenter.jsp',function() {
							
							clearTimeout( instance.hovertimeout );
							clearTimeout( instance.elementtimeout );
							
							instance.isScrollbarHover	= true;
							
								// show the scrollbar after 100 ms.
								// avoids showing the scrollbar when moving from inside the element to outside, passing over the scrollbar								
							instance.elementtimeout	= setTimeout(function() {
								$vBar.stop( true, true ).jspmouseenter();
							}, 100 );	
							
						}).bind('mouseleave.jsp',function() {
							
								// hide the scrollbar after hovertimeout_t
							clearTimeout( instance.hovertimeout );
							instance.isScrollbarHover	= false;
							instance.hovertimeout = setTimeout(function() {
									// if scrolling at the moment don't hide it
								if( !instance.isScrolling )
										$vBar.stop( true, true ).jspmouseleave( instance.extPluginOpts.mouseLeaveFadeSpeed || 0 );
								}, instance.extPluginOpts.hovertimeout_t );
							
						});
						
						$vBar.wrap( $vBarWrapper );
						
					}
					
					}
					
				},
				
				// the jScrollPane instance
				jspapi 			= $el.data('jsp');
				
			// extend the jScollPane by merging	
			$.extend( true, jspapi, extensionPlugin );
			jspapi.addHoverFunc();
		
		});
	</script>
</body>
</html>