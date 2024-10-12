package com.mst.dao;

import java.util.List;

import com.mst.dao.bean.*;

public interface EmployeeDao {
	public String getEmployeeNameById(int id);
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeesByNameLike(String name);
	public int savePerson(Employee e);
	public void deleteAll();
}
