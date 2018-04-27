package no1;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Dao.StuDao;
import Dao.StuDaoImp;

public class Showallstu extends ActionSupport {
	List<String[]> stus = new ArrayList<String[]>();

	public List<String[]> getStus() {
		return stus;
	}

	@Override
	public String execute() throws Exception {
		StuDao dao = new StuDaoImp();
		stus = dao.getAllStus();
		System.out.println(stus.size());
		return SUCCESS;
	}
}
