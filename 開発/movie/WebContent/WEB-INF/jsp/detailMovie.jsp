<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "beans.Movie_Detail_Beans"%>
    <%@ page import = "java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画詳細画面</title>
</head>
<body>
<p>aaaaaa</p>
<% List<Movie_Detail_Beans> list = (List<Movie_Detail_Beans>)session.getAttribute("list"); %>
<% for(Movie_Detail_Beans movieDetailBeans : list) { %>

<p><%= movieDetailBeans.getMovie_id() %></p>
<p><%= movieDetailBeans.getMovie_name() %></p>
<p><%= movieDetailBeans.getMovie_detail() %></p>
<% } %>
<a href = "appoint_seat">座席の予約へ</a>
</body>
</html>