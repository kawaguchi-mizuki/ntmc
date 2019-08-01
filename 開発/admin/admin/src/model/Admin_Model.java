package model;

import beans.AdminInfoBeans;
import model.dao.AdminDao;

public class Admin_Model {

	//管理者ログイン画面

	public AdminInfoBeans Adminlogin(int id, String password) {
		AdminInfoBeans adminLogin = null;

		AdminDao userDao = new AdminDao();

		try {
			userDao.connect();
			adminLogin = userDao.getFromAdmin(id,password);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(userDao!=null) {
				userDao.close();
			}
		}
		return adminLogin;
	}

}