/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2017-09-21 08:56:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class school_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>&nbsp;清风教育网 - 合作院校简介</title>\r\n");
      out.write("<link rel=\"icon\" href=\"images/logo/logo2.ico\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/rz.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/modernizr.custom.js\"></script>\r\n");
      out.write("<link href=\"css/schools.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\r\n");
      out.write("\t$(window).scroll(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t/* var top = $(window).scrollTop() + 200;\r\n");
      out.write("\r\n");
      out.write("\t\tvar left = $(window).scrollLeft() + 1000;\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#dd\").css({\r\n");
      out.write("\t\t\tleft : left + \"px\",\r\n");
      out.write("\t\t\ttop : top + \"px\"\r\n");
      out.write("\t\t}); */\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"by\">\r\n");
      out.write("\t\t<!-- 左侧 -->\r\n");
      out.write("\t\t<div class=\"tli\" style=\"\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li title=\"\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">学校简介</a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">主要专业</a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">合作认证</a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">联系我们</a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 中间 -->\r\n");
      out.write("\t\t<div class=\"con\">\r\n");
      out.write("\t\t\t<section>江西农业大学</section>\r\n");
      out.write("\t\t\t<br /> <font class=\"g\"> <a href=\"http://www.jxau.edu.cn/4/list.htm\"\r\n");
      out.write("\t\t\t\tstyle=\"text-decoration: none; font-size: 20px; color: red;\">\r\n");
      out.write("\t\t\t\t\t查看官网 </a>\r\n");
      out.write("\t\t\t</font>\r\n");
      out.write("\t\t\t<h2 style=\"font-family: '楷体';\">简介</h2>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<div class=\"im\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"images/next11.jpg\" style=\"float: center;\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>江西农业大学是一所以农为优势、以生物技术为特色、多学科协调发展的有特色高水平大学；具有博士学位授予权；是我国首批具有学士学位、硕士学位授予权单位之一；是江西省最早开展研究生教育的高校；是农业部与江西省人民政府共建高校，是国家林业局与江西省人民政府共建高校；国家“中西部高校基础能力建设工程”高校。学校位于南昌经济技术开发区，总占地面积1.6万亩。校园风景秀丽，景色宜人。\r\n");
      out.write("\r\n");
      out.write("学校溯源于1905年创办的江西实业学堂，1908年更名为江西高等农业学堂。本科教育肇始于1940年创办的国立中正大学，1949年更名为南昌大学，1952年组建江西农学院。1958年创办江西共产主义劳动大学总校，1968年更名为江西共产主义劳动大学。1969年江西农学院和江西共产主义劳动大学合并。1980年11月更名为江西农业大学。\r\n");
      out.write("\r\n");
      out.write("学校育人体系完备。学科涵盖农、理、工、经、管、文、法、教、哲、艺等10大门类。现设有17个学院，各类全日制在校学生达26000余人（含独立学院）。有3个一级学科博士点，19个一级学科硕士点，68个本科专业。有1个国家林业局重点学科，3个江西省高水平学科，7个省级重点学科。有1个国家二类特色专业，4个国家一类特色专业，9个省级特色专业。有2个博士后科研流动站，1个博士后科研工作站。2014年，招收了江西省第一个外籍博士后。\r\n");
      out.write("\r\n");
      out.write("学校师资力量雄厚。现有在职教职工近1600余人，其中具有博士、硕士学位人员占教师总数的80%以上。有中国科学院院士1人，“国家杰出青年基金”获得者2人，国家“万人计划”领军人才3人，国家中青年科技创新领军人才1人。有全国“五四”奖章获得者2人，国家级有突出贡献中青年专家3人，国家“百千万人才工程”人选5人，“中国青年科技奖”获得者3人，国家现代农业产业技术体系岗位科学家3人，教育部“新世纪优秀人才支持计划”人选4人，“赣鄱英才555工程”人选24人。有“全国杰出专业技术人才先进集体”、教育部“长江学者和创新团队发展计划”创新团队、农业部“农业科研杰出人才及其创新团队”等国家级创新团队，江西省优势科技创新团队4个，江西省高校科技创新团队1个，南昌市优势科技创新团队1个。有国家级教学名师2人，全国模范教师3人，全国优秀教师1人。有国家级优秀教学团队1个，省级优秀教学团队7个。\r\n");
      out.write("\r\n");
      out.write("学校依托办学优势，逐步建成了具有鲜明特色的科技创新体系。拥有江西省唯一独立组建的省部共建国家重点实验室；建有国家工程实验室、国家地方联合工程实验室、教育部重点实验室、农业部重点实验室等高层次科技创新平台；建有11个省级重点实验室（工程技术研究中心）、3个省级工程实验室（研究中心）、4个省高校重点实验室、2个省高校高水平实验室（工程中心）；1个省哲学社会科学重点研究基地、2个省高校人文社科重点研究基地、1个省软科学重点研究基地，1个省文化艺术科学重点研究基地。学校大力推进协同创新能力建设，作为核心协同单位组建国家“2011协同创新中心”1个、获批认定江西省“2011协同创新中心”5个。拥有国家级新农村发展研究院。建有2个国家级实验教学示范中心。\r\n");
      out.write("\r\n");
      out.write("学校坚持以育人为中心，教学、科研共同发展，在人才培养、科学研究、社会服务、文化传承创新等方面取得优异成绩。建校以来，累计培养各类毕业生30余万人，大多数成为生产、经营、管理和农业技术推广等领域的骨干力量和领导干部。据不完全统计，学校培养的学生中，涌现了6名院士，1名共和国部长，12名省部级领导干部，30多位大学党委书记、校长，100多位国家有突出贡献专家、全国劳动模范、模范教师。目前全省100个县市区中有近30位县（市）委书记、县（市）长为农大毕业生。\r\n");
      out.write("\r\n");
      out.write("学校主动对接经济社会与地方产业发展，与全省80%以上县市区建立了科技合作关系，以重大产业项目为载体，先后推广了一大批拥有自主知识产权的优良品种及现代农业技术。“十二五”以来，学校共获得各级各类科技奖励95项，其中国家技术发明二等奖1项，国家科技进步特等奖1项、二等奖2项。\r\n");
      out.write("\r\n");
      out.write("在新的历史时期，学校坚持人才强校、质量立校、特色兴校，大力推进有特色高水平大学建设，努力为科教兴国和人才强国战略，为“创新引领、绿色崛起、担当实干、兴赣富民”作出新的更大贡献。</p>\r\n");
      out.write("\t\t\t<p></p>\r\n");
      out.write("\t\t\t<p>江西农业大学</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a style=\"text-decoration: none; font-size: 8px; float: right;\">\r\n");
      out.write("\t\t\t\t\t截至2017年 </a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<br class=\"br\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section>专业</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"height: 1150px;\">\r\n");
      out.write("\t\t\t\t<div class=\"floatdemo\">\r\n");
      out.write("\t\t\t\t\t<div class=\"demo01\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-left\" src=\"images/06.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 230px; height: 230px;\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h\">我等你</h2>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p\">\r\n");
      out.write("\t\t\t\t\t\t\t我等你<br>不在别处<br>就在灯火阑珊处<br>我不怕千山万水、岁月沧桑<br>我只愿，某日，君踏马而归\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"demo02\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-right\" src=\"images/02.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 230px; height: 230px;\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h\">走向深秋</h2>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p\">\r\n");
      out.write("\t\t\t\t\t\t\t走向深秋<br>让时间的永恒<br>与澎湃的秋梦一起成长<br>为了剪去心中那一缕清愁<br>我再度往前.\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"demo03\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-right\" src=\"images/03.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 230px; height: 230px;\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h\">爱</h2>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p\">\r\n");
      out.write("\t\t\t\t\t\t\t爱<br>没有距离<br>只要心是在一起<br>爱<br>只有心灵的距离\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"demo04\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img-left\" src=\"images/04.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 230px; height: 230px;\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"h\">只愿岁月静好</h2>\r\n");
      out.write("\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p\">\r\n");
      out.write("\t\t\t\t\t\t\t我不想要<br>生活多么的绚丽</span><br>我只想生活平平淡淡<br>我想要找寻那份真实感<br>只愿岁月静好\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br class=\"br\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section>认证</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"grid\">\r\n");
      out.write("\t\t\t\t<li class=\"cs-style-4\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/03.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>学信网</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style=\"font-size: 16px; font-family: '清茶楷体预览版';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t本平台于2011-01-01正式通过认证\r\n");
      out.write("\t\t\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www.chsi.com.cn/\" style=\"text-decoration: none;\">前 往</a> \r\n");
      out.write("\t\t\t\t\t\t</figcaption> \r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"cs-style-4\">\r\n");
      out.write("\t\t\t\t\t<figure>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/04.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<figcaption>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>艺考网</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"font-size: 16px; font-family: '清茶楷体预览版';\">\r\n");
      out.write("\t\t\t\t\t\t\t\t本平台于2009-05-07正式通过认证 \r\n");
      out.write("\t\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"http://www.xihe8.com/\" style=\"text-decoration: none;\">前 往</a> \r\n");
      out.write("\t\t\t\t\t\t</figcaption> \r\n");
      out.write("\t\t\t\t\t</figure>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<br class=\"br\" />\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
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
}
