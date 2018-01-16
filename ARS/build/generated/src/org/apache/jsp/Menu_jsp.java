package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_link_style_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_link_style_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_link_style_action.release();
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:12px;\n");
      out.write("\ttop:116px;\n");
      out.write("\twidth:189px;\n");
      out.write("\theight:29px;\n");
      out.write("\tz-index:1;\n");
      out.write("}\n");
      out.write("#Layer2 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:12px;\n");
      out.write("\ttop:115px;\n");
      out.write("\twidth:198px;\n");
      out.write("\theight:32px;\n");
      out.write("\tz-index:1;\n");
      out.write("}\n");
      out.write(".style2 {color: #000000; }\n");
      out.write(".style4 {color: #FF0000}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"150\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#CCCCFF\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("    <td width=\"198\" height=\"550\" valign=\"top\" bgcolor=\"#FFFFFF\"><table width=\"200\" border=\"0\" bgcolor=\"#CCFFFF\">\n");
      out.write("      <!--DWLayoutTable-->\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\">\n");
      out.write("          ");
      if (_jspx_meth_p_link_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div></td>\n");
      out.write("        </tr>\n");
      out.write("      <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\">\n");
      out.write("        ");
      if (_jspx_meth_p_link_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div></td>\n");
      out.write("    </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\">\n");
      out.write("          ");
      if (_jspx_meth_p_link_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div></td>\n");
      out.write("    </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\"> <strong></strong>\n");
      out.write("          ");
      if (_jspx_meth_p_link_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div></td>\n");
      out.write("    </tr>\n");
      out.write("      <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\">\n");
      out.write("        ");
      if (_jspx_meth_p_link_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div></td>\n");
      out.write("    </tr>\n");
      out.write("      <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" style=\"background-color:#0000FF\">\n");
      out.write("        ");
      if (_jspx_meth_p_link_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div></td>\n");
      out.write("    </tr>\n");
      out.write("      <td height=\"23\" valign=\"top\"><div align=\"center\" class=\"style2\" onmouseover style=\"background-color:#0000FF\">\n");
      out.write("              ");
      if (_jspx_meth_p_link_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div></td>\n");
      out.write("    </tr><tr>\n");
      out.write("      <td height=\"373\"></td>\n");
      out.write("    </tr>\n");
      out.write("    </table></td>\n");
      out.write("  <td width=\"2\">&nbsp;</td>\n");
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

  private boolean _jspx_meth_p_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_0.setPageContext(_jspx_page_context);
    _jspx_th_p_link_0.setParent(null);
    _jspx_th_p_link_0.setAction("/log1");
    _jspx_th_p_link_0.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_0 = _jspx_th_p_link_0.doStartTag();
    if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_0.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\"> Search Flight</span>");
        int evalDoAfterBody = _jspx_th_p_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_0);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_0);
    return false;
  }

  private boolean _jspx_meth_p_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_1.setPageContext(_jspx_page_context);
    _jspx_th_p_link_1.setParent(null);
    _jspx_th_p_link_1.setAction("/log2");
    _jspx_th_p_link_1.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_1 = _jspx_th_p_link_1.doStartTag();
    if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_1.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\">Reservation Of Tickets </span>");
        int evalDoAfterBody = _jspx_th_p_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_1);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_1);
    return false;
  }

  private boolean _jspx_meth_p_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_2.setPageContext(_jspx_page_context);
    _jspx_th_p_link_2.setParent(null);
    _jspx_th_p_link_2.setAction("/log3");
    _jspx_th_p_link_2.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_2 = _jspx_th_p_link_2.doStartTag();
    if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_2.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\">Cancellation of Tickets </span>");
        int evalDoAfterBody = _jspx_th_p_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_2);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_2);
    return false;
  }

  private boolean _jspx_meth_p_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_3.setPageContext(_jspx_page_context);
    _jspx_th_p_link_3.setParent(null);
    _jspx_th_p_link_3.setAction("/log4");
    _jspx_th_p_link_3.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_3 = _jspx_th_p_link_3.doStartTag();
    if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_3.doInitBody();
      }
      do {
        out.write(" <span class=\"style4\" style=\"color:  #ffffff\">Check PNR Status</span> ");
        int evalDoAfterBody = _jspx_th_p_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_3);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_3);
    return false;
  }

  private boolean _jspx_meth_p_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_4.setPageContext(_jspx_page_context);
    _jspx_th_p_link_4.setParent(null);
    _jspx_th_p_link_4.setAction("/log5");
    _jspx_th_p_link_4.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_4 = _jspx_th_p_link_4.doStartTag();
    if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_4.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\"> Get Fare </span>");
        int evalDoAfterBody = _jspx_th_p_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_4);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_4);
    return false;
  }

  private boolean _jspx_meth_p_link_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_5.setPageContext(_jspx_page_context);
    _jspx_th_p_link_5.setParent(null);
    _jspx_th_p_link_5.setAction("/log6");
    _jspx_th_p_link_5.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_5 = _jspx_th_p_link_5.doStartTag();
    if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_5.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\"> Flight Status</span>");
        int evalDoAfterBody = _jspx_th_p_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_5);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_5);
    return false;
  }

  private boolean _jspx_meth_p_link_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_style_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_6.setPageContext(_jspx_page_context);
    _jspx_th_p_link_6.setParent(null);
    _jspx_th_p_link_6.setAction("/log7");
    _jspx_th_p_link_6.setStyle("color:white;text-decoration:none");
    int _jspx_eval_p_link_6 = _jspx_th_p_link_6.doStartTag();
    if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_6.doInitBody();
      }
      do {
        out.write("<span class=\"style4\" style=\"color:  #ffffff\"> Profile </span>");
        int evalDoAfterBody = _jspx_th_p_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_6);
      return true;
    }
    _jspx_tagPool_p_link_style_action.reuse(_jspx_th_p_link_6);
    return false;
  }
}
