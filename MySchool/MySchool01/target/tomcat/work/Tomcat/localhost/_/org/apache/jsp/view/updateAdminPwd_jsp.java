/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-28 06:46:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.chj.entity.AdminEntity;

public final class updateAdminPwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/view/top.jsp", Long.valueOf(1527404416000L));
    _jspx_dependants.put("/view/left_admin.jsp", Long.valueOf(1527489428328L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap-theme.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-2.1.0.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.min.js\" ></script>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #right_content{\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 700px;\r\n");
      out.write("            padding-top: 100px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            padding-left: 100px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"top\" style=\"height: 100px;margin: auto;background-color: black;\">\r\n");
      out.write("    <h3 style=\"padding-top: 35px;color: white;padding-left: 80px;\">校园宿舍管理系统</h3>\r\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap-theme.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/jquery-2.1.0.js\" ></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/bootstrap.min.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\" media=\"screen\" type=\"text/css\" />\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"left\" style=\"float: left\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li class=\"active\"><i class=\"fa fa-home fa-lg\"></i> <a href=\"main_admin.jsp\" >后台首页</a></li>\r\n");
      out.write("        <li ><i class=\"fa fa-envelope fa-lg\"></i> <a href=\"../queryBuildAdmin.do\">楼宇管理员管理</a></li>\r\n");
      out.write("        <li ><i class=\"fa fa-user fa-lg\"></i> <a href=\"querystu.do\">学生管理</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-cogs fa-lg\"></i> <a  href=\"queryBuild.do\">楼宇管理</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"querydor.do\">宿舍管理</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"../view/addIn.jsp\">学生入住登记</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"#\">学生寝室调换</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"../queryin_out.do\">学生迁出登记</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"queryQueqing.do\">学生缺寝记录</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"showout.do\">迁出记录</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"../view/updateAdminPwd.jsp\">修改密码</a></li>\r\n");
      out.write("        <li><i class=\"fa fa-power-off fa-lg\"></i><a href=\"../exitAdmin.do\">退出系统</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<div id=\"right_content\" class=\"tip\">\r\n");
      out.write("    ");
 AdminEntity stu= (AdminEntity) request.getAttribute("admin");
      out.write("\r\n");
      out.write("    <form action=\"/updateAdminPwd.do\" method=\"post\">\r\n");
      out.write("        <input type=\"hidden\" name=\"method\" value=\"update\">\r\n");
      out.write("        请输入原密码:<input type=\"text\" name=\"a_pwd\" ><br/><br/>\r\n");
      out.write("        请输入新密码:<input type=\"text\" name=\"a_newpwd\" /><br/><br/>\r\n");
      out.write("        请重复新密码:<input type=\"text\" name=\"a_newpwds\" /><br/><br/>\r\n");
      out.write("        <input  type=\"submit\"  value=\"修改\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}