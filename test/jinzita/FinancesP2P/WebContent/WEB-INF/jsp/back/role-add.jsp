<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    
    <head>
        <meta charset="utf-8">
        <title>
            金字塔 - 综合金融服务后台管理 - 角色列表 - 添加
        </title>
        <base href="<%=path%>/">
        <meta name="renderer" content="webkit">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="format-detection" content="telephone=no">
        <link rel="stylesheet" href="./css/x-admin.css" media="all">
    <style type="text/css">
		a:focus{text-decoration: none}
		a:focus{outline:none;}
	</style>
</head>
    
<body>
        <div class="x-body">
            <form action="" method="post" class="layui-form layui-form-pane">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>角色名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>别名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="alias" name="alias" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">
                        拥有权限
                    </label>
                    <table  class="layui-table" lay-size="sm">
                        <tbody>
                            <tr>
                                <td  width="5%">
                         首页管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                     
                                     <input name="jurId" type="checkbox" value="101"> 修改密码
                                      
                                    
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                         借款管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                   <input name="jurId" type="checkbox" value="201"> 借款申请
                                    <input name="jurId" type="checkbox" value="202"> 借款审核
                                    <input name="jurId" type="checkbox" value="203">所有借款 
                                    <input name="jurId" type="checkbox" value="204">招标中的借款
                                   
                                    <input name="jurId" type="checkbox" value="205"> 收款还款
                                    <input name="jurId" type="checkbox" value="206"> 手工放款
                                    <input name="jurId" type="checkbox" value="207"> 逾期借款
                                  
                                    </div>
                                </td>
                            </tr>
                            
                         <tr>
                                <td>
                           资金管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                  <input name="jurId" type="checkbox" value="301"> 用户资金管理
                                  <input name="jurId" type="checkbox" value="302"> 充值记录
                                  <input name="jurId" type="checkbox" value="303"> 提现记录
                                  <input name="jurId" type="checkbox" value="304"> 资金流向记录
                                 
                                 
                                  <input name="jurId" type="checkbox" value="305"> 银行卡管理
                                  <input name="jurId" type="checkbox" value="306">平台收费管理 
                                 
                                    </div>
                                </td>
                            </tr>   
                            
                            <tr>
                                <td>
                        认证管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                   <input name="jurId" type="checkbox" value="401">额度申请
                                   
                                        
                                     
                                    </div>
                                </td>
                            </tr>
                                <tr>
                                <td>
                        用户管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                    <input name="jurId" type="checkbox" value="501">用户管理
                                    <input name="jurId" type="checkbox" value="502">推荐人管理
                                    <input name="jurId" type="checkbox" value="503">管理员列表
                                    
                                    <input name="jurId" type="checkbox" value="504">角色管理
                                    <input name="jurId" type="checkbox" value="505">系统日志

                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                        宣传管理
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                     <input name="jurId" type="checkbox" value="601">平台公告
                                    <input name="jurId" type="checkbox" value="602">媒体报道
                                    <input name="jurId" type="checkbox" value="603">轮播列表
                                   
                                    <input name="jurId" type="checkbox" value="604">意见反馈
                                   <input name="jurId" type="checkbox" value="605">站内信
                                 
      
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                        系统统计
                                </td>
                                <td>
                                    <div class="layui-input-block">
                                    <input name="jurId" type="checkbox" value="701">统计报表
                                    <input name="jurId" type="checkbox" value="702">奖励统计
                                    <input name="jurId" type="checkbox" value="703">平台营运数据
                                                   
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label for="desc" class="layui-form-label">
                        描述
                    </label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容" id="desc" name="desc" class="layui-textarea"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
              </div>
            </form>
        </div>
        <script src="./lib/layui/layui.js" charset="utf-8"> </script>
        <script src="./js/x-layui.js" charset="utf-8">  </script>
        <script>
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form()
              ,layer = layui.layer;
             
              //监听提交
              form.on('submit(add)', function(data){
              console.log(data);
                
              //添加
              var name = $("#name").val();
              var alias = $("#alias").val();
              var desc = $("#desc").val();
              
              var tollerlist = new Array();//建立数组
		       	 //取得选中复选框值
		       	 $('input[name="jurId"]:checked').each(function(){
		                var sfruit=$(this).val();//取值
		                tollerlist.push(sfruit)//赋值
		                });
              
              if(tollerlist.length==0)
              { tollerlist.push(0)}
              //alert(tollerlist);
		       	$.ajax({
	    			 async:false,
	    		 	 cache:true,
	    		 	 url:'manager/addRole',
	    		 	 type:'post',
	     		 	data:{
	     		 		"name":name,
	     		 		"alias":alias,
	     		 		"desc":desc,
	     		 		"tollerlist":tollerlist
	     		 	},
	    		 	 success:function(result){
	    		 		
	    		 		layer.msg('添加成功!',{icon:6,time:1000});
	    		 		window.parent.location.reload(); //刷新父页面
  		 	    		 
	    		 	 },
	    		 	 error:function(XMLHttpRequest,textStatus){
	    		 		 alert("错误");
	    		 	 }
	    		 }); 
                
                
                
              /*   //发异步，把数据提交给php
                layer.alert("增加成功", {icon: 6},function () {
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                }); */
                return false;
              });
              
              
            });
        </script>
        
    </body>

</html>