<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画登録</title>
<link href="css/add_admin.css" rel="stylesheet" type="text/css">
</head>
<%!//メソッドの宣言
	Date dNow = new Date();
	SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");%>
<body>
	<form class="cmxform" action="addmovie" method="POST">
		<fieldset>
			<legend>映画登録</legend>
			<ol>
				<li><label for="movie">映画名<em>*</em></label> <input type="text"
					id="movie" name="movie" required="required" /></li>

				<li><label for="genre">ジャンル<span class="sr"></span><em>*</em></label>
					<select id="genre" name="genre"></select></li>

				<li><label for="cast">キャスト名<em>*</em></label> <input
					type="text" id="cast" name="cast" required="required" /></li>

				<li><label for="view">概要<em>*</em></label> <input type="text"
					id="view" name="view" required="required" /></li>


				<li><label for="movie_start">公開年月日<em>*</em></label> <input
					type="date" id="movie_start" min="<%=ft.format(dNow)%>"
					name=" movie_start" /></li>

				<li><label for="movie_finish">終了年月日<em>*</em></label> <input
					type="date" id="movie_finish" min="<%=ft.format(dNow)%>"
					 name="movie_finish" /></li>


				<li>
					<p>
						<a href="topadmin" class="back">戻る</a><input type="submit"
							value="登録" class="send" />
					</p>
				</li>
			</ol>
		</fieldset>

	</form>
</body>
<script type="text/javascript">

    const genre = document.getElementById('genre');

    var view = ["アクション","SF","コメディ","ファンタジー","アニメーション","ホラー","サスペンス"];

	for (let i = 0; i < view.length; i++) {
		const optionTag = document.createElement("option")
		genre.appendChild(optionTag)
		dispatchOption(optionTag, view[i])
	}
	function dispatchOption(option, value) {
		option.textContent = value
		option.value = value
	}
</script>
</html>