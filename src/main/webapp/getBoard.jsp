<%@ page import="com.interpark.hong.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
 	BoardVO board = (BoardVO)session.getAttribute("board");
 %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detail</title>
</head>
<body>
	<center>
		<h1>detail</h1>
		<a href="logout.do">log out</a>
		<hr>
		<form action="updateBoard.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">title</td>
					<td align="left"><input name="title" type="text" value="<%= board.getTitle() %>"></td>
				</tr>
				<tr>
					<td bgcolor="orange">writer</td>
					<td align="left"><%= board.getWriter() %></td>
				</tr>
				<tr>
					<td bgcolor="orange">content</td>
					<td align="left"><textarea name="content" cols="40" rows="10"><%= board.getContent() %></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">date</td>
					<td align="left"><%= board.getRegDate() %></td>
				</tr>
				<tr>
					<td bgcolor="orange">count</td>
					<td align="left"><%= board.getCnt() %></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="글 수정" /></td>
				</tr>
			</table>
			<input name="seq" type="hidden" value="<%= board.getSeq() %>" />
		</form>
		<hr>
		<a href="insertBoard.jsp">add</a>&nbsp;&nbsp;&nbsp; <a href="deleteBoard.do?seq=<%= board.getSeq() %>">delete</a>&nbsp;&nbsp;&nbsp; <a href="getBoardList.do">list</a>
	</center>
</body>
</html>
