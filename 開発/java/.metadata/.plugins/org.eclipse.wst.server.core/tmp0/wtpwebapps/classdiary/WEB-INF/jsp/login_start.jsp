<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
</head>
<body class="background">
	<%String errflg = request.getParameter("errflg"); %>
	<%String stNumber = (String)session.getAttribute("stNumber"); %>
	<h2 id="login">ログイン画面</h2>
	<div class="container">
	<form action="login" method="POST">
		<%if(errflg != null){%>
		<p class="errormessage">正しい学籍番号及びパスワードを記入してください</p>
		<%}%>
			<div class="form-group">
				<input type="text" class="form-control"
				name="stNumber" placeholder="学籍番号"
				<%if(errflg != null){ %> value="<%=stNumber%>" <%}%>>
	 		</div>
			<div class="form-group">
				<input type="password" class="form-control"
				name="password" placeholder="パスワード">
			</div>
			<input class="btn btn-warning btn-lg btn-block" type="submit" value="ログイン">
	</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous">
	</script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous">
	</script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous">
	</script>
</body>
</html>