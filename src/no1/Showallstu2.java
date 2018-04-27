package no1;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Dao.StuDao;
import Dao.StuDaoImp;
import Stu.Stu;

public class Showallstu2 extends ActionSupport {
	List<Stu> stus = new ArrayList<Stu>();

	public List<Stu> getStus() {
		return stus;
	}

	@Override
	public String execute() throws Exception {
		StuDao dao = new StuDaoImp();
		stus = dao.getAllStus2();
		System.out.println(stus);
		return SUCCESS;
	}

}
