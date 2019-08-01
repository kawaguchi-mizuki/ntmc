package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Movie_List_Beans;
import model.Movie_Model;

@WebServlet("/listMovie")
public class List_Movie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Movie_Model movieModel = new Movie_Model();
		List<Movie_List_Beans> list = movieModel.getMovieList();

		session.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listMovie.jsp");
		dispatcher.forward(request, response);
	}
}