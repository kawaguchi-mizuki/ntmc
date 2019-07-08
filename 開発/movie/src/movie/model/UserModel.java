package movie.model;


import movie.beans.UserInfoBeans;

import movie.model.dao.UserDao;


public class UserModel {



	//ログイン処理

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

	public void  changeInfoUser(String mail,String name,String password) {


		UserDao userDao = new UserDao();


		try {


			userDao.connect();


			userDao.changeInfoUser(mail,name,password);


		}catch(Exception e) {


			e.printStackTrace();

		}
		finally {


			if(userDao != null) {

				userDao.close();

			}

		}



	}

	public void unsubFromUser(int userId) {
		UserDao userDao = new UserDao();
		try{
			///////////////////////////////////
			//DBの接続
			userDao.connect();

			userDao.deleteUser(userId);
		}catch(Exception e) {
			//エラー発生した場合にコンソールにログを出力する
			e.printStackTrace();
		}
		finally {
			//接続（コネクション）を閉じる
			if(userDao!=null) {
				userDao.close();
			}
		}
	}
}

