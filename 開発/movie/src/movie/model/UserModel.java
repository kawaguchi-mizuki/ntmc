package movie.model;

import movie.beans.UserInfoBeans;
import movie.model.dao.UserDao;

public class UserModel {

	//ユーザーログイン処理

	public UserInfoBeans login(String mail,String password) {

		UserInfoBeans login = null;
		UserDao userDao = new UserDao();

		try {
			userDao.connect();
			login = userDao.getFromUser(mail,password);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(userDao!=null) {
				userDao.close();
			}
		}
		return login;
	}

	//会員登録

	public void createUser(String mail,String name,String sex, String
			birthday,String password) {

		UserDao userDao = new UserDao();

		try {
			userDao.connect();
			userDao.createUser(mail,name,sex,birthday,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(userDao != null) {
				userDao.close();
			}
		}
	}

	//会員情報変更

	public void  changeInfoUser(int id,String mail,String name,String password) {

		UserDao userDao = new UserDao();

		try {
			userDao.connect();
			userDao.changeInfoUser(id,mail,name,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(userDao != null) {
				userDao.close();
			}
		}
	}

	//会員情報画面 情報反映

	public UserInfoBeans example(int id) {

		UserInfoBeans example = null;
		UserDao userDao = new UserDao();

		try {
			userDao.connect();
			example = (UserInfoBeans) userDao.getFromUser(id);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(userDao!=null) {
				userDao.close();
			}
		}
		return example;
	}

	//退会処理

	public void unsubFromUser(int id) {

		UserDao userDao = new UserDao();

		try{
			userDao.connect();
			userDao.deleteUser(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(userDao!=null) {
				userDao.close();
			}
		}
	}

}