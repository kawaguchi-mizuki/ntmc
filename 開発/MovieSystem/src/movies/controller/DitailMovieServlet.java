package movies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movies.beans.MovieListBeans;
import movies.model.MovieModel;

@WebServlet("/ditailMovie")
public class DitailMovieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		//movieIdを取得//
		String notMovieId = request.getParameter("");
		int movieId = Integer.parseInt(notMovieId);

		//Modelのインスタンス生成//
		MovieModel movieModel = new MovieModel();
		MovieListBeans movieListBeans = movieModel.getDetail(movieId);

		//映画情報をセット//
		request.setAttribute("movieListBeans", movieListBeans);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/ditailMovie.jsp");
		dispatcher.forward(request,response);
	}
}
