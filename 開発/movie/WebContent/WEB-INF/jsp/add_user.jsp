<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/user_add.css" rel="stylesheet" type="text/css">
<title>会員登録</title>
</head>
<body>


	<form class="cmxform" action="user" method="POST">
		<fieldset>
			<legend>新規会員登録</legend>
			<ol>
				<li><label for="address">メールアドレス<em>*</em></label>
				 <input type ="email" id="mail" name="mail" required="required"/></li>

				<li><label for="name">名前<em>*</em></label>
				<input id="name" name="name"required="required" /></li>

				<li><label for="sex">性別<em>*</em></label>
				<input type="radio" name="sex" value="男" checked="checked">男
				<input type="radio" name="sex" value="女">女</li>

				<li><label for="year">生年月日 <span class="sr">生年月日(年)</span><em>*</em></label>
					<select id="year" name="year"></select>
					<label for="month" class="sr">生年月日（月) <em>*</em></label>
				    <select id="month" name="month"></select>
				    <label for="day" class="sr">生年月日 (日) <em>*</em></label>
				    <select id="day" name="day"></select>
				</li>

				<li><label for="password">パスワード<em>*</em></label>
				 <input type="password" id="password" name="password" required="required"/></li>

				<li><label for="postcode">パスワード再入力<em>*</em></label>
				<input type="password" id="r-password" name="r-password" required="required"/></li>

				<li>
					<%
						String errflg = request.getParameter("errflg");
					 if (errflg != null && errflg.equals("1")) {
 					%>
					<p class="err">パスワードは同じ文字をいれてください！</p> <%
 						}
 					%>

					<p>
						<a href="login" class="back">戻る</a><input type="submit" value="登録"
							class="send" />
					</p>
				</li>
			</ol>
		</fieldset>

	</form>

</body>

<script>
	//optionタグ量産
	const year = document.getElementById('year')
	const month = document.getElementById('month')
	const day = document.getElementById('day')
	for (let i = 1960; i <= 2019; i++) {
		const optionTag = document.createElement("option")
		year.appendChild(optionTag)
		dispatchOption(optionTag, i)
	}
	for (let i = 1; i <= 12; i++) {
		const optionTag = document.createElement("option")
		month.appendChild(optionTag)
		dispatchOption(optionTag, i)
	}
	for (let i = 1; i < 31; i++) {
		const optionTag = document.createElement("option")
		day.appendChild(optionTag)
		dispatchOption(optionTag, i)
	}
	//optionタグにvalueと表示文字を付与
	function dispatchOption(option, value) {
		option.textContent = value
		option.value = value
	}

</script>


</body>
</html>