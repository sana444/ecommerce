<%-- 
    Document   : newp
    Created on : Apr 11, 2018, 12:53:48 PM
    Author     : dell
--%>

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
    padding: 14px 16px;
    text-decoration: none;
    font-size: 25px;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color:white;
    color:black;
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

.dropdown-content a:hover {
    background-color: #f1f1f1;
}

.dropdown:hover .dropdown-content {
    display: block;
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
/*images*/
div.gallery {
    margin-left: 100px;
    margin-top: 20px;
    float: left;
    width: 300px;
}

div.gallery img {
    width: 100%;
    height: 300px;
    border-radius: 4px;
}
div.desc {
    padding: 15px;
    text-align: center;
}
/*table*/
th{
    border-bottom:1px solid gray;
    padding:5px 5px;
   font-size:25px;background-color:#f1f1f1;
}
td{
     font-size:25px;
    background-color:#f1f1f1;
     text-decoration: none;
     display: block;
}
td a{
    text-decoration: none;
    display:inline-block;
    color:black;
}
tr a:hover{
    background-color:#cccccc;
    color:black;
}
body {
    background-image:url("bg1.jpg");
    background-color: #cccccc;
    
}
</style>
<body>
      <div class="topnav">
<ul style="list-style-type: none;
    margin: 0;
    padding: 0;width:100%;
    overflow: hidden;
    background-color:#fcfcfc;color:black;">
  <li><a href="newp.jsp">Home</a></li>
  <li><a href="#about">About</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Product</a>
    <div class="dropdown-content">
      <a href="#">Men</a>
      <a href="#">Women</a>
      <a href="#">Kids</a>
    </div>
  </li>
  <li><a href="#about">Contact</a></li>
   <li style="float:right"><a href="#search">Search</a></li>
  <li style="float:right"><input type="text" placeholder="Search.."></li>
 </ul>
</div>

    <div style="background-color:#f1f1f1;border-radius: 20px;margin-top: 50px;" class="gallery" >
       <img src="man.jpg" alt="Forests" width="700" height="500">
       <div style="text-align: center;" class="desc">
       <table align="center" style="width:100%;height:100%;margin-left:100;text-align: center;">
          <th>MEN</th>
          <br>
          <tr><td><a href="first.jsp"> Topwear</a></td></tr>
          <tr><td><a href="#about"> Bottomwear</a></td></tr>
          <tr><td><a href="#about"> Footwear</a></td></tr>
         
       </div>
      </table>
           <br>
           
  </div>
    </div>
     <div style="background-color:#f1f1f1;margin-left:600;border-radius: 20px;margin-top: 50px;" class="gallery" >
       <img src="wm.jpg" alt="Forests" width="700" height="500">
       <div style="text-align: center;" class="desc">
       <table align="center" style="width:100%;height:100%;text-align: center;">
          <th>WOMEN</th>
          <br>
          <tr><td><a href="womentop.jsp"> Topwear</a></td></tr>
          <tr><td><a href="wbottom.jsp"> Bottomwear</a></td></tr>
          <tr><td><a href="#about"> Footwear</a></td></tr>
      
      </table> <br>
  </div>
    </div>
    
    <div style="background-color:#f1f1f1;margin-left:600;margin-top: 50px;border-radius: 20px;" class="gallery" >
       <img src="k.jpg" alt="Forests" width="700" height="500">
       <div style="text-align: center;" class="desc">
       <table align="center" style="width:100%;height:100%;text-align: center;">
          <th>KIDS</th>
          <br>
          <tr><td><a href="kidclothes.jsp"> Clothing</a></td></tr>
          <tr><td><a href="#about"> Footwear</a></td></tr>
       <tr><td><a href="#about"> Toys</a></td></tr></div>
      </table> <br>
  </div>
</div>
    </body>
</html>
