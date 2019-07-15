<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="movie.beans.UserInfoBeans"%>
<%@ page import="movie.sanitizing.Sanitize"%>
<%@ page import="movie.beans.AppointBeans"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/appoint_check.css" rel="stylesheet" type="text/css">
<title>予約確認</title> y>
<%
	List<AppointBeans> list = (List<AppointBeans>) request.getAttribute("list");
	UserInfoBeans login = (UserInfoBeans) session.getAttribute("userInfo");
%>
<form class="cmxform" action="unsub" method="GET">
	<fieldset>
		<legend>予約確認</legend>

		<%
			for (AppointBeans appoint : list) {
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
					<table border="1">
						<tr>
							<th>年月日</th>
							<th>時間</th>
							<th>名称</th>
						</tr>
						<tr>
							<td><%=appoint.getMovieDate() %></td>
							<td><%=appoint.getMovieTime() %></td>
							<td></td>
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
		</li>
		</ol>
	</fieldset>

</form>

</head>
<body>

</body>
</html>
