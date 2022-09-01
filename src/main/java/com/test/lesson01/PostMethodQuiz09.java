package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		String name = request.getParameter("name");
		String selfintroduction = request.getParameter("selfintroduction");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title></title></head><body>");
		out.print("<b>" + name + "</b>님 지원이 완료 되었습니다.");
		out.print("<br><h3>지원내용</h3>");
		out.print(selfintroduction);
		out.print("</body></html>");
	}
}
