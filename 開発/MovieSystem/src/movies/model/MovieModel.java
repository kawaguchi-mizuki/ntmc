package movies.model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import movies.beans.AppointBeans;
import movies.beans.MovieListBeans;
import movies.model.dao.AppointDao;
import movies.model.dao.MovieDao;

public class MovieModel {

	//映画を予約するメソッド//
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

	//映画予約確認のメソッド(listを返す)//
	public List<AppointBeans> getList(int userId) {
		List<AppointBeans> list = new ArrayList<>();
		MovieDao movieDao = new MovieDao();
		try {
			movieDao.connect();
			movieDao.getList(userId);
			//catchがExceptionの理由：DaoBaseが投げようとしている例外がException(全ての例外)のため//
		} catch(Exception e) {
			//エラーを出力画面に表示//
			e.printStackTrace();
		} finally {
			//接続を切る//
			if(movieDao != null) {
				movieDao.close();
			}
		}
		return list;
	}

	//予約詳細のメソッド//
	public MovieListBeans getDetail(int movieId) {
		MovieListBeans movieListBeans = new MovieListBeans();
		MovieDao movieDao = new MovieDao();
		try {
			movieDao.connect();
			movieDao.getDetail(movieId);
		} catch(Exception e) {
			//エラーを出力する//
			e.printStackTrace();
		} finally {
			//接続を切る//
			if(movieDao != null) {
				movieDao.close();
			}
		}
		return movieListBeans;
	}
}
