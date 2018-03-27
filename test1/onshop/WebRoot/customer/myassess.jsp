 <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'OrdersPJ.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	*{
		margin: 0;
	}
	.box{
		width: 60%;
		margin:0px auto;
	}
	.list{
		margin: 0 50px;
		width: 30%;
		float: left;
	}
	a{
		font-size: 20px;//星星大小
		text-decoration: none;
		color: lightgray;
	}
	span{
		font-size: 16px;
		padding-top: 10px;
		margin-left: 20px;
	}
	.c1{
		color: crimson;
	}
	.c2{
		color: goldenrod;
	}
	.c3{
		color: yellow;
	}
	.c4{
		color: orange;
	}
	.c5{
		color: limegreen;
	}
	
	.a-upload {
    padding: 4px 10px;
    height: 20px;
    line-height: 20px;
    position: relative;
    cursor: pointer;
    color: #888;
    background: #fafafa;
    border: 1px solid #ddd;
    border-radius: 4px;
    overflow: hidden;
    display: inline-block;
    *display: inline;
    *zoom: 1
}

.a-upload  input {
    position: absolute;
    font-size: 100px;
    right: 0;
    top: 0;
    opacity: 0;
    filter: alpha(opacity=0);
    cursor: pointer
}

.a-upload:hover {
    color: #444;
    background: #eee;
    border-color: #ccc;
    text-decoration: none
}
	
</style>

<style type="text/css">
body{ font-size:14px;}
input{ vertical-align:middle; margin:0; padding:0}
.file-box{ position:relative;width:150px}
.txt{ height:22px; border:1px solid #cdcdcd; width:80px;}
.btn{ background-color:#FFF; border:1px solid #CDCDCD;height:24px; width:70px;}
.file{ position:absolute; top:0; right:80px; height:137px; filter:alpha(opacity:0);opacity: 0;width:150px }
</style>


	<script type="text/javascript" src="js/jquery-1.11.0.js" ></script>
	<script type="text/javascript" src="js/my.js" ></script>
  </head>
  
  <body>
  	<form action="users?method=assess&pid=${product.pid }&oid=${oid }" method="post">
  	<input type="hidden" name="oid" value="${oid }">
    <table width="100%" align="center" >
    	<tr>
    		<td  width="20%"></td>
    		<td>
    			<table width="100%" border="1" rules="none">
    				<tr height="20"><td colspan="3"></td></tr>
    				<tr>
    				<td align="center" rowspan="6" valign="top">&nbsp;</td>
    				
    					
    				</tr>
    				<tr>
    					<td>
			    			<font face="幼圆" size="2">&nbsp;我的总体评价:</font>
							<a class="star1">★</a>
							<a class="star2">★</a>
							<a class="star3">★</a>
							<a class="star4">★</a>
							<a  class="star5">★</a>
							<span class="remark"style="font-size: 6">亲，请客观给出评价~</span>
							<input type="text" name="astar" id="astar" value="1"><!-- 评论星星数 -->
    					</td>
    				</tr>
    				<tr>
    					<td>
	    		
	    	</td>
    				</tr>
    				<tr>
	    				<td>
	    					<font face="微软雅黑" size="2">菜品口味如何，服务周到吗，环境如何？（写够15字以上，才是好同志～）</font>
	    				</td>
    				</tr>
    				<tr>
    					<td>
    						<textarea id="acontent" rows="6" cols="62" style="font-size: 20" name="ass"></textarea>
    					</td>
    				</tr>
    				<tr align="center" height="40">
    					<td>
    						<input style="height:25;width:80;" type="submit" value="提&nbsp;交&nbsp;评&nbsp;论">
    					</td>
    				</tr>
    			</table>
    		</td>
    		<td  width="7%" rowspan="6"></td>
    	</tr>
    </table>
    </form>
    
    <script type="text/javascript">
    
    	$(function(){

	starChange();
	
});
function starChange(){
	for (var i=1; i<=5; i++) {
		//为每个星星 绑定鼠标移入 移出 事件
		$(".star"+ i).hover(
			//鼠标移入
			function(){
				var index = $(this).attr("class").substr(4,1);
				for (var i= index; i>0; i--) {
					$(".star"+ i).addClass("c" + index);
				}
				//改变评价样式 及 内容
				switch(index){
					case "1":
						$(".remark").addClass("c1").text("垃圾！简直就是垃圾！！！");
						break;
					case "2":
						$(".remark").addClass("c2").text("糟糕透了！！");
						break;
					case "3":
						$(".remark").addClass("c3").text("这种东西还好意识拿出来卖？！");
						break;
					case "4":
						$(".remark").addClass("c4").text("不错，还可以~");
						break;
					case "5":
						$(".remark").addClass("c5").text("Good~一次愉快的购物体验~");
						break;
				}
			},
			//鼠标移出
			function(){
				var index = $(this).attr("class").substr(4,1);
				for (var i= index; i>0; i--) {
					//恢复本身及之前的星星的颜色
					$(".star"+ i).removeClass("c" + index);
				}
				//回复 评价
				$(".remark").removeClass("c" + index).text("亲，请客观给出评价~");
			}
		);
		
		//为每个星星 绑定点击事件
		$(".star"+ i).bind("click", function(){
			
			var index = $(this).attr("class").substr(4,1);
			document.getElementById("astar").value=index;
			//点击之后 解绑本身及之前星星的 所有事件
			for(var i=1; i<=index; i++){
				$(".star"+ i).unbind();
			}
			//将后面的隐藏
			while(++index <= 5){
				$(".star"+ index).css("display","none");
			}
		});
	}
}
    
    </script>
    
    
    <script type="text/javascript">
    	 //选择图片，马上预览
            function xmTanUploadImg(j) {
            	
            	
				if(j==1){
					var s = document.getElementById("xdaTanFileImg1");
					 var img = document.getElementById("xmTanImg1");
				}else if(j==2){
					var s = document.getElementById("xdaTanFileImg2");
					 var img = document.getElementById("xmTanImg2");
				}else if(j==3){
					var s = document.getElementById("xdaTanFileImg3");
					 var img = document.getElementById("xmTanImg3");
				}else if(j==4){
					var s = document.getElementById("xdaTanFileImg4");
					 var img = document.getElementById("xmTanImg4");
				}else if(j==5){
					var s = document.getElementById("xdaTanFileImg5");
					 var img = document.getElementById("xmTanImg5");
				}
            	
            	
            
                var file = s.files[0];

                console.log(s);console.log(file);
                console.log("file.size = " + file.size);  //file.size 单位为byte

                var reader = new FileReader();

                //读取文件过程方法
                reader.onloadstart = function (e) {
                    console.log("开始读取....");
                }
                reader.onprogress = function (e) {
                    console.log("正在读取中....");
                }
                reader.onabort = function (e) {
                    console.log("中断读取....");
                }
                reader.onerror = function (e) {
                    console.log("读取异常....");
                }
                reader.onload = function (e) {
                    console.log("成功读取....");
					
					
                   
                    img.src = e.target.result;
                    //或者 img.src = this.result;  //e.target == this
                }

                reader.readAsDataURL(file)
            }
    </script>
    
  </body>
</html>
