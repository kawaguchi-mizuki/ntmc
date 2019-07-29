<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" href="css/user_login.css">
</head>
<body>


	<div class="form-wrapper">
		<h1>管理人ログイン</h1>
		<form action="auth2" method="POST">
			<div class="form-item">
				<label for="text"></label> <input type="number" name="id"
					required="required" placeholder="管理者ＩＤ"></input>
			</div>
			<div class="form-item">
				<label for="password"></label> <input type="password"
					name="password" required="required" placeholder="パスワード"></input>
			</div>


			<%
				String errflg = request.getParameter("errflg");
				if (errflg != null) {
					if (errflg.equals("1")) {
			%>
			<p class="err">管理人IDまたはパスワードが間違っています。</p>
			<%
				}
			%>
			<%
				}
			%>


			<div class="button-panel">
				<input type="submit" class="button" title="Sign In" value="ログイン"></input>
			</div>
		</form>
		<div class="form-footer">
			<p>

			</p>
		</div>
	</div>

</body>
</html>