/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2018-04-11 11:34:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("    <link href=\"/resources/style1.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <p style=\"text-decoration-color: red;text-align: center;size: 20px;color: red;font-size:larger;font-family: 'Titillium Web', sans-serif\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logoutmsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("    <p style=\"text-decoration-color: red;text-align: center;size: 20px;color: red;font-size:larger;font-family: 'Titillium Web', sans-serif\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <div class=\"panel panel-login\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-6\">\n");
      out.write("                            <a href=\"#\" class=\"active\" id=\"login-form-link\">Login</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-6\">\n");
      out.write("                            <a href=\"#\" id=\"register-form-link\">Register</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <form id=\"login-form\" action=\"/loginDone\" method=\"post\" role=\"form\" style=\"display: block;\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"userName\" id=\"username-login\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"password-login\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group text-center\">\n");
      out.write("                                    <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\n");
      out.write("                                    <label for=\"remember\"> Remember Me</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                            <input type=\"submit\" name=\"login-submit\" id=\"login-submit\" tabindex=\"4\" class=\"form-control btn btn-login\" value=\"Log In\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-lg-12\">\n");
      out.write("                                            <div class=\"text-center\">\n");
      out.write("                                                ");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <form id=\"register-form\" method=\"get\" role=\"form\" style=\"display: none;\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"userName\" id=\"username\" tabindex=\"1\" class=\"form-control\" placeholder=\"Username\" value=\"\" required>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"email\" name=\"userEmail\" id=\"email\" tabindex=\"1\" class=\"form-control\" placeholder=\"Email Address\" value=\"\" required>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"confirmPassword\" id=\"confirm-password\" tabindex=\"2\" class=\"form-control\" placeholder=\"Confirm Password\" required>\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("                                            <input type=\"submit\" name=\"register-submit\" id=\"register-submit\" tabindex=\"4\" class=\"form-control btn btn-register\" value=\"Register Now\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"application/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/resources/home.js\" type=\"application/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   jQuery(function () {\n");
      out.write("\n");
      out.write("       jQuery(\"#register-submit\").click(function () {\n");
      out.write("           var password = jQuery(\"#password\").val();\n");
      out.write("           var confirmPassword = jQuery(\"#confirm-password\").val();\n");
      out.write("           if (password != confirmPassword) {\n");
      out.write("               alert(\"password and confirm password do not matches.\");\n");
      out.write("               return false;\n");
      out.write("           }\n");
      out.write("           else {\n");
      out.write("               var userName = jQuery.trim(jQuery(\"#username\").val());\n");
      out.write("               var userEmail = jQuery.trim(jQuery(\"#email\").val());\n");
      out.write("               var password = jQuery.trim(jQuery(\"#password\").val());\n");
      out.write("               var confirmPassword = jQuery.trim(jQuery(\"#confirm-password\").val());\n");
      out.write("              // alert(\"check\");\n");
      out.write("               jQuery.ajax({\n");
      out.write("                   url: \"/registrationDone\",\n");
      out.write("                   type: \"POST\",\n");
      out.write("                   data: {\n");
      out.write("\n");
      out.write("                       userId: userId,\n");
      out.write("                       userName: userName,\n");
      out.write("                       userEmail: userEmail,\n");
      out.write("                       password: password,\n");
      out.write("                       confirmPassword: confirmPassword\n");
      out.write("                   },\n");
      out.write("                   success: function () {\n");
      out.write("                       alert(\"Data is saved!\")\n");
      out.write("\n");
      out.write("                   }\n");
      out.write("               });\n");
      out.write("           }\n");
      out.write("           return true;\n");
      out.write("       });\n");
      out.write("   });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
