<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>ログイン画面</title>
<link rel="stylesheet" type="text/css" href="/movie/css/login.css">
</head>
<body>
<% String errflg = request.getParameter("errflg");
   if(errflg != null){
     if(errflg.equals("1")){%>
     <p><font color = "red">ログインに失敗しました。学籍番号またはパスワードが間違っています。</font></p>
   <%}%>
<% }%>

   <h1>ログイン</h1>

    <a href="movie/src/movie/controller/AddUserServlet.java" class="btn-square-slant" style="position: absolute; right: 0px; top: 0px">新規登録</a>
     <form action="auth" method="post">
      <table align="center">
          <tr>
            <th>メールアドレス</th><td><input type="text" name="mail"></td>
      </tr>
      <tr>
         <th>パスワード</th><td><input type="password" name="password"></td>
      </tr>
      <tr>
            <th></th><td align="left"><input type="submit" class="btn-square" value="ログイン"></td>
      </tr>
</table>
</form>
</body>
</html>