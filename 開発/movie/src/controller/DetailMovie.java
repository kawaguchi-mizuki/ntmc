package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.MovieDetailBeans;
import model.MovieModel;
@WebServlet("/detail")
public class DetailMovie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//映画を判断するためのIDを取得する//
		String movie_id = request.getParameter("movie_id");
		int newMovie_id = Integer.parseInt(movie_id);
		//request.setAttribute("movie_id",newMovie_id);
		//映画一覧画面にある映画情報を取得する//
		MovieModel movieModel = new MovieModel();
		List<MovieDetailBeans> list = movieModel.getMovieDetail(newMovie_id);
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/detailMovie.jsp");
		dispatcher.forward(request, response);
	}
}