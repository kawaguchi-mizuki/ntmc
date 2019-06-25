<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="movie.beans.UserInfoBeans" %>
    <%@page import="movie.beans.MovieListBeans" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
<%List<MovieListBeans> movie = (List<MovieListBeans>)request.getAttribute("movie");
  UserInfoBeans login = (UserInfoBeans)session.getAttribute("userInfo");
 %>
<h1>検索結果</h1>
<%for(MovieListBeans search:movie){ %>
<table>
  <tr>
    <td><%=search.getMovieName()%></td>
  </tr>
</table>
<%} %>
</body>
</html>