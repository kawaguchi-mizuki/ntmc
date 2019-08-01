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

@WebServlet("/authadmin")
public class LoginAdminServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String AdminId = request.getParameter("AdminId");
		int adminId = Integer.parseInt(AdminId);
		String Adminpass = request.getParameter("Adminpass");

		UserModel AdminModel = new UserModel();

		AdminInfoBeans adminInfo = AdminModel.loginAdmin(adminId,Adminpass);

		if(adminInfo != null) {
			HttpSession session = request.getSession();
			session.setAttribute("adminInfo",adminInfo);
		} else {
			response.sendRedirect("login?errflg=1");
			return;
		}

		response.sendRedirect("top");
	}
}
