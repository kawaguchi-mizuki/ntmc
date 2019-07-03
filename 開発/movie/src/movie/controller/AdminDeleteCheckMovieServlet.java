package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.MovieListBeans;
import model.MovieModel;



@WebServlet("/admin")
public class AdminDeleteCheckMovieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		HttpSession session = request.getSession();

		MovieListBeans movieBean = (MovieListBeans)session.getAttribute("");

		MovieModel movieModel = new MovieModel();

		movieModel.adminDeleteMovie(movieBean.getMovieId() );

	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/adminmovie.jsp");
	dispatcher.forward(request, response);
	}
}
