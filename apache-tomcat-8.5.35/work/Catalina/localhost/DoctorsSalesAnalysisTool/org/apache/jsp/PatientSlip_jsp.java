/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-03-02 08:47:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import com.mkj.entities.Doctor;
import java.util.List;
import com.mkj.dao.DAOImpl;

public final class PatientSlip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Wellness Pollyclinic</title>\r\n");
      out.write("<link rel=\"icon\" href=\"wellicon.ico\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("var xmlhttp = new XMLHttpRequest();\r\n");
      out.write("function doAgeStuff(age)\r\n");
      out.write("{\r\n");
      out.write("\tvar output = document.getElementById(\"ageOutput\");\r\n");
      out.write("\toutput.value = age;\r\n");
      out.write("}\r\n");
      out.write("function doWeightStuff(weight)\r\n");
      out.write("{\r\n");
      out.write("\tvar output = document.getElementById(\"weightOutput\");\r\n");
      out.write("\toutput.value = weight;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function updateFees(contextPath)\r\n");
      out.write("{\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\tcontextPath = contextPath.substr(1);\r\n");
      out.write("\t\tvar docName = document.getElementById(\"docName\").value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar xhr = new XMLHttpRequest();\r\n");
      out.write("\t\tvar url = contextPath+\"/GetDoctorFeesServlet?doctorName=\"+docName;\r\n");
      out.write("\t\txhr.open(\"GET\", url, true);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t    xhr.onreadystatechange = function () {\r\n");
      out.write("\t    \tif (xhr.readyState == 4 && xhr.status == 200) {\r\n");
      out.write("\t\t    \tdocument.getElementById(\"feesId\").value = xhr.responseText;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    else\r\n");
      out.write("\t\t    \t{\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t    \t\t//alert(\" Error in Ajax Contact to Developer \"+xhr.readyState+\" and \"+xhr.status)\r\n");
      out.write("\t\t    \t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t    xhr.send();\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch(e)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"Ajax Exception \");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}//end function\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UserHeader.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t");

		DAOImpl dao = new DAOImpl();

		List<Doctor> doctors = dao.getAllDoctor();

		Iterator<Doctor> itr = doctors.iterator();
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"post\" action=\"GenerateSlipServlet\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Patient Name</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"patientName\"></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Patient Age</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"range\" min=\"0\" max=\"130\" class=\"slider\"\r\n");
      out.write("\t\t\t\t\tid=\"myRange\" name=\"patientAge\" oninput=\"doAgeStuff(this.value)\" onchange=\"doAgeStuff(this.value)\"/></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" readonly=\"true\" id=\"ageOutput\" name=\"ageOutput\" size=\"3\"/>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Patient Gender</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"radio\" name=\"gender\" value=\"Male\">Male\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"Female\">Female</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Patient Weight</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"range\" min=\"0\" max=\"200\" class=\"slider\"\r\n");
      out.write("\t\t\t\t\tid=\"myRange\" name=\"patientWeight\" oninput=\"doWeightStuff(this.value)\" onchange=\"doWeightStuff(this.value)\"/></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" readonly=\"true\" id=\"weightOutput\" name=\"ageOutput\" size=\"3\"/>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Doctor</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<td><select name=\"doctor\" onchange=\"updateFees('/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("')\" id=\"docName\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							int fees = 0;
							while (itr.hasNext()) {
								Doctor temp = itr.next();

								String doctorName = temp.getDoctorName();
								fees = temp.getFees();
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option> ");
      out.print(doctorName);
      out.write(" </option>\r\n");
      out.write("\t\t\t\t\t\t");

							} //end while
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--  end of doctor choosing select  -->\r\n");
      out.write("\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"fees\" readonly=\"true\" placeholder=\"fees\" id=\"feesId\" size=\"4\"/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"Generate Slip\"></td>\r\n");
      out.write("\t\t\t\t<td><input type=\"reset\"></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "AllFooter.jsp", out, false);
      out.write("\r\n");
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
