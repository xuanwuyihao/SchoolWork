<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 关于团队</title>
<link rel="icon" href="images/logo/logo2.ico" />
<link rel="stylesheet" href="css/group/style.css" />
<script type="text/javascript" src="script/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		$(".nav_item").removeClass("active");
		$("#nav_index").addClass("active");

		var $centerwell_first = $('#centerwell li:first');
		$centerwell_first.animate({
			width : '635px'
		}, 300);
		$centerwell_first.find('h3').addClass("on");

		$('#centerwell li').click(function() {
			if (!$(this).is(':animated')) {
				$(this).animate({
					width : '635px'
				}, 300).siblings().animate({
					width : '100px'
				}, 300);

				$('#centerwell li h3').removeClass("on");
				$(this).find("h3").addClass("on");
			}
		});
	});
</script>

</head>
<body style="background:#FFF0F5;">
	<div style="width:auto;height:auto;border-radius:5px;">
		<div class="box2" style="border-radius:5px;">
			<div class="banner_tit" style="background:#F5FFFA;">团队介绍</div>
			<div class="hot_role">
				<ul id="centerwell">
					<li>
						<h3>
							<img alt="涂梅城" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="涂梅城" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">涂梅城</a></span>
										</div>
										<div class="mt10">
											<span class="bold">性别：</span>
											<span class="color444">男</span>
											<span class="role_fen ml15">19</span>
										</div>
										<div class="mt5">
											<span class="bold">爱好：</span> 
											<span class="color444">
						                        <a href="#" class="mr7">打高尔夫</a>
												<a href="#" class="mr7">敲代码</a> 
												<a href="#" class="mr7">喝咖啡</a>
												<a href="#" class="mr7">喝茶</a> 
												<a href="#" class="mr7">听音乐</a>
												<a href="#" class="mr7">看书</a>
										
											</span>
										</div>
										<div class="mt5">
											<span class="bold">所属班级：</span>
											<span class="color444"><a
												href="#">HT1604</a></span>
										</div>
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">详细资料介绍：</span> 
								<span class="color444">
									现居赣州，在读学生，就读于宏图软件学院；
									
								</span>
								<span class="ml20"><a href="http://">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
					<li>
						<h3>
							<img alt="赖永炜" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="赖永炜" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">赖永炜</a></span>
										</div>
										<div class="mt10">
											<span class="bold">性别：</span>
											<span class="color444">男</span>
											<span class="role_fen ml15">19</span>
										</div>
										<div class="mt5">
											<span class="bold">爱好：</span> 
											<span class="color444">
												<a href="#" class="mr7">玩游戏</a> 
												<a href="#" class="mr7">购物</a>
												<a href="#" class="mr7">看电影</a> 
											
												
											</span>
										</div>
										<div class="mt5">
											<span class="bold">所属班级：</span>
											<span class="color444"><a
												href="#">HT1604</a></span>
										</div>
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">详细资料介绍：</span> 
								<span class="color444">
									现居赣州，在读学生，就读于宏图软件学院；
								</span>
								<span class="ml20"><a href="#">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
					<li>
						<h3>
							<img alt="李汉" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="李汉" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">李汉</a></span>
										</div>
										<div class="mt10">
											<span class="bold">性别：</span>
											<span class="color444">男</span>
											<span class="role_fen ml15">19</span>
										</div>
										<div class="mt5">
											<span class="bold">爱好：</span> 
											<span class="color444">
												<a href="#" class="mr7">旅游</a> 
												<a href="#" class="mr7">写诗</a>
											
												<a href="#" class="mr7">听音乐</a>
											</span>
										</div>
										<div class="mt5">
											<span class="bold">所属班级：</span>
											<span class="color444"><a
												href="#">HT1604</a></span>
										</div>
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">详细资料介绍：</span> 
								<span class="color444">
									现居赣州，在读学生，就读于宏图软件学院；
								</span>
								<span class="ml20"><a href="#">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
					<li>
						<h3>
							<img alt="欧阳浩" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="欧阳浩" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">欧阳浩</a></span>
										</div>
										<div class="mt10">
											<span class="bold">性别：</span>
											<span class="color444">男</span>
											<span class="role_fen ml15">19</span>
										</div>
										<div class="mt5">
											<span class="bold">爱好：</span> 
											<span class="color444">
												<a href="#" class="mr7">乒乓球</a> 
												<a href="#" class="mr7">篮球</a>
												<a href="#" class="mr7">羽毛球</a> 
												<a href="#" class="mr7">打游戏</a>
												<a href="#" class="mr7">听歌</a> 
												<a href="#" class="mr7">聊天</a>
												<a href="#" class="mr7">看电影</a>
											</span>
										</div>
										<div class="mt5">
											<span class="bold">所属班级：</span>
											<span class="color444"><a
												href="#">HT1604</a></span>
										</div>
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">详细资料介绍：</span> 
								<span class="color444">
									现居赣州，在读学生，就读于宏图软件学院；<br />
									每天就知道看MV、听歌、睡觉、咸鱼，就是不干正事！！！！<br />
								</span>
								<span class="ml20"><a href="#">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
					<li>
						<h3>
							<img alt="汪嘉鑫" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="汪嘉鑫" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">汪嘉鑫</a></span>
										</div>
										<div class="mt10">
											<span class="bold">性别：</span>
											<span class="color444">男</span>
											<span class="role_fen ml15">19</span>
										</div>
										<div class="mt5">
											<span class="bold">爱好：</span> 
											<span class="color444">
												<a href="#" class="mr7">敲代码</a> 
												<a href="#" class="mr7">听歌</a>
												<a href="#" class="mr7">看动漫</a> 
												<a href="#" class="mr7">喝咖啡</a>
												<a href="#" class="mr7">喝茶</a>
												<a href="#" class="mr7">看书</a>
											
											</span>
										</div>
										<div class="mt5">
											<span class="bold">所属班级：</span>
											<span class="color444"><a
												href="#">HT1604</a></span>
										</div>
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">详细资料介绍：</span> 
								<span class="color444">
									现居赣州，在读学生，就读于宏图软件学院；
									
								</span>
								<span class="ml20"><a href="#">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
					<li>
						<h3>
							<img alt="清风" src="images/lo.jpg">
						</h3>
						<div class="hot_content">
							<div class="hot_left">
								<a href="#"><img alt="清风" class="img_box"
									src="images/lo.jpg"></a>
							</div>
							<div class="hot_top">
								<dl class="hot_line">
									<dd>
										<div class="t16 yahei">
											<span><a href="#">清风</a></span>
										</div>
										<div class="mt10">
											<span class="bold">类型：</span>
											<span class="color444">教育网站</span>
											<!-- <span class="role_fen ml15">8.9</span> -->
										</div>
										<div class="mt5">
											<span class="bold">模块：</span> 
											<span class="color444">
												<!-- <a href="#" class="mr7">新闻发布</a>  -->
												<a href="#" class="mr7">成考报名</a>
												<a href="#" class="mr7">职考报名</a> 
												<a href="#" class="mr7">信息管理</a>
												<a href="#" class="mr7">资料介绍</a> 
												<a href="#" class="mr7">平台共享</a>
												<a href="#" class="mr7">网站互联</a>
											</span>
										</div>
										<div class="mt5">
											<span class="bold">开发团队：</span>
											<span class="color444">
												<br />
												<a href="#">
													<label style="float:right;">HT1604非酋联盟</label>
												</a>
											</span>
										</div>
										<br />
										<div class="mt5">
											<span class="bold">地区：</span>
											<span class="color444"><a>中国</a></span>
										</div>
									</dd>
									<div class="clear"></div>
								</dl>
							</div>
							<div class="clear"></div>
							<div class="mt10">
								<span class="bold">功能与目标：</span> 
								<span class="color444">
									此教育管理平台旨在为平台公司提供给学生进行在线报名,无论平台招生老师在何方,只要发送地址后学生即可在线报名,
									并归属这个招生老师。我们有前后台两个子系统,前台负责报名宣传,同时也负责把报名的信息进行上传到后台,
									进行打印等功能；后台提供学生报名统计。
									<!-- 对于不同的人群访问后台的，有相应的权限控制，访问权限分为三级，并提供后台数据的实时汇总，缴费查询等。 -->
									此平台的前台页面需要自适应各种屏幕,方便不同的用户在不同设备上使用。
								</span>
								<span class="ml20"><a href="#">详情&gt;&gt;</a></span>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>