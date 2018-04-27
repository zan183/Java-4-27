package no1;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Dao.StuDao;
import Dao.StuDaoImp;

public class CheckLogin extends ActionSupport {
	String username;
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println(this.username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		
	}

	@Override
	public String execute() throws Exception {
		StuDao dao = new StuDaoImp();
		boolean isHave = dao.check(username);
		System.out.print(isHave);
		if (isHave) {
			Map session = ActionContext.getContext().getSession();
			session.put("username", username);			
			return "suc";
		} else
			return "fail";
	}
	public String good(){
		return "nl";
	}

}
