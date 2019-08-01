<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>映画更新確認画面</title>
</head>
<body>
<%String upmovie = (String)session.getAttribute("upmovie");
  String upgenre = (String)session.getAttribute("upgenre");
  String upcast = (String)session.getAttribute("upcast");
  String upsummry = (String)session.getAttribute("upsummry");%>
<h1>映画更新確認画面</h1>

<table>
<tr>
  <td class="koumoku">映画名</td>
  <td><%=upmovie %></td>
 </tr>
 <tr>
  <td class="koumoku">ジャンル</td>
  <td><%=upgenre %></td>
 </tr>
 <tr>
  <td class="koumoku">キャスト</td>
  <td><%=upcast %></td>
 </tr>
 <tr>
  <td class="koumoku">概要</td>
  <td><%=upsummry %></td>
 </tr>
</table>
<p class="messagecheck">この内容でよろしいですか？</p>
<p><form action="updateinfomovie" method="get">
<input type="submit" value="更新">
</form>
</p>
<form>
<INPUT type="button" onClick='history.back();' value="戻る">
</form>




</body>
</html>