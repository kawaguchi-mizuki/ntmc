package beans;

import java.io.Serializable;
import java.sql.Date;

//映画のBeans//
public class Movie_Info_Beans implements Serializable{

	//引数の宣言//
	private int movie_id;
	private String movie_name;
	private int admin_id;
	private int genre_id;
	private String cast_name;
	private String summary;
	private Date movieStart_day;
	private Date movieFinish_id;

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
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public int getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}
	public String getCast_name() {
		return cast_name;
	}
	public void setCast_name(String cast_name) {
		this.cast_name = cast_name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getMovieStart_day() {
		return movieStart_day;
	}
	public void setMovieStart_day(Date movieStart_day) {
		this.movieStart_day = movieStart_day;
	}
	public Date getMovieFinish_id() {
		return movieFinish_id;
	}
	public void setMovieFinish_id(Date movieFinish_id) {
		this.movieFinish_id = movieFinish_id;
	}
}