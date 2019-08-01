package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.repository.PhoneRepository;
import com.example.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{
	
	@Autowired
	PhoneRepository phoneRepository ;

	public String fetchnumwithid(Integer phoneId) {
		return phoneRepository.fetchnumwithid(phoneId);
	}
	
}
