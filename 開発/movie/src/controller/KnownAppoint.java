package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AppointBeans;
import beans.UserInfoBeans;
import model.MovieModel;

@WebServlet("/knownAppoint")
public class KnownAppoint extends HttpServlet {

	//Override//
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		//セッション取得//
		MovieModel movieModel = new MovieModel();
		List<AppointBeans> list = movieModel.getList(UserInfoBeans.getId());

		request.setAttribute("list", list);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/knownAppoint.jsp");
		dispatcher.forward(request, response);
	}
}