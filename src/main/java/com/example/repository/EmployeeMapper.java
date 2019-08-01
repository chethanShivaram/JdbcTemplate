package com.example.repository;
import com.example.domain.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>
{
	public Employee mapRow(ResultSet rs, int i) throws SQLException {

		Employee result = new Employee();
	    result.setEmpId(rs.getInt("empId"));
		result.setName(rs.getString("name"));
	    result.setSalary(rs.getInt("salary"));
		result.setDept(rs.getString("dept"));
		return result;
	}
	
}