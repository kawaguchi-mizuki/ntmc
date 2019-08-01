package movie.model;

import java.util.ArrayList;
import java.util.List;

import movie.beans.MovieListBeans;
import movie.dao.MovieDao;

public class MovieModel {
	//映画更新選択画面で映画名をとってくる//
    public List<MovieListBeans> updatestartmovie() {
          List<MovieListBeans> upselectmovie = new ArrayList<MovieListBeans>();
          MovieDao upselectdao = new MovieDao();
          try {
       		 upselectdao.connect();
       		 upselectmovie = upselectdao.updatestartMovie();
       	 }catch(Exception e) {
       		 e.printStackTrace();
       	 } finally {
       		 upselectdao.close();
       	 }
       	 return upselectmovie;
        }

    //映画更新選択画面で選択された映画の情報をとってくる処理//
    public List<MovieListBeans> update(int upmovieId){

    	List<MovieListBeans> updatemovie = new ArrayList<MovieListBeans>();
    	MovieDao updatedao = new MovieDao();
    	try {
      		 updatedao.connect();
      		 updatemovie = updatedao.updateMovie(upmovieId);
      	 }catch(Exception e) {
      		 e.printStackTrace();
      	 } finally {
      		 updatedao.close();
      	 }
      	 return updatemovie;

    }

    //映画更新する//
    public void updatemovieInfo(int upmovieId,String upmovie,int AdminId,String upgenre,String upcast,String upsummry) {
               MovieDao updateInfo = new MovieDao();
               try {
          		 updateInfo.connect();
          		 updateInfo.updateMovieInfo(upmovieId,upmovie,AdminId,upgenre, upcast,upsummry);


          	 } catch(Exception e) {
          		 e.printStackTrace();
          	 } finally {
          		 if(updateInfo!=null) {
          			 updateInfo.close();
          		 }
          	 }
           }

    }






