package movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/adduser")
public class AddUserStart extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/add_user.jsp");
dispatcher.forward(request, respons);
}
}
