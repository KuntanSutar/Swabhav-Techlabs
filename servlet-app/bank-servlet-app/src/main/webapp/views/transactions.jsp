<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
</head>
<body>

	<h1>Transaction Controller</h1>
	<form action="transaction" method="post">
		Amount:<input type="number" name="amount" placeholder="Enter amount" required> <br>
		<input type="radio" name="type" value="deposite"> Deposite <br>
		<input type="radio" name="type" value="withdraw"> Withdraw <br>
		<input type="submit" value="Commit"> <br>
	</form>
</body>
</html>