package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson/quiz05")

public class GetMethodQuiz05 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// Request Parameter
		int step = Integer.valueOf(request.getParameter("step"));
		
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>구구단</title></head><body><ul><hr>");
		for (int i = 1; i <=9; i++) {
			out.println("<li>" + step + " X "+ i + " = " + step*i + "</li>");
	
		}
		out.print("</ul></body></html>");

	}

}
