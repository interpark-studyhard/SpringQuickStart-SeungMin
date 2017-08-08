<%@ page import="java.util.List" %>
<%@ page import="com.interpark.hong.biz.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
List<BoardVO> boardList = (List)session.getAttribute("boardList");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list</title>
</head>
<body>
	<center>
		<h1>list</h1>
		<h3>welcome!<a href="logout.do">log out</a></h3>
	
		<!--  검색 시작  -->
		<form action="getBoardList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<option value="title">title</option>
							<option value="content">content</option>
						</select>
						<input name="searchKeyword" type="text">
						<input type="submit" value="search">
					</td>
				</tr>		
			</table>
		</form>
		<!-- 검색 종료  -->
	
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">number</th>
				<th bgcolor="orange" width="200">title</th>
				<th bgcolor="orange" width="150">writer</th>
				<th bgcolor="orange" width="150">date</th>
				<th bgcolor="orange" width="100">count</th>
			</tr>
<% for(BoardVO board: boardList) { %>
			<tr>
				<td><%= board.getSeq() %></td>
				<td align="left">
					<a href="getBoard.do?seq=<%= board.getSeq() %>"><%= board.getTitle() %></a>
				</td>
				<td><%= board.getWriter() %></td>
				<td><%= board.getRegDate() %></td>
				<td><%= board.getCnt() %></td>
			</tr>
<% } %>
		</table>
		<br>
		<a href="insertBoard.jsp">add</a>
	</center>
</body>
</html>