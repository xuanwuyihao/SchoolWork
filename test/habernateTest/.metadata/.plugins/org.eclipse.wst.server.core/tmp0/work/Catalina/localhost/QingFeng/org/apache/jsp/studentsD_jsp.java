/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-08-25 06:48:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentsD_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>待办事项管理中心</title>\r\n");
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
      out.write("table {\r\n");
      out.write("\tmargin:0px auto;\r\n");
      out.write("\tborder-collapse:collapse;\r\n");
      out.write("\tfont-size:13px;\r\n");
      out.write("}\r\n");
      out.write("tr {\r\n");
      out.write("\theight:50px;\r\n");
      out.write("}\r\n");
      out.write("tr:nth-of-type(odd) {\r\n");
      out.write("\tbackground-color:#FFF;\r\n");
      out.write("}\r\n");
      out.write("tr:nth-of-type(even) {\r\n");
      out.write("\tbackground-color:#F2F2F2;\r\n");
      out.write("}\r\n");
      out.write("tr:hover {\r\n");
      out.write("\tcolor:#F30;\r\n");
      out.write("\tbackground-color:#EFFEED;\r\n");
      out.write("}\r\n");
      out.write("tr:hover td:nth-child(1){\r\n");
      out.write("\tbackground:url(images/tr-hover-bg.png) no-repeat 3px 8px;\r\n");
      out.write("}\r\n");
      out.write("th {\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("\tborder-top:1px solid #CCC;\r\n");
      out.write("\tcolor:#333;\r\n");
      out.write("\tbackground-color:#F8F4DA;\r\n");
      out.write("}\r\n");
      out.write("td {\r\n");
      out.write("\tborder-bottom:1px solid #CCC;\r\n");
      out.write("}\r\n");
      out.write("/*定义列的宽度*/\r\n");
      out.write("[id^=\"Im\"] {\r\n");
      out.write("\twidth:500px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"ImTx\"] {\r\n");
      out.write("\twidth:510px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"Gxw\"] {\r\n");
      out.write("\twidth:120px;\r\n");
      out.write("}\r\n");
      out.write("[id=\"Xtt\"] {\r\n");
      out.write("\twidth:250px;\r\n");
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
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>待办事项管理中心</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<th id=\"Gxw\">编号</th>\r\n");
      out.write("\t\t\t<th id=\"Gxw\">程度</th><!-- 一般,急,特急 -->\r\n");
      out.write("\t\t\t<th id=\"Xtt\">内容</th>\r\n");
      out.write("\t\t\t<th id=\"Gxw\">状态</th><!-- 已完成,未完成 -->\r\n");
      out.write("\t\t\t<th id=\"SetUp\">操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>01</td>\r\n");
      out.write("\t\t\t<td>一般</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\tThe where 测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试\r\n");
      out.write("\t\t\t\t测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>未完成</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td><label title=\"修改信息\"><input type=\"radio\" name=\"st1\"\r\n");
      out.write("\t\t\t\t\tvalue=\"修改\" />修改</label> <label title=\"删除此条\"><input type=\"radio\"\r\n");
      out.write("\t\t\t\t\tname=\"st1\" value=\"删除\" />删除</label></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
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
