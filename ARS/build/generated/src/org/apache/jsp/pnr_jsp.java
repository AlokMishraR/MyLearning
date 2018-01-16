package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pnr_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(".style2 {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"461\" height=\"285\">&nbsp;</td>\n");
      out.write("    <td width=\"438\">&nbsp;</td>\n");
      out.write("    <td width=\"401\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"280\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFF99\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"52\" colspan=\"4\" valign=\"top\" bgcolor=\"#0000FF\"><div align=\"center\" class=\"style2\">GET PNR STATUS </div></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"52\" height=\"38\">&nbsp;</td>\n");
      out.write("        <td width=\"140\">&nbsp;</td>\n");
      out.write("        <td width=\"122\">&nbsp;</td>\n");
      out.write("        <td width=\"124\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"31\">&nbsp;</td>\n");
      out.write("        <td valign=\"top\">Enter PNR No </td>\n");
      out.write("        <td valign=\"top\"><label>\n");
      out.write("          <input type=\"text\" name=\"textfield\" />\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"31\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td valign=\"top\"><label>\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Get Status\" />\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"105\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"85\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
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
