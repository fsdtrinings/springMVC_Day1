/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-03-02 08:45:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Wellness Pollyclinic</title>\r\n");
      out.write("<link rel=\"icon\" href=\"wellicon.ico\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".form-style-6 {\r\n");
      out.write("\tfont: 95% Arial, Helvetica, sans-serif;\r\n");
      out.write("\tmax-width: 400px;\r\n");
      out.write("\tmargin: 10px auto;\r\n");
      out.write("\tpadding: 16px;\r\n");
      out.write("\tbackground: #F7F7F7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-6 h1 {\r\n");
      out.write("\tbackground: #43D1AF;\r\n");
      out.write("\tpadding: 20px 0;\r\n");
      out.write("\tfont-size: 140%;\r\n");
      out.write("\tfont-weight: 300;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tmargin: -16px -16px 16px -16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-6 input[type=\"text\"], .form-style-6 input[type=\"date\"],\r\n");
      out.write("\t.form-style-6 input[type=\"datetime\"], .form-style-6 input[type=\"email\"],\r\n");
      out.write("\t.form-style-6 input[type=\"number\"], .form-style-6 input[type=\"search\"],\r\n");
      out.write("\t.form-style-6 input[type=\"time\"], .form-style-6 input[type=\"url\"],\r\n");
      out.write("\t.form-style-6 input[type=\"password\"], .form-style-6 textarea,\r\n");
      out.write("\t.form-style-6 select {\r\n");
      out.write("\t-webkit-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-moz-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-ms-transition: all 0.30s ease-in-out;\r\n");
      out.write("\t-o-transition: all 0.30s ease-in-out;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tmargin-bottom: 4%;\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\tpadding: 3%;\r\n");
      out.write("\tcolor: #555;\r\n");
      out.write("\tfont: 95% Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-6 input[type=\"text\"]:focus, .form-style-6 input[type=\"date\"]:focus,\r\n");
      out.write("\t.form-style-6 input[type=\"datetime\"]:focus, .form-style-6 input[type=\"email\"]:focus,\r\n");
      out.write("\t.form-style-6 input[type=\"number\"]:focus, .form-style-6 input[type=\"search\"]:focus,\r\n");
      out.write("\t.form-style-6 input[type=\"time\"]:focus, .form-style-6 input[type=\"password\"],\r\n");
      out.write("\t.form-style-6 input[type=\"url\"]:focus, .form-style-6 textarea:focus,\r\n");
      out.write("\t.form-style-6 select:focus {\r\n");
      out.write("\tbox-shadow: 0 0 5px #43D1AF;\r\n");
      out.write("\tpadding: 3%;\r\n");
      out.write("\tborder: 1px solid #43D1AF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-6 input[type=\"submit\"], .form-style-6 input[type=\"button\"] {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 3%;\r\n");
      out.write("\tbackground: #43D1AF;\r\n");
      out.write("\tborder-bottom: 2px solid #30C29E;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-style-6 input[type=\"submit\"]:hover, .form-style-6 input[type=\"button\"]:hover\r\n");
      out.write("\t{\r\n");
      out.write("\tbackground: #2EBC99;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"form-style-6\">\r\n");
      out.write("\t\t<h1>Medical Center Login Form</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"username\" placeholder=\"username\"><br />\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"password\" placeholer=\"password\"><br />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Login\"> <br />\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<hr/>\r\n");
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
