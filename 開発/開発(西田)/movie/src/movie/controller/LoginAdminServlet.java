package movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.AdminInfoBeans;
import movie.model.UserModel;
@WebServlet("/authAdmin")
public class LoginAdminServlet extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String AdId = request.getParameter("AdminId");
		int AdminId = Integer.parseInt(AdId);
		String Adminpass = request.getParameter("Adminpass");

	    UserModel userModel = new UserModel();

		AdminInfoBeans AdminInfo = userModel.loginAdmin(AdminId,Adminpass);

		if(AdminInfo != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("AdminInfo", AdminInfo);
		}else{
			//ログイン結果がnullの場合はログイン画面に戻す
			response.sendRedirect("login?errflg=1");
			return;
		}

		///////////////////////////////////////////
		//画面を転送する（リダイレクト）
		response.sendRedirect("top");
	}
}
