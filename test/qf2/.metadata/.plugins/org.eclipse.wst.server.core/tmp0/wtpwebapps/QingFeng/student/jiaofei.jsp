<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 缴费查询</title>
<link rel="icon" href="images/logo/logo2.ico" />
<style type="text/css">
table,table tr th, table tr td { border:1px solid #0094ff; }
table {
	
	border-collapse: collapse;
	margin:1px auto;
	font-size:20px;
	font-family:'楷体';
	width:85%;
	text-align:center;
}
tr {
	height:53px;
}
tr:nth-of-type(odd) {
	background-color:#FFF;
}
tr:nth-of-type(even) {
	background-color:#FFF;
}
tr:hover {
	color:#F30;
	background-color:#fff;
}
tr:hover td:nth-child(1){
	background:url(images/tr-hover-bg.png) no-repeat 3px 8px;
}
th {
	border-bottom:1px solid #FFF;
	border-top:1px solid #FFF;
	color:#333;
	background-color:#C3F6F6;
}
td {
	border-bottom:1px solid #FFF;
	height:65px;
}
/*定义列的宽度*/
[id^="Student"] {
	width:100px;
}
[id="StudentAddress"] {
	width:90px;
}
[id="StudentName"],[id="StudentSex"] {
	width:60px;
}
[id="StuAddress"] {
	text-align:center;
	text-indent:3px;
	
}
[id="SenSanName"] {
	width:60px;
}
[id="BeanGouLex"] {
	width:120px;
}
[id="BeanGouNa"] {
	width:120px;
}
[id="BeanBirthday"] {
	width:90px;
}
[id="SetUp"] {
	width:120px;
}
.dc{
	width:250px;
	
}
[id="ld"] {
	
	text-indent:3px;
	font:"楷体";
	font-size:25px;
	background: rgba(122, 243, 234, 0.27) no-repeat;
	border-radius: 5px;
	border: 0.5px solid gray;
	letter-spacing:3px;
	
}
#ld:hover{
	/* letter-spacing:0px; */
	border: 0.5px solid red;
	color:red;
	background-color:rgba(255,255,255,0.5);
	
}

</style>
</head>
<body>
	
	<div style="position: relative;height:50px;width:100%;font-size:24px;float:left;left:10%;margin-bottom:10px;">
		<label><img src="images/sx.png" style="width:45px;height:35px"></label>
		<label><img src="images/tx.png" style="width:45px;height:35px"></label>
	</div>
	<div id="tab">
	
	<% int a=1; %>
	<table id="tabs">
		<tr><th colspan="13" style="bgcolor:#ffcc33"><font size="5" color="#ffcc33"> 成 考 缴 费 记 录 表</font></th></tr>
		<tr>
			 <th>姓名</th>
                    <th>- 学号 -</th>
                    <th>- 学校 -</th>
                    <th>- 专业 -</th>
                    <th>- 类型 -</th>
                    <th>- 学制 -</th>
                    <th>本次缴费</th>
                    <th>缴费方式</th>
                    <th>缴费时间</th>
                    <th>累计缴费</th>
                    <th>剩余学费</th>
                    <th>说明</th>
                    <th>打印</th>
			
		</tr>
		  <s:iterator value="payment2s">
		  	<%a=a+1; %>
                    		<tr id="aas<%=a %>" onclick="alert(this.id)">
                    			<td><s:property value="stu_name" /></td>
		                        <td><font color="#ffcc33"><s:property value="pay_id" /></font></td>
		                        <td><s:property value="aca_name" /></td>
		                        <td><font color="#ffcc33"><s:property value="maj_name" /></font></td>
		                        <td><s:property value="s_type" /></td>
		                        <td><font color="#ffcc33"><s:property value="s_gradations" /></font></td>
		                        <td><s:property value="practical_money" />元</td>
		                      	<td><font color="#ffcc33"><s:property value="f_way" /></font></td>
		                      	<td><s:property value="date" /></td>
		                      	<td><font color="#ffcc33"><s:property value="f_accumulative" />元</font></td>
		                      	<td><s:property value="need_money" />元</td>
		                      	<td><font color="#ffcc33"><s:property value="pay_state" /></font></td>
		                      	<td><button id="ld" onclick="printpage(<%=a%>)"><font size="3">打印</font></button></td>
                    		</tr>
                    		
		 </s:iterator>

			 

		 <tr style="height:30px"></tr>
		  <tr>
                        <td><font color="#ff6600"><s:property value="stu_name" />汇总</td>
                        
                          <td colspan="3"><font color="#ff6600"><div id="qq">学费总额：${finance[0].practical_money}</div></font></td>
                      
                        <td colspan="3"><font color="#ff6600">累计缴费：${finance[0].f_accumulative} </font></td>
                       
                        <td colspan="3"><font color="#ff6600">剩余学费：${finance[0].need_monuy}</font></td>
                      	
                      	<td colspan="3"><font color="#ff6600">缴费状态：${finance[0].f_state}</font></td>
                   </tr>
	</table>
	</div>
	
	<br/>
	<div style="position: relative;float:left;left:8%;width:100%;margin-top:10px;">
		&nbsp;&nbsp;<button id="ld" onclick="printtable()">全部导出</button>
	</div>
	
	<script type="text/javascript">
	//打印单条数据
	function printpage(id){ 
		
		var a=document.getElementById('tabs').rows[0].innerHTML;
		var b=document.getElementById('tabs').rows[1].innerHTML;
		var c=document.getElementById('tabs').rows[id].innerHTML;
		var n = "<table><tr>"+a+"</tr><tr>"+b+"</tr><tr>"+c+"</tr><table>";
		
		var pagedata = window.document.body.innerHTML;  //先将原来的网页面数据保存给变量pagedata
		window.document.body.innerHTML = n;      //将div局部数据赋值给整个窗口的body；
	    window.print();        //打印这个相当于body里面只有一个div数据的页面
	    window.document.body.innerHTML  = pagedata;   //将原先的页面数据还给页面
	}

	//打印整个表格
	function printtable(){ 
		
		var printData = document.getElementById("tab").innerHTML;//获得要打印的 div 里的所有 html 数据
		var pagedata = window.document.body.innerHTML;  //先将原来的网页面数据保存给变量pagedata
		window.document.body.innerHTML = printData;      //将div局部数据赋值给整个窗口的body；
	    window.print();        //打印这个相当于body里面只有一个div数据的页面
	    window.document.body.innerHTML  = pagedata;   //将原先的页面数据还给页面
	}
	
	</script>
	
</body>
</html>