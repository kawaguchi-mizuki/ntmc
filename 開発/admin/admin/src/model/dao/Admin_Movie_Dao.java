package model.dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Admin_Movie_Dao extends DaoBase{

	public void InsertMovie(String movie, String genre, String cast, String view,int adminid,
			Date movie_start, Date movie_finish) {

		if( con == null) {
			return;
		}

		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement("insert into movie(movie_name,movie_genre_name,movie_cast_name,movie_view,movie_admin_id,movie_start,movie_finish) "
					+ "value (?,?,?,?,?,?,?)");
			stmt.setString(1,movie);
			stmt.setString(2,genre);
			stmt.setString(3,cast);
			stmt.setString(4,view);
			stmt.setInt(5,adminid);
			stmt.setDate(6,(java.sql.Date) movie_start);
			stmt.setDate(7,(java.sql.Date) movie_finish);
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();

		}finally {
			if( con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}



	}

}