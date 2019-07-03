package movies.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movies.beans.MovieListBeans;
import movies.model.MovieModel;

@WebServlet("/listMovie")
public class ListMovieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MovieModel movieModel = new MovieModel();
		List<MovieListBeans> list = movieModel.getMovieList();

		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listMovie.jsp");
		dispatcher.forward(request, response);
	}
}