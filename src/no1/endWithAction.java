package no1;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class endWithAction extends ActionSupport {
	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String execute() throws Exception {
		double random = Math.random();
		System.out.println(random);
		if(random > 0.5)
			throw new SQLException("’“≤ªµΩ±Ì");
		else 
			return SUCCESS;
	}
   
}
