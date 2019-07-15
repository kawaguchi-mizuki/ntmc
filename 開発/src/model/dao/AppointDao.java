
package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.AppointBeans;

public class AppointDao extends DaoBase{
	public void setAppoint(AppointBeans appointBeans) throws SQLException{
		if(con == null) {
			//接続していない場合はエラーとする。//
			return;
		}
		PreparedStatement stmt = null;
		//SQLのinsert文を実行//
		try {
			stmt = con.prepareStatement("insert into appoint values (?,?,?,?,?)");
			stmt.setInt(1,appointBeans.getUserId());
			stmt.setInt(2,appointBeans.getMovieId());
			stmt.setDate(3,appointBeans.getMovieDate());
			stmt.setString(4,appointBeans.getMovieSeat());
			stmt.setString(5,appointBeans.getMovieScreen());

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

	public void countAppoint() throws SQLException{

		if(con == null) {
			//接続していない場合はエラーとする。//
			return;
		}

		PreparedStatement stmt = null;
		//SQLのinsert文を実行//
		try {
			stmt = con.prepareStatement("select count(*) from appoint");

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


	//映画予約状況確認 (ji

		public List<Integer> checkAppointMovie(int movieId) {

			PreparedStatement stmt = null;
			ResultSet rs = null;

			List<Integer> list = new ArrayList<Integer>();
			//予約された座席を全て引っぱる
			try {
				stmt = con.prepareStatement(
						  "SELECT M.appoint_meisai_seat"
						+ "FROM appoint_meisai AS M INNER JOIN appoint AS A ON M.appoint_meisai_id = A.appoint_id"
						+ "WHERE movie_id = '?' ");
				stmt.setInt(1,movieId);
				rs = stmt.executeQuery();

				while(rs.next()){

					Integer movie_id = rs.getInt("M.appoint_meisai_id");
					list.add(movie_id);
				}

					}
			catch(SQLException e) {
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
						}
						catch (SQLException e) {
									System.out.println("closeに失敗しました");
					}

				}
			return list;
		}

}