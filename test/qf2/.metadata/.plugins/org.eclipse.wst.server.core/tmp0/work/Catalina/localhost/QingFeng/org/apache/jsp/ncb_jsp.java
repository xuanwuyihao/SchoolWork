/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-21 06:45:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ncb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>&nbsp;清风教育网 - 权威认证</title>\r\n");
      out.write("<link rel=\"icon\" href=\"images/logo/logo2.ico\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/ncb/jQuery-easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/ncb/jQuery-jcImgScroll.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a, img {\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont: 12px/180% Arial, Helvetica, sans-serif, \"新宋体\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".blank30 {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("/* jQuery jcImgScroll */\r\n");
      out.write(".jcImgScroll {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\theight: 380px;\r\n");
      out.write("\tmargin: 40px auto 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll li {\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll li a {\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tz-index: 99;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll li.loading a {\r\n");
      out.write("\tbackground: #fff url(img/ncb/loading.gif) no-repeat center center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll li img, .jcImgScroll li, .jcImgScroll em, .jcImgScroll dl {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tborder: 0 none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll li img {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll em.sPrev {\r\n");
      out.write("\tbackground: url(images/ncb/arrow-left.png) no-repeat left center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll em.sNext {\r\n");
      out.write("\tbackground: url(images/ncb/arrow-right.png) no-repeat right center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll dl dd {\r\n");
      out.write("\tbackground: url(images/ncb/NumBtn.png) no-repeat 0 bottom;\r\n");
      out.write("\ttext-indent: -9em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jcImgScroll dl dd:hover, .jcImgScroll dl dd.curr {\r\n");
      out.write("\tbackground-position: 0 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\t\r\n");
      out.write("\t//演示三    ID改变下试试\r\n");
      out.write("\t$(\"#demo3\").jcImgScroll({\r\n");
      out.write("\t\tarrow : {\r\n");
      out.write("\t\t\twidth:45,\t\r\n");
      out.write("\t\t\theight:400,\r\n");
      out.write("\t\t\tx:60,\r\n");
      out.write("\t\t\ty:0\r\n");
      out.write("\t\t},\r\n");
      out.write("\t    width : 330, //设置图片宽度\r\n");
      out.write("\t\theight:469, //设置图片高度\r\n");
      out.write("\t\timgtop:22,//每张图片的上下偏移量\r\n");
      out.write("\t\timgleft:-10,//每张图片的左边偏移量\r\n");
      out.write("\t\timgwidth:30,//每张图片的宽度偏移量\r\n");
      out.write("\t\timgheight:44,//每张图片的高度偏移量\r\n");
      out.write("\t\tcount : 9,//数量\r\n");
      out.write("\t\toffsetX : 60,//位移\r\n");
      out.write("\t\tNumBtn : false,\r\n");
      out.write("\t\ttitle:false,\r\n");
      out.write("\t\tsetZoom:.8,\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"text-align:center;clear:both;\">\r\n");
      out.write("\t<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"/follow.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"demo3\" class=\"jcImgScroll\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/16.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/15.jpg\"></a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/17.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/18.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/20.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/19.jpg\"></a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/21.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/22.jpg\"></a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\" path=\"images/ncb/23.jpg\"></a></li>\r\n");
      out.write("\t        <li><a href=\"#\" path=\"images/ncb/24.jpg\"></a></li>\r\n");
      out.write("\t    \r\n");
      out.write("\t\t    </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("    </body>\r\n");
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
