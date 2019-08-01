package controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User_Info_Beans;
import model.User_Model;
@WebServlet("/updateuserstart")
public class Update_User_Start extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ

		User_Info_Beans userInfoBeans = new User_Info_Beans();
		int id = userInfoBeans.getUser_id();

		//ユーザーモデル生成
		User_Model userModel = new User_Model();

		User_Info_Beans userInfo = userModel.example(id);




		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/update_user.jsp");
		dispatcher.forward(request, respons);

	}

}