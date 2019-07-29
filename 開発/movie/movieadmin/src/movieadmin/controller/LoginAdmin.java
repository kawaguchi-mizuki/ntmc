package movieadmin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movieadmin.beans.AdminInfoBeans;
import movieadmin.model.AdminModel;
@WebServlet("/auth2")
public class LoginAdmin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//メールアドレスとパスワードを取得
		String Id = request.getParameter("id");
		int id = Integer.parseInt(Id);
		String password = request.getParameter("password");

		//ユーザーモデル生成
		AdminModel userModel = new AdminModel();

		AdminInfoBeans adminInfo = userModel.Adminlogin(id,password);

		if(adminInfo != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("adminInfo", adminInfo);
		}else{
			response.sendRedirect("loginadmin?errflg=1");
			return;
		}

		///////////////////////////////////////////
		//画面を転送する（リダイレクト）
		response.sendRedirect("topadmin");
	}

}
