<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

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
  background-color: #333;
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
 <script type="text/javascript">
function handleSelect(elm)
{
window.location = elm.value;
}
</script>
</head>
<body>

<div class="hero-image">
  <div class="hero-text">
    <h1 style="font-size:50px"><font face="Ariel" color="black">TSC Online</font> </h1>
    
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
   <a href="#home">About us</a>
   <a href="#home">Contact Us</a>
   <a href="help form.html">Help</a>
    </div>
    </div>
    
    
    <table border="1" class="table table-bordered">
    <select name="select-city" onchange="location = this.value;">
    <option value="">Select-Sorting Type</option>
 <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=AuthorAZ">Author(A-Z)</option>
 <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=AuthorZA">Author(Z-A)</option>
 
  <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=YearNew">Year(Newest First)</option>
 <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=YearOld">Year(Oldest First)</option>
 
  <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=TitleAZ">Title(A-Z)</option>
 <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=TitleZA">Title(Z-A)</option>
 
  <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=SubjectAZ">Subject(A-Z)</option>
 <option value="http://localhost:8071/Teacher-Student-Connect/SortDocumentsServlet?order=SubjectZA">Subject(Z-A)</option>
</select>
                                            <tr>
                                                <td>
                                                    <center><span style="color: gray">Subject</span>
                                                </td>
                                                <td>
                                                        <center> <span style="color: gray">Title</span>
                                                    </td>
                                                    <td>
                                                            <center><span style="color: gray">Author</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: gray">Year</span>
                                                            </td>
                                                         
                                            </tr>
						<c:forEach  var="resources"  items= "${resources}">
                        <tr>
                          <td>
                             ${resources.subject}
                          </td>
                          <td>
                            ${resources.title}
                          </td>
                          <td>
                            ${resources.author}
                          </td>
                          <td>
                            ${resources.year}
                            
                          </td>
                        </tr>
                       </c:forEach>                                

                                        </table>
    
    </div>
       

</body>
</html>