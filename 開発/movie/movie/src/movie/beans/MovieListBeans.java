package movie.beans;

import java.io.Serializable;
import java.sql.Date;

public class MovieListBeans implements Serializable {
	private int movieId;
    private String movieName;
    private int GenreId;
    private int CastId;
    private String movieSummary;
    private int adminId;
	private Date start;
	private Date finish;
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
	public int getGenreId() {
		return GenreId;
	}
	public void setGenreId(int genreId) {
		GenreId = genreId;
	}
	public int getCastId() {
		return CastId;
	}
	public void setCastId(int castId) {
		CastId = castId;
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
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getFinish() {
		return finish;
	}
	public void setFinish(Date finish) {
		this.finish = finish;
	}


}
