package movies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginStart
 */
@WebServlet("/adminLoginStart")
public class AdminLoginStartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminLoginStart.jsp");
		dispatcher.forward(request,response);
	}
}

