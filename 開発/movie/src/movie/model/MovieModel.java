package movie.model;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import movie.beans.AppointBeans;
import movie.beans.MovieListBeans;
import movie.model.dao.AppointDao;
//import movie.model.dao.MovieDao;
import movie.model.dao.MovieDao;

public class MovieModel {

	//予約のModel//
	public void appointMovie(int userId,int movieId,int movieFee,Date movieDate,Time movieTime,
			String movieSeat,String movieTheater,String movieScreen) {
		//Beansに格納//
		AppointBeans appointBeans = new AppointBeans();
		appointBeans.setUserId(userId);
		appointBeans.setMovieId(movieId);
		appointBeans.setMovieFee(movieFee);
		appointBeans.setMovieTime(movieTime);
		appointBeans.setMovieSeat(movieSeat);
		//  appointBeans.setMovieTheater(movieTheater);
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

	//映画予約確認のModel(listを返す)//
	public List<AppointBeans> getList(int userId) {
		List<AppointBeans> list = new ArrayList<>();
		AppointDao appointDao = new AppointDao();
		try {
			appointDao.connect();
			appointDao.getList(userId);
			//catchがExceptionの理由：DaoBaseが投げようとしている例外がException(全ての例外)のため//
		} catch(Exception e) {
			//エラーを出力画面に表示//
			e.printStackTrace();
		} finally {
			//接続を切る//
			if(appointDao != null) {
				appointDao.close();
			}
			//	}
			return list;
		}
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

	//映画一覧を表示
	public List<MovieListBeans> getMovieView(){
		List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		MovieDao moviedao = new MovieDao();
		try {
			moviedao.connect();
			list = moviedao.getMovieView();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			moviedao.close();
		}
		return list;
	}




	//予約確認を表示
	public List<MovieListBeans> getMovieList(){
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



	//映画検索
	public List<MovieListBeans> searchMovie(String searchmovie) {
		// TODO 自動生成されたメソッド・スタブ
		List<MovieListBeans> movie = new ArrayList<MovieListBeans>();
		MovieDao  moviesearchdao = new MovieDao();
		try {
			moviesearchdao.connect();
			movie = moviesearchdao.searchMovie(searchmovie);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			moviesearchdao.close();
		}
		return movie;
	}

}
