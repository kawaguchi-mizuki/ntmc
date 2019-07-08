
//movie
package beans;

import java.io.Serializable;

public class AdminInfoBeans implements Serializable {

	private int id;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String name;

	private String password;


	public String getName() {
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