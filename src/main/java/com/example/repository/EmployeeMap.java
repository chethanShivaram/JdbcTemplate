package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.domain.Employee;

public class EmployeeMap implements RowMapper<Employee>
	{
	    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	Employee e= new Employee ();
	        e.setName(rs.getString("name"));
	        e.setSalary(rs.getInt("salary"));
	        return e;
	    }
}
