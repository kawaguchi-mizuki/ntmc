package movie.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;

public class MovieDao extends DaoBase{

	//映画一覧表示
	public List<MovieListBeans> getMovieList() {
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
}
