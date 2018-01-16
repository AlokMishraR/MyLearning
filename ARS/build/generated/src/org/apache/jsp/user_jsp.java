package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_insert_attribute_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_insert_attribute_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_insert_attribute_nobody.release();
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("      <td height=\"80\" colspan=\"2\" valign=\"top\">");
      if (_jspx_meth_p_insert_0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td width=\"150\" height=\"550\" valign=\"top\">");
      if (_jspx_meth_p_insert_1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("      <td width=\"856\" valign=\"top\">");
      if (_jspx_meth_p_insert_2(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td height=\"20\" colspan=\"2\" valign=\"top\">");
      if (_jspx_meth_p_insert_3(_jspx_page_context))
        return;
      out.write("</td>\n");
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

  private boolean _jspx_meth_p_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_p_insert_0 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_p_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_p_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_p_insert_0.setParent(null);
    _jspx_th_p_insert_0.setAttribute("Header");
    int _jspx_eval_p_insert_0 = _jspx_th_p_insert_0.doStartTag();
    if (_jspx_th_p_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_0);
      return true;
    }
    _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_0);
    return false;
  }

  private boolean _jspx_meth_p_insert_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_p_insert_1 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_p_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_p_insert_1.setPageContext(_jspx_page_context);
    _jspx_th_p_insert_1.setParent(null);
    _jspx_th_p_insert_1.setAttribute("Menu");
    int _jspx_eval_p_insert_1 = _jspx_th_p_insert_1.doStartTag();
    if (_jspx_th_p_insert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_1);
      return true;
    }
    _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_1);
    return false;
  }

  private boolean _jspx_meth_p_insert_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_p_insert_2 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_p_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_p_insert_2.setPageContext(_jspx_page_context);
    _jspx_th_p_insert_2.setParent(null);
    _jspx_th_p_insert_2.setAttribute("Body");
    int _jspx_eval_p_insert_2 = _jspx_th_p_insert_2.doStartTag();
    if (_jspx_th_p_insert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_2);
      return true;
    }
    _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_2);
    return false;
  }

  private boolean _jspx_meth_p_insert_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:insert
    org.apache.struts.tiles.taglib.InsertTag _jspx_th_p_insert_3 = (org.apache.struts.tiles.taglib.InsertTag) _jspx_tagPool_p_insert_attribute_nobody.get(org.apache.struts.tiles.taglib.InsertTag.class);
    _jspx_th_p_insert_3.setPageContext(_jspx_page_context);
    _jspx_th_p_insert_3.setParent(null);
    _jspx_th_p_insert_3.setAttribute("Footer");
    int _jspx_eval_p_insert_3 = _jspx_th_p_insert_3.doStartTag();
    if (_jspx_th_p_insert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_3);
      return true;
    }
    _jspx_tagPool_p_insert_attribute_nobody.reuse(_jspx_th_p_insert_3);
    return false;
  }
}
