package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletEx")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getServletConfig()를 사용하여 web.xml 에서 정의한 adminId, adminPw 변수를 가져와 사용
		// init-param 에서 가져옴
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId : " + adminId + "</p>");
		out.print("<p>adminPw : " + adminPw + "</p>");
		
		// getServletContext() 를 사용하여 web.xml 에서 정의한 파라미터들을 불러옴
		// context-param 에서 가져옴
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIP = getServletContext().getInitParameter("testServerIP");
		String realServerIP = getServletContext().getInitParameter("realServerIP");
		
		out.print("<p>imgDir : " + imgDir + "</p>");
		out.print("<p>testServerIP : " + testServerIP + "</p>");
		out.print("<p>realServerIP : " + realServerIP + "</p>");
		
		// context-param 에 데이터를 2개 추가함
		getServletContext().setAttribute("connectedIP", "165.62.58.33");
		getServletContext().setAttribute("connectedUser", "kim");
		
		// 추가한 데이터를 불러옴
		String connectedIP = (String)getServletContext().getAttribute("connectedIP");
		String connectedUser = (String)getServletContext().getAttribute("connectedUser");
		
		out.print("<p>connectedIP : " + connectedIP + "</p>");
		out.print("<p>connectedUser : " + connectedUser + "</p>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
