package com.barclays.Business.Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.Business.Application.model.Business;
import com.barclays.Business.Application.repository.BusinessRepository;

@Service
public class BusinessService {
	
	@Autowired
	BusinessRepository businessRepository;
	
	public Business save(Business customer) {
		return businessRepository.save(customer);
	}
	
	public Business getCustomerByID(long id) {
		return businessRepository.findById(id).get();
	}
	
	public void delete(long id) {
		businessRepository.deleteById(id);
	}
}
