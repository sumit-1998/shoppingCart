<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterController" method="post">
    <label>First Name :</label>
    <input type="text" name="firstName" required>  
    <br>
    <br>
     <label>Last Name :</label>
    <input type="text" name="lastName" required>  
    <br>
    <br>
     <label>email Id :</label>
    <input type="email" name="emailId"> 
    <br>
    <br>
     <label>Date Of Birth :</label>
   <input type="date" id="dob" name="dob" required> 
    <br>
    <br>
    <label>Password :</label>
    <input type="password" name="password" required>
    <br>
    <br>
     <label>Forgot Password Question :</label>
    <input type="text" name="forgotPasswordQuestion" required>  
    <br>
    <br>
     <label>Forgot Password Answer :</label>
    <input type="text" name="forgotPasswordAnswer" required>  
    <br>
    <br>
     <label>Phone Number :</label>
    <input type="text" name="phoneNo" required>  
    <br>
    <br>
    <input type="submit" value="Register">
</form>
<a href="login.jsp">login</a>
</body>
</html>