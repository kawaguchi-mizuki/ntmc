package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserModel;
@WebServlet("/user")
public class AddUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//入力された値を取得
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String r_password = request.getParameter("r-password");
		String year =  request.getParameter("year");
		String month =  request.getParameter("month");
		String day =  request.getParameter("day");

		String birthday = year+"-"+month+"-"+day;




		//パスワードの入力値が再入力の値と違うならエラーをだす
		if(!(password.equals(r_password))) {
			response.sendRedirect("adduser?errflg=1");
			return;
		}

		//ユーザーモデルを生成、値を渡す
		UserModel usermodel = new UserModel();
		usermodel.createUser(mail,name,sex,birthday,password);


		//完了画面へ推移。
		response.sendRedirect("addusercomp");





	}

}
