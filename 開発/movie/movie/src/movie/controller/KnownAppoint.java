package movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.MovieListBeans;
import movie.beans.UserInfoBeans;
import movie.model.MovieModel;

@WebServlet("/knownAppoint")
public class KnownAppoint extends HttpServlet {

   @Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		//セッション取得//
		HttpSession session = request.getSession();
		UserInfoBeans userInfo = (UserInfoBeans)session.getAttribute("userInfo");


		MovieModel movieModel = new MovieModel();
		List<MovieListBeans> list = movieModel.getMovieList();

		request.setAttribute("list", list);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/knownAppoint.jsp");
		dispatcher.forward(request, response);
	}
}

