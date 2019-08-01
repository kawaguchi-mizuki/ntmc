package movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/updatemovie")
public class UpdateAdminMovieServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String upmovie = request.getParameter("upmovie");
		String upgenre = request.getParameter("upgenre");
		String upcast = request.getParameter("upcast");
		String upsummry = request.getParameter("upsummry");







		HttpSession session = request.getSession(true);
		session.setAttribute("upmovie", upmovie);
		session.setAttribute("upgenre", upgenre);
		session.setAttribute("upcast", upcast);
		session.setAttribute("upsummry", upsummry);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/updatecheckmovie.jsp");
		dispatcher.forward(request,response);

	}
}
