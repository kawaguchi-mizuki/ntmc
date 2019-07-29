package movieadmin.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movieadmin.beans.AdminInfoBeans;

public class AdminDao extends DaoBase {

		public AdminInfoBeans getFromAdmin(int id, String password) {
		if(con==null) {

			return null;

		}
		AdminInfoBeans adminInfo=null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{
			//DBの都合上、table「admin」を「movie.admin」としている(修正済)

			stmt = con.prepareStatement("SELECT * FROM admin WHERE admin_id=? AND admin_password=?");

			stmt.setInt(1,id);
			stmt.setString(2,password);
			rs = stmt.executeQuery();

			while(rs.next()) {
				adminInfo = new AdminInfoBeans();
				adminInfo.setId(rs.getInt("admin_id"));
				adminInfo.setName(rs.getString("admin_name"));
				adminInfo.setPassword(rs.getString("admin_password"));
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
		return adminInfo;
	}
}
