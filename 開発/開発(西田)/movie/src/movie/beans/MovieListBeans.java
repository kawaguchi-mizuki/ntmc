package movie.beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class MovieListBeans implements Serializable {
      private String movieId;
      private String movieName;
      private String movieGenre;
      private String movieCast;
      private String movieSummary;
      private String movieSeat;
      private int adminId;
      private Date appointdate;
      private Date movieStartDate;
      private Date movieFinishDate;
      private Time starttime;
      private Time finishtime;


	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieCast() {
		return movieCast;
	}
	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}
	public String getMovieSummary() {
		return movieSummary;
	}
	public void setMovieSummary(String movieSummary) {
		this.movieSummary = movieSummary;
	}
	public String getMovieSeat() {
		return movieSeat;
	}
	public void setMovieSeat(String movieSeat) {
		this.movieSeat = movieSeat;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public Date getAppointdate() {
		return appointdate;
	}
	public void setAppointdate(Date appointdate) {
		this.appointdate = appointdate;
	}
	public Time getStarttime() {
		return starttime;
	}
	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}
	public Time getFinishtime() {
		return finishtime;
	}
	public void setFinishtime(Time finishtime) {
		this.finishtime = finishtime;
	}




}
