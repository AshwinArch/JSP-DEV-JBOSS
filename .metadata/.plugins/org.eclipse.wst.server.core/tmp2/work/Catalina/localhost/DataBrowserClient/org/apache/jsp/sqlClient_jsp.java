package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sqlClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      com.lara.SQLClient client = null;
      synchronized (session) {
        client = (com.lara.SQLClient) _jspx_page_context.getAttribute("client", PageContext.SESSION_SCOPE);
        if (client == null){
          client = new com.lara.SQLClient();
          _jspx_page_context.setAttribute("client", client, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("client"), "driverClass", "oracle.jdbc.driver.OracleDriver", null, null, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("client"), "url", "jdbc:oracle:thin:@localhost:1521:XE", null, null, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("client"), "user", "system", null, null, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("client"), "password", "123", null, null, false);
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
  String sql=request.getParameter("sql");
	String results=null;
	if(sql!=null)
	{
		results=client.getResults(sql);
	}
	else
	{
		sql="";
	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<form action=\"\" method=\"post\">\r\n");
      out.print(client.getListOfSQLQueries());
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("SQL Query:\r\n");
      out.write("<textarea rows=\"4\" cols=\"50\" name=\"sql\" >");
      out.print(sql);
      out.write("</textarea>\r\n");
      out.write("<input type='submit' value='submit'></input>\r\n");
      out.write("</form>\r\n");

	if(sql.length()>0)
	{
		out.println(results);
	}

      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
