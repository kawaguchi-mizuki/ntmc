package movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.AdminInfoBeans;
import movie.model.MovieModel;

@WebServlet("/registmovie")
public class RegistMovie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		String moviename = request.getParameter("inmovie");
		String moviegenre = request.getParameter("janru");
		String moviecast = request.getParameter("incast");
		String startmovie = request.getParameter("startdate");
		String finishmovie = request.getParameter("finishdate");

		HttpSession session = request.getSession();
		AdminInfoBeans adminInfo = (AdminInfoBeans)session.getAttribute("AdminInfo");

		MovieModel moviemodel = new MovieModel();
		//moviemodel.registAdminMovie(moviename,moviegenre,moviecast,adminInfo.getAdminId(),startmovie,finishmovie);


}
}
