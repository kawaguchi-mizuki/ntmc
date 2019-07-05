package movies.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movies.beans.UserInfoBeans;
import movies.model.UserModel;

@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		//セッションを取得//
		HttpSession session = request.getSession();

		//モデル生成//
		UserModel userModel = new UserModel();
		UserInfoBeans userInfo = userModel.getUser(mail,password);

		//ログインに成功した場合は、ログイン情報をセッションに保存する//
		if(userInfo != null) {
			session.setAttribute("userInfo", userInfo);
		} else {
			//ログインエラーになっても、メールアドレスのみ残す//
			session.setAttribute("mail", mail);
			//リダイレクトする時に、値を一緒に持たせる//
			response.sendRedirect("userLoginStart?errflg=1");
			//voidだが、画面遷移に行かないようにするためにわざとしている//
			return;
		}

		//画面遷移//
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/listMovie.jsp");
		dispatcher.forward(request,response);
	}
}
