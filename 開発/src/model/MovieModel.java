
package model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//movie.

import beans.AppointBeans;
import beans.MovieListBeans;
import model.dao.AppointDao;
//import movie.model.dao.MovieDao;
import model.dao.MovieDao;


public class MovieModel {

	//予約のModel//
	public void appointMovie(int userId,int movieId,int movieFee,Date movieDate,Time movieTime,
			String movieSeat,String movieTheater,String movieScreen) {
		//Beansに格納//
		AppointBeans appointBeans = new AppointBeans();
		appointBeans.setUserId(userId);
		appointBeans.setMovieId(movieId);
		appointBeans.setMovieFee(movieFee);
		//		appointBeans.setMovieDate(movieDate);
		appointBeans.setMovieTime(movieTime);
		appointBeans.setMovieSeat(movieSeat);
		//	appointBeans.setMovieTheater(movieTheater);
		//	appointBeans.setMovieScreen(movieScreen);

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

	/*

	//管理者映画登録画面
	public void registAdminMovie(int movieId, String movieName, String movieGenre, String movieCast,
										String movieSummary int adminId, Date movieStartDate, Date movieEndDate) {
		MovieDao movieDao = new MovieDao();
		try {
				movieDao.connect();

				movieDao.deleteAppointMovie(movieId);
		}catch(Exception e) {
			//エラー発生した場合にコンソールにログを出力する
			e.printStackTrace();
		}
		finally {
			//接続（コネクション）を閉じる
			if(movieDao!=null) {
				movieDao.close();
			}
		}
	}

	*/

	//映画予約確認のModel(listを返す)//
	public List<AppointBeans> getList(int userId) {
		List<AppointBeans> list = new ArrayList<>();
		//		MovieDao movieDao = new MovieDao();
		try {
			//		movieDao.connect();
			//		movieDao.getList(userId);
			//catchがExceptionの理由：DaoBaseが投げようとしている例外がException(全ての例外)のため//
		} catch(Exception e) {
			//エラーを出力画面に表示//
			e.printStackTrace();
		} finally {
			//接続を切る//
			//		if(movieDao != null) {
			//			movieDao.close();
		}
		//	}
		return list;
	}


	//映画一覧を表示
	public List<MovieListBeans> getMovieList() {
		List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		MovieDao moviedao = new MovieDao();
		try {
			moviedao.connect();
			list = moviedao.getMovieList();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			moviedao.close();
		}
		return list;
	}

	//予約状況確認操作
	public List<Integer> getAdminCheckMovie(int movie_id) {
		List<Integer> list = new ArrayList<Integer>();
		AppointDao appointDao = new AppointDao();

		try {
			appointDao.connect();
			list = appointDao.checkAppointMovie(movie_id);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			appointDao.close();
		}
		return list;
	}

}
