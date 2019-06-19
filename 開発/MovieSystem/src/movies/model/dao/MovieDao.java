package movies.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import movies.beans.AppointBeans;

public class MovieDao extends DaoBase{
	//映画予約リストを返す処理//
	public List<AppointBeans> getList(int userId) throws SQLException{
		List<AppointBeans> list = new ArrayList<>();
		if(con == null) {
			return null;
		}
		return list;
	}
}
