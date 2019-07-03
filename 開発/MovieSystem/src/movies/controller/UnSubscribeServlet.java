package movies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movies.beans.UserInfoBeans;
import movies.model.UserModel;
@WebServlet("/unSubscribe")
public class UnSubscribeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {

		//入力された値を取得
		UserInfoBeans userInfoBeans = new UserInfoBeans();
		int id = userInfoBeans.getUserId();
		HttpSession session = request.getSession();

		UserModel userModel = new UserModel();

		userModel.unsubFromUser(id);

		session.invalidate();

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/unSubscribe.jsp");
		dispatcher.forward(request, respons);
	}
}