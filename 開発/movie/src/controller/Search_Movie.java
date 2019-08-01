package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Movie_List_Beans;
import model.Movie_Model;
@WebServlet("/searchmovie")
public class Search_Movie extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String searchmovie = request.getParameter("search");

		Movie_Model moviemodel = new Movie_Model();
		List<Movie_List_Beans> movie = moviemodel.searchMovie(searchmovie);
		request.setAttribute("movie", movie);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listmovie.jsp");
		dispatcher.forward(request, response);


	}

}