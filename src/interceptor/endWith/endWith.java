package interceptor.endWith;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class endWith extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		if(username.endsWith("r"))
			return arg0.invoke();
		else{
			((ActionSupport) arg0.getAction()).addFieldError("username","用户名不是以r结尾，无权访问"); 
			return "login";
		}
	}

}
