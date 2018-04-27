package interceptor;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import no1.Reg;

public class Myinterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		Reg reg = (Reg) arg0.getAction();
		//导入java.util的包
		reg.setDate(new Date());		
		//arg0.invoke()：让下一个拦截器执行
		return arg0.invoke();
	}

}
