<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="beans.UserInfoBeans"%>
<link href="css/header.css" rel="stylesheet" type="text/css">
<%
	UserInfoBeans login = (UserInfoBeans) session.getAttribute("userInfo");
%>

<div class="top">
	<a href="listview"><img src="img/ntmc.png"></a>
	<%
		UserInfoBeans userInfo = (UserInfoBeans) session.getAttribute("userInfo");
	%>

</div>