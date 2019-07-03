
//package・import先に注意

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AdminInfoBeans;
import model.UserModel;
@WebServlet("/auth")
public class LoginAdmin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//メールアドレスとパスワードを取得
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");

		//ユーザーモデル生成
		UserModel userModel = new UserModel();

		AdminInfoBeans adminInfo = userModel.Adminlogin(mail,password);

		if(adminInfo != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("adminInfo", adminInfo);
		}else{
		//ログイン結果がnullの場合はログイン画面に戻す
			response.sendRedirect("login?errflg=1");
			return;
		}

		///////////////////////////////////////////
		//画面を転送する（リダイレクト）
		response.sendRedirect("adminTop");
	}

}