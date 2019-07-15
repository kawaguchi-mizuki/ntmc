package diary.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import diary.beans.ListBeans;
import diary.model.dao.ListDao;

public class ListModel {
	//日誌の登録メソッド//
	public void setDiary(String course,String classCode,String name,String
			insertDate, String goodPoint, String badPoint, String studentComment,String className) throws SQLException {

		//ビーンズに格納//
		ListBeans listbeans = new ListBeans();
		listbeans.setInsertDate(insertDate);
		listbeans.setGoodPoint(goodPoint);
		listbeans.setBadPoint(badPoint);
		listbeans.setStudentComment(studentComment);
		listbeans.setClassCode(classCode);
		listbeans.setCourseName(course);
		listbeans.setName(name);
		listbeans.setClassName(className);

		//DAO呼び出し//
		ListDao listdao = new ListDao();
		try {
			//DAO接続//
			listdao.connect();
			listdao.setDiary(listbeans);
		//すべての例外//
		}catch(SQLException e) {
		    //エラーが発生した場合に出力//
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//接続（コネクション）を閉じる//
			if(listdao != null) {
				listdao.close();
		    }
	    }

		    //戻り値なし//
		    return;
	}

	//日誌の取得メソッド//
	public List<ListBeans> getDiary(String getClassCode) throws Exception{
				List<ListBeans> list = new ArrayList<ListBeans>();

			//DAO呼び出し//
			ListDao listdao = new ListDao();
			try {
				//DAO接続//
				listdao.connect();
				list = listdao.getDiary(getClassCode);
			 //すべての例外//
			}catch(Exception e) {
				//エラーが発生した場合に出力//
				e.printStackTrace();
				throw e;
			}finally {
				//接続（コネクション）を閉じる//
				if(listdao != null) {
					listdao.close();

			    }
			}

			   //リストを返す//
			   return list;
	}
}
