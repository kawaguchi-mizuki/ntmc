package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Appoint_Beans;
import beans.User_Info_Beans;
import model.Movie_Model;

@WebServlet("/knownAppoint")
public class Known_Appoint extends HttpServlet {

	//Override//
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		//セッション取得//
		Movie_Model movieModel = new Movie_Model();
		User_Info_Beans userInfoBeans = new User_Info_Beans();
		List<Appoint_Beans> list = movieModel.getList(userInfoBeans.getUser_id());

		request.setAttribute("list", list);

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/knownAppoint.jsp");
		dispatcher.forward(request, response);
	}
}