<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@page import="movie.beans.AdminInfoBeans" %>
    <%@page import="movie.beans.MovieListBeans" %>
    <%@ page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<MovieListBeans> movieList = (List<MovieListBeans>)request.getAttribute("movieList");
  AdminInfoBeans login = (AdminInfoBeans)session.getAttribute("adminInfo");
 %>

 <h1>映画更新</h1>
        <form action="searchmovie" method="get">
		<input type="text" name="search"><input type="submit" value="検索">
		</form>




  <form action="updatemovie" method="get">
	<table border="3">

	 <%for(MovieListBeans updatemovie:movieList){ %>

		<tr>
			<th>映画名</th>
			<td><input type="text" name="upmovie" value="<%=updatemovie.getMovieName() %>" required="required" maxlength="128"></td>
		</tr>
		<tr>
			<th>ジャンル</th>

			<td>

               <input type="text" name="upgenre" value="<%=updatemovie.getMovieGenre()%>" required="required" maxlength="128">
            </td>

        </tr>
        <tr>
			<th>キャスト</th>
			<td><input type="text" name="upcast" value="<%=updatemovie.getMovieCast() %>" required="required" maxlength="128"></td>
		</tr>
		<tr>
			<th>概要</th>
			<td><input type="text" name="upsummry" value="<%=updatemovie.getMovieSummary() %>" required="required" maxlength="128"></td>
        </tr>
        <%}%>
	    </table>




        <p><input type="submit" name="updatebtn" value="更新"></p>
       </form>
        <form>
         <INPUT type="button" onClick='history.back();' value="戻る">
       </form>
</body>
</html>