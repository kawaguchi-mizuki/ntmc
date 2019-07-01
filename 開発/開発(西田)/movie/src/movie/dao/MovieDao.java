package movie.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;

public class MovieDao extends DaoBase {

	public List<MovieListBeans>getMovieList(){
		if(con==null) {
			  return null;
		  }
		  List<MovieListBeans> list = new ArrayList<MovieListBeans>();
		  PreparedStatement stmt = null;
		  ResultSet rs = null;

		  try {
			  stmt = con.prepareStatement("SELECT * from movie left outer join appoint on movie.movie_id=appoint.appoint_movie_id left outer join movie_time on appoint.appoint_movie_time=movie_time.movie_time_id where date_add(appoint_date,interval 0 day)=curdate()");
			  rs= stmt.executeQuery();
			  while(rs.next()) {
				  MovieListBeans beans = new MovieListBeans();

				    beans.setMovieName(rs.getString("movie_name"));
					beans.setAppointdate(rs.getDate("appoint_date"));
					beans.setStarttime(rs.getTime("movie_start_time"));
					beans.setFinishtime(rs.getTime("movie_finish_time"));

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

	public List<MovieListBeans>searchMovie(String searchmovie){
		if(con==null) {
 		   return null;
 	   }
 	   List<MovieListBeans> movie = new ArrayList<MovieListBeans>();
 	   PreparedStatement stmt = null;
	   	   ResultSet rs = null;

	   	 try{
	   		 stmt = con.prepareStatement("SELECT * FROM movie inner join cast on movie.movie_cast_id=cast.cast_id inner join genre on movie_genre_id=genre.genre_id where movie.movie_name like ?");
	   		 stmt.setString(1,"%"+searchmovie+"%");
	   		 rs = stmt.executeQuery();

	   	 while(rs.next()) {
	   		 MovieListBeans searchbeans = new MovieListBeans();
	   		 searchbeans.setMovieName(rs.getString("movie_name"));
	   		 searchbeans.setMovieGenre(rs.getString("genre_name"));
	   		 searchbeans.setMovieCast(rs.getString("cast_name"));
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

}


