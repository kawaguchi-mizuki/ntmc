package movie.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;

public class MovieDao extends DaoBase{

	//予約確認を表示
	public List<MovieListBeans>getMovieList(){
		if(con==null) {
			return null;
		}
		List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement("SELECT * from movie  inner join movie_list on movie.movie_id=movie_list.movie_id inner join "
					+ "appoint on movie_list.movie_list_id=appoint.appoint_movie_list_id inner join movie_time on movie_list.movie_time_id=movie_time.movie_time_id"
					+ " where date_add(appoint_date,interval 0 day)>=curdate()");
			rs = stmt.executeQuery();

			while(rs.next()) {
				MovieListBeans beans = new MovieListBeans();

				beans.setMovieName(rs.getString("movie_name"));
				beans.setAppointdate(rs.getDate("appoint_date"));
				beans.setStarttime(rs.getTime("movie_start_time"));
				beans.setFinishtime(rs.getTime("movie_finish_time"));
				beans.setMovieId(rs.getInt("movie_id"));

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

	//映画一覧を表示
	public List<MovieListBeans>getMovieView(){
		if(con==null) {
			return null;
		}
		List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement("SELECT * from movie  inner join movie_list on movie.movie_id=movie_list.movie_id inner join "
					+ " movie_time on movie_list.movie_time_id=movie_time.movie_time_id"
					+ " where movie_list_date>=curdate() and movie_list_date>=movie_start and movie_list_date<=movie_finish");
			rs = stmt.executeQuery();

			while(rs.next()) {
				MovieListBeans beans = new MovieListBeans();

				beans.setMovieName(rs.getString("movie_name"));
				beans.setMovieListdate(rs.getDate("movie_list_date"));
				beans.setStarttime(rs.getTime("movie_start_time"));
				beans.setFinishtime(rs.getTime("movie_finish_time"));
				beans.setMovieId(rs.getInt("movie_id"));

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
		}
		finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(SQLException e) {
				System.out.println("closeに失敗しました");
				;
			}
		}
		return movie;

	}




	public MovieListBeans getDetail(int movieId) throws SQLException{
		if(con == null) {
			//接続していない場合はエラー//
			return null;
		}
		MovieListBeans movieListBeans = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//select文実行//
			stmt = con.prepareStatement("select * from movie where movieId = ?");
			//実行するための引数をセット//
			stmt.setInt(1, movieId);
			//実行//
			rs = stmt.executeQuery();
			while(rs.next()) {
				movieListBeans = new MovieListBeans();
				movieListBeans.setMovieId(rs.getInt("movie_id"));
				movieListBeans.setMovieName(rs.getString("movie_name"));
				movieListBeans.setMovieSummary(rs.getString("movie_view"));
			}
		} catch(SQLException e) {
		} finally {

		}
		return movieListBeans;
	}





}
