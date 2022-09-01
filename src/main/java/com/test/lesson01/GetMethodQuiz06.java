package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson/quiz06")
public class GetMethodQuiz06 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Response header
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.valueOf(request.getParameter("number2"));
		
		PrintWriter out = response.getWriter();	// 문자로 인식하고 싶어하는 " 앞에 \를 붙이면 문자로 인식한다
		out.print("{\"addition\":" +(number1+number2) + ", \"subtraction\":" + (number1-number2)
				+ ", \"multiplication\":" +(number1*number2) + ", \"division\":" +(number1/number2) + "}");
	}

}


/*
{
    addtion: 1570,
    subtraction: 1430,
    multiplication: 105000,
    division: 21
}

*/