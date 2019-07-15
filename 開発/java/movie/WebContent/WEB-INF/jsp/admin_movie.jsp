<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/Adminmovie.css">
<title>Insert title here</title>
</head>
<body>
	<h1 class="common">映画削除確認</h1>
	<table>
		<tr>
			<td class="koumoku">映画名</td>
			<td>エゴマゲドン</td>
		</tr>
		<tr>
			<td class="koumoku">ジャンル</td>
			<td>R18</td>
		</tr>
		<tr>
			<td class="koumoku">キャスト</td>
			<td>江越伊織、吉川希大</td>
		</tr>
		<tr>
			<td class="koumoku">概要</td>
			<td>大魔王エゴブリン襲来から早5年 <br>新たな脅威が地球にせまっていた。
			</td>
		</tr>
	</table>

	<p class="messagecheck">この作品を削除しますか？</p>

	<br>
	<input type="submit" onclick="location.href='../トップ画面/Adtop.html'"
		value="戻る" class="back">

	<input type="submit"
		onclick="location.href='../映画削除完了画面/Addeletefinish.html'" value="削除"
		class="delete">
</body>
</html>