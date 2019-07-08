package beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class AppointBeans implements Serializable{
	private int movieId;
	private Date movieDate;
	private Timestamp movieTime;
	private String movieSeat;
	private String movieName;

	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Date getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}
	public Timestamp getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(Timestamp movieTime) {
		this.movieTime = movieTime;
	}
	public String getMovieSeat() {
		return movieSeat;
	}
	public void setMovieSeat(String movieSeat) {
		this.movieSeat = movieSeat;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}
