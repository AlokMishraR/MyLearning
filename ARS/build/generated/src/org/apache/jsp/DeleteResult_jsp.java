package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DeleteResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_link_action.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {\n");
      out.write("\tfont-size: 24px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("              \n");
      out.write("                         \n");
      out.write("                    ");

try
{
    String st=request.getParameter("select");
    Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS","root","ujjawal");
PreparedStatement pst=con.prepareStatement("delete from flightinfo where flightno=?");
PreparedStatement pst1=con.prepareStatement("delete from reservationpnr where flightnumber=?");
pst.setString(1, st);
pst1.setString(1, st);
pst.executeUpdate();
pst1.executeUpdate();
}
catch(Exception e)
{
out.println(e);
}                                 

      out.write("\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCCC\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"470\" height=\"61\">&nbsp;</td>\n");
      out.write("    <td width=\"437\">&nbsp;</td>\n");
      out.write("    <td width=\"393\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"285\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#99CCFF\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"60\" height=\"49\">&nbsp;</td>\n");
      out.write("        <td width=\"265\">&nbsp;</td>\n");
      out.write("        <td width=\"45\">&nbsp;</td>\n");
      out.write("        <td width=\"54\">&nbsp;</td>\n");
      out.write("        <td width=\"13\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"123\">&nbsp;</td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\" bgcolor=\"#00FFFF\"><div align=\"center\" class=\"style1\">Flight Deleted Succesfully </div></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"65\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"19\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td colspan=\"2\" valign=\"top\">");
      if (_jspx_meth_p_link_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"29\">&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"304\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_p_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_0.setPageContext(_jspx_page_context);
    _jspx_th_p_link_0.setParent(null);
    _jspx_th_p_link_0.setAction("/log22");
    int _jspx_eval_p_link_0 = _jspx_th_p_link_0.doStartTag();
    if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_0.doInitBody();
      }
      do {
        out.write("Back To Home");
        int evalDoAfterBody = _jspx_th_p_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
    return false;
  }
}
