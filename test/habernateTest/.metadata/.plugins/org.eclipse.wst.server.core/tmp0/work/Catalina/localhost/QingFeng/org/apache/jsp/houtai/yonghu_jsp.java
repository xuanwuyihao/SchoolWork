/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-08-25 01:34:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.houtai;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yonghu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>用户管理</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../script/jquery-easyui-1.5.2/jquery.min.js\"></script>\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../script/jquery-easyui-1.5.2/themes/gray/easyui.css\" />\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"../script/jquery-easyui-1.5.2/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../script/jquery-easyui-1.5.2/jquery.easyui.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"../script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tmargin:30px auto;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\t\r\n");
      out.write("\tcolor:#666;\r\n");
      out.write("}\r\n");
      out.write("h1 {\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tfont-size:25px;\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tletter-spacing:5px;\r\n");
      out.write("\tfont-weight:600;\r\n");
      out.write("}\r\n");
      out.write(".table {\r\n");
      out.write("\tmargin:0px auto;\r\n");
      out.write("\tborder-collapse:collapse;\r\n");
      out.write("\tfont-size:13px;\r\n");
      out.write("}\r\n");
      out.write(".tr {\r\n");
      out.write("\theight:50px;\r\n");
      out.write("}\r\n");
      out.write(".tr:nth-of-type(odd) {\r\n");
      out.write("\tbackground-color:#FFF;\r\n");
      out.write("}\r\n");
      out.write(".tr:nth-of-type(even) {\r\n");
      out.write("\tbackground-color:#F2F2F2;\r\n");
      out.write("}\r\n");
      out.write(".tr:hover {\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tbackground-color:#EFFEED;\r\n");
      out.write("}\r\n");
      out.write(".tr:hover .td:nth-child(1){\r\n");
      out.write("\tbackground:url(images/tr-hover-bg.png) no-repeat 3px 8px;\r\n");
      out.write("}\r\n");
      out.write(".th {\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("\tborder-top:1px solid #CCC;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tbackground-color:#F8F4DA;\r\n");
      out.write("}\r\n");
      out.write(".td {\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("}\r\n");
      out.write("/*定义列的宽度*/\r\n");
      out.write("[id^=\"Im\"] {\r\n");
      out.write("\twidth:50px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"ImTx\"] {\r\n");
      out.write("\twidth:310px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"Gxw\"] {\r\n");
      out.write("\twidth:110px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"Xtt\"] {\r\n");
      out.write("\twidth:120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("[id=\"SetUp\"] {\r\n");
      out.write("\twidth:120px;\r\n");
      out.write("}\r\n");
      out.write(".dc{\r\n");
      out.write("\twidth:250px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("[id=\"ld\"] {\r\n");
      out.write("\ttext-indent:3px;\r\n");
      out.write("\tfont:\"楷体\";\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("\tbackground: rgba(255,255,255,0.1) no-repeat;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid gray;\r\n");
      out.write("\tletter-spacing:3px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("#ld:hover{\r\n");
      out.write("\tletter-spacing:2px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("\tbackground-color:rgba(255,255,255,0.5);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".la{\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tmargin:10px;\r\n");
      out.write("\tfont-size:25px;\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tletter-spacing:5px;\r\n");
      out.write("\tfont-weight:600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ths{\r\n");
      out.write("\twidth:35px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("\tborder-top:1px solid #CCC;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tbackground-color:rgba(255,255,255,0.2);\r\n");
      out.write("\tborder:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ct{\r\n");
      out.write("\twidth:350px;\r\n");
      out.write("\theight:28px;\r\n");
      out.write("\tfont-size:24px;\r\n");
      out.write("\tfont-family:'楷体';\r\n");
      out.write("\tbackground:rgba(255,255,255,0.5); \r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.2; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cz{\r\n");
      out.write("\twidth: 95%; \r\n");
      out.write("\theight: 230px; \r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tfont-family:'楷体'; \r\n");
      out.write("\tborder-radius: 5px; \r\n");
      out.write("\tborder: 0.2; \r\n");
      out.write("\tcolor: red; \r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, .05);\r\n");
      out.write("\tfont:'楷体';\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bu{\r\n");
      out.write("\twidth: 150px; \r\n");
      out.write("\theight: 30px; \r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tfont-family:'楷体'; \r\n");
      out.write("\tborder-radius: 5px; \r\n");
      out.write("\tborder: 0; \r\n");
      out.write("\tcolor: red; \r\n");
      out.write("\tbackground-color: rgba(0, 0, 0, 0.05);\r\n");
      out.write("\tbottom:0px;\r\n");
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
      out.write("\tfont-size: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".xl:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*文本框*/\r\n");
      out.write("\r\n");
      out.write(".te {\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\theight: 25px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*特殊TH*/\r\n");
      out.write("\r\n");
      out.write(".the{\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tbottom:15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thx{\r\n");
      out.write("\twidth:355px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("\tborder-top:1px solid #CCC;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tbackground-color:rgba(255,255,255,0.2);\r\n");
      out.write("\tborder:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#xg1\").click(function(){\r\n");
      out.write("\t\t\tt.value = $(\"#yh1\").text();\r\n");
      out.write("\t\t\tz.value = $(\"#yh2\").text();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"dlg\" class=\"easyui-dialog\" title=\"修改\"\r\n");
      out.write("\t\tstyle=\"width: 80%; height: 400px; max-width: 800px; padding: 2px; display: none;\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'确定',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-ok',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\talert('ok');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\talert('cancel');;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t\">\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<label class=\"la\">标题：</label><input type=\"text\" id=\"t\" class=\"ct\" />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<label class=\"la\">内容：</label><input type=\"text\" id=\"z\" class=\"ct\" />\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>用户管理</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr class=\"tr\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<th>\r\n");
      out.write("\t\t\t \t<label>学号</label>\r\n");
      out.write("\t\t\t \t<input type=\"text\" class=\"te\">\r\n");
      out.write("\t\t\t </th>\r\n");
      out.write("\t\t\t <th>\r\n");
      out.write("\t\t\t \t<label>姓名</label>\r\n");
      out.write("\t\t\t \t<input type=\"text\" class=\"te\">\r\n");
      out.write("\t\t\t </th>\r\n");
      out.write("\t\t\t<th class=\"the\"> \r\n");
      out.write("\t\t        <input class=\"easyui-datetimebox\" id=\"date1\" data-options=\"formatter:ww4,parser:w4\" ></input>\r\n");
      out.write("\t\t\t </th>\r\n");
      out.write("\t\t\t <th class=\"ths\">至:</th>\r\n");
      out.write("\t\t\t <th class=\"the\" > \r\n");
      out.write("\t\t        <input class=\"easyui-datetimebox\" id=\"date2\" data-options=\"formatter:ww4,parser:w4\" ></input>\r\n");
      out.write("\t\t\t </th>\r\n");
      out.write("\t\t\t <th><input type=\"button\" id=\"b1\" value=\"获取时间\" class=\"bu\" /></th>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t\t<tr class=\"tr\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Im\">编号</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">登录名</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">姓名</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">所属部门</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"ImTx\">创建时间</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Im\">性别</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Im\">年龄</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">电话</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">角色</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">用户类型</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"Gxw\">状态</th>\r\n");
      out.write("\t\t\t<th class=\"th\" id=\"SetUp\">操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr class=\"tr\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh1\">01</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh2\">admin</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh3\">无姓名</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh4\">董事会</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh5\">2017-08-23 10:23:55</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh6\">男</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh7\">33</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh8\">111111111111</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh9\">admin</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh10\">管理员</td>\r\n");
      out.write("\t\t\t<td class=\"td\" id=\"yh11\">正常</td>\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td class=\"td\"><label title=\"修改信息\"> <a type=\"radio\" name=\"st1\"\r\n");
      out.write("\t\t\t\t\tvalue=\"修改\" id=\"xg1\" href=\"javascript:void(0)\"\r\n");
      out.write("\t\t\t\t\tonclick=\"$('#dlg').dialog('open')\">修改</a></label> <label title=\"恢复初始值\">\r\n");
      out.write("\t\t\t\t\t<a type=\"radio\" name=\"st1\" value=\"删除\" id=\"sc1\" href=\"\">删除</a>\r\n");
      out.write("\t\t\t</label></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- ****************************时间控件************************************** -->\r\n");
      out.write("\t<script type=\"text/javascript\">  \r\n");
      out.write("            function ww4(date){  \r\n");
      out.write("                var y = date.getFullYear();  \r\n");
      out.write("                var m = date.getMonth()+1;  \r\n");
      out.write("                var d = date.getDate();  \r\n");
      out.write("                var h = date.getHours();  \r\n");
      out.write("                return  y+'年'+(m<10?('0'+m):m)+'月'+(d<10?('0'+d):d)+'日'+(h<10?('0'+h):h)+'点';  \r\n");
      out.write("                 \r\n");
      out.write("            }  \r\n");
      out.write("            function w4(s){  \r\n");
      out.write("                var reg=/[\\u4e00-\\u9fa5]/  //利用正则表达式分隔  \r\n");
      out.write("                var ss = (s.split(reg));  \r\n");
      out.write("                var y = parseInt(ss[0],10);  \r\n");
      out.write("                var m = parseInt(ss[1],10);  \r\n");
      out.write("                var d = parseInt(ss[2],10);  \r\n");
      out.write("                var h = parseInt(ss[3],10);  \r\n");
      out.write("                if (!isNaN(y) && !isNaN(m) && !isNaN(d) && !isNaN(h)){  \r\n");
      out.write("                    return new Date(y,m-1,d,h);  \r\n");
      out.write("                } else {  \r\n");
      out.write("                    return new Date();  \r\n");
      out.write("                }  \r\n");
      out.write("            }  \r\n");
      out.write("        </script>\r\n");
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