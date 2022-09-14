<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
<!--  bootstrap -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>   

<!-- bootstrap CDN link -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- jquery slim 제거-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>계산결과</h1>
		
		<%
		
		String check = request.getParameter("check");
		int number1= Integer.valueOf(request.getParameter("number1"));
		int number2= Integer.valueOf(request.getParameter("number2"));
		
		if(check.equals("plus")){
			out.print(number1 + " + " + number2 + " = " + (number1+number2));
		} else if (check.equals("-")) {
			out.print(number1 + " - " + number2 + " = " + (number1-number2));
		} else if (check.equals("*")) {
			out.print(number1 + " X " + number2 + " = " + (number1*number2));
		} else {
			out.print(number1 + " / " + number2 + " = " + (number1/(double)number2));
			}
			
		%>
		
	</div>

</body>
</html>