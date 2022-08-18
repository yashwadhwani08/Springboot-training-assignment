package com.barclays.Business.Application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.Business.Application.model.Business;
import com.barclays.Business.Application.service.BusinessService;

@RestController
public class BusinessController {
	
	@Autowired
	private BusinessService businessService;
	
	@PostMapping("/customer")
	public ResponseEntity<Business> saveCustomer(@RequestBody Business customer)
	{
		customer = businessService.save(customer);
		return new ResponseEntity<>(customer, HttpStatus.CREATED);
				
	}
	
	@GetMapping("/customer/id")
	private Business getCustomer(@PathVariable("id") long id) {
		return businessService.getCustomerByID(id);
	}
	
	@DeleteMapping("/customer/id")
	private void deleteCustomer(@PathVariable("id") long id)
	{
		businessService.delete(id);
	}
}
