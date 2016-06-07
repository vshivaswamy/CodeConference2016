package com.vinay.demo.customer;

import java.util.List;

/**
 * @author Vinay
 *
 */
interface CustomerService {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer findCustomer(String criteria);

	List<Customer> findAllCustomer();
}
