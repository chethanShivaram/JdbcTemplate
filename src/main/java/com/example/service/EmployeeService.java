package com.example.service;
import com.example.domain.*;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService{
	  List<Employee> fetchAllData();
	  Employee fetchDataWithName(String name);
	  Employee maxSalaryData();
	  List<Employee> fetchDataWithDept(String dept);
      List<Employee> fetchDataStartNameA(String name);
      List<Employee> fetchDataEndNameH(String name);
      List<Employee> fetchDataStartREndM(String name);
      
      String fetchNameById(Integer empId);
      List<String> fetchName();
      List<Employee> fetchListByHighSalary();
      List<Map<String, Object>> fetchnamesalary();
      
}
