<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../css/appointSelect.css" rel="stylesheet">
<title>予約座席選択画面</title>

<script src="js/jquery.min.js　jQueryのパス"></script>
  <script>
    $(function() {
      $("#header01").load("header01.jsp");

    });
  </script>

</head>
<body>

<style>
input[type=checkbox] {
display: none;	/* checkboxを非表示にする */
}

input[type=radio]{
display: none;/*チェックボックスを非表示にする*/
}

input[type="checkbox"]:checked + label {
background: #fd7e00;/* マウス選択時の背景色を指定する */
color: #ffffff; /* マウス選択時のフォント色を指定する */
}

.label {
display: block;	/* ブロックレベル要素化する */
float: left;	/* 要素の左寄せ・回り込を指定する */
margin: 1px;	/* ラベル外側の余白を指定する */
width: 10px;	/* ラベルの横幅を指定する */
height: 20px;	/* ラベルの高さを指定する */
text-align: center;	/* テキストのセンタリングを指定する */
line-height: 45px;	/* 行の高さを指定する */
padding-left: 5px;	/* ラベル内左側の余白を指定する */
padding-right: 5px;	/* ラベル内右側の余白を指定する */
cursor: pointer;	/* マウスカーソルの形（リンクカーソル）を指定する */
color: #b20000;	/* フォントの色を指定 */
border: 2px solid #006DD9;/* ラベルの境界線を実線で指定する */
border-radius: 5px;	/* 角丸を指定する */
}

.btn-square {
  display: inline-block;
  padding: 0.5em 1em;
  text-decoration: none;
  background: #668ad8;/*ボタン色*/
  color: #FFF;
  border-bottom: solid 4px #627295;
  border-radius: 3px;
}
.btn-square:active {
  /*ボタンを押したとき*/
  -webkit-transform: translateY(4px);
  transform: translateY(4px);/*下に動く*/
  border-bottom: none;/*線を消す*/
}

.border_radius {
    border-radius: 20px;
    -webkit-border-radius: 20px;
    -moz-border-radius: 20px;
}


/*テーブルを囲むcardクラスの情報 */

.card {
  width: 350px;
  background: #fff;
  border-radius: 30px;

  border-style: solid;
  border-color: black;
  box-shadow: 0 2px 5px #ccc;

  padding: 30px;
  padding-left: 70px;
}
.card-img {
  border-radius: 5px 5px 0 0;
  max-width: 100%;
  height: auto;
}
.card-content {
  padding: 20px;
}
.card-title {
  font-size: 20px;
  margin-bottom: 20px;
  text-align: center;
  color: #333;
}
.card-text {
  color: #777;
  font-size: 14px;
  line-height: 1.5;
}
.card-link {
  text-align: center;
  border-top: 1px solid #eee;
  padding: 20px;
}
.card-link a {
  text-decoration: none;
  color: #0bd;
  margin: 0 10px;
}
.card-link a:hover {
  color: #0090aa;
}

</style>

<!-- //////ヘッダーを読み込ませる///// -->

<header id="header01"></header>

<!-- ///////////////////////////////// -->

<h1>予約する座席を選択してください。</h1>

	<!-- チェックボックスをボタンの形にしている。  -->

