<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="movie.beans.UserInfoBeans" %>
    <%@page import="movie.beans.MovieListBeans" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>映画一覧</title>
<link rel="stylesheet" href="/movie/css/list.css">
</head>
<body>
<%List<MovieListBeans> list = (List<MovieListBeans>)request.getAttribute("list");
  UserInfoBeans login = (UserInfoBeans)session.getAttribute("userInfo");
 %>


 <h1>映画一覧</h1>
        <form action="searchmovie" method="get">
		<input type="text" name="search"><input type="submit" value="検索">
		</form>
	<table border="3">
		<tr>
			<th>年月日</th>
			<th>開始時間</th>
			<th>終了時間</th>
			<th>タイトル</th>
		</tr>
		<%for(MovieListBeans movielist:list){ %>

		<tr>
			<td><%=movielist.getAppointdate()%></td>
			<td><%=movielist.getStarttime() %></td>
			<td><%=movielist.getFinishtime() %></td>
			<td><a href="ditail<%=movielist.getMovieId()%>"><%=movielist.getMovieName() %></a></td>
		</tr>
		<%} %>
	</table>


</body>
</html>