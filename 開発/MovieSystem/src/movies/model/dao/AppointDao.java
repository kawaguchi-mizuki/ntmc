package movies.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import movies.beans.AppointBeans;

public class AppointDao extends DaoBase{
	public void setAppoint(AppointBeans appointBeans) throws SQLException{
		if(con == null) {
			//接続していない場合はエラーとする。//
			return;
		}
		PreparedStatement stmt = null;
		//SQLのinsert文を実行//
		try {
			stmt = con.prepareStatement("insert into appoint values (?,?,?,?,?,?,?,?)");
			stmt.setInt(1,appointBeans.getUserId());
			stmt.setInt(2,appointBeans.getMovieId());
			stmt.setInt(3,appointBeans.getMovieFee());
			stmt.setDate(4,appointBeans.getMovieDate());
			stmt.setTime(5,appointBeans.getMovieTime());
			stmt.setString(6,appointBeans.getMovieSeat());
			stmt.setString(7,appointBeans.getMovieTheater());
			stmt.setString(8,appointBeans.getMovieScreen());
		} catch(SQLException e ) {
			//エラーを出力する//
			e.printStackTrace();
			throw e;
		} finally {
			//接続を切る//
			con.close();
		}
		return;
	}

}
