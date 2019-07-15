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

@WebServlet("/unsubscribe")
public class UnsubscribeSevlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		UserModel userModel = new UserModel();

		UserInfoBeans userInfo = userModel.unsubFromUser(userId);

		HttpSession session = request.getSession(true);

		session.setAttribute("userInfo", userInfo);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/unsubscribe.jsp");
		dispatcher.forward(request, response);
	}
}