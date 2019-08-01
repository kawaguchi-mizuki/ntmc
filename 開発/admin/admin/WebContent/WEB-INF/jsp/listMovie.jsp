<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="beans.UserInfoBeans"%>
<%@page import="beans.MovieListBeans"%>
<%@ page import="java.util.List"%>
<link href="css/list.css" rel="stylesheet" type="text/css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画一覧画面</title>
<link href="css/list.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
		List<MovieListBeans> list = (List<MovieListBeans>) session.getAttribute("list");
		UserInfoBeans userInfo = (UserInfoBeans) session.getAttribute("userInfo");
		String loginflg = request.getParameter("loginflg");
	%>

	<form class="cmxform" action="searchmovie" method="GET">
		<fieldset>
			<legend><jsp:include page="./header/header.jsp" /></legend>
			<a href="mypage" class="my">マイページ</a>


			<%
				if (userInfo != null) {
			%>
			<a href="logout" class="login">ログアウト</a>


			<%
				} else {
			%>
			<a href="login" class="login">ログイン</a>
			<%
				}
			%>

			<input class="search" type="text" name="search"
				placeholder="キーワードを入力"><input class="btn" type="submit"
				value="検索">
		</fieldset>
	</form>
	<table border="1" style="border-collapse: collapse">
		<tr>
			<th>年月日</th>
			<th>開始時間</th>
			<th>終了時間</th>
			<th>タイトル</th>
		</tr>
		<%
			for (MovieListBeans movielist : list) {
		%>

		<tr>
			<td class="data"><%=movielist.getMovie_date()%></td>
			<td class="data"><%=movielist.getStartMovie_time()%></td>
			<td class="data"><%=movielist.getFinishMovie_time()%></td>
			<td class="data"><a href= "detail?movie_id=<%=movielist.getMovieList_id()%>"><%=movielist.getMovieName()%></a></td>
		</tr>
		<%
			}
		%>
	</table>

	<%
		if (loginflg != null) {
			if (loginflg.equals("1")) {
	%>
	<script>
		alert('ログインしてください');
	</script>
	<%
		}
	%>
	<%
		}
	%>

</body>
</html>