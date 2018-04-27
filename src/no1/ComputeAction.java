package no1;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ComputeAction extends ActionSupport {
	double num1;
	double num2;
//	double sum;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

//	public double getSum() {
//		return sum;
//	}

	@Override
	public String execute() {	
		double sum = this.num1 + this.num2;
		Map session = ActionContext.getContext().getSession();
		session.put("sum",sum);
		return SUCCESS;
	}

}
