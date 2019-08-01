<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>マイページ</title>
<link href="css/mypage.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form class="cmxform" action="searchmovie" method="GET">
		<fieldset>
			<legend><jsp:include page="./header/header.jsp" /></legend>
		</fieldset>


	</form>

	<table align="center">
		<tr>
			<th><a href="unsubstart" class="btn-square">退会手続</a></th>
			<th><a href="updateuserstart" class="btn-square">会員変更</a></th>
		</tr>
		<tr>
			<th><a href="knownAppoint" class="btn-square">予約確認</a></th>
			<th><a href="" class="btn-square">お知らせ</a></th>
		</tr>
	</table>
</body>
</html>