package movie.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import movie.beans.UserInfoBeans;
import movie.model.UserModel;
@WebServlet("/auth")
public class LoginUser extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//メールアドレスとパスワードを取得
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");

		//ユーザーモデル生成
		UserModel userModel = new UserModel();

		UserInfoBeans userInfo = userModel.login(mail,password);

		if(userInfo != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userInfo", userInfo);
		}else{
		//ログイン結果がnullの場合はログイン画面に戻す
			response.sendRedirect("login?errflg=1");
			return;
		}

		///////////////////////////////////////////
		//画面を転送する（リダイレクト）
		response.sendRedirect("listview");
	}

}
