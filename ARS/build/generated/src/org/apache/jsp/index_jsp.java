package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {\n");
      out.write("\tfont-size: 36px;\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".style3 {font-weight: bold}\n");
      out.write(".style4 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #0000FF;\n");
      out.write("}\n");
      out.write(".style5 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:239px;\n");
      out.write("\ttop:184px;\n");
      out.write("\twidth:157px;\n");
      out.write("\theight:45px;\n");
      out.write("\tz-index:1;\n");
      out.write("}\n");
      out.write("#Layer2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:398px;\n");
      out.write("\ttop:187px;\n");
      out.write("\twidth:137px;\n");
      out.write("\theight:44px;\n");
      out.write("\tz-index:2;\n");
      out.write("}\n");
      out.write("#Layer3 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:536px;\n");
      out.write("\ttop:186px;\n");
      out.write("\twidth:170px;\n");
      out.write("\theight:44px;\n");
      out.write("\tz-index:3;\n");
      out.write("}\n");
      out.write(".style6 {font-size: 24px}\n");
      out.write(".style7 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: #FF0000;\n");
      out.write("}\n");
      out.write("#Layer4 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:707px;\n");
      out.write("\ttop:186px;\n");
      out.write("\twidth:153px;\n");
      out.write("\theight:43px;\n");
      out.write("\tz-index:4;\n");
      out.write("}\n");
      out.write("#Layer5 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:861px;\n");
      out.write("\ttop:186px;\n");
      out.write("\twidth:158px;\n");
      out.write("\theight:44px;\n");
      out.write("\tz-index:5;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #99CCCC;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    function check()\n");
      out.write("    {\n");
      out.write("        var a=document.getElementById(\"1\");\n");
      out.write("        var b=document.getElementById(\"2\");\n");
      out.write("        if(a==null || b==null)\n");
      out.write("            {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("     \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form action=\"Login\">\n");
      out.write("<div id=\"Layer1\">\n");
      out.write("  <div align=\"center\" class=\"style6\">Home</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"Layer2\">\n");
      out.write("  <div align=\"center\" class=\"style6\">About</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"Layer3\">\n");
      out.write("  <div align=\"center\" class=\"style6\">Tenders</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"style6\" id=\"Layer4\">\n");
      out.write("  <div align=\"center\">Career</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"Layer5\">\n");
      out.write("  <div align=\"center\" class=\"style6\">Branches</div>\n");
      out.write("</div>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CC99FF\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"172\" colspan=\"5\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#3399FF\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"230\" height=\"172\">&nbsp;</td>\n");
      out.write("        <td width=\"806\" valign=\"top\"><img src=\"images/flight-guide-banner.jpg\" width=\"806\" height=\"172\" /></td>\n");
      out.write("        <td width=\"248\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("    </table>    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"231\" height=\"44\">&nbsp;</td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\" bgcolor=\"#CCCCCC\"><div align=\"center\" class=\"style1\">\n");
      out.write("      <div></div>\n");
      out.write("    </div></td>\n");
      out.write("    <td width=\"273\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"35\">&nbsp;</td>\n");
      out.write("    <td width=\"66\">&nbsp;</td>\n");
      out.write("    <td width=\"697\">&nbsp;</td>\n");
      out.write("    <td width=\"17\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"409\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"42\" height=\"27\">&nbsp;</td>\n");
      out.write("          <td width=\"633\">&nbsp;</td>\n");
      out.write("          <td width=\"22\">&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"354\">&nbsp;</td>\n");
      out.write("          <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#9999FF\">\n");
      out.write("            <!--DWLayoutTable-->\n");
      out.write("            <tr>\n");
      out.write("              <td width=\"26\" height=\"21\">&nbsp;</td>\n");
      out.write("              <td width=\"88\">&nbsp;</td>\n");
      out.write("              <td width=\"25\">&nbsp;</td>\n");
      out.write("              <td width=\"31\">&nbsp;</td>\n");
      out.write("              <td width=\"54\">&nbsp;</td>\n");
      out.write("              <td width=\"107\">&nbsp;</td>\n");
      out.write("              <td width=\"37\">&nbsp;</td>\n");
      out.write("              <td width=\"9\">&nbsp;</td>\n");
      out.write("              <td width=\"13\">&nbsp;</td>\n");
      out.write("              <td width=\"243\">&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"28\">&nbsp;</td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"style4\">User Login </div></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"59\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"28\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td colspan=\"3\" valign=\"top\"><div align=\"center\" class=\"style5\">User Name </div></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("                      <input type=\"text\" name=\"textfield\"  id=\"1\"/>\n");
      out.write("              </label></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\" bgcolor=\"#9999FF\"><span class=\"style7\">*</span></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"26\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"26\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td colspan=\"3\" valign=\"top\"><div align=\"center\" class=\"style5\">Password</div></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("                <input type=\"password\" name=\"textfield2\" id=\"2\" />\n");
      out.write("              </label></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\" bgcolor=\"#9999FF\"><span class=\"style7\">*</span></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"20\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"27\">&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td valign=\"top\"><label>\n");
      out.write("                <select name=\"select\">\n");
      out.write("                  <option>Admin</option>\n");
      out.write("                  <option>Customer</option>\n");
      out.write("                </select>\n");
      out.write("              </label></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"24\"></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\" bgcolor=\"#FFFFFF\"><label>\n");
      out.write("                      <a href=\"NewAccount.jsp\"  style=\"text-decoration: none\">Sign UP</a>\n");
      out.write("              </label></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td></td>\n");
      out.write("              <td colspan=\"2\" valign=\"top\" bgcolor=\"#FFFFFF\"><label>\n");
      out.write("                      <input type=\"submit\" name=\"Submit2\" value=\"Login\" onclick=\"check();\" />\n");
      out.write("              </label></td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("              <td>&nbsp;</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td height=\"93\"></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </table></td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"28\">&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("          <td>&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("    </table></td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"33\" colspan=\"5\" valign=\"top\"><div class=\"style3\" id=\"copyrights\">\n");
      out.write("      <div align=\"center\">This Site works best when viewed in Mozilla Firefox (3.6.1 or higher)</div>\n");
      out.write("    </div>\n");
      out.write("      <div id=\"copyrights\">\n");
      out.write("        <div align=\"center\">Copyright &copy; ALOK INFOTECH. All rights reserved.</div>\n");
      out.write("      </div>\n");
      out.write("    <div id=\"designedby\">\n");
      out.write("      <div align=\"center\">Designed by ALOK MISHRA </div>\n");
      out.write("    </div></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
