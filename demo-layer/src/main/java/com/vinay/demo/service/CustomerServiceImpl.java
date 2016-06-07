package com.vinay.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.dao.CustomerRepository;
import com.vinay.demo.domain.Customer;

/**
 * @author Vinay
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CommonUtil commonUtil;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		String customerNumber = commonUtil.generateNumber();
		customer.setCustomerNumber(customerNumber);
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer findCustomer(String criteria) {
		Customer customer = null;
		customer = customerRepository.findByCustomerNumber(criteria);
		if(customer != null) return customer;
		customer = customerRepository.findByLastName(criteria);
		
		return customer;
	}
	
	public List<Customer> findAllCustomer() {
		Iterator<Customer> itr = customerRepository.findAll().iterator();
		List<Customer> customers = new ArrayList<Customer>();
		while(itr.hasNext()){
			customers.add(itr.next());
		}
		return customers;
	}
}
