package model;

import beans.User_Info_Beans;
import model.dao.User_Dao;

public class User_Model {

	//ユーザーログイン処理

	public User_Info_Beans login(String mail,String password) {

		User_Info_Beans login = null;
		User_Dao userDao = new User_Dao();

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

		User_Dao userDao = new User_Dao();

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

		User_Dao userDao = new User_Dao();

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

	public User_Info_Beans example(int id) {

		User_Info_Beans example = null;
		User_Dao userDao = new User_Dao();

		try {
			userDao.connect();
			example = (User_Info_Beans) userDao.getFromUser(id);
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

		User_Dao userDao = new User_Dao();

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