package movie.beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class MovieListBeans implements Serializable {
	private int movieId;
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
	private Date movieListdate;
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
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
	public Date getMovieStartDate() {
		return movieStartDate;
	}
	public void setMovieStartDate(Date movieStartDate) {
		this.movieStartDate = movieStartDate;
	}
	public Date getMovieFinishDate() {
		return movieFinishDate;
	}
	public void setMovieFinishDate(Date movieFinishDate) {
		this.movieFinishDate = movieFinishDate;
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

	public Date getMovieListdate() {
		return movieListdate;
	}

	public void setMovieListdate(Date movieListdate) {
		this.movieListdate = movieListdate;
	}



}
