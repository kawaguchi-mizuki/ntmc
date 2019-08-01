package movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.MovieListBeans;
import movie.model.MovieModel;
@WebServlet("/updateAdmin")
public class UpdateAdminServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		int updatemovie = Integer.parseInt(request.getParameter("radio1"));


		MovieModel moviemodel = new MovieModel();

		List<MovieListBeans> movieList = moviemodel.update(updatemovie);

		request.setAttribute("movieList",movieList);
		HttpSession session = request.getSession();
		session.setAttribute("upmovieId", updatemovie);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/update.jsp");
		dispatcher.forward(request,respons);

	}
}
