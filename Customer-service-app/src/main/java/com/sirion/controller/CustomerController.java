package com.sirion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sirion.entity.Customer;
import com.sirion.service.CustomerService;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	CustomerService service;

	@PostMapping("/add")
	public Customer addCustomer(Customer c) {
		return service.addCustomer(c);
	}
	@PutMapping("/update")
	public Customer updateCustomer(Customer c) {
		return service.updateCustomer(c);
	}
	@PostMapping("/remove")
	public Customer removeCustomer(Customer c) {
		return service.removeCustomer(c);
	}
	@GetMapping("/viewBy/id/{id}")
	public Customer viewCustomer(@RequestParam String cid) {
		return service.viewCustomer(cid);
			
	}
	@GetMapping("/viewall")
	public List<Customer> viewAllCustomer() {
			return service.viewAllCustomer();
	}


}
