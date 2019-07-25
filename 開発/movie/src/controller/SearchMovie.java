package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MovieListBeans;
import model.MovieModel;
@WebServlet("/searchmovie")
public class SearchMovie extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchmovie = request.getParameter("search");

		MovieModel moviemodel = new MovieModel();
		List<MovieListBeans> movie = moviemodel.searchMovie(searchmovie);
		request.setAttribute("movie", movie);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listmovie.jsp");
		dispatcher.forward(request, response);


	}

}