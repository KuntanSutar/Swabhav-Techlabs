<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Successful</title>
</head>
<body>
	
	<h1>Application Submitted Successfully</h1>
	<h2>${msg}</h2>
	
	Name: ${student1.name}
	Hobby: ${student1.hobby}
	Mobile No: ${student1.mobileNo}
	DOB : ${student1.dob}
	Skills: ${student1.skills}
	Address:
		Country: ${student1.address.country}
		City: ${student1.address.city}
		Street: ${student1.address.street}
		Pincode: ${student1.address.pincode}
</body>
</html>