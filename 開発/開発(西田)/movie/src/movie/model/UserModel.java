package movie.model;

import movie.beans.AdminInfoBeans;
import movie.beans.UserInfoBeans;
import movie.dao.UserDao;

public class UserModel {
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

    public AdminInfoBeans loginAdmin(int AdminId,String password) {
    	AdminInfoBeans login = null;
    	UserDao userDao = new UserDao();
    	 try {
             userDao.connect();
             login = userDao.getFromAdmin(AdminId,password);
         } catch(Exception e) {
       	  e.printStackTrace();
         } finally {
       	  if(userDao!=null) {
       		  userDao.close();
       	  }
         }
         return login;
         }

}
