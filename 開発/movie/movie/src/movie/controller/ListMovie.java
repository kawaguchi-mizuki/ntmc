package movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.beans.MovieListBeans;
import movie.model.MovieModel;

@WebServlet("/listview")
public class ListMovie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MovieModel movieModel = new MovieModel();
		List<MovieListBeans> list = movieModel.getMovieView();

		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/movielist.jsp");
		dispatcher.forward(request, response);
	}
}
