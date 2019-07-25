package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.MovieDetailBeans;
import beans.MovieListBeans;

public class MovieDao extends DaoBase{

	//映画一覧を表示//
	public List<MovieListBeans>getMovieView(){
		if(con==null) {
			return null;
		}
		List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		//映画一覧テーブルのmovie_list_date = 今日の日付、これの解決をする//
		try {
			stmt = con.prepareStatement("select * from movie_list inner join movie on movie_list.movie_id = movie.movie_id inner join "
					+ " movie_time on movie_list.movie_time_id = movie_time.movie_time_id inner join screen on movie_list.screen_id = screen.screen_id");
			//+ " where movie_list_date >= curdate() and movie_list_date >= movie_start and movie_list_date <= movie_finish"
			//実行//
			rs = stmt.executeQuery();

			while(rs.next()) {
				MovieListBeans beans = new MovieListBeans();

				beans.setMovieList_id(rs.getInt("movie_list_id"));
				beans.setMovieName(rs.getString("movie_name"));
				beans.setMovie_date(rs.getDate("movie_date"));
				beans.setStartMovie_time(rs.getTime("movie_start_time"));
				beans.setFinishMovie_time(rs.getTime("movie_finish_time"));
				beans.setScreen_id(rs.getInt("movie_id"));

				//リストに格納//
				list.add(beans);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}


	//映画検索
	public List<MovieListBeans> searchMovie(String searchmovie) {
		if(con==null) {
			return null;
		}
		List<MovieListBeans> movie = new ArrayList<MovieListBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try{
			stmt = con.prepareStatement("SELECT * FROM movie  where movie.movie_name like ?");
			stmt.setString(1,"%"+searchmovie+"%");
			rs = stmt.executeQuery();

			while(rs.next()) {
				MovieListBeans searchbeans = new MovieListBeans();
				searchbeans.setMovieName(rs.getString("movie_name"));

				movie.add(searchbeans);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return movie;
	}

	//映画詳細を表示するメソッド//
	public List<MovieDetailBeans> getMovieDetail(int movie_id) throws SQLException{
		if(con == null) {
			//接続していない場合はエラー//
			return null;
		}
		List<MovieDetailBeans> detail_list = new ArrayList<MovieDetailBeans>();
		MovieDetailBeans movieDetailBeans = new MovieDetailBeans();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//select文実行//
			stmt = con.prepareStatement("select * from movie inner join movie_list on movie.movie_id = movie_list.movie_id"
									  + "where movie_list.movie_list_id = ?");
			//実行するための引数をセット//
			stmt.setInt(1, movie_id);
			//実行//
			rs = stmt.executeQuery();
			//映画詳細画面で表示する値をセットする//
			//jspに値はしっかり取れている//
			while(rs.next()) {
				movieDetailBeans.setMovie_id(rs.getInt("movie_id"));
				movieDetailBeans.setMovie_name(rs.getString("movie_name"));
				movieDetailBeans.setMovie_detail(rs.getString("movie_view"));
			}
		} catch(SQLException e) {
		} finally {
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(movieDetailBeans.getMovie_id());
		System.out.println(movieDetailBeans.getMovie_name());
		System.out.println(movieDetailBeans.getMovie_detail());
		return detail_list;
	}
}