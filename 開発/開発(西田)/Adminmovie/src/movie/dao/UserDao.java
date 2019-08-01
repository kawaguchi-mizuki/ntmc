package movie.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movie.beans.AdminInfoBeans;


public class UserDao extends DaoBase{



       public AdminInfoBeans getFromAdmin(int AdminId,String password) {
    	   if(con==null) {
    		   return null;
    	   }
    	   AdminInfoBeans AdminInfo=null;
    	   PreparedStatement stmt = null;
  	   	   ResultSet rs = null;

  	   	 try{
  	   		 /////私のmysqlがadminに対応してないためテーブル名変更しているから
  	   		 ////loginadをadminに直して使って////
  	   		 stmt = con.prepareStatement("SELECT * FROM adinfo WHERE admin_id=? AND admin_password=?");
  	   		 stmt.setInt(1,AdminId);
  	   		 stmt.setString(2,password);
  	   		 rs = stmt.executeQuery();

  	   	 while(rs.next()) {
  	   		 AdminInfo = new AdminInfoBeans();
  	   		 AdminInfo.setAdminId(rs.getInt("admin_id"));
  	   		 AdminInfo.setAdminName(rs.getString("admin_name"));
  	   		 AdminInfo.setAdminPassword(rs.getString("admin_password"));


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
  	   	 return AdminInfo;

  	    }
       public void createUser(String mail,String name,String sex, String

    			birthday,String password) {


    		if( con == null) {


    			return;

    	}



    		PreparedStatement stmt = null;

       }
}




