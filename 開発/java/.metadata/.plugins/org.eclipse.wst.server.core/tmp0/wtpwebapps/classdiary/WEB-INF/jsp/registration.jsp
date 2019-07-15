<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="diary.beans.LoginInfoBeans"%>
<%@ page import="diary.sanitizing.Sanitizing" %>
<!DOCTYPE>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
<meta charset="UTF-8">
<title>日誌登録画面</title>
</head>
<body class="background">
	<%LoginInfoBeans loginInfo = (LoginInfoBeans)session.getAttribute("loginInfo");%>
	<%String errflg = request.getParameter("errflg"); %>
	<%String insertDate = (String)session.getAttribute("insertDate"); %>
	<%String goodPoint = (String)session.getAttribute("goodPoint"); %>
	<%String badPoint = (String)session.getAttribute("badPoint"); %>
	<%String stComment = (String)session.getAttribute("stComment"); %>
	<form action="check" method = "GET">
		<h3 id="registration">日誌登録画面</h3>
		<table>
		<tr>
			<td><a class="btn btn-info btn-lg" href="top">トップへ戻る</a>
			<td class="registration"><input type = "date" name="insertDate"
     		    <%if(insertDate != null){ %> value = "<%=insertDate%>" <%}%>></td>
			<td class="loginInfo"><%=loginInfo.getCourseName()%></td>
			<td class="loginInfo"><%=loginInfo.getClassName()%>クラス</td>
			<td class="loginInfo">氏名 : <%=loginInfo.getName()%></td>
		</tr>
		</table>
		<%if(errflg != null && errflg.equals("1")){ %>
			<p class ="errormessage">空欄があります</p>
		<%} else if(errflg != null && errflg.equals("2")){%>
			<p class ="errormessage">制限文字を超えている欄があります</p>
		<%} else if(errflg != null && errflg.equals("3")){%>
			<p class ="errormessage">空欄と、制限文字を超えている欄があります</p>
		<%} else if(errflg != null && errflg.equals("4")){%>
		    <p class ="errormessage"><%=insertDate%>の日誌はすでに登録されています</p>
		<%} %>

			<p id="goodPoint">良かった点</p>
			<div class="form-group">
			<input type="text" class="form-control" name="goodPoint" placeholder="30文字以内"
			       <%if(goodPoint != null){ %>value = "<%=Sanitizing.scriptStop(goodPoint)%>"<%}%>>
			 </div>
			<p id="badPoint">悪かった点</p>
			<input type="text" class="form-control" name="badPoint" placeholder="30文字以内"
			       <%if(badPoint != null){ %>value = "<%=Sanitizing.scriptStop(badPoint)%>"<%}%>>
			<p id="studentComment">学生コメント</p>
			<input type="text" class="form-control" name="stComment" placeholder="30文字以内"
			         <%if(stComment != null){%> value = "<%=Sanitizing.scriptStop(stComment)%>"<%}%>>
			<input id="registrationbutton" class="btn btn-warning btn-lg btn-block"
			 type="submit" value="次へ">
</form>
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