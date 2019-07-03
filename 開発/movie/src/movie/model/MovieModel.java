package model;

import dao.MovieDao;

public class MovieModel {
	public void appointMovie(int movieId) {
		MovieDao movieDao = new MovieDao();
		try{
			///////////////////////////////////
			//DBの接続
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
	public void adminDeleteMovie(int movieId) {
		MovieDao movieDao = new MovieDao();
		try{
			///////////////////////////////////
			//DBの接続
			movieDao.connect();

			movieDao.deleteMovie(movieId);
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
}

