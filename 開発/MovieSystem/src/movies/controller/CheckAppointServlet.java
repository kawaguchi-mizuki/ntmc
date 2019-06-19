package movies.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movies.model.MovieModel;

@WebServlet("checkAppoint")
public class CheckAppointServlet extends HttpServlet {

	/*Overrideとは
	  クラスを継承する時に、スーパークラスのメソッドを
	  サブクラスにおいて同じメソッド名で定義し直すこと。
	  オーバーライドする際は、メソッド名だけでなく、
	  引数も同じ数、同じ順番にする必要がある。
	  今回はHttoServletクラスのメソッドをオーバーライドしている。*/
	//オーバーライド//
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		HttpSession session = request.getSession();
		//映画情報を取得する//
		String movieSeat = request.getParameter("");
		String movieFee = request.getParameter("");
		int newMovieFee = Integer.parseInt(movieFee);
		String movieTheater = request.getParameter("");
		String movieScreen = request.getParameter("");
		String movieId = (String)session.getAttribute("");
		int newMovieId = Integer.parseInt(movieId);
		Date movieDate = (Date)session.getAttribute("");
		Time movieTime = (Time)session.getAttribute("");

		int userId = (int)session.getAttribute("");
		MovieModel movieModel = new MovieModel();
		movieModel.appointMovie(userId,newMovieId,newMovieFee,movieDate
				                ,movieTime,movieSeat,movieTheater,movieScreen);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/checkAppointComp.jsp");
		dispatcher.forward(request,response);
	}
}
