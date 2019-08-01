<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "beans.MovieDetailBeans"%>
    <%@ page import = "java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画詳細画面</title>
</head>
<body>
<% List<MovieDetailBeans> list = (List<MovieDetailBeans>)request.getAttribute("list"); %>
<% for(MovieDetailBeans movieDetailBeans : list) { %>
<p><%= movieDetailBeans.getMovie_id() %></p>
<p><%= movieDetailBeans.getMovie_name() %></p>
<p><%= movieDetailBeans.getMovie_detail() %></p>
<% } %>
</body>
</html>