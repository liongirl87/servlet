package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
		
		Date now = new Date(); // util만 사용!
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
		SimpleDateFormat sdf1 = new SimpleDateFormat("현재 시간은 hh시 mm분 ss초 입니다.");
		
		PrintWriter out = response.getWriter(); // 내가 에러처리 하지 않겠다
		out.println(sdf.format(now));
		out.println(sdf1.format(now));
	}
}
