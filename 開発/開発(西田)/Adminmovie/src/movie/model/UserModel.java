package movie.model;

import movie.beans.AdminInfoBeans;
import movie.dao.UserDao;

public class UserModel {
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
