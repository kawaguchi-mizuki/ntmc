package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.AppointBeans;

public class AppointDao extends DaoBase{

	//映画予約のメソッド//
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
			//		stmt.setString(7,appointBeans.getMovieTheater());
			//		stmt.setString(8,appointBeans.getMovieScreen());
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

	//映画予約確認のメソッド//
	public  List<AppointBeans> getList(int userId) throws SQLException{
		if(con == null) {
			//接続していない場合はエラーとする//
			return null;
		}
		List<AppointBeans> list = new ArrayList<AppointBeans>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//select文実行(今回は予約明細テーブルと予約テーブルを結合している）//
			stmt = con.prepareStatement(
					  " select * from appoint_meisai inner join appoint on appoint_meisai.appoint_id = appoint.appoint_id "
					+ " inner join fee on appoint_meisai.fee_id = fee.fee_id "
					+ " inner join movie_list on appoint.movie_list_id = movie_list.movie_list_id "
					+ " inner join movie on movie_list.movie_id = movie.movie_id "
					+ " where user_id = ? order by appoint_meisai_appoint_id desc");
			//ここで、実行するためのuserIdをセット//
			stmt.setInt(1, userId);
			//実行//
			rs = stmt.executeQuery();
			while(rs.next()) {
				AppointBeans appointBeans = new AppointBeans();
				appointBeans.setAppoint_id(rs.getInt("appoint_id"));
				appointBeans.setAppoint_date(rs.getDate("appoint_date"));
				appointBeans.setAppoint_time(rs.getTime("appoint_time"));
				appointBeans.setAppoint_seat(rs.getString("appoint_seat"));
				appointBeans.setFee(rs.getInt("fee"));
				appointBeans.setMovie_name(rs.getString("movie_name"));
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