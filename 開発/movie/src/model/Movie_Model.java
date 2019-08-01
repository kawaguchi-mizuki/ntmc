package model;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.Appoint_Beans;
import beans.Movie_Detail_Beans;
import beans.Movie_List_Beans;
import model.dao.Appoint_Dao;
import model.dao.Movie_Dao;

public class Movie_Model {

	//予約のModel//
	public void appointMovie(int userId,int movieId,int movieFee,Date movieDate,Time movieTime,
			String movieSeat,String movieTheater,String movieScreen) {
		//Beansに格納//
		Appoint_Beans appointBeans = new Appoint_Beans();
		appointBeans.setUserId(userId);
		appointBeans.setMovieId(movieId);
		appointBeans.setMovieFee(movieFee);
		appointBeans.setMovieTime(movieTime);
		appointBeans.setMovieSeat(movieSeat);
		//	appointBeans.setMovieTheater(movieTheater);
		//	appointBeans.setMovieScreen(movieScreen);

		Appoint_Dao appointDao = new Appoint_Dao();
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
	public List<Appoint_Beans> getList(int userId) {
		List<Appoint_Beans> list = new ArrayList<>();
		Appoint_Dao appointDao = new Appoint_Dao();
		try {
			appointDao.connect();
			appointDao.getList(userId);
			//catchがExceptionの理由：DaoBaseが投げようとしている例外がException(全ての例外)のため//
		} catch(Exception e) {
			//エラーを出力画面に表示//
			e.printStackTrace();
		} finally{
			//接続を切る//
			if(appointDao != null) {
				appointDao.close();
			}
		}
		return list;
	}


	//映画一覧を表示
	public List<Movie_List_Beans> getMovieList(){
		List<Movie_List_Beans> list = new ArrayList<Movie_List_Beans>();
		Movie_Dao moviedao = new Movie_Dao();
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

	//映画詳細を表示するメソッド//
	public List<Movie_Detail_Beans> getMovieDetail(int movie_id){
		List<Movie_Detail_Beans> list = new ArrayList<Movie_Detail_Beans>();
		Movie_Dao moviedao = new Movie_Dao();
		try {
			moviedao.connect();
			list = moviedao.getMovieDetail(movie_id);
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			moviedao.close();
		}
		return list;
	}

	//映画検索
	public List<Movie_List_Beans> searchMovie(String searchmovie) {
		// TODO 自動生成されたメソッド・スタブ
		List<Movie_List_Beans> movie = new ArrayList<Movie_List_Beans>();
		Movie_Dao  moviesearchdao = new Movie_Dao();
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

	//映画削除//
	public void deleteMovie(int movieId) {

	}

}