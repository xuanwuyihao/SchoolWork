/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-18 12:01:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.qf.model.Employee;

public final class ckStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.15.1.jar", Long.valueOf(1505734853447L));
    _jspx_dependants.put("jar:file:/E:/test/qf2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/QingFeng/WEB-INF/lib/struts2-core-2.3.15.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1373806914000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.qf.model.Employee");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<title>成考学生报名管理</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../js/jquery-easyui-1.5.2/jquery.min.js\"></script>\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../js/jquery-easyui-1.5.2/themes/gray/easyui.css\" />\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../js/jquery-easyui-1.5.2/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../js/jquery-easyui-1.5.2/jquery.easyui.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#tt\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.datagrid(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : 'Ckstudent',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tidField : \"s_id\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tpageList : [ 10, 20, 30, 40 ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsortName : \"s_id\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttoolbar : \"#toolbar\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"a[name='opera']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.linkbutton(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-edit'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"a[name='oo']\").linkbutton({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-remove'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'pay_id',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '学号',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 50,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\thidden : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'stu_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '姓名',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'emp_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '合作人',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'cardid',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '身份证号码',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'phone',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '手机号码',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'aca_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '报考院校',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'maj_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '专业',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 's_gradations',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '报考层次',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 's_systme',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '学制',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'date',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '报名时间',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 200,\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tformatter : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue, row,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar str = '<a href=\"#\" name=\"opera\" onclick=\"editUserss('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar ss = '<a href=\"#\" name=\"oo\" onclick=\"editUser('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn str + ss;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}, ] ]\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t//添加窗口打开\r\n");
      out.write("\t\t$(\"#add\").click(function() {\r\n");
      out.write("\t\t\talert('bbbbbbbbbb');\r\n");
      out.write("\t\t\t$('#add_dlg').window('open');\r\n");
      out.write("\t\t\t//$('#dd').dialog('refresh', 'new_content.php');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*=================================================================================*/\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar sel2 = document.getElementById(\"academy\");\r\n");
      out.write("\t\tvar opt2 = document.createElement(\"option\");\r\n");
      out.write("\t\topt2.text = '选择院校';\r\n");
      out.write("\t\topt2.value = 0;\r\n");
      out.write("\t\tsel2.appendChild(opt2);\r\n");
      out.write("\r\n");
      out.write("\t\tvar sel = document.getElementById(\"major\");\r\n");
      out.write("\t\tvar opt = document.createElement(\"option\");\r\n");
      out.write("\t\topt.text = '选择专业';\r\n");
      out.write("\t\topt.value = 0;\r\n");
      out.write("\t\tsel.appendChild(opt);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t\t\tcache : true,\r\n");
      out.write("\t\t\turl : 'GetAcademy_list.action',\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t'id' : 25,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$.each(data, function(index, content) {\r\n");
      out.write("\t\t\t\t\t// alert(\"角色名称：\" + content.u_name + \" ，ID： \" + content.u_id)\r\n");
      out.write("\t\t\t\t\tvar sel2 = document.getElementById(\"academy\");\r\n");
      out.write("\t\t\t\t\tvar opt2 = document.createElement(\"option\");\r\n");
      out.write("\t\t\t\t\topt2.text = content.a_school;\r\n");
      out.write("\t\t\t\t\topt2.value = content.a_id;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tsel2.appendChild(opt2);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(XMLHttpRequest, textStatus) {\r\n");
      out.write("\t\t\t\talert(\"系统繁忙,请稍候再试!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tcache:true,\r\n");
      out.write("\t\t\tasync:true,\r\n");
      out.write("\t\t\turl:'Zhikao_UserAndList',\r\n");
      out.write("\t\t\ttype:'post',\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t \t\t\t $.each( data, function(index, content)\r\n");
      out.write("\t\t\t\t {  \r\n");
      out.write("\t\t\t\t  $(\"#empt\").append(\"<option value='\" + content.emp_id + \"'>\" + content.emp_name + \"</option>\");\r\n");
      out.write("\t\t\t\t });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},error:function(){\r\n");
      out.write("\t\t\t\talert('服务繁忙！');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t/* --------新增----------------------------------------------------------------------- */\r\n");
      out.write("\tfunction Add() {\r\n");
      out.write("\t\t$('#add_dlg').dialog('open') //打开添加窗口\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction getMajor(value) { //根据院校获取专业\r\n");
      out.write("\t\tvar majsel = document.getElementById(\"major\");\r\n");
      out.write("\t\tvar children = majsel.children; //获取select列表的所有子元素。\r\n");
      out.write("\t\tfor (var i = 0, len = children.length; i < len; i++) {\r\n");
      out.write("\t\t\tmajsel.removeChild(children[0]); //循环删除所有子元素\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (value == 0) {\r\n");
      out.write("\t\t\tvar sel = document.getElementById(\"major\");\r\n");
      out.write("\t\t\tvar opt = document.createElement(\"option\");\r\n");
      out.write("\t\t\topt.text = '选择专业';\r\n");
      out.write("\t\t\topt.value = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t\tsel.appendChild(opt);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t\t\tcache : true,\r\n");
      out.write("\t\t\turl : 'GetMajor_list.action',\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t'a_id' : value,\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$.each(data, function(index, content) {\r\n");
      out.write("\t\t\t\t\tvar sel = document.getElementById(\"major\");\r\n");
      out.write("\t\t\t\t\tvar opt = document.createElement(\"option\");\r\n");
      out.write("\t\t\t\t\topt.text = content.maj_name;\r\n");
      out.write("\t\t\t\t\topt.value = content.maj_id;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tsel.appendChild(opt);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(XMLHttpRequest, textStatus) {\r\n");
      out.write("\t\t\t\talert(\"系统繁忙,请稍候再试!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t\t<!-- <div style=\"display:none\"> -->\r\n");
      out.write("\t\t<!-- <table id=\"tt\" class=\"easyui-datagrid\"> -->\r\n");
      out.write("\t\t<table id=\"tt\" class=\"easyui-datagrid\" iconCls=\"icon-save\"\r\n");
      out.write("\t\t\tpagination=\"true\"></table>\r\n");
      out.write("\t\t<!-- </table> -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"#\" id=\"add\" class=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
      out.write("\t\t\tplain=\"true\"\">添加</a> <a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-edit\" plain=\"true\" onclick=\"Add()\">Edit User</a> <a\r\n");
      out.write("\t\t\thref=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\"\r\n");
      out.write("\t\t\tonclick=\"destroyUser()\">Remove User</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 添加学生--------------------------------------------------------------------------------------- -->\r\n");
      out.write("\t<div id=\"add_dlg\" class=\"easyui-dialog\" title=\"添加学生\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 300px; max-width: 400px; padding: 2px; display: none;\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'添加',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\talert('修改成功！');\r\n");
      out.write("\t\t\t\t\t\tdocument.add_form.submit();   //提交添加form表单\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#add_dlg').dialog('close');  //关闭添加窗口\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form name=\"add_form\" action=\"Save_ck\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td ><label class=\"la\">姓名：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"student.s_name\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td ><label class=\"la\">身份证：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"student.id_number\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">联系电话：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"student.s_phone\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">推荐老师：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select  name=\"student.emp_id\" id=\"empt\">\r\n");
      out.write("\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">报考类型：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td ><select class=\"xl\" name=\"student.s_gradations\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" title=\"\">--请选择--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"高升专\">高升专</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"专升本\">专升本</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"直达本\">直达本</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select><br /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"t\">院校/专业：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"academy\" name=\"student.academy_id\"\r\n");
      out.write("\t\t\t\t\t\t\tonchange=\"getMajor(value)\"></select> <select id=\"major\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"student.maj_id\"></select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr><td><label class=\"la\">报名时间：</label></td>\r\n");
      out.write("\t\t\t\t\t<td><input class=\"easyui-datetimebox\" name=\"student.s_date\"\r\n");
      out.write("   \t\t\t\t\t data-options=\"required:true,showSeconds:false\" value=\"3/4/2010 2:3\" style=\"width:150px\"></td></tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
