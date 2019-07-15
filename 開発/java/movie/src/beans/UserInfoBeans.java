package movie.beans;

import java.io.Serializable;
import java.sql.Date;

public class UserInfoBeans implements Serializable {
	private static int id;
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String mail;
	private String name;
	private String sex;
	private String password;
	private Date birthday;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}





}