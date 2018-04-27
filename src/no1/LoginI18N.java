package no1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Dao.StuDao;
import Dao.StuDaoImp;

public class LoginI18N extends ActionSupport {
	String type;
	String username;
	String password;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
    public void validate(){
    	if(username.isEmpty()){
    		addFieldError("username",getText("username.empty"));
    	}
    	if(password.isEmpty()){
    		addFieldError("password",getText("password.empty"));
    	}
//		if(username.isEmpty()||password.isEmpty()){
//			addActionError(getText("Key"));
//		}
    	
    	
//    	getText("key",String[]/List)
    	//(1)
//    	 String[] args = new String[]{username,password};
//    	 addActionError(getText("stu.info",args));
//    	(2)
//    	 java.util.List list = new ArrayList();
//    	 list.add(username);
//    	 list.add(password);
//    	 addActionError(getText("stu.info",list));
    	 
    }
	@Override
	public String execute() throws Exception {
		if ("admin".equals(username)) {		
			String[] args = new String[]{username,password};
			System.out.println(getText("stu.info",args));
//			System.out.println(getText("stu.info"));
			Map session = ActionContext.getContext().getSession();
			session.put("username", username);	
			System.out.println(type);
			return type;
		} else
			return "fail";
	}
	

}
