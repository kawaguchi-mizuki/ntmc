package movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.UserInfoBeans;
import movie.model.UserModel;
@WebServlet("/unsub")
public class Unsbscribe extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ


		//入力された値を取得
		int id = UserInfoBeans.getId();
		HttpSession session = request.getSession();

		UserModel userModel = new UserModel();

		userModel.unsubFromUser(id);

		session.invalidate();

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/unsub_comp.jsp");
		dispatcher.forward(request, respons);

	}



}
