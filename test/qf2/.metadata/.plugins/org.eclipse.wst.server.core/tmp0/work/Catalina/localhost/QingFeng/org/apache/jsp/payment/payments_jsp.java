/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-18 12:00:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.payment;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payments_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction;

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
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>成考缴费记录</title>\r\n");
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document)\r\n");
      out.write("\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#tt\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.datagrid(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : 'Payment_list',\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\tsingleSelect: true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$(\"a[name='opera']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.linkbutton(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttext : '修改',\r\n");
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
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 80,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'stu_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '姓名',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'aca_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '学校',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'maj_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '专业',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 's_gradations',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '层次',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'emp_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '合作人',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'practical_money',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '本次缴费',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'need_money',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '还需缴费',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'date',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '缴费时间',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 200,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'f_way',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '支付方式',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'f_accumulative',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '累计金额',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'pay_state',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '缴费状态',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 's_type',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '报考类型',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tformatter : function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue, row,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif (value == 0) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn '公告';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn '简章';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tfield : 'operate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\twidth : 250,\r\n");
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
      out.write("\t\t//选择完学生后打开填写缴费窗口\r\n");
      out.write("\t\t$(\"#addss\").click(function() {\r\n");
      out.write("\t\t\talert(\"sds\");\r\n");
      out.write("\t\t\t$('#dd').dialog({\r\n");
      out.write("\t\t\t\ttitle : '缴费记录填写',\r\n");
      out.write("\t\t\t\twidth : 600,\r\n");
      out.write("\t\t\t\theight : 300,\r\n");
      out.write("\t\t\t\tclosed : false,\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\t//href: 'get_content.php',\r\n");
      out.write("\t\t\t\tmodal : true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#tt').datagrid('getPager').pagination({\r\n");
      out.write("\t\t\t    displayMsg:'当前显示从{rows}到{to}共{total}记录',\r\n");
      out.write("\t\t\t    onBeforeRefresh:function(pageNumber, pageSize){\r\n");
      out.write("\t\t\t     $(this).pagination('loading');\r\n");
      out.write("\t\t\t     alert('pageNumber:'+pageNumber+',pageSize:'+pageSize);\r\n");
      out.write("\t\t\t     $(this).pagination('loaded');\r\n");
      out.write("\t\t\t    },\r\n");
      out.write("\t\t\t   });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/*=================================================================================*/\r\n");
      out.write("\r\n");
      out.write("\t\t//打开选择缴费学生窗口\r\n");
      out.write("\t\t$(\"#add\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#tt2\").datagrid({\r\n");
      out.write("\t\t\t\turl : 'SelectNOStu',\r\n");
      out.write("\t\t\t\tstriped : true,\r\n");
      out.write("\t\t\t\trownumbers : true,\r\n");
      out.write("\t\t\t\tidField : \"s_id\",\r\n");
      out.write("\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\tcollapsible:true,\r\n");
      out.write("\t\t\t\tpageSize : 5,\r\n");
      out.write("\t\t\t\tpageList : [ 5, 10, 15, 20 ],\r\n");
      out.write("\t\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\t\tsortName : \"s__id\",\r\n");
      out.write("\t\t\t\tloadMsg:'数据装载中......',\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\t\tsingleSelect: true,\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'pay_id',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '学号',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 80,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'stu_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '姓名',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'aca_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '学校',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'maj_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '专业',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 's_gradations',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '层次',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'emp_name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '合作人',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'date',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '报名时间',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'need_money',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '还需缴费',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfield : 'pay_state',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttitle : '缴费状态',\r\n");
      out.write("\t\t\t\t\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t ] ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$('#dd2').dialog({\r\n");
      out.write("\t\t\t\ttitle : '请选择添加缴费记录的学生',\r\n");
      out.write("\t\t\t\twidth : 700,\r\n");
      out.write("\t\t\t\theight : 500,\r\n");
      out.write("\t\t\t\tclosed : false,\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\t//  href: 'get_content.php',\r\n");
      out.write("\t\t\t\tmodal : true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
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
      out.write("\tfunction editUser(index) {     //删除\r\n");
      out.write("\r\n");
      out.write("\t\t$('#tt').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\t\talert(\" 学校名称:\"+row.aca_name);\r\n");
      out.write("\t\t//alert(row.n_id);\r\n");
      out.write("\t\t//window.location.href = \"NoticeDel.action?n_id=\" + row.n_id;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction editUserss(index) {       //修改\r\n");
      out.write("\r\n");
      out.write("\t\t$('#tt').datagrid('selectRow', index);// 关键在这里\r\n");
      out.write("\t\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\t\t//alert('ID:'+row.r_id+\" 学校名称:\"+row.a_school);\r\n");
      out.write("\t\talert(row.n_id);\r\n");
      out.write("\t\t$(\"#n_id\").val(row.n_id);\r\n");
      out.write("\t\t$(\"#n_title\").val(row.n_title);\r\n");
      out.write("\t\t$(\"#n_date\").val(row.n_date);\r\n");
      out.write("\t\t$(\"#n_flag\").val(row.n_flag);\r\n");
      out.write("\t\t$(\"#n_content\").val(row.n_content);\r\n");
      out.write("\t\t$('#win').window('open');\r\n");
      out.write("\t\t//window.location.href=\"notice2.jsp?n_content=\"+row.n_content;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction ttion() {\r\n");
      out.write("\r\n");
      out.write("\t\talert(\"QQQQQQQQQ\");\r\n");
      out.write("\t\tdocument.getElementById(\"alers\").submit();\r\n");
      out.write("\t\talert(\"oooooo\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
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
      out.write("\t\t\t\t\t\t$('#stu_no').html(row.pay_id); \r\n");
      out.write("\t\t\t\t\t\t$('#s_name').html(row.stu_name);\r\n");
      out.write("\t\t\t\t\t\t$('#p_money').html(row.need_money);\r\n");
      out.write("\t\t\t\t\t\t$('#emp_name').html(row.emp_name);\r\n");
      out.write("\t\t\t\t\t\t$('#pay_state').html(row.pay_state);\r\n");
      out.write("\t\t\t\t\t\t$('#stu_id').val(row.pay_id);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$('#dd2').dialog('close')  //关闭选择学生窗口窗口\r\n");
      out.write("\t\t\t\t\t\t//打开完善缴费表\r\n");
      out.write("\t\t\t\t\t\twsjl();\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
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
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"toolbar\">\r\n");
      out.write("\t\t<a href=\"#\" id=\"add\" class=\"easyui-linkbutton\" iconCls=\"icon-add\"\r\n");
      out.write("\t\t\tplain=\"true\"\">增加缴费记录</a> <a href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\ticonCls=\"icon-edit\" plain=\"true\" onclick=\"editUser()\">Edit User</a> <a\r\n");
      out.write("\t\t\thref=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\"\r\n");
      out.write("\t\t\tonclick=\"destroyUser()\">Remove User</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ======================================================================================================= -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dd\" style=\"display: none\"\r\n");
      out.write("\t\tdata-options=\"\r\n");
      out.write("\t\t\t\tclosed:true,\r\n");
      out.write("\t\t\t\tbuttons: [{\r\n");
      out.write("\t\t\t\t\ttext:'提交',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-save',\r\n");
      out.write("\t\t\t\t\thandler:function(){      //提交缴费表单\r\n");
      out.write("\t\t\t\t\t\talert('添加成功！');\r\n");
      out.write("\t\t\t\t\t\tdocument.saveform.submit();\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ttext:'取消',\r\n");
      out.write("\t\t\t\t\ticonCls:'icon-no',\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$('#dd').dialog('close');  //关闭添加窗口\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /payment/payments.jsp(408,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("Save_payment");
    // /payment/payments.jsp(408,2) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setName("saveform");
    // /payment/payments.jsp(408,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t<table align=\"center\">\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>学生学号:</td>\r\n");
        out.write("\t\t\t\t\t<td><label id=\"stu_no\"></label></td> <label></label>\r\n");
        out.write("\t\t\t\t\t</tr><tr>\r\n");
        out.write("\t\t\t\t\t<td>学生姓名：</td>\r\n");
        out.write("\t\t\t\t\t<td> <label id=\"s_name\"></label></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>缴费状态：</td>\r\n");
        out.write("\t\t\t\t\t<td> <label id=\"pay_state\"></label></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>还需缴费:</td>\r\n");
        out.write("\t\t\t\t\t<td> <label id=\"p_money\" ></label></td>\r\n");
        out.write("\t\t\t\t\t</tr><tr>\r\n");
        out.write("\t\t\t\t\t<td>合作人:</td>\r\n");
        out.write("\t\t\t\t\t<td> <label id=\"emp_name\" ></label></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>本次缴费金额:</td>\r\n");
        out.write("\t\t\t\t\t<td><input type=\"text\" id=\"p_amount\"\r\n");
        out.write("\t\t\t\t\t\tname=\"payment.p_money\"></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>缴费时间:</td>\r\n");
        out.write("\t\t\t\t\t<td><input class=\"easyui-datetimebox\" name=\"birthday\"\r\n");
        out.write("   \t\t\t\t\t data-options=\"required:true,showSeconds:false\" value=\"3/4/2010 2:3\" style=\"width:150px\"></td>\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td>缴费方式:</td>\r\n");
        out.write("\t\t\t\t\t<td><select name=\"payment.pay_pattern\">\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"支付宝\">支付宝</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"微信\">微信</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"银行转账\">银行转账</option>\r\n");
        out.write("\t\t\t\t\t\t\t<option value=\"现金\">现金</option>\r\n");
        out.write("\t\t\t\t\t</select></td>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<!-- 隐藏域保存id -->\r\n");
        out.write("\t\t\t\t\t<tr><td><input type=\"hidden\" id=\"stu_id\" name=\"payment.s_id\"/></td></tr>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t</table>\r\n");
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fname_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
