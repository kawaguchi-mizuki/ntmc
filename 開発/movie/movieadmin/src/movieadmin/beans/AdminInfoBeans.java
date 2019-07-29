package movieadmin.beans;

import java.io.Serializable;

public class AdminInfoBeans implements Serializable {
	private static int id;
	private String name;
	private String password;
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamel() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



}
