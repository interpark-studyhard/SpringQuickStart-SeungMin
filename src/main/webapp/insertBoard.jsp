<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	<center>
		<h1>add</h1>
		<a href="logout.do">log out</a>
		<hr>
		<form action="insertBoard.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">title</td>
					<td align="left"><input name="title" type="text"></td>
				</tr>
				<tr>
					<td bgcolor="orange">writer</td>
					<td align="left"><input name="writer" size="10" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">content</td>
					<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="add" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">list</a>
	</center>
</body>
</html>
