package beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

//映画一覧のBeans//
public class Movie_List_Beans implements Serializable {

	//引数の宣言//
	private int movieList_id;
	private String movieName;
	private Date movie_date;
	private Time startMovie_time;
	private Time finishMovie_time;
	private int screen_id;

	//getterとsetterの宣言//
	public int getMovieList_id() {
		return movieList_id;
	}
	public void setMovieList_id(int movieList_id) {
		this.movieList_id = movieList_id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(Date movie_date) {
		this.movie_date = movie_date;
	}
	public Time getStartMovie_time() {
		return startMovie_time;
	}
	public void setStartMovie_time(Time startMovie_time) {
		this.startMovie_time = startMovie_time;
	}
	public Time getFinishMovie_time() {
		return finishMovie_time;
	}
	public void setFinishMovie_time(Time finishMovie_time) {
		this.finishMovie_time = finishMovie_time;
	}
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}
}