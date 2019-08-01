package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User_Info_Beans;
import model.User_Model;
@WebServlet("/updateuser")
public class Update_User extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respons) throws ServletException, IOException {
		// TOD 自動生成されたメソッド・スタブ


		//入力された値を取得
		User_Info_Beans userInfoBeans = new User_Info_Beans();
		int id = userInfoBeans.getUser_id();
		String mail = request.getParameter("mail");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String r_password = request.getParameter("r-password");



		//パスワードの入力値が再入力の値と違うならエラーをだす
		if(!(password.equals(r_password))) {
			respons.sendRedirect("updateuserstart?errflg=1");
			return;
		}

		//ユーザーモデルを生成、値を渡す
		User_Model usermodel = new User_Model();
		usermodel.changeInfoUser(id,mail,name,password);

		HttpSession session = request.getSession();

		User_Info_Beans userInfo = (User_Info_Beans) session.getAttribute("userInfo");

		userInfo.setMail(mail);
		userInfo.setName(name);
		userInfo.setPassword(r_password);

		session.setAttribute("userInfo", userInfo);


		//完了画面へ推移。
		respons.sendRedirect("updateusercomp");

	}

}