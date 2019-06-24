package movies.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movies.beans.AppointBeans;

public class MovieDao extends DaoBase{
	//映画予約リストを返す処理//
	public List<AppointBeans> getList(int userId) throws SQLException{
		if(con == null) {
			//接続していない場合はエラーとする//
			return null;
		}
		List<AppointBeans> list = new ArrayList<AppointBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//select文実行(今回は予約明細テーブルと予約テーブルを結合している）//
			stmt = con.prepareStatement("select * from appoint_meisai inner join appoint"
					+ "on appoint_meisai.appoint_meisai_appoint_id = appoint.appoint_id"
					+ "inner join movie on appoint.appoint_movie_id = movie.movie_id"
					+ " where user_id = ? order by appoint_meisai_appoint_id desc");
			//ここで、実行するためのuserIdをセット//
			stmt.setInt(1, userId);
			//実行//
			rs = stmt.executeQuery();
			while(rs.next()) {
				AppointBeans appointBeans = new AppointBeans();
				appointBeans.setMovieDate(rs.getDate("appoint_date"));
				appointBeans.setMovieTime(rs.getTime("appoint_movie_time"));
				appointBeans.setMovieSeat(rs.getString("appoint_meisai_seat"));
				appointBeans.setMovieName(rs.getString("movie_name"));
			}
		} catch(SQLException e) {
			//エラーを出力する//
			e.printStackTrace();
			throw e;
		} finally {
			//接続を切る//
			con.close();
		}
		return list;
	}
}
