<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="movies.beans.UserInfoBeans"%>
<%@page import="movies.beans.MovieListBeans"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画一覧画面</title>
<link href="css/list.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%
		List<MovieListBeans> list = (List<MovieListBeans>) request.getAttribute("list");
		UserInfoBeans userInfo = (UserInfoBeans) session.getAttribute("userInfo");
		String loginFlg = (String)request.getAttribute("loginFlg");
	%>

			<form class="cmxform" action="listMovie" method="GET">
		<fieldset>
			<legend><jsp:include page="./header/header.jsp" /></legend>
			<a href="mypage" class="my">マイページ</a>

			//ログインされてないとき//
			<%if((loginFlg == null) || (loginFlg.equals("1"))){ %>
				<a href="userLoginStart" class="userLoginStart">ログイン</a>
			//ログインされているとき//
			<%} else {%>
				<a href="logout" class="listMovie">ログアウト</a>
			<%}%>
				<input class="search" type="text" name="search"
				placeholder="キーワードを入力"><input class="btn" type="submit"
				value="検索">
		</fieldset>
		</form>

</body>
</html>