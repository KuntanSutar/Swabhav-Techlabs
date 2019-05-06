<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Form</title>
</head>
<body>

	<h1>Admission Form</h1>
	<form:errors path="student1.*"/>
	
	<form action="/SpringGontuSeries/submit" method="post">
		Name: <input type="text" name="name"> <br>
		Hobby: <input type="text" name="hobby"> <br>
		Mobile No: <input type="text" name="mobileNo"> <br>
		DOB: <input type="text" name="dob"> <br>
		Skills: <select name="skills" multiple="multiple"> 
					<option value="java">Java</option> 
					<option value="python">Python</option> 
					<option value="C#">C#</option>
				</select> <br>
		Address:
			Country: <input type="text" name="address.country"> <br>
			City: <input type="text" name="address.city"> <br>
			Street: <input type="text" name="address.street"> <br>
			Pincode: <input type="text" name="address.pincode"> <br>
		<input type="submit" value="Submit"> <br>
	</form>
	
</body>
</html>