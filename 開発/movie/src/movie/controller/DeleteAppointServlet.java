package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AppointBeans;
import model.MovieModel;

@WebServlet("/App")
public class DeleteAppointServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		HttpSession session = request.getSession();

		AppointBeans userInfo = (AppointBeans)session.getAttribute("");

		MovieModel movieModel = new MovieModel();

		movieModel.appointMovie(userInfo.getMovieId());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/deleteappoint.jsp");
		dispatcher.forward(request, response);
	}
}