package movie.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movie.beans.UserInfoBeans;

public class UserDao extends DaoBase {

	//ログイン処理
	public UserInfoBeans getFromUser(String mail,String password) {
		if(con==null) {
			return null;
		}
		UserInfoBeans userInfo=null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{
			stmt = con.prepareStatement("SELECT * FROM user WHERE user_mail=? AND user_password=?");
			stmt.setString(1,mail);
			stmt.setString(2,password);
			rs = stmt.executeQuery();

			while(rs.next()) {
				userInfo = new UserInfoBeans();
				userInfo.setId(rs.getInt("user_id"));
				userInfo.setMail(rs.getString("user_mail"));
				userInfo.setName(rs.getString("user_name"));
				userInfo.setSex(rs.getString("user_sex"));
				userInfo.setBirthday(rs.getDate("user_birthday"));
				userInfo.setPassword(rs.getString("user_password"));


			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				System.out.println("closeに失敗しました");
				;
			}
		}
		return userInfo;

	}

	//会員登録
	public void createUser(String mail,String name,String sex, String
			birthday,String password) {

		if( con == null) {

			return;

		}

		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement("insert into user(user_mail,user_name,user_sex,user_birthday,user_password) "
					+ "value (?,?,?,?,?)");
			stmt.setString(1,mail);
			stmt.setString(2,name);
			stmt.setString(3,sex);
			stmt.setString(4,birthday);
			stmt.setString(5,password);
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			if( con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}



	}
	//会員情報変更
	public void changeInfoUser(int id,String mail, String name, String password) {
		// TODO 自動生成されたメソッド・スタブ
		if( con == null) {

			return;
		}
		UserInfoBeans userInfo=null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement("update user set user_mail = ?,user_name = ?,user_password = ? "
					+ "where user_id = ?");

			stmt.setString(1,mail);
			stmt.setString(2,name);
			stmt.setString(3,password);
			stmt.setInt(4,id);
			stmt.executeUpdate();

			while(rs.next()) {
				userInfo = new UserInfoBeans();
				userInfo.setMail(rs.getString("user_mail"));
				userInfo.setName(rs.getString("user_name"));
				userInfo.setPassword(rs.getString("user_password"));
			}

		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			if( con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}

	//会員更新 初期値 反映

	public UserInfoBeans getFromUser(int id) {
		// TODO 自動生成されたメソッド・スタブ
		if(con==null) {
			return null;
		}
		UserInfoBeans userInfo=null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{
			stmt = con.prepareStatement("SELECT * FROM user WHERE user_id=?");
			stmt.setInt(1,id);

			rs = stmt.executeQuery();

			while(rs.next()) {
				userInfo = new UserInfoBeans();
				userInfo.setId(rs.getInt("user_id"));
				userInfo.setMail(rs.getString("user_mail"));
				userInfo.setName(rs.getString("user_name"));
				userInfo.setSex(rs.getString("user_sex"));
				userInfo.setBirthday(rs.getDate("user_birthday"));
				userInfo.setPassword(rs.getString("user_password"));


			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				System.out.println("closeに失敗しました");
				;
			}
		}



		return userInfo;
	}

	//退会処理
	public void deleteUser(int id) {
		// TODO 自動生成されたメソッド・スタブ
		UserInfoBeans userInfo = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement(
					"DELETE FROM user "
							+ "WHERE user_id = ? ");
			stmt.setInt(1, id);
			stmt.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				System.out.println("closeに失敗しました");
			}
		}

	}



}
