package movies.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movies.beans.UserInfoBeans;

public class UserDao extends DaoBase{

	public UserInfoBeans getUser(String mail, String password) {
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
				System.out.println("実行前");
				rs = stmt.executeQuery();

				while(rs.next()) {
					System.out.println("値を入れる前");
					userInfo = new UserInfoBeans();
					userInfo.setUserId(rs.getInt("user_id"));
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
				}
			}
			return userInfo;
	}
}
