package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_insert_attribute_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p1_link_style_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_insert_attribute_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_p1_link_style_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_insert_attribute_nobody.release();
    _jspx_tagPool_p1_link_style_action.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:256px;\n");
      out.write("\ttop:154px;\n");
      out.write("\twidth:1px;\n");
      out.write("\theight:59px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tbackground-color: #0000FF;\n");
      out.write("}\n");
      out.write("#Layer2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:40px;\n");
      out.write("\ttop:212px;\n");
      out.write("\twidth:217px;\n");
      out.write("\theight:60px;\n");
      out.write("\tz-index:2;\n");
      out.write("\tbackground-color: #0000FF;\n");
      out.write("}\n");
      out.write("#Layer3 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:11px;\n");
      out.write("\ttop:155px;\n");
      out.write("\twidth:246px;\n");
      out.write("\theight:56px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tbackground-color: #0000FF;\n");
      out.write("}\n");
      out.write("#Layer4 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:11px;\n");
      out.write("\ttop:214px;\n");
      out.write("\twidth:246px;\n");
      out.write("\theight:60px;\n");
      out.write("\tz-index:2;\n");
      out.write("\tbackground-color: #0000FF;\n");
      out.write("}\n");
      out.write(".style1 {font-weight: bold}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"Layer3\">\n");
      out.write("    <div align=\"center\" >");
      if (_jspx_meth_p1_link_0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"Layer4\">\n");
      out.write("    <div align=\"center\">");
      if (_jspx_meth_p1_link_1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"Layer5\">\n");
      out.write("    <div align=\"center\">");
      if (_jspx_meth_p1_link_2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"140\" colspan=\"2\" valign=\"top\"><img src=\"images/head.jpg\" width=\"1349\" height=\"140\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"249\" height=\"523\" valign=\"top\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#9999FF\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"249\" height=\"60\" valign=\"top\"><div></div>\n");
      out.write("          <div></div></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"59\" valign=\"top\"><div></div>\n");
      out.write("          <div></div></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"404\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("    </table>    </td>\n");
      out.write("    <td width=\"1100\" valign=\"top\"><p>&nbsp;</p>\n");
      out.write("    <p>");
      if (_jspx_meth_p_insert_0(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("    <p>&nbsp;</p></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"36\" colspan=\"2\" valign=\"top\" bgcolor=\"#FF0000\"><div class=\"style1\" id=\"copyrights\">\n");
      out.write("      <div align=\"center\"><br />\n");
      out.write("        This Site works best when viewed in Mozilla Firefox (3.6.1 or higher)</div>\n");
      out.write("    </div>\n");
      out.write("      <div id=\"copyrights\">\n");
      out.write("        <div align=\"center\">Copyright &copy; ALOK INFOTECH. All rights reserved.</div>\n");
      out.write("      </div>\n");
      out.write("    <div id=\"designedby\">\n");
      out.write("      <div align=\"center\">Designed by ALOK MISHRA </div>\n");
      out.write("    </div></td>\n");
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

  private boolean _jspx_meth_p1_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p1:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p1_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p1_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p1_link_0.setPageContext(_jspx_page_context);
    _jspx_th_p1_link_0.setParent(null);
    _jspx_th_p1_link_0.setAction("/log10");
    _jspx_th_p1_link_0.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p1_link_0 = _jspx_th_p1_link_0.doStartTag();
    if (_jspx_eval_p1_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p1_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p1_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p1_link_0.doInitBody();
      }
      do {
        out.write("<div>Add Flights</div>");
        int evalDoAfterBody = _jspx_th_p1_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p1_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p1_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_0);
      return true;
    }
    _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_0);
    return false;
  }

  private boolean _jspx_meth_p1_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p1:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p1_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p1_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p1_link_1.setPageContext(_jspx_page_context);
    _jspx_th_p1_link_1.setParent(null);
    _jspx_th_p1_link_1.setAction("/log11");
    _jspx_th_p1_link_1.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p1_link_1 = _jspx_th_p1_link_1.doStartTag();
    if (_jspx_eval_p1_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p1_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p1_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p1_link_1.doInitBody();
      }
      do {
        out.write("Cancel Flights");
        int evalDoAfterBody = _jspx_th_p1_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p1_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p1_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_1);
      return true;
    }
    _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_1);
    return false;
  }

  private boolean _jspx_meth_p1_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p1:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p1_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p1_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p1_link_2.setPageContext(_jspx_page_context);
    _jspx_th_p1_link_2.setParent(null);
    _jspx_th_p1_link_2.setAction("/log40");
    _jspx_th_p1_link_2.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p1_link_2 = _jspx_th_p1_link_2.doStartTag();
    if (_jspx_eval_p1_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p1_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p1_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p1_link_2.doInitBody();
      }
      do {
        out.write("Logout");
        int evalDoAfterBody = _jspx_th_p1_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p1_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p1_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_2);
      return true;
    }
    _jspx_tagPool_p1_link_style_action.reuse(_jspx_th_p1_link_2);
    return false;
  }

  private boolean _jspx_meth_p_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_p_insert_0 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_p_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_p_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_p_insert_0.setParent(null);
    _jspx_th_p_insert_0.setAttribute("Body1");
    int _jspx_eval_p_insert_0 = _jspx_th_p_insert_0.doStartTag();
    if (_jspx_th_p_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_0);
      return true;
    }
    _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_0);
    return false;
  }
}
