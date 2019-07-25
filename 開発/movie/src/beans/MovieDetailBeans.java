package beans;

import java.io.Serializable;

public class MovieDetailBeans implements Serializable{

	//引数の宣言//
	private int movie_id;
	private String movie_name;
	private String movie_detail;

	//getterとsetterの生成//
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_detail() {
		return movie_detail;
	}
	public void setMovie_detail(String movie_detail) {
		this.movie_detail = movie_detail;
	}
}
