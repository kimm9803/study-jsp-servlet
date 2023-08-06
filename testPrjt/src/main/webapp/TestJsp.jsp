<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
  </head>
  <body>
  
  	<%@ include file="header.jsp" %>
  	<!-- 선언문 태그 -->
  	<%!
  	int num = 8080;
  	String str = "jsp";
  	List<String> list = new ArrayList<>();
  	
  	public void jspMethod() {
  		System.out.println("Hello JSP!!");
  	}
  	%>
  	
  	<!-- HTML 주석 태그 -->
  	<%-- JSP 주석 태그 --%>

	<!-- 스크립트릿 태그 -->
	<%
	if (num > 0) {
	%>  
	<p> num은 0보다 크다 </p>
	<%
	} else {
	%>
	<p> num은 0보다 작다</p>
	<%
	} 
	%>
	
	<!-- 표현식 태그 -->
	num is <%= num %>
	
	<%@ include file="footer.jsp" %>
  </body>
</html>