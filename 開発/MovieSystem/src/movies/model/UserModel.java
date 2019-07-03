package movies.model;

import movies.beans.UserInfoBeans;
import movies.model.dao.UserDao;

public class UserModel {

	public UserInfoBeans getUser(String mail, String password) {
		UserInfoBeans userInfo = new UserInfoBeans();

		//Dao呼び出し//
		UserDao userDao = new UserDao();

		try {
			//Dao接続//
			userDao.connect();
			userInfo = userDao.getUser(mail,password);
			//全ての例外//
		} catch(Exception e) {
			//エラーを出力画面に出力する//
			e.printStackTrace();
		} finally {
			//最後に接続を閉じる//
			if(userDao != null) {
				userDao.close();
			}
		}
		//ログイン情報を返す//
		return userInfo;
	}

	public void createUser(String mail, String name, String sex, String birthday, String password) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void unsubFromUser(int id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void changeInfoUser(int id, String mail, String name, String password) {
		// TODO 自動生成されたメソッド・スタブ

	}
}