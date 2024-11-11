<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.sumin.jsp.board.Rq" %>

<!--/jsp/gugudan.jsp-->
<%
int dan = (int)request.getAttribute("dan");
int limit = (int)request.getAttribute("limit");
int number = (int)request.getAttribute("number");
%>
<h2><%=dan%>단</h2>
<% for(int i=1; i<=limit; i++) {%>
<div><%=dan%> * <%=i%> = <%=dan * i%></div>
<%}%>

<h1><%=number%></h1>