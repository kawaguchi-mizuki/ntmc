package movies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("selectsSeat")
public class SelectsSeatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		HttpSession session = request.getSession();

		//映画予約に必要な値を取得//
		String movieName = request.getParameter("");
		String movieDate = request.getParameter("");
		String movieTime = request.getParameter("");

		//引数の受け渡し//
		session.setAttribute("movieName", movieName);
		session.setAttribute("movieDate", movieDate);
		session.setAttribute("movieTime", movieTime);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/loginStart.jsp");
		dispatcher.forward(request,response);
	}
}
