/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-03-02 08:46:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.Iterator;
import com.mkj.entities.Doctor;
import java.util.List;
import com.mkj.dao.DAOImpl;

public final class DailyStats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.mkj.dao.DAOImpl");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("com.mkj.entities.Doctor");
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
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Wellness Pollyclinic</title>\r\n");
      out.write("<link rel=\"icon\" href=\"wellicon.ico\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("  background-color: Crimson;  \r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: .5em;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:focus,\r\n");
      out.write(".button:hover {\r\n");
      out.write("  background-color: FireBrick;\r\n");
      out.write("  color: White;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UserHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		DAOImpl dao = new DAOImpl();

		List<Doctor> doctors = dao.getAllDoctor();

		Iterator<Doctor> itr = doctors.iterator();
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<form method=\"post\" action=\"DailyStatsServlet\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td> Choose Date</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td><input type=\"date\" name=\"todayDate\" default></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td> Select Doctor</td>\r\n");
      out.write("\t\t\t\t<td><select name=\"doctor\" id=\"docName\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							
							while (itr.hasNext()) {
								Doctor temp = itr.next();

								String doctorName = temp.getDoctorName();
							
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option> ");
      out.print(doctorName);
      out.write(" </option>\r\n");
      out.write("\t\t\t\t\t\t");

							} //end while
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"Get Today's Transaction\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"reset\"></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<hr/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t");

		
		Object objdoctorFees = request.getAttribute("dailyStats_docFees");
		Object objclinicFees = request.getAttribute("dailyStats_clinicFees");
		
		Object objdocName = request.getAttribute("dailyStats_docName");
		Object objdate = request.getAttribute("dailyStats_date");
		Object objcount = request.getAttribute("dailyStats_count");
		Object objdocShare = request.getAttribute("dailyStats_docShare");
		
		
		
		
		int docFees= 0,clinicFees= 0,count = 0,docshare= 0;
		String docName = null;
		Date todayDate = null;
		
		boolean flag = false;
		
		if(objdoctorFees != null)
		{
			flag = true;
			docFees = (Integer)objdoctorFees;
			
		}
		if(objdocName != null)
		{
			flag = true;
			docName = (String)objdocName;
		}
		
		if(objdate != null)
		{
			flag = true;
			todayDate = (Date)objdate;
			
		}
		if(objcount != null)
		{
			flag = true;
			count = (Integer)objcount;
		}
		if(objclinicFees != null)
		{
			flag = true;
			clinicFees = (Integer)objclinicFees;
			
		}
		
		if(objdocShare != null)
		{
			flag = true;
			docshare = (Integer)objdocShare;
			
		}
	
		if(flag == true)
		{
			
			
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<p style=\"background-color: red;text-shadow: aqua;color: white;\"> Doctor Signature on Payment Slip is mandatory </p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<table style=\"padding-top: 12px; padding-bottom: 12px;  \r\n");
      out.write("\t\t\t\t\ttext-align: left; background-color:#98F6BE; ;color: black;border:thick;\";\r\n");
      out.write("\t\t\t\t\tpadding: 30px;column-width: 30%;\" cellspacing=\"30\" cellpadding=\"1\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> Doctor Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> ");
      out.print(docName );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> Total Patient Count</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> ");
      out.print(count );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> Doctor Per Patient Fees</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> ");
      out.print(docshare );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> Doctor Total Payment Made by Clinic</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> ");
      out.print(docFees );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> Date of Payment</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> ");
      out.print(todayDate );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <a href=\"DoctorPaymentPrintServlet?name=");
      out.print(docName);
      out.write("&count=");
      out.print(count);
      out.write("&totalfees=");
      out.print(docFees);
      out.write("\" class=\"button\">Print Payment Slip</a>   </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

		}
		
		
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AllFooter.jsp", out, false);
      out.write("\r\n");
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