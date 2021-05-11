<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CESA Registration</title>
</head>
<body>
<h1 style="text-align:center; margin-top:100px;">CESA Registration Form</h1>

<form action ="RegistrationServlet" method="post">
<table style="margin-left:auto;margin-right:auto;">
<tr><td>Student Name: </td><td><input type="text" name="studentName"></td></tr>
<tr><td>Roll No: </td><td><input type="text" name="rollNo"></td></tr>
<tr><td>Department: </td><td><input type="text" name="department"></td></tr>
<tr><td>Year: </td><td><input type="text" name="year"></td></tr>
<tr><td>Event: </td><td>
<div class="custom-select" style="margin-top: -18px;margin-left: 52px;">
  <select style="width:350px;margin-left: -52px;margin-top: 21px;">
    <option value="0">Select Event</option>
    <option value="1">Coding</option>
    <option value="2">Treasure Hunt</option>
    <option value="3">Placement</option>
    <option value="4">NFS</option>
    <option value="5">Badminton</option>
    <option value="6">Football</option>
  </select>
</div>
</td></tr>
<tr><td></td><td><input type="submit" value="Registration" style="margin-top: 17px;"></td></tr>
</table>
</form>
</body>
</html>