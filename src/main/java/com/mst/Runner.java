package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mst.config.Config;
import com.mst.dao.EmployeeDaoImpl;
import com.mst.dao.bean.Employee;

public class Runner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		EmployeeDaoImpl dao = context.getBean(EmployeeDaoImpl.class);
		
		Employee e = new Employee(2,"John Smith",234.0,61);
		System.out.println("Insert new Employee to DB MySql: "+dao.savePerson(e));
		//System.out.println("Employee count from MySql: "+dao.count());
		System.out.println("get Employee name by id from Mysql: "+dao.getEmployeeNameById(1));
		System.out.println("get all employees from MySql: "+dao.getAllEmployees());
	}

}
