package movies.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movies.beans.AppointBeans;
import movies.beans.UserInfoBeans;
import movies.model.MovieModel;

@WebServlet("knownAppoint")
public class KnownAppointServlet extends HttpServlet {

	//Override//
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
						throws ServletException,IOException{
		//セッション取得//
		HttpSession session = request.getSession();
		UserInfoBeans userInfo = (UserInfoBeans)session.getAttribute("");
		List<AppointBeans> list = new ArrayList<AppointBeans>();
		MovieModel movieModel = new MovieModel();
		list = movieModel.getList(userInfo.getUserId());



	//画面遷移//
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/knownAppoint.jsp");
	dispatcher.forward(request, response);
	}
}
