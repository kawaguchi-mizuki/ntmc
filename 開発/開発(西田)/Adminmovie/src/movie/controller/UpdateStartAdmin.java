package movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.beans.MovieListBeans;
import movie.model.MovieModel;

@WebServlet("/updatestartAdmin")
public class UpdateStartAdmin extends HttpServlet {


		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {



			MovieModel upmoviemodel = new MovieModel();
			List<MovieListBeans> selectmovie = upmoviemodel.updatestartmovie();

			request.setAttribute("selectmovie", selectmovie);

			// TOD 自動生成されたメソッド・スタブ
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/updatestart.jsp");
	dispatcher.forward(request, respons);
		}
}
