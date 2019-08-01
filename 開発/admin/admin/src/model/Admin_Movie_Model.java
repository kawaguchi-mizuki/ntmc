package movieadmin.model;

import java.util.Date;

import movieadmin.model.dao.AdminMovieDao;

public class AdminMovieModel {

	//映画登録処理

	public void addmovie(String movie, String genre, String cast, String view,int adminid, Date movie_start,
			Date movie_finish) {

		AdminMovieDao movieDao = new AdminMovieDao();

		try {
			movieDao.connect();
			movieDao.InsertMovie(movie,genre,cast,view,adminid,new java.sql.Date(movie_start.getTime()),
					new java.sql.Date(movie_finish.getTime()));
		} catch(Exception e) {
			//エラーを出力する//
			e.printStackTrace();
		} finally {
			//接続を切る//
			if(movieDao != null) {
				movieDao.close();
			}
		}
		return ;
	}
}