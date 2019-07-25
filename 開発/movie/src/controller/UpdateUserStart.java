package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.UserInfoBeans;
import model.UserModel;
@WebServlet("/updateuserstart")
public class UpdateUserStart extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ

		int id = UserInfoBeans.getId();

		//ユーザーモデル生成
		UserModel userModel = new UserModel();

		UserInfoBeans userInfo = userModel.example(id);




		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/update_user.jsp");
		dispatcher.forward(request, respons);

	}

}