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
@WebServlet("/updateuser")
public class UpdateUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ


		//入力された値を取得
		int id = UserInfoBeans.getId();
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String r_password = request.getParameter("r-password");



		//パスワードの入力値が再入力の値と違うならエラーをだす
		if(!(password.equals(r_password))) {
			respons.sendRedirect("updateuser?errflg=1");
			return;
		}

		//ユーザーモデルを生成、値を渡す
		UserModel usermodel = new UserModel();
		usermodel.changeInfoUser(id,mail,name,password);

		HttpSession session = request.getSession();

		UserInfoBeans userInfo = (UserInfoBeans) session.getAttribute("userInfo");

		userInfo.setMail(mail);
		userInfo.setName(name);
		userInfo.setPassword(r_password);

		session.setAttribute("userInfo", userInfo);


		//完了画面へ推移。
		respons.sendRedirect("updateusercomp");

	}

}
