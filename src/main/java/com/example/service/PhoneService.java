package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface PhoneService {
	String fetchnumwithid(Integer phoneId);
}
