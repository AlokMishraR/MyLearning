package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style3 {font-size: 18px; font-weight: bold; }\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"372\" height=\"26\">&nbsp;</td>\n");
      out.write("    <td width=\"625\">&nbsp;</td>\n");
      out.write("    <td width=\"11\">&nbsp;</td>\n");
      out.write("    <td width=\"253\">&nbsp;</td>\n");
      out.write("    <td width=\"39\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"200\">&nbsp;</td>\n");
      out.write("    <td rowspan=\"2\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFF99\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"55\" height=\"15\"></td>\n");
      out.write("        <td width=\"142\"></td>\n");
      out.write("        <td width=\"95\"></td>\n");
      out.write("        <td width=\"26\"></td>\n");
      out.write("        <td width=\"95\"></td>\n");
      out.write("        <td width=\"20\"></td>\n");
      out.write("        <td width=\"192\"></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"29\"></td>\n");
      out.write("        <td valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\"><span class=\"style3\">PassportId</span></div></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield2\">\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"17\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"28\" colspan=\"7\" valign=\"top\" bgcolor=\"#0000FF\"><div align=\"center\" class=\"style3\">Personal Information </div></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"29\">&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"25\">&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">CustomerName</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield\">\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"14\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"24\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">Age</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield3\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"15\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"22\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">Gender</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><p>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup1\" value=\"radio\">\n");
      out.write("            Male</label>\n");
      out.write("          <br>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup1\" value=\"radio\">\n");
      out.write("            Female</label>\n");
      out.write("          <br>\n");
      out.write("        </p></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"14\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"26\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">City</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield4\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"15\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"24\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">EMailId</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield5\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"26\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">ContactNo</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield6\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"26\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"25\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style3\">Class</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><p>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup2\" value=\"radio\">\n");
      out.write("            First Class</label>\n");
      out.write("          <br>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup2\" value=\"radio\">\n");
      out.write("            Economy</label>\n");
      out.write("          <br>\n");
      out.write("        </p></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"29\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\"><span class=\"style3\">FlightNo</span></div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield7\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"22\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"29\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Book\">\n");
      out.write("        </label></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"198\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("    </table>    </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><img src=\"images/store1.jpg\" width=\"535\" height=\"257\"></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"531\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
