package movie.beans;

import java.sql.Date;
import java.sql.Time;

public class AppointBeans {
	private int appointId;
	private int movieId;
	private int userId;
	private int theaterId;
	private int screenId;
	private Date movieDate;
	private int movieFee;
	private Time movieTime;
	private String movieSeat;
	public int getAppointId() {
		return appointId;
	}
	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public Date getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}
	public int getMovieFee() {
		return movieFee;
	}
	public void setMovieFee(int movieFee) {
		this.movieFee = movieFee;
	}
	public Time getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(Time movieTime) {
		this.movieTime = movieTime;
	}
	public String getMovieSeat() {
		return movieSeat;
	}
	public void setMovieSeat(String movieSeat) {
		this.movieSeat = movieSeat;
	}






}
