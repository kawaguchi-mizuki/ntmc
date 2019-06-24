<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ログイン</title>
<link rel="stylesheet" type="text/css" href="/movie/css/Admin.css">
</head>
<body>
<h1>ログイン</h1>
<div id="t_btn"><button class="touroku" type="button" value="新規登録">新規登録</button></div>
<form action="authAdmin" method="post">
<table>
 <tr>
  <td>管理者ID</td>
  <td><input type="text" class="AdID" style="height: 26px" name="AdminId"></td>
 </tr>
 <tr>
  <td>パスワード</td>
  <td><input type="password" class="Adpass" style="height: 26px" name="Adminpass"></td>
 </tr>
</table>

<div id="loginbtn"><input type="submit" class="login" value="ログイン"></div>
</form>
</body>
</html>