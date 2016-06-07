package com.vinay.demo.customer;

import org.springframework.data.repository.CrudRepository;


interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	Customer findByLastName(String lastname);
	Customer findByCustomerNumber(String customerNumber);
}
