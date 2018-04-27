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
		//����java.util�İ�
		reg.setDate(new Date());		
		//arg0.invoke()������һ��������ִ��
		return arg0.invoke();
	}

}
