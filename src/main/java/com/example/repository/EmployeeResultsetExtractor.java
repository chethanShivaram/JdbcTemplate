package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.example.domain.*;

public class EmployeeResultsetExtractor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> list=new ArrayList<Employee>(); 
		while(rs.next()){  
	    Employee e=new Employee();  
	    e.setEmpId(rs.getInt("empId"));
		e.setName(rs.getString("name"));
		e.setSalary(rs.getInt("salary"));
	    e.setDept(rs.getString("dept"));
		list.add(e);
	}
	return list;
	}
}
