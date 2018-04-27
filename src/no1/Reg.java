package no1;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Reg extends ActionSupport {
	Date date;
	String Username;
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

}
