package com.mst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Types;

import com.mst.dao.bean.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Override
	public String getEmployeeNameById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "select * from Employees";
		Object[] args = null;//{id}
		List<Employee> list = jdbcTemplate.query(sql, args, new EmployeeRowMapper());
		return list;
	}

	@Override
	public List<Employee> getEmployeesByNameLike(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int savePerson(Employee e) {
		String sql = "insert into Employees (id,name,salary,age) values (?,?,?,?)";
		Object[] args = {e.getId(),e.getName(),e.getSalary(),e.getAge()};
		int[] types = { Types.INTEGER,Types.VARCHAR,Types.DOUBLE, Types.INTEGER};
		int insertCount = jdbcTemplate.update(sql,args,types);
		return insertCount;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
