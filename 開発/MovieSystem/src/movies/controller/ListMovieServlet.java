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

		String loginFlg = (String)request.getAttribute("loginFlg");
		//映画情報を取得するためのモデル//
		MovieModel movieModel = new MovieModel();
		List<MovieListBeans> list = movieModel.getMovieList();
		request.setAttribute("list", list);

		//ログインを判定するための素材（フラグ）を渡す//
		request.setAttribute("loginFlg", loginFlg);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listMovie.jsp");
		dispatcher.forward(request, response);
	}
}