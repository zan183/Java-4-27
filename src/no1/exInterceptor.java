package no1;

import java.io.IOException;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class exInterceptor extends ActionSupport {
	@Override public String execute() throws Exception{
		Double random = Math.random();
		System.out.println("random is :"+random);
		if(random<0.5)
			throw new SQLException("SQL�쳣");
		else
	         throw new IOException("IO�쳣");
	}
}
