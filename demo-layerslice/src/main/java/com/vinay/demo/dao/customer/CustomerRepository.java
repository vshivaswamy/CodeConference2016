package com.vinay.demo.dao.customer;

import org.springframework.data.repository.CrudRepository;

import com.vinay.demo.domain.customer.Customer;


/**
 * @author Vinay
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	Customer findByLastName(String lastname);
	Customer findByCustomerNumber(String customerNumber);
}
