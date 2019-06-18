package movies.beans;

import java.sql.Date;
import java.sql.Time;

public class AppointBeans {
	private int userId;
	private int movieId;
	private int movieFee;
	private Date movieDate;
	private String movieSeat;
	private Time movieTime;
	private String movieTheater;
	private String movieScreen;


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getMovieFee() {
		return movieFee;
	}

	public void setMovieFee(int movieFee) {
		this.movieFee = movieFee;
	}

	public Date getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(Date movieStartDate) {
		this.movieDate = movieStartDate;
	}

	public String getMovieSeat() {
		return movieSeat;
	}

	public void setMovieSeat(String movieSeat) {
		this.movieSeat = movieSeat;
	}

	public Time getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(Time movieTime) {
		this.movieTime = movieTime;
	}

	public String getMovieTheater() {
		return movieTheater;
	}

	public void setMovieTheater(String movieTheater) {
		this.movieTheater = movieTheater;
	}

	public String getMovieScreen() {
		return movieScreen;
	}

	public void setMovieScreen(String movieScreen) {
		this.movieScreen = movieScreen;
	}



}
