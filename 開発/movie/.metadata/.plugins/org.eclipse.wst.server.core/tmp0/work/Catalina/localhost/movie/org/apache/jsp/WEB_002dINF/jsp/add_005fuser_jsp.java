/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-06-25 05:03:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"css/user_add.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<title>会員登録</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"cmxform\" action=\"user\" method=\"POST\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend>新規会員登録</legend>\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t\t<li><label for=\"address\">メールアドレス<em>*</em></label>\r\n");
      out.write("\t\t\t\t <input type =\"email\" id=\"mail\" name=\"mail\" required=\"required\"/></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><label for=\"name\">名前<em>*</em></label>\r\n");
      out.write("\t\t\t\t<input id=\"name\" name=\"name\"required=\"required\" /></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><label for=\"sex\">性別<em>*</em></label>\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"男\" checked=\"checked\">男\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"女\">女</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><label for=\"year\">生年月日 <span class=\"sr\">生年月日(年)</span><em>*</em></label>\r\n");
      out.write("\t\t\t\t\t<select id=\"year\" name=\"year\"></select>\r\n");
      out.write("\t\t\t\t\t<label for=\"month\" class=\"sr\">生年月日（月) <em>*</em></label>\r\n");
      out.write("\t\t\t\t    <select id=\"month\" name=\"month\"></select>\r\n");
      out.write("\t\t\t\t    <label for=\"day\" class=\"sr\">生年月日 (日) <em>*</em></label>\r\n");
      out.write("\t\t\t\t    <select id=\"day\" name=\"day\"></select>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><label for=\"password\">パスワード<em>*</em></label>\r\n");
      out.write("\t\t\t\t <input type=\"password\" id=\"password\" name=\"password\" required=\"required\"/></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><label for=\"postcode\">パスワード再入力<em>*</em></label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" id=\"r-password\" name=\"r-password\" required=\"required\"/></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t");

						String errflg = request.getParameter("errflg");
					 if (errflg != null && errflg.equals("1")) {
 					
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"err\">パスワードは同じ文字をいれてください！</p> ");

 						}
 					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login\" class=\"back\">戻る</a><input type=\"submit\" value=\"登録\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"send\" />\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t//optionタグ量産\r\n");
      out.write("\tconst year = document.getElementById('year')\r\n");
      out.write("\tconst month = document.getElementById('month')\r\n");
      out.write("\tconst day = document.getElementById('day')\r\n");
      out.write("\tfor (let i = 1960; i <= 2019; i++) {\r\n");
      out.write("\t\tconst optionTag = document.createElement(\"option\")\r\n");
      out.write("\t\tyear.appendChild(optionTag)\r\n");
      out.write("\t\tdispatchOption(optionTag, i)\r\n");
      out.write("\t}\r\n");
      out.write("\tfor (let i = 1; i <= 12; i++) {\r\n");
      out.write("\t\tconst optionTag = document.createElement(\"option\")\r\n");
      out.write("\t\tmonth.appendChild(optionTag)\r\n");
      out.write("\t\tdispatchOption(optionTag, i)\r\n");
      out.write("\t}\r\n");
      out.write("\tfor (let i = 1; i < 31; i++) {\r\n");
      out.write("\t\tconst optionTag = document.createElement(\"option\")\r\n");
      out.write("\t\tday.appendChild(optionTag)\r\n");
      out.write("\t\tdispatchOption(optionTag, i)\r\n");
      out.write("\t}\r\n");
      out.write("\t//optionタグにvalueと表示文字を付与\r\n");
      out.write("\tfunction dispatchOption(option, value) {\r\n");
      out.write("\t\toption.textContent = value\r\n");
      out.write("\t\toption.value = value\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
