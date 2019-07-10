package movie.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import movie.beans.AdminInfoBeans;
import movie.beans.UserInfoBeans;

public class UserDao extends DaoBase{

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
  	   			 ;
  	   		 }
  	   	 }
  	   	 return userInfo;

  	    }

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
  	   		 stmt = con.prepareStatement("SELECT * FROM loginad WHERE admin_id=? AND admin_password=?");
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




