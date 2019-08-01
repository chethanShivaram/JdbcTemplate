package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Employee;
import com.example.service.EmployeeService;
import com.example.service.PhoneService;


@RestController
public class MainController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PhoneService phoneService;
	
	@RequestMapping(path="/displaydata")
	public List<Employee> fetchAllData(){
		System.out.println(employeeService.fetchAllData());
		return employeeService.fetchAllData();
	}
	
	@RequestMapping(path="/displaydatawithname")
	public Employee fetchDataWithName(String name){
		System.out.println(employeeService.fetchDataWithName("rohit"));
		return employeeService.fetchDataWithName("rohit");
	}
	
	@RequestMapping(path="/displaydatawithmaxsalary")
	public  Employee maxSalaryData(){
		System.out.println(employeeService.maxSalaryData());
		return employeeService.maxSalaryData();
	}
	
	@RequestMapping(path="/displaydatawithdept")
	public  List<Employee> fetchDataWithDept(String dept){
		System.out.println(employeeService.fetchDataWithDept("IT"));
		return employeeService.fetchDataWithDept("IT");
	}
	
	@RequestMapping(path="/displaydatastartnamea")
     public List<Employee> fetchDataStartNameA(String name){
		System.out.println(employeeService.fetchDataStartNameA("a%"));
		return employeeService.fetchDataStartNameA("a%");
	}
	
	@RequestMapping(path="/displaydataendnameh")
    public List<Employee> fetchDataEndNameH(String name){
		System.out.println(employeeService.fetchDataStartNameA("%h"));
		return employeeService.fetchDataStartNameA("%h");
	}
	
	@RequestMapping(path="/displaydatastartrendm")
    public List<Employee> fetchDataStartREndM(String name){
		System.out.println(employeeService.fetchDataStartREndM("r%m"));
		return employeeService.fetchDataStartREndM("r%m");
	}
	
	@RequestMapping(path="/displayname")
	 public String fetchNameById(Integer empId) {
		 return employeeService.fetchNameById(5);
	 }
	
	@RequestMapping(path="/displayonlyname")
	 public List<String> fetchName(){
		return employeeService.fetchName();
	}
	
	@RequestMapping(path="/displaylistbysalary")
	 public List<Employee> fetchListByHighSalary(){
		 return employeeService.fetchListByHighSalary();
	 }
	@RequestMapping(path="/displaynumbyid")
	 public String fetchnumwithid(Integer phoneId){
		 return phoneService.fetchnumwithid(2);
	 }
	@RequestMapping(path="/displaynamesalary")
	public List<Map<String, Object>> fetchnamesalary(){
		 return employeeService.fetchnamesalary();
	 }
}
