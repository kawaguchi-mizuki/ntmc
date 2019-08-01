package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AdminInfoBeans;
import model.AdminMovieModel;
@WebServlet("/add_movie")
public class Add_Movie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date movie_start=null,movie_finish=null;


		try {
			movie_start=sdf.parse(request.getParameter("movie_start"));
			if(request.getParameter("movie_finish")!=null) {
				movie_finish=sdf.parse(request.getParameter("movie_finish"));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String movie = request.getParameter("movie");
		String genre = request.getParameter("genre");
		String cast = request.getParameter("cast");
		String view = request.getParameter("view");
		int adminid = AdminInfoBeans.getAdminId();



		AdminMovieModel movieModel = new AdminMovieModel();

		movieModel.addmovie(movie,genre,cast,view,adminid,movie_start,movie_finish);


		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/add_movie_comp.jsp");
		dispatcher.forward(request, respons);
	}
}