package movies.model.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public abstract class DaoBase {
	protected Connection con = null;

	//データベースに接続するメソッド//
	public void connect() throws Exception{

		if(con != null) {
			//既に接続している//
			return;
		}

		InitialContext context;
		try {
		//DBの接続//
			String ResourseName = "jdbc/MySQL";
			String jndi = "java:comp/env/" + ResourseName;
			context = new InitialContext();
			DataSource dataSourse = (DataSource)context.lookup(jndi);
			con = dataSourse.getConnection();
			/*Context および DirContext インタフェースでの
			  操作によってスローされるすべての例外*/
		} catch(NamingException e) {
			//エラーを出力//
			e.printStackTrace();
			throw e;
			//SQLの例外//
		} catch(SQLException e) {
			//エラーを出力//
			e.printStackTrace();
			throw e;
		}
	}

	//接続を切断するメソッド(共通メソッド)//
	public void close() {
		if(con != null) {
		try {
			con.close();
			con = null;
		}catch(SQLException e) {
		//クローズの場合は、ログを出力するだけ//
			System.out.println("closeに失敗しました");
		}
		}
	}
}
