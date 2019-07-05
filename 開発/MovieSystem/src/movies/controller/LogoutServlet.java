package movies.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
								throws ServletException, IOException{

		//セッション取得//
		HttpSession session = request.getSession();
		//セッションを破棄//
		session.invalidate();

		//映画一覧画面へ遷移//
		response.sendRedirect("listMovie");
	}
}
