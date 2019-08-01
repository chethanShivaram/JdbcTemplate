package com.example.repository;

import java.util.List;
import java.util.Map;

import com.example.domain.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	    public List<Employee> fetchAllData() {
		List<Employee> result= jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper<Employee>(Employee.class));	
		return result;
     	}
	    
	    public Employee fetchDataWithName(String name) {
	    return jdbcTemplate.queryForObject("select * from employee where name=?", new Object[] {name}, new EmployeeMapper());
       }
	    
	    public Employee maxSalaryData() {
		    return jdbcTemplate.queryForObject("select * from employee where salary in (select MAX(salary) from employee)",new EmployeeMapper());
	       }
	    public  List<Employee> fetchDataWithDept(String dept) {
		    return jdbcTemplate.query("select * from employee where dept=?", new Object[] {dept}, new BeanPropertyRowMapper<Employee>(Employee.class));
	     }
	    
	    public  List<Employee> fetchDataStartNameA(String name){
		    return jdbcTemplate.query("select * from employee where name like ? ", new Object[] {name}, new BeanPropertyRowMapper<Employee>(Employee.class));
	     }
	    
	    public  List<Employee> fetchDataEndNameH(String name){
		    return jdbcTemplate.query("select * from employee where name like ? ", new Object[] {name}, new BeanPropertyRowMapper<Employee>(Employee.class));
	     }
	    
	    public  List<Employee> fetchDataStartREndM(String name){
		    return jdbcTemplate.query("select * from employee where name like ? ", new Object[] {name}, new BeanPropertyRowMapper<Employee>(Employee.class));
	     }
	    
	    public String fetchNameById(Integer empId) {
	    	return jdbcTemplate.queryForObject("select name from employee where empId=?", new Object[] {empId},(String.class));
	    }
	    
	     
	    public List<Employee> fetchListByHighSalary(){
	    	return jdbcTemplate.query("select * from employee order by salary desc limit 3", new EmployeeResultsetExtractor());
	    }  
	    public List<String> fetchName(){
		    	 List<String> menuNameList = jdbcTemplate.queryForList("SELECT name FROM employee", String.class);
		    	 return menuNameList;	      
		 } 
	       
	    public List<Map<String, Object>> fetchnamesalary(){
	    	  List<Map<String, Object>> list =jdbcTemplate.queryForList("select name,salary from employee"); 
	    	return list;	  
	    }
}
