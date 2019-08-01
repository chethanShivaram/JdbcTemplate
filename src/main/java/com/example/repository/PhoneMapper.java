package com.example.repository;
import com.example.domain.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PhoneMapper implements RowMapper<Phone>
{
	public Phone mapRow(ResultSet rs, int i) throws SQLException {
		Phone  result = new Phone();
	    result.setPhoneId(rs.getInt("phoneId"));
		result.setPhoneNum(rs.getString("phoneNum"));
		return result;
	}
	
}