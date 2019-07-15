<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "diary.beans.ListBeans" %>
<%@ page import = "diary.beans.LoginInfoBeans" %>
<%@ page import = "java.util.*" %>
<%@ page import = "diary.sanitizing.Sanitizing" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
<title>日誌閲覧画面</title>
</head>
<body class="backgroundList">
	<%List<ListBeans> list = (List<ListBeans>)request.getAttribute("list"); %>
	<%if(list != null){ %>
		<%for(ListBeans listbeans : list){ %>
	<table id="list" border="1">
		<tr>
			<td><%=listbeans.getInsertDate()%></td>
			<td class="loginInfo"><%=listbeans.getCourseName()%></td>
			<td class="loginInfo"><%=listbeans.getClassName()%>クラス</td>
			<td class="loginInfo">氏名 : <%=listbeans.getName()%></td>
		</tr>
		<tr><td id="goodPoint" colspan="4">良かった点</td></tr>
		<tr><td class="bg-white text-dark" colspan="4"><%=Sanitizing.scriptStop(listbeans.getGoodPoint())%></td></tr>
		<tr><td id="badPoint" colspan="4">悪かった点</td></tr>
		<tr><td class="bg-white text-dark" colspan="4"><%=Sanitizing.scriptStop(listbeans.getBadPoint())%></td></tr>
		<tr><td id="studentComment" colspan="4">学生コメント</td></tr>
		<tr><td class="bg-white text-dark" colspan="4"><%=Sanitizing.scriptStop(listbeans.getStudentComment())%></td></tr>
	</table>
		<%}%>
	<%}%>
	<a class="btn btn-warning btn-lg btn-block" href="top">トップに戻る</a>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
crossorigin="anonymous"></script>
</body>
</html>