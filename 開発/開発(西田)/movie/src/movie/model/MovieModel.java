package movie.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;
import movie.dao.MovieDao;

public class MovieModel {
    public List<MovieListBeans> getMovieView(){
    	List<MovieListBeans> list = new ArrayList<MovieListBeans>();
    	MovieDao moviedao = new MovieDao();
    	try {
   		 moviedao.connect();
   		 list = moviedao.getMovieView();
   	 }catch(Exception e) {
   		 e.printStackTrace();
   	 } finally {
   		 moviedao.close();
   	 }
   	 return list;
    }

    public List<MovieListBeans> searchMovie(String searchmovie){
    	List<MovieListBeans> movie = new ArrayList<MovieListBeans>();
    	MovieDao  moviesearchdao = new MovieDao();
    	try {
      		 moviesearchdao.connect();
      		 movie = moviesearchdao.searchMovie(searchmovie);
      	 }catch(Exception e) {
      		 e.printStackTrace();
      	 } finally {
      		 moviesearchdao.close();
      	 }
      	 return movie;
       }

    public void registAdminMovie(String movieName,String Genre,String movieCast,String movieSummary,int adminId,Date movieStartDate,Date movieEndDate) {

    }



}
