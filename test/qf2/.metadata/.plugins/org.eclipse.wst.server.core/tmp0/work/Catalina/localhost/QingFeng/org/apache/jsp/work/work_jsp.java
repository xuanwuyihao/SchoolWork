/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-21 11:20:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.work;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.qf.model.Employee;

public final class work_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.15.1.jar", Long.valueOf(1505974453894L));
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\r\n");
      out.write("<title>工作助手</title>\r\n");
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("label{\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tmargin-left: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tfont-size:25px;\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tletter-spacing:5px;\r\n");
      out.write("\tfont-weight:600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".la{\r\n");
      out.write("\t/* padding:0;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tfont-size:25px;\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tletter-spacing:5px;\r\n");
      out.write("\tfont-weight:600; */\r\n");
      out.write("\twidth: 180px;\r\n");
      out.write("\tmargin-top: 3px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding: 3px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".las{\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\t/* letter-spacing:5px;\r\n");
      out.write("\tfont-weight:600; */ \r\n");
      out.write("\t/* width: 180px;\r\n");
      out.write("\tmargin-top: 3px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding: 3px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ct{\r\n");
      out.write("\twidth:350px;\r\n");
      out.write("\theight:28px;\r\n");
      out.write("\tfont-size:24px;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tbackground:rgba(255,255,255,0.5); \r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bu{\r\n");
      out.write("\tborder-radius: 6px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground: rgba(26, 228, 108, 0.52);\r\n");
      out.write("\tborder: 0 solid;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("}\r\n");
      out.write(".bu:hover {\r\n");
      out.write("\t\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cz{\r\n");
      out.write("\twidth: 75%; \r\n");
      out.write("\theight: 130px; \r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tfont-family:'楷体'; \r\n");
      out.write("\tborder-radius: 5px; \r\n");
      out.write("\tborder: 0.2; \r\n");
      out.write("\tcolor: red; \r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, .05);\r\n");
      out.write("\tfont:'楷体';\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("\tright:2%;\r\n");
      out.write("\ttop:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*下拉框*/\r\n");
      out.write(".xl {\r\n");
      out.write("\tborder: 1;\r\n");
      out.write("\tborder-color: #233;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: samller;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".xl:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
 Employee emp = (Employee)session.getAttribute("employee"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#tt\").datagrid({\r\n");
      out.write("\t\t\turl : 'Work_list',\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tidField : \"s_id\",\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\tpageList : [ 10, 20, 30, 40 ],\r\n");
      out.write("\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\tsortName : \"s_id\",\r\n");
      out.write("\t\t\ttoolbar : \"#toolbar\",\r\n");
      out.write("\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\theight:500,\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"a[name='opera']\").linkbutton({\r\n");
      out.write("\t\t\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-edit'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\"a[name='oo']\").linkbutton({\r\n");
      out.write("\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\tplain : true,\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-remove'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$(\".tip\").tooltip({  \r\n");
      out.write("                    onShow: function(){  \r\n");
      out.write("                        $(this).tooltip('tip').css({   \r\n");
      out.write("                            width:auto,  \r\n");
      out.write("                            boxShadow: '1px 1px 3px #292929',\r\n");
      out.write("                        });\r\n");
      out.write("                        \r\n");
      out.write("                    },\r\n");
      out.write("    \t\t\t\tonPosition: function(){\r\n");
      out.write("    \t\t\t\t\t$(this).tooltip('tip').css('left', $(this).offset().left);\r\n");
      out.write("    \t\t\t\t\t$(this).tooltip('arrow').css('left', 20);\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("                });\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'work_id',\r\n");
      out.write("\t\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\t\twidth : 50,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\thidden : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'founder',\r\n");
      out.write("\t\t\t\t\ttitle : '创建者',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'plan_title',\r\n");
      out.write("\t\t\t\t\ttitle : '标题',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'plan_content',\r\n");
      out.write("\t\t\t\t\ttitle : '工作内容',\r\n");
      out.write("\t\t\t\t\twidth : 350,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'emp_name',\r\n");
      out.write("\t\t\t\t\ttitle : '负责人',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'create_time',\r\n");
      out.write("\t\t\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'end_time',\r\n");
      out.write("\t\t\t\t\ttitle : '完成时间',\r\n");
      out.write("\t\t\t\t\twidth : 120,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'work_state',\r\n");
      out.write("\t\t\t\t\ttitle : '完成状态',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter:function(value,row){  \r\n");
      out.write("\t\t\t        \tvar content = '<li title=\"' + value + '\" class=\"tip\" data-html=\"true\" style=\"list-style:none;nowrap : false\">' +value + '</li>';  \r\n");
      out.write("\t\t\t        \t\treturn content;  \r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\twidth : 200,\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tformatter : function(value, row,index) {\r\n");
      out.write("\t\t\t\t\t\tvar str = '<a href=\"#\" name=\"opera\" onclick=\"editUserss('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ ')\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\tvar ss = '<a href=\"#\" name=\"oo\" onclick=\"editUser('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ index\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ ')\" class=\"easyui-linkbutton\" ></a>';\r\n");
      out.write("\t\t\t\t\t\treturn str + ss;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}, ] ]\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t//添加窗口打开\r\n");
      out.write("\t\t$(\"#add\").click(function() {\r\n");
      out.write("\t\t//\talert('bbbbbbbbbb');\r\n");
      out.write("\t\t\t$('#emp_name2').val('admin');\r\n");
      out.write("\t\t\t$('#add_tab').window('open');\r\n");
      out.write("\t\t\t//$('#dd').dialog('refresh', 'new_content.php');\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*=================================================================================*/\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction wsjl() {\r\n");
      out.write("\t\t$('#dd').dialog({\r\n");
      out.write("\t\t\ttitle : '缴费记录填写',\r\n");
      out.write("\t\t\twidth : 350,\r\n");
      out.write("\t\t\theight : 300,\r\n");
      out.write("\t\t\tclosed : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\t//href: 'get_content.php',\r\n");
      out.write("\t\t\tmodal : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction editUser(index) { //删除\r\n");
      out.write("\r\n");
      out.write("\t\t$('#tt').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\t\tif(confirm(\"确认删除该项工作提醒？\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\twindow.location.href = \"Work_delete.action?work_id=\" + row.work_id;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction editUserss(index) { //修改\r\n");
      out.write("\r\n");
      out.write("\t\t$('#tt').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\t\t$(\"#emp_name\").val(row.emp_name);\r\n");
      out.write("\t\t$(\"#plan_title\").val(row.plan_title);\r\n");
      out.write("\t\t$(\"#plan_content\").val(row.plan_content);\r\n");
      out.write("\t\t$(\"#work_state\").val(row.work_state);\r\n");
      out.write("\t\t$(\"#work_id\").val(row.work_id);\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#upd_dlg').window('open');\r\n");
      out.write("\t\t//window.location.href=\"notice2.jsp?n_content=\"+row.n_content;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ttion() {\r\n");
      out.write("\r\n");
      out.write("\t\t//alert(\"QQQQQQQQQ\");\r\n");
      out.write("\t\tdocument.getElementById(\"alers\").submit();\r\n");
      out.write("\t\t//alert(\"oooooo\");\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t////////////////////////////////////////////////////////////////////////////////////////\r\n");
      out.write("\tfunction xzyg(){\r\n");
      out.write("\t\t$(\"#tt2\")\r\n");
      out.write("\t\t.datagrid(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\turl : \"Employee_list\",\r\n");
      out.write("\t\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\t\tidField : \"id\",\r\n");
      out.write("\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\tpageSize : 20,\r\n");
      out.write("\t\t\t\t\tpageList : [ 10, 20, 30, 40 ],\r\n");
      out.write("\t\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\t\tsortName : \"id\",\r\n");
      out.write("\t\t\t\t\tsortOrder : \"desc\",\r\n");
      out.write("\t\t\t\t\tsingleSelect: true,    //只选中一条数据\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"emp_id\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"编号\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 30,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"emp_name\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"姓名\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"dep_name\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"所属部门\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"user_name\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"角色\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"user_description\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"用户类型\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 70,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tfield : \"emp_state\",\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : \"状态\",\r\n");
      out.write("\t\t\t\t\t\t\t\twidth : 50,\r\n");
      out.write("\t\t\t\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tformatter : function(value, row, index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif (value == 1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '正常';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '停用';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t] ],\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#dd2').dialog({\r\n");
      out.write("\t\t\ttitle : '请选择添加缴费记录的学生',\r\n");
      out.write("\t\t\twidth : 700,\r\n");
      out.write("\t\t\theight : 500,\r\n");
      out.write("\t\t\tclosed : false,\r\n");
      out.write("\t\t\tcache : false,\r\n");
      out.write("\t\t\t//  href: 'get_content.php',\r\n");
      out.write("\t\t\tmodal : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ================================================================================================== -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dd2\" style=\"display: none\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'确认选择',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\tvar row = $('#tt2').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$('#emp_name').val(row.emp_name);\r\n");
      out.write("\t\t\t\t\t\t$('#emp_name2').val(row.emp_name);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$('#dd2').dialog('close')  //关闭选择学生窗口窗口\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t$('#emp_name2').val('admin');\r\n");
      out.write("\t\t\t\t\t\t$('#dd2').dialog('close');  //关闭添加窗口\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\">\r\n");
      out.write("\t\t<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t\t\t<table id=\"tt2\" class=\"easyui-datagrid\" iconCls=\"icon-ok\"\r\n");
      out.write("\t\t\t\tpagination=\"true\" style=\"title: poiu\"></table>\r\n");
      out.write("\t\t\t<!-- </table> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"easyui-tabs\" fit=\"true\">\r\n");
      out.write("\t\t<!-- <div style=\"display:none\"> -->\r\n");
      out.write("\t\t<!-- <table id=\"tt\" class=\"easyui-datagrid\"> -->\r\n");
      out.write("\t\t<table id=\"tt\" class=\"easyui-datagrid\" iconCls=\"icon-save\"\r\n");
      out.write("\t\t\tpagination=\"true\"></table>\r\n");
      out.write("\t\t<!-- </table> -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"#\" id=\"add\" class=\"easyui-linkbutton\" iconCls=\"icon-wj\"\r\n");
      out.write("\t\t\tplain=\"true\"\">\r\n");
      out.write("\t\t\t<label>添加工作项</label>\r\n");
      out.write("\t\t</a> \r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-scnr\" plain=\"true\" onclick=\"editUser()\">\r\n");
      out.write("\t\t\t<label>删除工作项</label>\r\n");
      out.write("\t\t</a> \r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-wjxg\" plain=\"true\"\r\n");
      out.write("\t\t\tonclick=\"destroyUser()\">\r\n");
      out.write("\t\t\t<label>Remove User</label>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======================================================================================================= -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- -----修改窗口----------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"upd_dlg\" class=\"easyui-dialog\" title=\"编辑工作\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 480px; max-width: 800px; padding: 2px; display: none;\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'保存',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t//\talert('修改成功！');\r\n");
      out.write("\t\t\t\t\t\tdocument.upd_form.submit();   //提交添加form表单\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#upd_dlg').dialog('close')  //关闭修改窗口\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form name=\"upd_form\" action=\"Work_update\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<h1>编辑工作</h1>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">负责人：</label>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"ct\" id=\"emp_name\" name=\"work_assistant.emp_name\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"xzyg()\" value=\"选择职员\" class=\"bu\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">标题：</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"plan_title\" name=\"work_assistant.plan_title\" class=\"ct\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">计划时间");
      out.print(emp.getEmp_name() );
      out.write("：</label>\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-datetimebox\" name=\"birthday\" style=\"width:250px;height:35px;font-size:30px;\"\r\n");
      out.write("   \t\t\t\t\t data-options=\"required:true,showSeconds:false\" value=\"18/9/2017 9:3\" >\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">状态：</label>\r\n");
      out.write("\t\t\t\t\t<select id=\"work_state\" name=\"work_assistant.work_state\" class=\"xl\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"未完成\">未完成</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"已完成\">已完成</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"work_id\" name=\"work_assistant.work_id\"/>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"las\">内容：</label>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<textarea rows=\"5\" cols=\"40\" class=\"cz\" id=\"plan_content\" name=\"work_assistant.plan_content\"></textarea>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- -----添加窗口----------------------------------------------------------------------------------------- -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"add_tab\" class=\"easyui-dialog\" title=\"添加工作助手\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 480px; max-width: 800px; padding: 2px; display: none;\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'保存',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t//alert('添加成功！');\r\n");
      out.write("\t\t\t\t\t\tdocument.add_form.submit();   //提交添加form表单\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#add_tab').dialog('close')  //关闭修改窗口\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<form name=\"add_form\" action=\"Work_save\">\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<p><h1>添加工作助手</h1></p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">负责人：</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"emp_name2\" class=\"ct\" value=\"admin\" name=\"work_assistant.emp_name\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"xzyg()\" value=\"选择职员\" class=\"bu\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">标题：</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"work_assistant.plan_title\" class=\"ct\" />\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">计划时间");
      out.print(emp.getEmp_name() );
      out.write("：</label>\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-datetimebox\" name=\"birthday\"\r\n");
      out.write("   \t\t\t\t\t data-options=\"required:true,showSeconds:false\" value=\"18/9/2017 9:3\" style=\"width:250px;height:35px;font-size:30px;\">\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"la\">状态：</label>\r\n");
      out.write("\t\t\t\t\t<select id=\"work_state\" name=\"work_assistant.work_state\" class=\"xl\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"未完成\">未完成</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"已完成\">已完成</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<label class=\"las\">内容：</label>\r\n");
      out.write("\t\t\t\t\t<textarea rows=\"5\" cols=\"40\" class=\"cz\" name=\"work_assistant.plan_content\"></textarea>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"work_assistant.founder\" value=\"");
      out.print(emp.getEmp_name() );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t</p>\r\n");
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