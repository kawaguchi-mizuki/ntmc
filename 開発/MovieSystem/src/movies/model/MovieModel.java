package movies.model;

import java.sql.Date;
import java.sql.Time;

import movies.beans.AppointBeans;
import movies.model.dao.MovieDao;

public class MovieModel {

	public AppointBeans appointMovie(int userId,int movieId,int movieFee,Date movieDate,Time movieTime,
									 String movieSeat,String movieTheater,String movieScreen) {
		//インスタンス生成//
		AppointBeans appoint = new AppointBeans();
		MovieDao movieDao = new MovieDao();
		try {
		 movieDao.connect();
		 appoint = movieDao.setAppoint(userId,movieId,movieFee,movieDate,movieSeat,
				                      movieTime,movieTheater,movieScreen);
		} catch(Exception e) {
		//エラーを出力画面に表示する//
		e.printStackTrace();
		} finally{
		//接続を切る//
		if(movieDao != null) {
		movieDao.close();
			}
		}
		return appoint;
	}

}
