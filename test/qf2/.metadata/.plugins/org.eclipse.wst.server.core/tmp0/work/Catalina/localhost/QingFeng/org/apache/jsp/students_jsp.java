/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-21 07:41:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class students_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>&nbsp;清风教育网 - 学生注册</title>\r\n");
      out.write("<link rel=\"icon\" href=\"images/logo/logo2.ico\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/jquery.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\t/* background-image: url(images/bj.jpg); */\r\n");
      out.write("\t/* background-size:contain; */\r\n");
      out.write("\t/* background-origin:content-box; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tpadding-left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bj {\r\n");
      out.write("\t/* background-repeat: round; */\r\n");
      out.write("\t/* width:100%;\r\n");
      out.write("\theight:100%; */\r\n");
      out.write("\t\r\n");
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
      out.write(".m:hover {\r\n");
      out.write("\t/* letter-spacing: 0px; */\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.9);\r\n");
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
      out.write("/* .bs {\r\n");
      out.write("\tfont-size: 15px;\r\n");
      out.write("\twidth: 60px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("} */\r\n");
      out.write(".ff {\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tpadding-bottom: 35px;\r\n");
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
      out.write(".te_s {\r\n");
      out.write("\twidth: 300px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tborder: 0.5px solid #0492d6;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tfont-size: 25px;\r\n");
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
      out.write(".te:focus {\r\n");
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
      out.write(".te_y:focus {\r\n");
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
      out.write(".te:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_s:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".te_y:hover {\r\n");
      out.write("\tletter-spacing: 1px;\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".m {\r\n");
      out.write("\twidth: 130px;\r\n");
      out.write("\theight: 39px;\r\n");
      out.write("\ttop: 3px;\r\n");
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
      out.write("option {\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tfont-family: '楷体';\r\n");
      out.write("\tfont-size: auto;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twhite-space: pre;\r\n");
      out.write("\tmin-height: 1.2em;\r\n");
      out.write("\tpadding: 0px 2px 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".m:hover {\r\n");
      out.write("\t/* letter-spacing: 0px; */\r\n");
      out.write("\tborder: 0.5px solid red;\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("\tbackground-color: rgba(255, 255, 255, 0.5);\r\n");
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
      out.write(".xl {\r\n");
      out.write("\tborder: 1;\r\n");
      out.write("\tborder-color: #233;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\twidth: 150px;\r\n");
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
      out.write("/*---------------------------------------------------*/\r\n");
      out.write(".formbox {\r\n");
      out.write("\twidth: 85%;\r\n");
      out.write("\tmargin: 40px auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".formcon {\r\n");
      out.write("\tpadding: 10px 0;\r\n");
      out.write("\tborder: solid 1px #ddd\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".formcon table input {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".formcon table td {\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tline-height: 24px;\r\n");
      out.write("}\r\n");
      out.write("/* flow_steps */\r\n");
      out.write(".flow_steps {\r\n");
      out.write("\theight: 63px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\twidth:60%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flow_steps li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tpadding: 0 8% 0 30px;\r\n");
      out.write("\tline-height: 43px;\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground: url(images/barbg2.png) no-repeat 100% 0 #E4E4E4;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flow_steps li.done {\r\n");
      out.write("\tbackground-position: 100% -107px;\r\n");
      out.write("\tbackground-color: #FFEDA2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flow_steps li.current_prev {\r\n");
      out.write("\tbackground-position: 100% -53px;\r\n");
      out.write("\tbackground-color: #FFEDA2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flow_steps li.current {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground-color: #990D1B;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".flow_steps li#qzfs.current, .flow_steps li.last {\r\n");
      out.write("\tbackground-image: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*================================================================*/\r\n");
      out.write("\r\n");
      out.write(".Scroller {\r\n");
      out.write("\tline-height: 45px;\r\n");
      out.write("\tborder: 1px solid #D4D4D4;\r\n");
      out.write("\tpadding: 0px 10px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\twidth: 35%;\r\n");
      out.write("\tfloat:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".Scroller * {\r\n");
      out.write("\tmargin: 0px;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ScrollMid {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ScrollMid .uls {\r\n");
      out.write("\twidth: 800px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ScrollMid .lis {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 390px;\r\n");
      out.write("\tpadding-left: 10px;\r\n");
      out.write("\tline-height: 45px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t/* var $ = function(id) {\r\n");
      out.write("\t\treturn \"string\" == typeof id ? document.getElementById(id) : id;\r\n");
      out.write("\t};\r\n");
      out.write("\tvar Class = {\r\n");
      out.write("\t\tcreate : function() {\r\n");
      out.write("\t\t\treturn function() {\r\n");
      out.write("\t\t\t\tthis.initialize.apply(this, arguments);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tObject.extend = function(destination, source) {\r\n");
      out.write("\t\tfor ( var property in source) {\r\n");
      out.write("\t\t\tdestination[property] = source[property];\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn destination;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction addEventHandler(oTarget, sEventType, fnHandler) {\r\n");
      out.write("\t\tif (oTarget.addEventListener) {\r\n");
      out.write("\t\t\toTarget.addEventListener(sEventType, fnHandler, false);\r\n");
      out.write("\t\t} else if (oTarget.attachEvent) {\r\n");
      out.write("\t\t\toTarget.attachEvent(\"on\" + sEventType, fnHandler);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\toTarget[\"on\" + sEventType] = fnHandler;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tvar Scroller = Class.create();\r\n");
      out.write("\tScroller.prototype = {\r\n");
      out.write("\t\tinitialize : function(idScroller, idScrollMid, options) {\r\n");
      out.write("\t\t\tvar oThis = this, oScroller = $(idScroller), oScrollMid = $(idScrollMid);\r\n");
      out.write("\t\t\tthis.SetOptions(options);\r\n");
      out.write("\t\t\tthis.Side = this.options.Side || [ \"up\" ];//方向 \r\n");
      out.write("\t\t\tthis.scroller = oScroller; //对象 \r\n");
      out.write("\t\t\tthis.speed = this.options.Speed; //速度 \r\n");
      out.write("\t\t\tthis.timer = null; //时间 \r\n");
      out.write("\t\t\tthis.pauseHeight = 0; //定高 \r\n");
      out.write("\t\t\tthis.pauseWidth = 0; //定宽 \r\n");
      out.write("\t\t\tthis.pause = 0; //定高(宽) \r\n");
      out.write("\t\t\tthis.side = 0; //参数 \r\n");
      out.write("\t\t\t//用于上下滚动 \r\n");
      out.write("\t\t\tthis.heightScroller = parseInt(oScroller.style.height)\r\n");
      out.write("\t\t\t\t\t|| oScroller.offsetHeight;\r\n");
      out.write("\t\t\tthis.heightList = oScrollMid.offsetHeight;\r\n");
      out.write("\t\t\t//用于左右滚动 \r\n");
      out.write("\t\t\tthis.widthScroller = parseInt(oScroller.style.width)\r\n");
      out.write("\t\t\t\t\t|| oScroller.offsetWidth;\r\n");
      out.write("\t\t\tthis.widthList = oScrollMid.offsetWidth;\r\n");
      out.write("\t\t\t//js取不到css设置的height和width \r\n");
      out.write("\t\t\toScroller.style.overflow = \"hidden\";\r\n");
      out.write("\t\t\toScrollMid.appendChild(oScrollMid.cloneNode(true));\r\n");
      out.write("\t\t\toScrollMid.appendChild(oScrollMid.cloneNode(true));\r\n");
      out.write("\t\t\taddEventHandler(oScroller, \"mouseover\", function() {\r\n");
      out.write("\t\t\t\toThis.Stop();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\taddEventHandler(oScroller, \"mouseout\", function() {\r\n");
      out.write("\t\t\t\toThis.Start();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tthis.Start();\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//设置默认属性 \r\n");
      out.write("\t\tSetOptions : function(options) {\r\n");
      out.write("\t\t\tthis.options = {//默认值 \r\n");
      out.write("\t\t\t\tStep : 1,//每次变化的px量 \r\n");
      out.write("\t\t\t\tSpeed : 20,//速度(越大越慢) \r\n");
      out.write("\t\t\t\tSide : [ \"up\" ],//滚动方向:\"up\"是上，\"down\"是下，\"left\"是左，\"right\"是右 \r\n");
      out.write("\t\t\t\tPauseHeight : 0,//隔多高停一次 \r\n");
      out.write("\t\t\t\tPauseWidth : 0,//隔多宽停一次 \r\n");
      out.write("\t\t\t\t//当上下和左右一起使用时必须设置PauseHeight和PauseWidth来设置转向位置 \r\n");
      out.write("\t\t\t\tPauseStep : 3000\r\n");
      out.write("\t\t\t//停顿时间(PauseHeight或PauseWidth大于0该参数才有效) \r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tObject.extend(this.options, options || {});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//转向 \r\n");
      out.write("\t\tTurn : function() {\r\n");
      out.write("\t\t\t//通过设置方向数组的排列来转向 \r\n");
      out.write("\t\t\tthis.Side.push(this.Side.shift().toLowerCase());\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//上下滚动 \r\n");
      out.write("\t\tScrollUpDown : function() {\r\n");
      out.write("\t\t\tthis.pause = this.pauseHeight;\r\n");
      out.write("\t\t\tthis.scroller.scrollTop = this.GetScroll(this.scroller.scrollTop,\r\n");
      out.write("\t\t\t\t\tthis.heightScroller, this.heightList,\r\n");
      out.write("\t\t\t\t\tthis.options.PauseHeight);\r\n");
      out.write("\t\t\tthis.pauseHeight = this.pause;\r\n");
      out.write("\t\t\tvar oThis = this;\r\n");
      out.write("\t\t\tthis.timer = window.setTimeout(function() {\r\n");
      out.write("\t\t\t\toThis.Start();\r\n");
      out.write("\t\t\t}, this.speed);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//左右滚动 \r\n");
      out.write("\t\tScrollLeftRight : function() {\r\n");
      out.write("\t\t\tthis.pause = this.pauseWidth;\r\n");
      out.write("\t\t\t//注意:scrollLeft超过1400会自动变回1400 注意长度 \r\n");
      out.write("\t\t\tthis.scroller.scrollLeft = this\r\n");
      out.write("\t\t\t\t\t.GetScroll(this.scroller.scrollLeft, this.widthScroller,\r\n");
      out.write("\t\t\t\t\t\t\tthis.widthList, this.options.PauseWidth);\r\n");
      out.write("\t\t\tthis.pauseWidth = this.pause;\r\n");
      out.write("\t\t\tvar oThis = this;\r\n");
      out.write("\t\t\tthis.timer = window.setTimeout(function() {\r\n");
      out.write("\t\t\t\toThis.Start();\r\n");
      out.write("\t\t\t}, this.speed);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//获取设置滚动数据 \r\n");
      out.write("\t\tGetScroll : function(iScroll, iScroller, iList, iPause) {\r\n");
      out.write("\t\t\tvar iStep = this.options.Step * this.side;\r\n");
      out.write("\t\t\tif (this.side > 0) {\r\n");
      out.write("\t\t\t\tif (iScroll >= (iList * 2 - iScroller)) {\r\n");
      out.write("\t\t\t\t\tiScroll -= iList;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tif (iScroll <= 0) {\r\n");
      out.write("\t\t\t\t\tiScroll += iList;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tthis.speed = this.options.Speed;\r\n");
      out.write("\t\t\tif (iPause > 0) {\r\n");
      out.write("\t\t\t\tif (Math.abs(this.pause) >= iPause) {\r\n");
      out.write("\t\t\t\t\tthis.speed = this.options.PauseStep;\r\n");
      out.write("\t\t\t\t\tthis.pause = iStep = 0;\r\n");
      out.write("\t\t\t\t\tthis.Turn();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tthis.pause += iStep;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn (iScroll + iStep);\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//开始 \r\n");
      out.write("\t\tStart : function() {\r\n");
      out.write("\t\t\t//document.getElementById(\"test\").innerHTML+=sTurn+\",\"; \r\n");
      out.write("\t\t\t//方向设置 \r\n");
      out.write("\t\t\tswitch (this.Side[0].toLowerCase()) {\r\n");
      out.write("\t\t\tcase \"right\":\r\n");
      out.write("\t\t\t\tif (this.widthList < this.widthScroller)\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\tthis.side = -1;\r\n");
      out.write("\t\t\t\tthis.ScrollLeftRight();\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase \"left\":\r\n");
      out.write("\t\t\t\tif (this.widthList < this.widthScroller)\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\tthis.side = 1;\r\n");
      out.write("\t\t\t\tthis.ScrollLeftRight();\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase \"down\":\r\n");
      out.write("\t\t\t\tif (this.heightList < this.heightScroller)\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\tthis.side = -1;\r\n");
      out.write("\t\t\t\tthis.ScrollUpDown();\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\tcase \"up\":\r\n");
      out.write("\t\t\tdefault:\r\n");
      out.write("\t\t\t\tif (this.heightList < this.heightScroller)\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\tthis.side = 1;\r\n");
      out.write("\t\t\t\tthis.ScrollUpDown();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\t//停止 \r\n");
      out.write("\t\tStop : function() {\r\n");
      out.write("\t\t\tclearTimeout(this.timer);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}; */\r\n");
      out.write("\t/*----------------------------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("function yy(){\r\n");
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
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"bj\">\r\n");
      out.write("\t\t\t\t\t<div class=\"qj\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">姓名：</label><input type=\"text\" id=\"s_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" class=\"te\" /><font id=\"fon\">&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">身份证号码：</label><input type=\"text\" id=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" class=\"te_s\" /><font id=\"fon\">&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<!-- <p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">姓名：</label><input type=\"text\" id=\"s_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" class=\"te\" /><font id=\"fon\">&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">姓名：</label><input type=\"text\" id=\"s_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" class=\"te\" /><font id=\"fon\">&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t\t\t</p> -->\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">预留手机号：</label><input type=\"text\" id=\"s_phone\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"\" class=\"te\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\">手机验证码：</label><input type=\"text\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"te_y\" id=\"\" title=\"\" /> \r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"m\" id=\"yz\" type=\"button\" value=\"发送验证码\" onclick=\"yy()\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"t\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"bu\" onclick=\"one()\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
