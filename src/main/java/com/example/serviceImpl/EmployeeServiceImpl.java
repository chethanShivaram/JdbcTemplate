package com.example.serviceImpl;

import com.example.service.EmployeeService;
import com.example.domain.Employee;
import com.example.repository.*;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> fetchAllData() {
		return employeeRepository.fetchAllData();
	}
	
	 public Employee fetchDataWithName(String name){
		return employeeRepository.fetchDataWithName(name);
	}
	 public Employee maxSalaryData() {
		 return employeeRepository.maxSalaryData(); 
	 }
	 
	 public  List<Employee> fetchDataWithDept(String dept){
			return employeeRepository.fetchDataWithDept(dept);
		}
	 
	 public List<Employee> fetchDataStartNameA(String name){
			return employeeRepository.fetchDataStartNameA(name);
	 }
	 public List<Employee> fetchDataEndNameH(String name){
		 return employeeRepository.fetchDataEndNameH(name);
	 }
	 public List<Employee> fetchDataStartREndM(String name){
		 return employeeRepository.fetchDataStartREndM(name);
	 }
	 public String fetchNameById(Integer empId) {
		 return employeeRepository.fetchNameById(empId);
	 }
	 public  List<String> fetchName(){
		 return employeeRepository.fetchName();
	 }
	 public List<Employee> fetchListByHighSalary(){
		 return employeeRepository.fetchListByHighSalary();
	 }
	 public List<Map<String, Object>> fetchnamesalary(){
		 return employeeRepository.fetchnamesalary();
	 }
}