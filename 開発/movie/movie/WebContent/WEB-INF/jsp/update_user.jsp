<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ page import="movie.beans.UserInfoBeans"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/user_add.css" rel="stylesheet" type="text/css">
<title>会員情報更新</title>
</head>
<body>
	<%
		UserInfoBeans userInfo = (UserInfoBeans) session.getAttribute("userInfo");
	%>

	<form class="cmxform" action="updateuser" method="POST">
		<fieldset>
			<legend>会員情報更新</legend>
			<ol>
				<li><label for="address">メールアドレス<em>*</em></label>
				 <input type="email" id="mail" name="mail" required="required" value=<%=userInfo.getMail() %>></li>

				<li><label for="name">名前<em>*</em></label>
				<input id="name" name="name"required="required" value=<%= userInfo.getName() %>></li>

				<li><label for="sex">性別<em>*</em></label>
				<%= userInfo.getSex() %>
				</li>

				<li><label for="dob">生年月日 <span class="sr">生年月日(年)</span><em>*</em></label>
					<%= userInfo.getBirthday() %>
				</li>

				<li><label for="password">パスワード<em>*</em></label>
				 <input id="password" name="password" required="required" value=<%=userInfo.getPassword() %>></li>

				<li><label for="postcode">パスワード再入力<em>*</em></label>
				<input  id="r-password" name="r-password" required="required"/></li>

				<li>
					<%
						String errflg = request.getParameter("errflg");
					 if (errflg != null && errflg.equals("1")) {
 					%>
					<p class="err">パスワードは同じ文字をいれてください！</p> <%
 						}
 					%>

					<p>
						<a href="mypage" class="back">戻る</a><input type="submit" value="更新"
							class="send" />
					</p>
				</li>
			</ol>
		</fieldset>

	</form>

</body>
</html>