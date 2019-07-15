<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="diary.beans.LoginInfoBeans"%>
    <%@ page import="diary.sanitizing.Sanitizing" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css">
<title>登録確認画面</title>
</head>
<body class="background">
   <%LoginInfoBeans loginInfo = (LoginInfoBeans)session.getAttribute("loginInfo");%>
   <%String errorComment = (String)request.getAttribute("errorComment"); %>
   <%String insertDate = (String)session.getAttribute("insertDate"); %>
   <%String goodPoint = (String)session.getAttribute("goodPoint"); %>
   <%String badPoint = (String)session.getAttribute("badPoint"); %>
   <%String stComment = (String)session.getAttribute("stComment"); %>

   <h2 class="check">日誌確認画面</h2>
       <table>
       	<tr>
           <td class="registration"><%=insertDate%></td>
           <td class="loginInfo"><%=loginInfo.getCourseName()%></td>
           <td class="loginInfo"><%=loginInfo.getClassName()%>クラス</td>
           <td class="loginInfo">氏名 : <%=loginInfo.getName()%></td>
       	</tr>
       </table>
	      <p id="goodPoint">良かった点</p>
	      <p><%=Sanitizing.scriptStop(goodPoint)%></p>
	      <p id="badPoint">悪かった点</p>
	      <p><%=Sanitizing.scriptStop(badPoint)%></p>
	      <p id="studentComment">学生コメント</p>
	      <p><%=Sanitizing.scriptStop(stComment)%></p>
            <p id="check">この内容でよろしいですか？</p>
	<form action="checkcomp" method="GET">
	<div class="form-group">
	<input id="yes" class="btn btn-warning btn-lg btn-block"
	 type="submit" value="はい">
		</div>
	</form>
	<form action="registration" method="GET">
	<div class="form-group">
		<input id="no" class="btn btn-warning btn-lg btn-block"
		type="submit" value="いいえ">
	</div>
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