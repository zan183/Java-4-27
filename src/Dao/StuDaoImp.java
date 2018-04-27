package Dao;

import java.sql.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Stu.Stu;

public class StuDaoImp implements StuDao {
	String driver = "org.hsqldb.jdbcDriver";
	String url="jdbc:hsqldb:hsql://localhost";
	String user = "sa";
	String pass ="";
	Connection con;
	
	@Override
	public boolean check(String username) throws ClassNotFoundException{
		Class.forName(driver);
		boolean isHave=false;
	    String sql="select * from stu where username = ?";	
		try {
			con=DriverManager.getConnection(url,user,pass);
			PreparedStatement pstmt=con.prepareStatement(sql);
		    pstmt.setString(1, username);
		    ResultSet rs = (ResultSet) pstmt.executeQuery();
			isHave = rs.next();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isHave;
	}

	@Override
	public List<String[]> getAllStus() throws Exception {
		Class.forName(driver);
		List<String[]> stus = new ArrayList<String[]>();
		 String sql="select * from Stu";	
			try {
				con=DriverManager.getConnection(url,user,pass);
				Statement st=con.createStatement();
			    ResultSet rs = (ResultSet)st.executeQuery(sql);
			    while(rs.next()){
			    	String[] str = new String[3];
			    	str[0]=rs.getString("id");
			    	str[1]=rs.getString("username");
			    	str[2]=rs.getString("pass");
			    	stus.add(str);
			    }
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
		return stus;
	}
	
	@Override
	public List<Stu> getAllStus2() throws Exception {
		Class.forName(driver);
		List<Stu> stus = new ArrayList<Stu>();
		 String sql="select * from Stu1";	
			try {
				con=DriverManager.getConnection(url,user,pass);
				Statement st=con.createStatement();
			    ResultSet rs = (ResultSet)st.executeQuery(sql);
			    while(rs.next()){
			    	
			    	Stu stu = new Stu();
			    	stu.setId(rs.getLong("id"));
			    	stu.setUsername(rs.getString("name"));
			    	stu.setPass(rs.getString("pass"));
			    	stu.setOs(rs.getDouble("os"));
			    	stu.setJava(rs.getDouble("java"));
			    	stu.setMath(rs.getDouble("math"));
			    	stus.add(stu);
			    }
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
		return stus;
	}

}
