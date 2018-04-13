package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <style>\n");
      out.write("   /*topnavigation*/\n");
      out.write("        li {\n");
      out.write("    float: left;\n");
      out.write("      display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("    display: inline-block;\n");
      out.write("    color:white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color:white;\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li.dropdown {\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".topnav input[type=text] {\n");
      out.write("  float: right;\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 16px;\n");
      out.write("  border: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .topnav a, .topnav input[type=text] {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 14px;\n");
      out.write("  }\n");
      out.write("  .topnav input[type=text] {\n");
      out.write("    border: 1px solid #ccc;  \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/*images*/\n");
      out.write("div.gallery {\n");
      out.write("    margin-left: 100px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    float: left;\n");
      out.write("    width: 300px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.gallery img {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 300px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("div.desc {\n");
      out.write("    padding: 15px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("/*table*/\n");
      out.write("th{\n");
      out.write("    border-bottom:1px solid gray;\n");
      out.write("    padding:5px 5px;\n");
      out.write("   font-size:25px;background-color:#f1f1f1;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("     font-size:25px;\n");
      out.write("    background-color:#f1f1f1;\n");
      out.write("     text-decoration: none;\n");
      out.write("     display: block;\n");
      out.write("}\n");
      out.write("td a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    display:inline-block;\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("tr a:hover{\n");
      out.write("    background-color:#1db083;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-image:url(\"bg1.jpg\");\n");
      out.write("    background-color: #cccccc;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("<ul style=\"list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;width:100%;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:#1db083;color:white;\">\n");
      out.write("  <li><a href=\"newp.jsp\">Home</a></li>\n");
      out.write("  <li><a href=\"#about\">About</a></li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Product</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Men</a>\n");
      out.write("      <a href=\"#\">Women</a>\n");
      out.write("      <a href=\"#\">Kids</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"#about\">Contact</a></li>\n");
      out.write("   <li style=\"float:right\"><a href=\"#search\">Search</a></li>\n");
      out.write("  <li style=\"float:right\"><input type=\"text\" placeholder=\"Search..\"></li>\n");
      out.write(" </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div style=\"background-color:#f1f1f1;border-radius: 20px;\" class=\"gallery\" >\n");
      out.write("       <img src=\"man.jpg\" alt=\"Forests\" width=\"700\" height=\"500\">\n");
      out.write("       <div style=\"text-align: center;\" class=\"desc\">\n");
      out.write("       <table align=\"center\" style=\"width:100%;height:100%;margin-left:100;text-align: center;\">\n");
      out.write("          <th>MEN</th>\n");
      out.write("          <br>\n");
      out.write("          <tr><td><a href=\"first.jsp\"> Topwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Bottomwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Accessories</a></td></tr>\n");
      out.write("       </div>\n");
      out.write("      </table>\n");
      out.write("           <br>\n");
      out.write("           \n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("     <div style=\"background-color:#f1f1f1;margin-left:600;border-radius: 20px;\" class=\"gallery\" >\n");
      out.write("       <img src=\"wm.jpg\" alt=\"Forests\" width=\"700\" height=\"500\">\n");
      out.write("       <div style=\"text-align: center;\" class=\"desc\">\n");
      out.write("       <table align=\"center\" style=\"width:100%;height:100%;text-align: center;\">\n");
      out.write("          <th>WOMEN</th>\n");
      out.write("          <br>\n");
      out.write("          <tr><td><a href=\"womentop.jsp\"> Topwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"wbottom.jsp\"> Bottomwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("       <tr><td><a href=\"#about\"> Accessories</a></td></tr></div>\n");
      out.write("      </table> <br>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div style=\"background-color:#f1f1f1;margin-left:600;border-radius: 20px;\" class=\"gallery\" >\n");
      out.write("       <img src=\"k.jpg\" alt=\"Forests\" width=\"700\" height=\"500\">\n");
      out.write("       <div style=\"text-align: center;\" class=\"desc\">\n");
      out.write("       <table align=\"center\" style=\"width:100%;height:100%;text-align: center;\">\n");
      out.write("          <th>KIDS</th>\n");
      out.write("          <br>\n");
      out.write("          <tr><td><a href=\"kidclothes.jsp\"> Clothing</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Babycare</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("       <tr><td><a href=\"#about\"> Toys</a></td></tr></div>\n");
      out.write("      </table> <br>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
}
