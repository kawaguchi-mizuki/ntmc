package movies.beans;

import java.sql.Date;

public class AppointBeans {
	private int movieId;
	private String movieName;
	private String movieGenre;
	private String movieCast;
	private String movieSummary;
	private int adminId;
	private Date movieStartDate;
	private Date movieEndDate;

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

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Date getMovieStartDate() {
		return movieStartDate;
	}

	public void setMovieStartDate(Date movieStartDate) {
		this.movieStartDate = movieStartDate;
	}

	public Date getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(Date movieEndDate) {
		this.movieEndDate = movieEndDate;
	}



}
