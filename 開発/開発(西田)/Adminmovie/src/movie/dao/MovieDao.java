package movie.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;

public class MovieDao extends DaoBase {



	public List<MovieListBeans>updatestartMovie(){
		if(con==null) {
			  return null;
		  }
		  List<MovieListBeans> upselectMovie = new ArrayList<MovieListBeans>();
		  PreparedStatement stmt = null;
		  ResultSet rs = null;

		  try {
			  stmt = con.prepareStatement("SELECT * from movie  inner join movie_list on movie.movie_id=movie_list.movie_id "
				  					  		+ " where movie_list_date>=curdate()  and movie_list_date<=movie_finish");
			  rs = stmt.executeQuery();

			  while(rs.next()) {
				  MovieListBeans updatemovie = new MovieListBeans();
                   updatemovie.setMovieId(rs.getInt("movie_id"));
				   updatemovie.setMovieName(rs.getString("movie_name"));

					upselectMovie.add(updatemovie);

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
		  return upselectMovie;

	}
	public List<MovieListBeans> updateMovie(int movieId){
		if(con==null) {
 		   return null;
 	   }
 	   List<MovieListBeans> updateMovie = new ArrayList<MovieListBeans>();
 	   PreparedStatement stmt = null;
	   	   ResultSet rs = null;

	   	 try{
	   		 stmt = con.prepareStatement("SELECT * FROM movie where movie_id=?");
	   		 stmt.setInt(1,movieId);
	   		 rs = stmt.executeQuery();

	   	 while(rs.next()) {
	   		 MovieListBeans movieInfo = new MovieListBeans();
	   		 movieInfo.setMovieName(rs.getString("movie_name"));
	   		 movieInfo.setMovieCast(rs.getString("movie_cast_name"));
	   		 movieInfo.setMovieGenre(rs.getString("movie_genre_name"));
	   		 movieInfo.setMovieSummary(rs.getString("movie_view"));

	   		 updateMovie.add(movieInfo);


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
	   	 return updateMovie;

	    }

	public void updateMovieInfo(int movieId,String upmovie,int AdminId,String upgenre,String upcast,String upsummry) {
		if(con==null) {
 		   return;
 	   }
		PreparedStatement stmt = null;
	   	 try{

	   		 stmt = con.prepareStatement("UPDATE movie SET movie_name=?,movie_cast_name=?,movie_view=?,movie_admin_id=?,movie_genre_name=? WHERE movie_id=?");
	   		 stmt.setString(1,upmovie);
	   		 stmt.setString(2,upcast);
	   		 stmt.setString(3,upsummry);
	   		 stmt.setInt(4,AdminId);
	   		 stmt.setString(5,upgenre);
	   		 stmt.setInt(6, movieId);
	   		 stmt.executeUpdate();

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
	}
}







