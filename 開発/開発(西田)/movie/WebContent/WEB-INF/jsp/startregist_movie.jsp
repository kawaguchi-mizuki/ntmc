<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="common">映画登録</h1>
<form action="registmovie" method="get">
<table>
 <tr>
  <td class="koumoku">映画名</td>
  <td><input type="text"  style="height: 26px" class="nyuuryoku" name="inmovie"></td>
 </tr>
 <tr>
  <td class="koumoku">ジャンル</td>
  <td>
     <select name="janru">
     <option value="1">ホラー</option>
     <option value="2">恋愛</option>
     <option value="3">アクション</option>
     <option value="4">ギャグ・コメディ</option>
     <option value="5">SF</option>
     <option value="6">ミステリー</option>
     <option value="7">R18</option>
     </select>
  </td>
 </tr>
 <tr>
  <td class="koumoku">キャスト</td>
  <td><input type="text" style="height: 26px" name="incast"></td>
 </tr>
 <tr>
   <td class="startmovieDate">開始日</td>
   <td><input type="date" name="startdate"></td>
   </tr>
 <tr>
   <td class="finishmovieDate">終了日</td>
   <td><input type="date" name="finishdate"></td>
 </tr>

 <tr>
  <td class="koumoku">概要</td>
  <td><textarea name="naiyou" rows="8" cols="16"></textarea></td>
 </tr>
</table>


<div class="backbtn">
  <a href="top" class="back">戻る</a>
  <input type="submit"  value="確認" class="check">
</div>
</form>

</body>

</html>