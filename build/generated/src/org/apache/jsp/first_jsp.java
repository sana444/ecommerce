package org.apache.jsp;

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

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>My Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("   /*topnavigation*/\r\n");
      out.write("        li {\r\n");
      out.write("    float: left;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a, .dropbtn {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 10px 15px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 23px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover, .dropdown:hover .dropbtn {\r\n");
      out.write("    background-color:white;color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li.dropdown {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    min-width: 160px;\r\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write(".topnav\r\n");
      out.write("{    overflow: hidden;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    width: 100%;top:0;\r\n");
      out.write("}\r\n");
      out.write(".topnav input[type=text] {\r\n");
      out.write("  float: right;\r\n");
      out.write("  padding: 6px;\r\n");
      out.write("  margin-top: 8px;\r\n");
      out.write("  margin-right: 16px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("@media screen and (max-width: 600px) {\r\n");
      out.write("  .topnav a, .topnav input[type=text] {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 14px;\r\n");
      out.write("  }\r\n");
      out.write("  .topnav input[type=text] {\r\n");
      out.write("    border: 1px solid #ccc;  \r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("/*sidenavigation*/\r\n");
      out.write(".sidenav {\r\n");
      out.write("    width: auto;\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("    top: 56px;\r\n");
      out.write("    left: auto;\r\n");
      out.write("    background: white;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    padding: 8px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a{\r\n");
      out.write("    padding: 16px 8px 6px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    color: black;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sidenav a:hover {\r\n");
      out.write("    color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main {\r\n");
      out.write("    margin-left: 160px; /* Same as the width of the sidenav */\r\n");
      out.write("    font-size: 25px; /* Increased text to enable scrolling */\r\n");
      out.write("    padding: 0px 10px;\r\n");
      out.write("}\r\n");
      out.write("/*table*/\r\n");
      out.write("th{\r\n");
      out.write("   \r\n");
      out.write("    padding:10px 10px;\r\n");
      out.write("   font-size:20px;background-color:white;\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write(" background-color:white;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("td:hover{\r\n");
      out.write("    background-color: #1db083;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*images*/\r\n");
      out.write("div.gallery {\r\n");
      out.write("    margin-left: 100px;\r\n");
      out.write("    margin-top: 25px;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("    float: left;\r\n");
      out.write("    width: 150px;\r\n");
      out.write("    border-style:solid;\r\n");
      out.write("    border-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div.gallery img {\r\n");
      out.write("    width:210px;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("div.desc{\r\n");
      out.write("  background-color:white; \r\n");
      out.write("  padding: 15px;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    width:180px;height:120px;\r\n");
      out.write("}\r\n");
      out.write("div.desc a{\r\n");
      out.write("   display: inline block; \r\n");
      out.write("   background-color:#1db083;\r\n");
      out.write("   width:100%;\r\n");
      out.write("   color:white;\r\n");
      out.write("   padding:5px;\r\n");
      out.write("   font-size:15px;\r\n");
      out.write("   float:bottom;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("    background-image:linear-gradient(rgba(255,255,255,.4), rgba(255,255,255,.4)),url(\"bg1.jpg\");\r\n");
      out.write("    background-color: #cccccc;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("    <body>\r\n");
      out.write("      <div class=\"topnav\">\r\n");
      out.write("<ul style=\"list-style-type: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background-color:#1db083;\">\r\n");
      out.write("  <li><a href=\"newp.jsp\">Home</a></li>\r\n");
      out.write("  <li><a href=\"#about\">About</a></li>\r\n");
      out.write("  <li class=\"dropdown\">\r\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Product</a>\r\n");
      out.write("    <div class=\"dropdown-content\">\r\n");
      out.write("      <a href=\"#\">Men</a>\r\n");
      out.write("      <a href=\"#\">Women</a>\r\n");
      out.write("      <a href=\"#\">Electronics</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li><a href=\"#about\">Contact</a></li>\r\n");
      out.write("   <li style=\"float:right\"><a href=\"#search\">Search</a></li>\r\n");
      out.write("  <li style=\"float:right\"><input type=\"text\" placeholder=\"Search..\"></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</div>\r\n");
      out.write("        <br>       \r\n");
      out.write("  <div style=\"border-radius:20px;\" class=\"sidenav\">\r\n");
      out.write("   \r\n");
      out.write("      <table style=\"text-align:left;background-color:white;\">\r\n");
      out.write("          <th>Men</th>\r\n");
      out.write("          <tr><td><a href=\"first.jsp\"> Topwear</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"#about\"> Bottomwear</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\r\n");
      out.write("          \r\n");
      out.write("          <th>Women</th>\r\n");
      out.write("          <tr><td><a href=\"womentop.jsp\"> Topwear</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"wbottom.jsp\"> Bottomwear</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\r\n");
      out.write("     \r\n");
      out.write("           \r\n");
      out.write("          <th>Kids</th>\r\n");
      out.write("          <tr><td><a href=\"kidclothes.jsp\"> Clothing</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"#about\"> Footwear</a></td></tr>\r\n");
      out.write("          <tr><td><a href=\"#about\"> Toys</a></td></tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      \r\n");
      out.write("</div>\r\n");
      out.write("        <div style=\"margin-left:250px;margin-top:60px;width:960px;\r\n");
      out.write("             text-align:center;font-size:15px;background-color:#1db083;padding:0px;color:white\">\r\n");
      out.write("            <h1>WOMEN'S TOPWEAR</h1></div>\r\n");
      out.write("        \r\n");
      out.write("  <div style=\"margin-left:150px;width:1000px;\">\r\n");

         try
         {
         Class.forName("com.mysql.jdbc.Driver"); 
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "");
         Statement st=con.createStatement();
         String cate="Men Topwear";
         String name,brand,category,price;Blob image = null;int id;
         String s="select * from shop where category='"+cate+"'";
         ResultSet rs=st.executeQuery(s);
         
        while( rs.next())
        {   id=rs.getInt(1);
            name=rs.getString(2);
            brand=rs.getString(3);
            category=rs.getString(4);
            image=rs.getBlob(5);
            byte[ ] imgData = null ; 
            imgData = image.getBytes(1,(int)image.length());
            String imgDataBase64=new String(Base64.getEncoder().encode(imgData));
            price=rs.getString(6);
            
      out.write("\r\n");
      out.write("        <div style=\"border:2px gray;\" class=\"gallery\">\r\n");
      out.write("  <img src=\"data:image/gif;base64,");
      out.print( imgDataBase64 );
      out.write("\"  alt=\"shirt\" width=300 height=200>\r\n");
      out.write("  <div class=\"desc\">\r\n");
      out.write("      ");
      out.print(name);
      out.write("<br>Brand:");
      out.print(brand);
      out.write("<br>Category:");
      out.print(category);
      out.write("<br>Price:");
      out.print(price);
      out.write("<br><br>\r\n");
      out.write("      <a style=\"display: inline block; margin-left: 20px;\r\n");
      out.write("   text-decoration: none;\" href=\"buy.jsp?cid=");
      out.print(rs.getInt(1));
      out.write("\">Buy</a>\r\n");
      out.write("   <a style=\"display: inline block;margin-left: 20px; \r\n");
      out.write("   text-decoration: none;\" href=\"addcart.jsp?aid=");
      out.print(rs.getInt(1));
      out.write("\">Add to cart </a>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>  \r\n");
      out.write("  ");

      }
}
catch(SQLException e)
{

      out.write('\r');
      out.write('\n');
      out.print(e);
      out.write('\r');
      out.write('\n');
}
      
      out.write("\r\n");
      out.write("</div> \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
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
