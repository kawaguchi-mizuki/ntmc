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
@WebServlet("/updateinfomovie")
public class UpdateInfoMovie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		AdminInfoBeans adminInfo = (AdminInfoBeans)session.getAttribute("adminInfo");

		int movieId = (int)session.getAttribute("upmovieId");


		String upmovie = (String)session.getAttribute("upmovie");
		String upgenre = (String)session.getAttribute("upgenre");
		String upcast = (String)session.getAttribute("upcast");
		String upsummry = (String)session.getAttribute("upsummry");


		MovieModel updatemovie = new MovieModel();
		updatemovie.updatemovieInfo(movieId,upmovie,adminInfo.getAdminId(),upgenre,upcast,upsummry);
		response.sendRedirect("updatecomp");
	}
}
