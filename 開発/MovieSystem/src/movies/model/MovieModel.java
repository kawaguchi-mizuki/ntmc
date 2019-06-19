package movies.model;

import java.sql.Date;
import java.sql.Time;

import movies.beans.AppointBeans;
import movies.model.dao.AppointDao;

public class MovieModel {

	public void appointMovie(int userId,int movieId,int movieFee,Date movieDate,Time movieTime,
									 String movieSeat,String movieTheater,String movieScreen) {
		//Beansに格納//
		AppointBeans appointBeans = new AppointBeans();
		appointBeans.setUserId(userId);
		appointBeans.setMovieId(movieId);
		appointBeans.setMovieFee(movieFee);
		appointBeans.setMovieDate(movieDate);
		appointBeans.setMovieTime(movieTime);
		appointBeans.setMovieSeat(movieSeat);
		appointBeans.setMovieTheater(movieTheater);
		appointBeans.setMovieScreen(movieScreen);

		AppointDao appointDao = new AppointDao();
		try {
		 appointDao.connect();
		 appointDao.setAppoint(appointBeans);
		} catch(Exception e) {
		//エラーを出力画面に表示する//
		e.printStackTrace();
		} finally{
		//接続を切る//
		if(appointDao != null) {
		appointDao.close();
			}
		}
		return;
	}

}
