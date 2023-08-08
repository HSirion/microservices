package com.sirion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sirion.entity.Customer;
import com.sirion.repo.CustomerRepo;

public class CustomerService {
	@Autowired
	CustomerRepo repo;
	
	public Customer addCustomer(Customer customer) {
		Optional<Customer> op = repo.findById(customer.getCustomerId());
		if(op.isPresent())
			return null;
		else {
			repo.saveAndFlush(customer);
			return customer;
		}
	}
	public Customer updateCustomer(Customer c) {
		Optional<Customer> op = repo.findById(c.getCustomerId());
		if(op.isPresent()) {
			repo.delete(c);
			repo.saveAndFlush(c);
		}
		return c;
	}
	public Customer removeCustomer(Customer c) {
		Optional<Customer> op = repo.findById(c.getCustomerId());
		if(op.isPresent()) {
			repo.delete(c);
			return c;
		}
		return null;
	}
	public Customer viewCustomer(String cid) {
		Optional<Customer> op = repo.findById(cid);
		if(op.isPresent())
			return op.get();
		return null;
			
	}
	public List<Customer> viewAllCustomer() {
		return repo.findAll();
}

}
