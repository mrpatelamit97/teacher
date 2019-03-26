<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%            
        response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of he origin server
        response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
        response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
        response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
%>
    
<!DOCTYPE html>
<html>
<head>

<style>
body 
 {
 font-family: Cooper Black, Helvetica, sans-serif;
background-image: url("wall8.gif");
background-size: 100% 278%;

  background-repeat: no-repeat;
  background-size: center;
  position: bottom;
}

.hero-image {
  background-image: url("wall7.jpg");
  background-color: #cccc;
  height: 170px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

.hero-text {
  text-align: center;
  font-family:  Harlow Solid Italic, Helvetica, sans-serif;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: black;
}


.navbar {
  overflow: hidden;
  background-color: #111;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 16px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
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
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.button {
  background-color: grey; 
  border: 20px;
  color: red;
  padding: 10px;
  text-align: centre;
  aling:right;
  text-decoration: bold;
  font-size: 25px;
  cursor: pointer;
  float: right;
}
.button1 {border-radius: 10%;}

</style>
</head>
<body>

<div class="hero-image">
  <div class="hero-text">
    <h1 style="font-size:50px"><font face="Monotype Corsiva" color="black">Teacher Student Connect</font> </h1>
    
  </div>
</div>

<div class="navbar">
  <div class="dropdown">
    <button class="dropbtn">Resource List 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="documents.jsp">Document</a>
      <a href="teachers.jsp">Teacher</a>
      <a href="students.jsp">student</a>
    </div>
  </div> 
  <a href="advance search.html">Advance Search</a>
   <a href="submitResources.jsp">Submit Resource</a>
   <a href="About_Us.jsp">About us</a>
   <a href="Contact_Us.jsp">Contact Us</a>
   <a href="help form.html">Help</a>
    <a href="LogoutServlet">Log Out</a>
    </div>
    </div>
    </div>
       

</body>
</html>