package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex02")
public class UrlMappingEx02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 1 ~ 10 합계. 1+2+3+.....+10
		int sum = 0;
		for (int i =1; i <= 10; i++) {
			sum += i;
		}
		
		out.print("<html><head><title>합계</title></head><body><h1></h1>");
		out.print("합계: <strong>" + sum + "</strong>");
		out.print("</body></html>");
	}
}