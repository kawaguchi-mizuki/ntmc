package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User_Info_Beans;
import model.Movie_Model;

@WebServlet("/delete_appoint")
public class Delete_Appoint extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{

		//セッションの取得//
		HttpSession session = request.getSession();

		User_Info_Beans userInfoBeans = (User_Info_Beans)session.getAttribute("");

		//映画を削除するためのモデル呼び出し//
		Movie_Model movieModel = new Movie_Model();
		movieModel.deleteMovie(userInfoBeans.getUser_id());

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/deleteappoint.jsp");
		dispatcher.forward(request, response);
	}
}