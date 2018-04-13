package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.io.OutputStream;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class wbottom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>My Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("   /*topnavigation*/\n");
      out.write("        li {\n");
      out.write("    float: left;\n");
      out.write("      display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn {\n");
      out.write("    display: inline-block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 10px 15px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 23px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color:white;color:black;\n");
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
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".topnav\n");
      out.write("{    overflow: hidden;\n");
      out.write("    position: fixed;\n");
      out.write("    width: 100%;top:0;\n");
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
      out.write("/*sidenavigation*/\n");
      out.write(".sidenav {\n");
      out.write("    width: auto;\n");
      out.write("    position: fixed;\n");
      out.write("    z-index: 1;\n");
      out.write("    top: 56px;\n");
      out.write("    left: auto;\n");
      out.write("    background: white;\n");
      out.write("    overflow-x: hidden;\n");
      out.write("    padding: 8px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a{\n");
      out.write("    padding: 6px 8px 6px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: black;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav a:hover {\n");
      out.write("    color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main {\n");
      out.write("    margin-left: 160px; /* Same as the width of the sidenav */\n");
      out.write("    font-size: 25px; /* Increased text to enable scrolling */\n");
      out.write("    padding: 0px 10px;\n");
      out.write("}\n");
      out.write("/*table*/\n");
      out.write("th{\n");
      out.write("   \n");
      out.write("    padding:10px 10px;\n");
      out.write("   font-size:20px;background-color:white;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write(" background-color:white;\n");
      out.write("\n");
      out.write("}\n");
      out.write("td:hover{\n");
      out.write("    background-color: #1db083;\n");
      out.write("}\n");
      out.write("/*images*/\n");
      out.write("div.gallery {\n");
      out.write("    margin-left: 100px;\n");
      out.write("    margin-top: 25px;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("    float: left;\n");
      out.write("    width: 150px;\n");
      out.write("    border-style:solid;\n");
      out.write("    border-color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.gallery img {\n");
      out.write("    width:210px;\n");
      out.write("    height: 200px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("}\n");
      out.write("div.desc{\n");
      out.write("  background-color:white; \n");
      out.write("  padding: 15px;\n");
      out.write("    text-align: left;\n");
      out.write("    width:180px;height:120px;\n");
      out.write("}\n");
      out.write("div.desc a{\n");
      out.write("   display: inline block; \n");
      out.write("   background-color:#1db083;\n");
      out.write("   width:100%;\n");
      out.write("   color:white;\n");
      out.write("   padding:5px;\n");
      out.write("   font-size:15px;\n");
      out.write("   float:bottom;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("    background-image:linear-gradient(rgba(255,255,255,.4), rgba(255,255,255,.4)),url(\"bg1.jpg\");\n");
      out.write("    background-color: #cccccc;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("<ul style=\"list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:#1db083;\">\n");
      out.write("  <li><a href=\"newp.jsp\">Home</a></li>\n");
      out.write("  <li><a href=\"#about\">About</a></li>\n");
      out.write("  <li class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Product</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Men</a>\n");
      out.write("      <a href=\"#\">Women</a>\n");
      out.write("      <a href=\"#\">Electronics</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li><a href=\"#about\">Contact</a></li>\n");
      out.write("   <li style=\"float:right\"><a href=\"#search\">Search</a></li>\n");
      out.write("  <li style=\"float:right\"><input type=\"text\" placeholder=\"Search..\"></li>\n");
      out.write(" </ul>\n");
      out.write("</div>\n");
      out.write("        <br>       \n");
      out.write("  <div style=\"border-radius:20px;\" class=\"sidenav\">\n");
      out.write("   \n");
      out.write("      <table style=\"text-align:left;background-color:white;\">\n");
      out.write("          <th>Men</th>\n");
      out.write("          <tr><td><a href=\"first.jsp\"> Topwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Bottomwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("          \n");
      out.write("          <th>Women</th>\n");
      out.write("          <tr><td><a href=\"womentop.jsp\"> Topwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Bottomwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Accessories</a></td></tr>\n");
      out.write("           \n");
      out.write("          <th>Kids</th>\n");
      out.write("              <tr><td><a href=\"kidclothes.jsp\"> Clothing</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Babycare</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\n");
      out.write("          <tr><td><a href=\"#about\"> Toys</a></td></tr>\n");
      out.write("      </table>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("        <div style=\"margin-left:250px;margin-top:60px;width:960px;\n");
      out.write("             text-align:center;font-size:15px;background-color:#1db083;padding:0px;color:white\">\n");
      out.write("            <h1>Women Bottomwear</h1></div>\n");
      out.write("        \n");
      out.write("  <div style=\"margin-left:150px;width:1000px;\">\n");

         try
         {
         Class.forName("com.mysql.jdbc.Driver"); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "");
         Statement st=con.createStatement();
         String cate="Women Bottomwear";
         String name,brand,category,price;Blob image = null;
         String s="select * from shop where category='"+cate+"'";
         ResultSet rs=st.executeQuery(s);
        while( rs.next())
        {
            name=rs.getString(2);
            brand=rs.getString(3);
            category=rs.getString(4);
            image=rs.getBlob(5);
            byte[ ] imgData = null ; 
            imgData = image.getBytes(1,(int)image.length());
            String imgDataBase64=new String(Base64.getEncoder().encode(imgData));
            price=rs.getString(6);
            
      out.write("\n");
      out.write("        <div style=\"border:2px gray;\" class=\"gallery\">\n");
      out.write("  <img src=\"data:image/gif;base64,");
      out.print( imgDataBase64 );
      out.write("\"  alt=\"shirt\" width=300 height=200>\n");
      out.write("  <div class=\"desc\">\n");
      out.write("      ");
      out.print(name);
      out.write("<br>Brand:");
      out.print(brand);
      out.write("<br>Category:");
      out.print(category);
      out.write("<br>Price:");
      out.print(price);
      out.write("<br><br><a style=\"display: inline block; \n");
      out.write("   text-decoration: none;\" href=\"#buy\">Buy</a>\n");
      out.write("  </div>\n");
      out.write("  </div>  \n");
      out.write("  ");

      }
}
catch(SQLException e)
{

      out.write('\n');
      out.print(e);
      out.write('\n');
}
      
      out.write("\n");
      out.write("</div> \n");
      out.write("</body>\n");
      out.write("</html>");
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
