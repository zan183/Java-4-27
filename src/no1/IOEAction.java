package no1;

import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;

public class IOEAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		throw new IOException("IOE");
	}
	
}
