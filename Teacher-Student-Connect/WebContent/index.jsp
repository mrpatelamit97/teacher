<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
width: 100%;
height: 610px;
font-family: Garamond; 
background:url("wall.jpg");
background-size: 100% 100%}
* {box-sizing: border-box;}

.input-container {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  width: 60%;
  margin-bottom: 10px;
}

.icon {
  padding: 10px;
  background: blue;
  color: white;
  min-width: 50px;
  text-align: center;
}

.input-field {
  width: 100%;
  padding: 5px;
  outline: none;
}

.input-field:focus {
  border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
  background-color: green;
  color: white;
  padding: 12px 20px;
  border: none;
  cursor: pointer;
  width: 60%;
  opacity: 0.9;
}

.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>


<form action="RegisterServlet" method="POST" style="max-width:500px;margin:auto">
  <h1 align="center"; style="color:white;">USER REGISTRATION FORM</h1><br>
<center>
  


<div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="First Name" name="fname" id="fname"title="Enter first name here">
  </div>

<div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Last Name" name="lname" id="lname" title="Enter last name here">
  </div>

<div class="input-container">
    <i class="fa fa-user icon"></i>
    <input class="input-field" type="text" placeholder="Age" name="age" id="age" title="Enter first name here">
  </div>

<div class="input-container">
    <i class="fa fa-user icon"></i>
<select style="width:250px" name="gender" id="gender" >
  <option value="male">Male</option>
  <option value="female">Female</option>
</select>
  </div>

<div class="input-container">
    <i class="fa fa-phone icon"></i>
    <input class="input-field" type="text" placeholder="Contact Number" name="cno" id="cno" title="Enter first name here">
  </div>

<div class="input-container" >
    <i class="fa fa-user icon"></i>
    <select style="width:250px" name="cat" id="cat">
  <option value="Student">Student</option>
  <option value="Teacher">Teacher</option>
</select>
  </div>

  <div class="input-container">
    <i class="fa fa-envelope icon"></i>
    <input class="input-field" type="text" placeholder="User Id" name="userid" id="uid" title="Enter email here"> 
  </div>
 
  <div class="input-container">
    <i class="fa fa-key icon"></i>
    <input class="input-field" type="password" placeholder="Password" name="password" id="pass" title="Enter password here">
</div>
 
</center>
<center>
  <button type="submit" class="btn">Register</button>
</center>
</form>

</body>
</html>
