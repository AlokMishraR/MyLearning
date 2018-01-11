package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class fare_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".style2 {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tbackground-color: #99CCFF;\n");
      out.write("\tbackground-image: url(images/6.jpg);\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form action=\"fareinfo.jsp\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"497\" height=\"69\">&nbsp;</td>\n");
      out.write("    <td width=\"420\">&nbsp;</td>\n");
      out.write("    <td width=\"383\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"313\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFF99\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"26\" colspan=\"5\" valign=\"top\" bgcolor=\"#0000FF\"><div align=\"center\" class=\"style2\">Get Fare Information </div></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"55\" height=\"19\">&nbsp;</td>\n");
      out.write("        <td width=\"134\">&nbsp;</td>\n");
      out.write("        <td width=\"95\">&nbsp;</td>\n");
      out.write("        <td width=\"37\">&nbsp;</td>\n");
      out.write("        <td width=\"99\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"22\">&nbsp;</td>\n");
      out.write("        <td valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style1\">From</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <select name=\"select\">\n");
      out.write("                  <option value=\"-1\">Select Source </option>\n");
      out.write("                     \n");
      out.write("                    ");

try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from fare");
ResultSet rs=pst.executeQuery();

while(rs.next())
      {
    
      out.write("\n");
      out.write("    \n");
      out.write("    <option value=\"");
      out.print(rs.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(1));
      out.write("</option>\n");
      out.write("    ");

}
}
catch(Exception e)
{
out.println(e);
}                                 

      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </select>\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"22\">&nbsp;</td>\n");
      out.write("        <td valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style1\">To</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><label>\n");
      out.write("          <select name=\"select2\">\n");
      out.write("                  <option value=\"-1\">Select Source </option>\n");
      out.write("                     \n");
      out.write("                    ");

try
{
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("select * from fare");
ResultSet rs=pst.executeQuery();

while(rs.next())
      {
    
      out.write("\n");
      out.write("    \n");
      out.write("    <option value=\"");
      out.print(rs.getString(2));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("    ");

}
}
catch(Exception e)
{
out.println(e);
}                                 

      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </select>\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\"></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("        <td height=\"44\"></td>\n");
      out.write("        <td valign=\"top\" bgcolor=\"#99FFFF\"><div align=\"center\" class=\"style1\">Class</div></td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\"><p>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup1\" value=\"First Class\" />\n");
      out.write("            First Class</label>\n");
      out.write("          <br />\n");
      out.write("          <label>\n");
      out.write("            <input type=\"radio\" name=\"RadioGroup1\" value=\"Economy\" />\n");
      out.write("            Economy</label>\n");
      out.write("          <br />\n");
      out.write("        </p></td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\"></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"24\"></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td valign=\"top\"><label>\n");
      out.write("          <input type=\"submit\" name=\"Submit\" value=\"Get Fare\" />\n");
      out.write("        </label></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("    </table>\n");
      out.write("    </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"268\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
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
