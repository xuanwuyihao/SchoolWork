/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-18 11:57:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");

	request.setCharacterEncoding("UTF-8");

      out.write("\r\n");
      out.write("<title>员工管理</title>\r\n");
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
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#cc\")\r\n");
      out.write("\t\t\t\t.datagrid(\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\turl : \"User_list\",\r\n");
      out.write("\t\t\t\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\t\t\t\tidField : \"id\",\r\n");
      out.write("\t\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\t\tpageSize : 20,\r\n");
      out.write("\t\t\t\t\t\t\tpageList : [ 10, 20, 30, 40 ],\r\n");
      out.write("\t\t\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\t\t\tsortName : \"id\",\r\n");
      out.write("\t\t\t\t\t\t\tsortOrder : \"desc\",\r\n");
      out.write("\t\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"a[name='opera']\").linkbutton({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-edit'\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"a[name='oo']\").linkbutton({\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ticonCls : 'icon-remove'\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"ck\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcheckbox : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"选择\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"u_id\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"编号\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"u_name\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"角色名称\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"u_seq\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"排序号\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"u_description\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"描述\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 170,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : \"u_state\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : \"状态\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : delectId,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : $(this).width() * 0.1,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(value, row, index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar str = '<a href=\"#\" onclick=\"editUser('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')\" name=\"opera\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar ss = '<a href=\"#\" onclick=\"delect('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')\"name=\"oo\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\treturn str + ss;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t] ],\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction doRow() {\r\n");
      out.write("\t\talert(\"ttt\");\r\n");
      out.write("\t\tvar row = $('#cc').datagrid('getSelected');\r\n");
      out.write("\t\tif (row) {\r\n");
      out.write("\t\t\talert('ID:' + row.a_id + \" 学校名称:\" + row.u_name);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/*-------------------------------------------------------------------------------*/\r\n");
      out.write("\tfunction delectId(val, row, index) {\r\n");
      out.write("\t\treturn '&nbsp;&nbsp;<a href=\"#\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:\"icon-remove\"\" onclick=\"editUser('\r\n");
      out.write("\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t+ ')\">编辑</a>'\r\n");
      out.write("\t\t\t\t+ '&nbsp;&nbsp;<a href=\"#\" onclick=\"delect('\r\n");
      out.write("\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t+ ')\">删除</a>';\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction editUser(index) { //修改方法\r\n");
      out.write("\t\t$('#cc').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#cc').datagrid('getSelected');\r\n");
      out.write("\t\t$('#u_name').val(row.u_name);\r\n");
      out.write("\t\t$('#u_seq').val(row.u_seq);\r\n");
      out.write("\t\t$('#u_description').val(row.u_description);\r\n");
      out.write("\t\t$('#u_state').val(row.u_state);\r\n");
      out.write("\t\t$('#u_id').val(row.u_id);\r\n");
      out.write("\r\n");
      out.write("\t\t$('#dlg').dialog('open')\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction delect(index) { //删除方法\r\n");
      out.write("\t\t$('#cc').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#cc').datagrid('getSelected');\r\n");
      out.write("\t\talert('确认删除该角色信息?');\r\n");
      out.write("\t\tvar u_id = row.u_id;\r\n");
      out.write("\t\twindow.location.href = \"Delete_user.action?u_id=\" + u_id;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/*--------------------------点击按钮取值--------------------------------*/\r\n");
      out.write("\tfunction getSelected() {\r\n");
      out.write("\t\tvar row = $('#cc').datagrid('getSelected');\r\n");
      out.write("\t\tif (row) {\r\n");
      out.write("\t\t\talert('ID:' + row.a_id + \" 角色名称:\" + row.u_name);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getSelections() {\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tvar rows = $('#cc').datagrid('getSelections');\r\n");
      out.write("\t\tfor (var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t\t\tids.push(rows[i].itemid);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\talert(ids.join('\\n'));\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* --------新增----------------------------------------------------------------------- */\r\n");
      out.write("\tfunction Add() {\r\n");
      out.write("\t\t$('#add_dlg').dialog('open') //打开添加窗口\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<input type=\"button\" value=\"ss\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("<div id=\"center\"\r\n");
      out.write("\t\tdata-options=\"region:'center' ,title:'角色信息：',split:true\"\r\n");
      out.write("\t\tstyle=\"padding: 5px; background: #eee\">\r\n");
      out.write("\t\t<div class=\"easyui-layout\" data-options=\"fit:true\">\r\n");
      out.write("\t\t\t<div data-options=\"region:'north',title:'表格信息' \" style=\"height: 60px\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\tdata-options=\"plain:true,iconCls:'icon-add'\" onclick=\"Add()\">新增</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-options=\"region:'center',title:'南方：' \"\r\n");
      out.write("\t\t\t\tstyle=\"height: 550px, width:300px\">\r\n");
      out.write("\t\t\t\t<div class=\"easyui-tabs\" fit=\"true\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 550px, width:300px\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<table id=\"cc\" class=\"easyui-datagrid\" pagination=\"true\" width=\"65%\" height=\"100%\"></table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dlg\" class=\"easyui-dialog\" title=\"修改\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 300px; max-width: 300px; padding: 2px; display: none;\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'保存',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#dlg').dialog('close')  //关闭修改窗口\r\n");
      out.write("\t\t\t\t\t\talert('修改成功!');\r\n");
      out.write("\t\t\t\t\t\tdocument.edit_form.submit();   //提交修改form表单\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#dlg').dialog('close')  //关闭修改窗口\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form name=\"edit_form\" action=\"Edit_user\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">角色名称：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"u_name\" name=\"user.u_name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">排序号：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"u_seq\" name=\"user.u_seq\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">状态：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"u_state\" name=\"user.u_state\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">描述：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" id=\"u_description\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"user.u_description\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<!-- 隐藏域保存ID主键 -->\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"hidden\" id=\"u_id\" name=\"user.u_id\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- -----添加窗口----------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"add_dlg\" class=\"easyui-dialog\" title=\"添加院校\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 300px; max-width: 300px; padding: 2px; display: none;\"\r\n");
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
      out.write("\t\t\t\t\t\t$('#add_dlg').dialog('close')  //关闭添加窗口\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form name=\"add_form\" action=\"Save_user\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">角色名称：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"user.u_name\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">排序：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"user.u_seq\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">状态：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"user.u_state\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"la\">描述：</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"user.u_description\" class=\"ct\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
