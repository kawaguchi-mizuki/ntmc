package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.UserInfoBeans;
import model.UserModel;

@WebServlet("/unsub")
public class UnsubscribeSevlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		HttpSession session = request.getSession();

		UserInfoBeans userInfo = (UserInfoBeans)session.getAttribute("");

		UserModel userModel = new UserModel();

		userModel.unsubFromUser(userInfo.getUserId());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/unsubscribe.jsp");
		dispatcher.forward(request, response);
	}
}
