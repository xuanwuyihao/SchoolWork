/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-21 07:14:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exam_005fzhikao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>&nbsp;清风教育网 - 职考报名</title>\r\n");
      out.write("<link rel=\"icon\" href=\"images/logo/logo2.ico\" />\r\n");
      out.write("<link type=\"text/css\" href=\"css/exam_c.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"script/jquery-easyui-1.5.2/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"script/jquery.min.js\"></script>\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"script/jquery-easyui-1.5.2/themes/gray/easyui.css\" />\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"script/jquery-easyui-1.5.2/themes/icon.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"script/jquery-easyui-1.5.2/jquery.easyui.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"script/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\tcharset=\"utf-8\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<link type=\"text/css\" href=\"css/formimg.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 10;\r\n");
      out.write("\tbackground:#FFFACD;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".qj {\r\n");
      out.write("\tmargin-top: 10%;\r\n");
      out.write("\tmargin-left: 30%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".la {\r\n");
      out.write("\ttop: 20px;\r\n");
      out.write("\tfloat: center;\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tborder-radius: 8px;\r\n");
      out.write("\tborder-color: #000;\r\n");
      out.write("\tword-spacing: normal;\r\n");
      out.write("\tfont-family: '宋体';\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bu {\r\n");
      out.write("\tborder-radius: 6px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground: rgba(26, 228, 108, 0.52);\r\n");
      out.write("\tborder: 0 solid;\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bu:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".di {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\talign: center;\r\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder: 1px solid #0492d6;\r\n");
      out.write("\tbackground: rgba(255, 255, 255, 0.3);\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\twidth: 55px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p {\r\n");
      out.write("\talign: center;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tbackground: rgba(233, 233, 233, 0.2);\r\n");
      out.write("\tpadding-top: 18px;\r\n");
      out.write("\tpadding-left: 35px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bs {\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\twidth: 60px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ff {\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tpadding-bottom: 35px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te:focus{\r\n");
      out.write("\tborder:1px solid rgba(4, 146, 214, 0.28);\r\n");
      out.write("\tbox-shadow:1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px rgba(4, 146, 214, 0.28) inset;\r\n");
      out.write("\tborder-radius:2px;\r\n");
      out.write("\tpadding-right:30px;\r\n");
      out.write("\t-moz-transition:padding .25s;\r\n");
      out.write("\t-webkit-transition:padding .25s;\r\n");
      out.write("\t-o-transition:padding .25s;\r\n");
      out.write("\ttransition:padding .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te:hover{\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_s {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_s:focus {\r\n");
      out.write("\tborder: 1px solid rgba(4, 146, 214, 0.28);\r\n");
      out.write("\tbox-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px\r\n");
      out.write("\t\trgba(4, 146, 214, 0.28) inset;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tpadding-right: 30px;\r\n");
      out.write("\t-moz-transition: padding .25s;\r\n");
      out.write("\t-webkit-transition: padding .25s;\r\n");
      out.write("\t-o-transition: padding .25s;\r\n");
      out.write("\ttransition: padding .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_s:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_n{\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 135px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_n:focus {\r\n");
      out.write("\tborder: 1px solid rgba(4, 146, 214, 0.28);\r\n");
      out.write("\tbox-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px\r\n");
      out.write("\t\trgba(4, 146, 214, 0.28) inset;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tpadding-right: 30px;\r\n");
      out.write("\t-moz-transition: padding .25s;\r\n");
      out.write("\t-webkit-transition: padding .25s;\r\n");
      out.write("\t-o-transition: padding .25s;\r\n");
      out.write("\ttransition: padding .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_n:hover{\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_y {\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_y:focus {\r\n");
      out.write("\tborder: 1px solid rgba(4, 146, 214, 0.28);\r\n");
      out.write("\tbox-shadow: 1px 1px 3px rgba(4, 146, 214, 0.28), 0 1px 2px\r\n");
      out.write("\t\trgba(4, 146, 214, 0.28) inset;\r\n");
      out.write("\tborder-radius: 2px;\r\n");
      out.write("\tpadding-right: 38px;\r\n");
      out.write("\t-moz-transition: padding .25s;\r\n");
      out.write("\t-webkit-transition: padding .25s;\r\n");
      out.write("\t-o-transition: padding .25s;\r\n");
      out.write("\ttransition: padding .25s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_y:hover {\r\n");
      out.write("\tletter-spacing: 0.4px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".t {\r\n");
      out.write("\twidth: 150px;\r\n");
      out.write("\tmargin-top: 3px;\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tpadding: 3px;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 22px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".m {\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\theight: 39px;\r\n");
      out.write("\t/* top: 3px; */\r\n");
      out.write("\tborder-top: 5px;\r\n");
      out.write("\tborder-left: 2px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\t/* font-color:#fff; */\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".m:hover {\r\n");
      out.write("\t/* letter-spacing: 0px; */\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*图片*/\r\n");
      out.write(".pic-box div {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 45px;\r\n");
      out.write("\theight: 768px;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pic-box div.pic-box01 {\r\n");
      out.write("\tbackground: url(images/pic01.png) no-repeat right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pic-box div.pic-box02 {\r\n");
      out.write("\tbackground: url(images/pic02.png) no-repeat left;\r\n");
      out.write("\twidth: 0px;\r\n");
      out.write("\ttransition: width 2s;\r\n");
      out.write("\t-moz-transition: width 2s;\r\n");
      out.write("\t-webkit-transition: width 2s;\r\n");
      out.write("\t-o-transition: width 2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pic-box div.pic-box03 {\r\n");
      out.write("\tbackground: url(images/pic03.png) no-repeat left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pic-box:hover>div.pic-box02 {\r\n");
      out.write("\twidth: 980px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pic-tt {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 90%;\r\n");
      out.write("\tleft: 12%;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tfloat: inherit;\r\n");
      out.write("\tleft: 44%;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tline-height:45px;\r\n");
      out.write("\ttop:5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input::-webkit-input-placeholder {\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("input:-ms-input-placeholder { /*IE10+*/\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("input:-moz-placeholder { /*Firefox4-18*/\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("input::-moz-placeholder { /*Firefox19+*/\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function () {\r\n");
      out.write("\t//$(document).ready(function(){\r\n");
      out.write("\t\t$(\"#yz\").click(function(){\r\n");
      out.write("\t\t\t//setTimeout(function(){});\r\n");
      out.write("\t\t\t$(\"#yz\").attr(\"disabled\",\"\");\r\n");
      out.write("\t\t\tjs(60);\r\n");
      out.write("\t\t\t//alert(\"TTT\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}); \r\n");
      out.write("\tfunction js(s){\r\n");
      out.write("\t\tif(s <= 0){\r\n");
      out.write("\t\t\t$(\"#yz\").val(\"重新获取\");\r\n");
      out.write("\t\t\t$(\"#yz\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#yz\").val(s+\"秒后重新获取\");\r\n");
      out.write("\t\tsetTimeout(\"js(\"+(s-1)+\")\",1000);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction yy(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"DADSA\");\r\n");
      out.write("\t\tte_y = \"\";\r\n");
      out.write("\t\tvar cd = 4;\r\n");
      out.write("\t\tvar yzm = document.getElementById(\"sjm\");\r\n");
      out.write("\t\tvar yzsz = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd',\r\n");
      out.write("\t\t\t\t'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',\r\n");
      out.write("\t\t\t\t'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',\r\n");
      out.write("\t\t\t\t'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',\r\n");
      out.write("\t\t\t\t'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');\r\n");
      out.write("\t\tfor (var i = 0; i < cd; i++) {\r\n");
      out.write("\t\t\tvar n = Math.floor(Math.random() * 52);\r\n");
      out.write("\t\t\tte_y += yzsz[n];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (yzm) {\r\n");
      out.write("\t\t\tyzm.className = \"te_y\";\r\n");
      out.write("\t\t\tyzm.innerHTML = te_y;\r\n");
      out.write("\t\t\talert(te_y);\r\n");
      out.write("\t\t\t$(\"#sjm\").innerHTML=te_y;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar s_phone = $('#s_phone').val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t\t\tcache : true,\r\n");
      out.write("\t\t\turl : 'yzm.action',\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t's_phone' : s_phone,\r\n");
      out.write("\t\t\t\t'te_y' :te_y\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\talter(\"成功向\"+s_phone+\"发送验证码！\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(XMLHttpRequest, textStatus) {\r\n");
      out.write("\t\t\t\talert(\"系统繁忙,请稍候再试!\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("        \r\n");
      out.write("        var defaultInd = 0;\r\n");
      out.write("        var list = $('#js_ban_content').children();\r\n");
      out.write("        var count = 0;\r\n");
      out.write("        var change = function(newInd, callback){\r\n");
      out.write("            if(count) return;\r\n");
      out.write("            count = 2;\r\n");
      out.write("            $(list[defaultInd]).fadeOut(400, function(){\r\n");
      out.write("                count--;\r\n");
      out.write("                if(count <= 0){\r\n");
      out.write("                    if(start.timer) window.clearTimeout(start.timer);\r\n");
      out.write("                    callback && callback();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            $(list[newInd]).fadeIn(400, function(){\r\n");
      out.write("                defaultInd = newInd;\r\n");
      out.write("                count--;\r\n");
      out.write("                if(count <= 0){\r\n");
      out.write("                    if(start.timer) window.clearTimeout(start.timer);\r\n");
      out.write("                    callback && callback();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        var next = function(callback){\r\n");
      out.write("            var newInd = defaultInd + 1;\r\n");
      out.write("            if(newInd >= list.length){\r\n");
      out.write("                newInd = 0;\r\n");
      out.write("            }\r\n");
      out.write("            change(newInd, callback);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        var start = function(){\r\n");
      out.write("            if(start.timer) window.clearTimeout(start.timer);\r\n");
      out.write("            start.timer = window.setTimeout(function(){\r\n");
      out.write("                next(function(){\r\n");
      out.write("                    start();\r\n");
      out.write("                });\r\n");
      out.write("            }, 8000);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        start();\r\n");
      out.write("        \r\n");
      out.write("        $('#js_ban_button_box').on('click', 'a', function(){\r\n");
      out.write("            var btn = $(this);\r\n");
      out.write("            if(btn.hasClass('right')){\r\n");
      out.write("                //next\r\n");
      out.write("                next(function(){\r\n");
      out.write("                    start();\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("                //prev\r\n");
      out.write("                var newInd = defaultInd - 1;\r\n");
      out.write("                if(newInd < 0){\r\n");
      out.write("                    newInd = list.length - 1;\r\n");
      out.write("                }\r\n");
      out.write("                change(newInd, function(){\r\n");
      out.write("                    start();\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    })();\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"\">\r\n");
      out.write("\t<!-- 姓名、身份证、手机号、报考职业类型、验证码 -->\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"\" style=\"\">\r\n");
      out.write("\t\t<div class=\"qj\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">姓名：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" class=\"te\" placeholder=\"请输入您的姓名\"\r\n");
      out.write("\t\t\t\t\tid=\"\" title=\"\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">报考证书：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" class=\"te_s\" placeholder=\"请输入您想要报考的证书类型\"\r\n");
      out.write("\t\t\t\t\tid=\"\" title=\"\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">身份证号：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" class=\"te_s\" placeholder=\"请输入您的身份证号\"\r\n");
      out.write("\t\t\t\t title=\"\" id=\"\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">学习内容：</label>\r\n");
      out.write("\t\t\t\t<textarea class=\"te_n\" id=\"\" title=\"请填写您想学习的专业内容\" /></textarea>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">手机号：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" class=\"te\" placeholder=\"请输入您的手机号码\"\r\n");
      out.write("\t\t\t\t\tid=\"s_phone\" title=\"\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\">验证码：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" class=\"te_y\" placeholder=\"请输入手机验证码\"\r\n");
      out.write("\t\t\t\t\t id=\"sjm\" title=\"\" />\r\n");
      out.write("\t\t\t\t<!-- <button class=\"m\" id=\"yz\" title=\"点一点切换\">点击获取验证码</button> -->\r\n");
      out.write("\t\t\t\t<input class=\"m\" id=\"yz\" type=\"button\" value=\"发送验证码\" onclick=\"yy()\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<label class=\"t\"></label><input type=\"submit\" value=\"确认\" class=\"bu\"\r\n");
      out.write("\t\t\t\t\tid=\"\" title=\"\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<h1 style=\"font-size:45px;font-family: '楷体';\">祝选择清风教育的您： </h1>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div class=\"pic-tt\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"pic-box\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"pic-box01\"></div>\r\n");
      out.write("\t\t\t<div class=\"pic-box02\"></div>\r\n");
      out.write("\t\t\t<div class=\"pic-box03\"></div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("     </body>\r\n");
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
