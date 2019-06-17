package movies.beans;

import java.sql.Date;
import java.sql.Timestamp;

public class MovieListBeans {

	private int userId;
	private int movieId;
	private Date movieDate;
	private Timestamp movieTime;
	private String movieSeat;
	private String movieName;
	private int movieFee;
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

	public int getMovieFee() {
		return movieFee;
	}

	public void setMovieFee(int movieFee) {
		this.movieFee = movieFee;
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
