package movieadmin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginadmin")
public class LoginAdminStart extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		respons.setContentType("text/css");
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/login_admin.jsp");
		dispatcher.forward(request, respons);
	}

}
