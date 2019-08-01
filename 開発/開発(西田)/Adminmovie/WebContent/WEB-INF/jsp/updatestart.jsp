<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="movie.beans.MovieListBeans" %>
    <%@ page import="java.util.List" %>
 <%@page import="movie.beans.AdminInfoBeans" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>映画更新選択画面</title>
</head>
<body>
<%List<MovieListBeans> selectmovie = (List<MovieListBeans>)request.getAttribute("selectmovie");
  AdminInfoBeans adminInfo = (AdminInfoBeans)session.getAttribute("adminInfo");
 %>

 映画更新選択画面
<br>更新したい映画を選択
<form action="updateAdmin" method="get">
<%for(MovieListBeans list:selectmovie){ %>
   <div class="selectmovielist">
      <input type="radio" name="radio1" value=<%=list.getMovieId() %>><%=list.getMovieName() %>
  </div>
 <%} %>
<input type="submit" value="更新">
</form>
<br>
<form action="top" method="get">
<input type="submit" value="戻る" class="back">
</form>
</body>
</html>