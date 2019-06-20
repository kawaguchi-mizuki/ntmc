<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="movie.beans.UserInfoBeans" %>
    <%@page import="movie.beans.MovieListBeans" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<MovieListBeans> list = (List<MovieListBeans>) request.getAttribute("list");
		UserInfoBeans login = (UserInfoBeans) session.getAttribute("userInfo");
	%>
	<jsp:include page="./header/header.jsp" />
	<h1>映画一覧</h1>
	<input type="text" name="search">
	<input type="button" value="検索">
	<table border="3">
		<tr>
			<th>年月日</th>
			<th>時間</th>
			<th>タイトル</th>
		</tr>
		<tr>
			<td></td>
			<td>10:00~12:30</td>
			<td><a href="../映画詳細画面/user_detail.html"></a></td>
		</tr>
		<tr>
			<td>2019/04/26</td>
			<td>13:30~16:00</td>
			<td><a href="../映画詳細画面/user_detail2.html">ギターはもう聞こえない</a></td>
		</tr>
		<tr>
			<td>2019/04/26</td>
			<td>17:00~19:30</td>
			<td><a href="../映画詳細画面/user_detail3.html">擬似恋愛 ～岩元物語～</a></td>
		</tr>
	</table>
</body>
</html>