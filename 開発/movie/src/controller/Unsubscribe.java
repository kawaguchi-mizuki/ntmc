package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User_Info_Beans;
import model.User_Model;
@WebServlet("/unsub")
public class Unsubscribe extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ


		//入力された値を取得
		User_Info_Beans userInfoBeans = new User_Info_Beans();
		int id = userInfoBeans.getUser_id();
		HttpSession session = request.getSession();

		User_Model userModel = new User_Model();

		userModel.unsubFromUser(id);

		session.invalidate();

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/unsub_comp.jsp");
		dispatcher.forward(request, respons);

	}



}