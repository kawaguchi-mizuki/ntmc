package beans;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

public class AppointBeans implements Serializable{

	//引数の生成//
	private int appoint_id;
	private Date appoint_date;
	private Time appoint_time;
	private String appoint_seat;
	private int fee;
	private String movie_name;

	//getterとsetterの生成//
	public int getAppoint_id() {
		return appoint_id;
	}
	public void setAppoint_id(int appoint_id) {
		this.appoint_id = appoint_id;
	}
	public Date getAppoint_date() {
		return appoint_date;
	}
	public void setAppoint_date(Date appoint_date) {
		this.appoint_date = appoint_date;
	}
	public Time getAppoint_time() {
		return appoint_time;
	}
	public void setAppoint_time(Time appoint_time) {
		this.appoint_time = appoint_time;
	}
	public String getAppoint_seat() {
		return appoint_seat;
	}
	public void setAppoint_seat(String appoint_seat) {
		this.appoint_seat = appoint_seat;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
}