<%-- 
    Document   : buy
    Created on : Apr 12, 2018, 12:33:56 PM
    Author     : dell
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        /*topnavigation*/
        li {
            float: left;
            display: inline-block;
        }

        li a, .dropbtn {
            display: inline-block;
            color:black;
            text-align: center;
            padding: 10px 15px;
            text-decoration: none;
            font-size: 23px;
        }

        li a:hover, .dropdown:hover .dropbtn {
            background-color:white;color:black;
        }

        li.dropdown {
            display: inline-block;
        }

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
            text-align: left;
        }

        .dropdown-content a:hover {background-color: #f1f1f1}

        .dropdown:hover .dropdown-content {
            display: block;
        }
        .topnav
        {    overflow: hidden;
             position: fixed;
             width: 100%;top:0;
        }
        .topnav input[type=text] {
            float: right;
            padding: 6px;
            margin-top: 8px;
            margin-right: 16px;
            border: none;
            font-size: 17px;
        }
        @media screen and (max-width: 600px) {
            .topnav a, .topnav input[type=text] {
                float: none;
                display: block;
                text-align: left;
                width: 100%;
                margin: 0;
                padding: 14px;
            }
            .topnav input[type=text] {
                border: 1px solid #ccc;  
            }
        }
        /*sidenavigation*/
        .sidenav {
            width: auto;
            position: fixed;
            z-index: 1;
            top: 56px;
            left: auto;
            background: white;
            overflow-x: hidden;
            padding: 8px 0;
        }

        .sidenav a{
            padding: 16px 8px 6px 16px;
            text-decoration: none;
            font-size: 20px;
            color: black;
            display: block;
        }

        .sidenav a:hover {
            color: #f1f1f1;
        }

        .main {
            margin-left: 160px; /* Same as the width of the sidenav */
            font-size: 25px; /* Increased text to enable scrolling */
            padding: 0px 10px;
        }
        /*table*/
        body {
            background-image:linear-gradient(rgba(255,255,255,.4), rgba(255,255,255,.4)),url("bg1.jpg");
            background-color: #cccccc;

        }

        th{

            padding:10px 10px;
            font-size:20px;background-color:white;
        }
        td{
            background-color:white;
            
        }
        td:hover{
            background-color: #cccccc;
            color:black;
        }
        div.gallery {
            margin-left: 100px;
            margin-top: 25px;
            margin-bottom: 25px;
            float: left;
            width: 150px;
          
        }

        div.gallery img {
            width:450px;
            height: 500px;
            margin-top:20px;
            border-radius: 10px;
          
        }
        div.desc{
            background-color:white; 
            padding: 15px;
            text-align: left;
            width:380px;height:470px;
            margin-top:-504px;
            font-size: 1.5em;
            line-height: 1.4;
            border-radius: 10px;
        }
        div.desc a{
            display: inline block; 
            background-color:#1db083;
            width:100%;
            color:white;
            padding:5px;
            font-size:15px;
          
           
            
        }
    </style>
    <body>
        <div class="topnav">
            <ul style="list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color:#fcfcfc;">
                <li><a href="newp.jsp">Home</a></li>
                <li><a href="#about">About</a></li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Product</a>
                    <div class="dropdown-content">
                        <a href="#">Men</a>
                        <a href="#">Women</a>
                        <a href="#">Electronics</a>
                    </div>
                </li>
                <li><a href="#about">Contact</a></li>
                <li style="float:right"><a href="#search">Search</a></li>
                <li style="float:right"><input type="text" placeholder="Search.."></li>
            </ul>
        </div>
        <br>       
        <div style="border-radius:20px;" class="sidenav">

            <table style="text-align:left;background-color:white;">
                <th>Men</th>
                <tr><td><a href="first.jsp"> Topwear</a></td></tr>
                <tr><td><a href="#about"> Bottomwear</a></td></tr>
                <tr><td><a href="#about"> Footwear</a></td></tr>

                <th>Women</th>
                <tr><td><a href="womentop.jsp"> Topwear</a></td></tr>
                <tr><td><a href="#about"> Bottomwear</a></td></tr>
                <tr><td><a href="#about"> Footwear</a></td></tr>
               

                <th>Kids</th>
                <tr><td><a href="kidclothes.jsp"> Clothing</a></td></tr>
                <tr><td><a href="#about"> Footwear</a></td></tr>
                <tr><td><a href="#about"> Toys</a></td></tr>
            </table>
        </div>

        <div>
            <%

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "");
                    java.sql.Statement st = con.createStatement();
                    String cate = "Women Topwear";
                    String name, brand, category, price;
                    Blob image = null;
                    if (request.getParameter("cid") != null) {
                        int id = Integer.parseInt(request.getParameter("cid"));
                        String s = "select * from shop where id=" + id;
                        ResultSet rs = st.executeQuery(s);
                        while (rs.next()) {
                            name = rs.getString(2);
                            brand = rs.getString(3);
                            category = rs.getString(4);
                            image = rs.getBlob(5);
                            byte[] imgData = null;
                            imgData = image.getBytes(1, (int) image.length());
                            String imgDataBase64 = new String(Base64.getEncoder().encode(imgData));
                            price = rs.getString(6);
            %>
            <div style="border:2px gray;margin-left:250px;width:850px;" class="gallery">
               
                <img src="data:image/gif;base64,<%= imgDataBase64%>"  alt="shirt" width=300 height=200>
                <aside><div style="float:right;"class="desc">
                        <form action="">
                    <%=name%><br>Brand:<%=brand%><br>Category:<%=category%><br>
                    Price:<%=price%><br>
                    Enter name     :<input style="float:right;" type="text" name="a"><br>
                    Enter address  :<input style="float:right;"type="text" name="a"><br>
                    Enter phone no.:<input style="float:right;"type="text" name="a"><br>
                    Enter email    :<input style="float:right;"type="text" name="a"><br>
                    Enter Payment mode:<br>
                    <input type="radio" name="payment" value="credit">Credit Card <br>
                    <input type="radio" name="payment" value="debit">Debit Card<br>
                    <input type="radio" name="payment" value="net">Net Banking<br>
                    <input type="radio" name="payment" value="cash">Cash On Delivery<br>
                          </div></aside>
                    </form>
            </div> 
                <input style="float:center;padding:15px;font-size: 20px;margin-top: -5px;margin-left: 550px;width:200px;" type="submit" name="submit" value="BUY"> 
            <%
                    }
                }
            } catch (SQLException e) {
            %>
            <%=e%>
            <%}
            %>
        </div> 
    </body>
</html>