<section class="card">
	<table border="0">

		<tr>
			<th></th>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
			<th>6</th>
			<th>7</th>
			<th>8</th>

		</tr>


		<tr>
			<th>A</th>
			<td><input type="checkbox" name="A" value="1" id="A1">
				<label for="A1" class="label"></label></td>
			<td><input type="checkbox" name="A" value="2" id="A2">
				<label for="A2" class="label"></label></td>
			<td><input type="checkbox" name="A" value="3" id="A3">
				<label for="A3" class="label"></label></td>
			<td><input type="checkbox" name="A" value="4" id="A4">
				<label for="A4" class="label"></label></td>
			<td><input type="checkbox" name="A" value="5" id="A5">
				<label for="A5" class="label"></label></td>
			<td><input type="checkbox" name="A" value="6" id="A6">
				<label for="A6" class="label"></label></td>
			<td><input type="checkbox" name="A" value="7" id="A7">
				<label for="A7" class="label"></label></td>
			<td><input type="checkbox" name="A" value="8" id="A8">
				<label for="A8" class="label"></label></td>

		</tr>

		<tr>
			<th>B</th>
			<td><input type="checkbox" name="B" value="1" id="B1">
				<label for="B1" class="label"></label></td>
			<td><input type="checkbox" name="B" value="2" id="B2">
				<label for="B2" class="label"></label></td>
			<td><input type="checkbox" name="B" value="3" id="B3">
				<label for="B3" class="label"></label></td>
			<td><input type="checkbox" name="B" value="4" id="B4">
				<label for="B4" class="label"></label></td>
			<td><input type="checkbox" name="B" value="5" id="B5">
				<label for="B5" class="label"></label></td>
			<td><input type="checkbox" name="B" value="6" id="B6">
				<label for="B6" class="label"></label></td>
			<td><input type="checkbox" name="B" value="7" id="B7">
				<label for="B7" class="label"></label></td>
			<td><input type="checkbox" name="B" value="8" id="B8">
				<label for="B8" class="label"></label></td>

		</tr>

		<tr>
			<th>C</th>
			<td><input type="checkbox" name="C" value="1" id="C1">
				<label for="C1" class="label"></label></td>
			<td><input type="checkbox" name="C" value="2" id="C2">
				<label for="C2" class="label"></label></td>
			<td><input type="checkbox" name="C" value="3" id="C3">
				<label for="C3" class="label"></label></td>
			<td><input type="checkbox" name="C" value="4" id="C4">
				<label for="C4" class="label"></label></td>
			<td><input type="checkbox" name="C" value="5" id="C5">
				<label for="C5" class="label"></label></td>
			<td><input type="checkbox" name="C" value="6" id="C6">
				<label for="C6" class="label"></label></td>
			<td><input type="checkbox" name="C" value="7" id="C7">
				<label for="C7" class="label"></label></td>
			<td><input type="checkbox" name="C" value="8" id="C8">
				<label for="C8" class="label"></label></td>

		</tr>

		<tr>
			<th>D</th>
			<td><input type="checkbox" name="D" value="1" id="D1">
				<label for="D1" class="label"></label></td>
			<td><input type="checkbox" name="D" value="2" id="D2">
				<label for="D2" class="label"></label></td>
			<td><input type="checkbox" name="D" value="3" id="D3">
				<label for="D3" class="label"></label></td>
			<td><input type="checkbox" name="D" value="4" id="D4">
				<label for="D4" class="label"></label></td>
			<td><input type="checkbox" name="D" value="5" id="D5">
				<label for="D5" class="label"></label></td>
			<td><input type="checkbox" name="D" value="6" id="D6">
				<label for="D6" class="label"></label></td>
			<td><input type="checkbox" name="D" value="7" id="D7">
				<label for="D7" class="label"></label></td>
			<td><input type="checkbox" name="D" value="8" id="D8">
				<label for="D8" class="label"></label></td>

		</tr>

		<tr>
			<th>ペア</th>
			<td><input type="checkbox" name="P" value="1" id="P1">
				<label for="P1" class="label"></label></td>
			<td><input type="checkbox" name="P" value="2" id="P2">
				<label for="P2" class="label"></label></td>
			<td><input type="checkbox" name="P" value="3" id="P3">
				<label for="P3" class="label"></label></td>
			<td><input type="checkbox" name="P" value="4" id="P4">
				<label for="P4" class="label"></label></td>
			<td><input type="checkbox" name="P" value="5" id="P5">
				<label for="P5" class="label"></label></td>
			<td><input type="checkbox" name="P" value="6" id="P6">
				<label for="P6" class="label"></label></td>
			<td><input type="checkbox" name="P" value="7" id="P7">
				<label for="P7" class="label"></label></td>
			<td><input type="checkbox" name="P" value="8" id="P8">
				<label for="P8" class="label"></label></td>


	</table>
</section>

	<!-- タッチ差で予約に失敗した時など、エラーメッセージを表示させる -->
	<span class="message label-danger">${message}</span>

	<a href="#" class="btn-square">前の画面に戻る</a>
	<a href="#" class="btn-square">決定</a>

</body>
</html>