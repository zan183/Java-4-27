package no1;

import com.opensymphony.xwork2.ActionSupport;

import Bean.Stu;

public class checkLoginByObj extends ActionSupport {
    Stu stu;

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}
     public void validate(){
    	 if(stu.getUsername().isEmpty()){
    		 addFieldError("stu.username","用户名不能为空");
    	 }
    	 if(stu.getPass().isEmpty()){
    		 addFieldError("stu.pass","密码不能为空");
    	 }
     }
//     建议所有子类都重写此方法。
//     Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、
//     at 标记符“@”和此对象哈希码的无符号十六进制表示组成。
     @Override public String execute(){
		if("admin".equals(stu.getUsername())){
			return SUCCESS;
		}else
    	 return "fail";
     }
}
