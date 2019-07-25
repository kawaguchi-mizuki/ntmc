<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="beans.UserInfoBeans"%>
<%@ page import="sanitizing.Sanitize"%>
<%@ page import="beans.AppointBeans"%>
<%@page import="beans.MovieListBeans"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/appoint_check.css" rel="stylesheet" type="text/css">
<title>予約確認</title> y>
<%
	List<MovieListBeans> list = (List<MovieListBeans>) request.getAttribute("list");
	UserInfoBeans login = (UserInfoBeans) session.getAttribute("userInfo");
%>
<form class="cmxform" action="unsub" method="GET">
	<fieldset>
		<legend>予約確認</legend>

		<%
			for (MovieListBeans movielist : list) {
		%>
		<table>
			<tr>
				<td>
					<table>
						<tr>
							<td><input type="checkbox" name="check"></td>
						</tr>
					</table>
				</td>
				<td>
					<table border="3" class="title">
						<tr>
							<th>年月日</th>
							<th>開始時間</th>
							<th>終了時間</th>
							<th>タイトル</th>
						</tr>
						<tr>
							<td class="data"><%=movielist.getAppointdate()%></td>
							<td class="data"><%=movielist.getStarttime()%></td>
							<td class="data"><%=movielist.getFinishtime()%></td>
							<td class="data"><a href="ditail"><%=Sanitize.replaceInput(movielist.getMovieName())%></a></td>
						</tr>

					</table>
				</td>
			</tr>
		</table>
		<%
			}
		%>


		<p>
			<a href="mypage" class="back">戻る</a><input type="submit" value="取り消す"
				class="send" />
		</p>
	</fieldset>

</form>

</head>
<body>

</body>
</html>