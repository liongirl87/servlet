package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plan");
		
		// Request Parameter
		String userId = request.getParameter("user_id");
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();
//		out.println("안녕하세요");
//		out.println("user_id:" + userId);
//		out.println("name:" + name);
//		out.println("나이:" + age);
		
		// JSON(Javascript object Notation) String 으로 response 구성하기
		// {"user_id":"liongirl", "name":"유성용", "age":25}
		
		
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + name + "\", \"age\":"+ age + "}" );
	}

}
