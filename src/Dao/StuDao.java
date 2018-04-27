package Dao;

import java.util.List;

import Stu.Stu;

public interface StuDao {
  public boolean check(String username) throws Exception;
  public List<String[]> getAllStus() throws Exception;
  public List<Stu> getAllStus2() throws Exception; 
}
