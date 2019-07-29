<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画更新</title>
<link href="css/add_admin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form class="cmxform" action=updatemovie" method="GET">
		<fieldset>
			<legend>映画更新</legend>

			<table>
				<tr>
					<td>
						<table>
							<tr>
								<td><input type="checkbox" name="check"></td>
							</tr>
						</table>
					</td>
					<td>
						<table border="3" class="title">
							<tr>
								<th>タイトル</th>
							</tr>
							<tr>
								<td>エゴブリン</td>
							</tr>

						</table>
					</td>
				</tr>
			</table>

			<input type="submit" value="更新" class="send" />

		</fieldset>
</body>
</html>