package movieadmin.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/updateselect")
public class UpdateMovieSelect extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ


		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/update_movie.jsp");
		dispatcher.forward(request, respons);

	}

}
