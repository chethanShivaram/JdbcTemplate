package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PhoneRepository {
		
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public  String fetchnumwithid(Integer phoneId) {
		    return jdbcTemplate.queryForObject("select phoneNum from phone where phoneId=?", new Object[] {phoneId}, (String.class));
	    }
}