package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.AppointBeans;
import beans.MovieListBeans;

public class MovieDao extends DaoBase{
	public void deleteAppointMovie(int movieId) {
		AppointBeans movie = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement(
					  "DELETE "
					+ "FROM appoint"
					+ "WHERE appoint_id = '?' ");
			stmt.setInt(1,movieId);
			rs = stmt.executeQuery();

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
	}
	public void deleteMovie(int movieId) {
		MovieListBeans movie = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.prepareStatement(
					  "DELETE "
					+ "FROM movie"
					+ "WHERE movieId = '?' ");
			stmt.setInt(1,movieId);
			rs = stmt.executeQuery();

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
	}
}
