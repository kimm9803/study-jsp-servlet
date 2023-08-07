<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
	String adminId;
	String adminPw;
	
	String imgDir;
	String testServerIP;
	String realServerIP;
	
	String connectedIP;
	String connectedUser;
	
	String str;
	%>
	
	<%
	adminId = config.getInitParameter("adminId");
	adminPw = config.getInitParameter("adminPw");
	
	imgDir = application.getInitParameter("imgDir");
	testServerIP = application.getInitParameter("testServerIP");
	realServerIP = application.getInitParameter("realServerIP");
	
	application.setAttribute("connectedIP", "165.62.58.23");
	application.setAttribute("connectedUser", "kim");
	
	connectedIP = (String)application.getAttribute("connectedIP");
	connectedUser = (String)application.getAttribute("connectedUser");
	%>
	
	<p>adminId : <%= adminId %></p>
	<p>adminPw : <%= adminPw %></p>
	
	<p>imgDir : <%= imgDir %></p>
	<p>testServerIP : <%= testServerIP %></p>
	<p>realServerIP : <%= realServerIP %></p>
	
	<p>connectedIP : <%= connectedIP %></p>
	<p>connectedUser : <%= connectedUser %></p>
	
	<!-- exception 처리 -->
	<%
	out.print(str.toString());
	%>
</body>
</html>