<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="beans.User_Info_Beans"%>
<%@page import="beans.Movie_List_Beans"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/appoint_seat.css" rel="stylesheet">
<title>予約座席選択画面</title>

<script src="js/jquery.min.js jQueryのパス"></script>
  <script>
    $(function() {
      $("#header01").load("header01.jsp");

    });
  </script>

</head>
<body>
<% User_Info_Beans userInfo = (User_Info_Beans) session.getAttribute("userInfo"); %>
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

	<a href="detail?" class="btn-square">前の画面に戻る</a>
	<a href="check_appoint" class="btn-square">決定</a>

</body>
</html>