package com.vinay.demo.account;

import java.util.List;

import com.vinay.demo.customer.Customer;


/**
 * @author Vinay
 *
 */
public interface AccountCustomerService {
	public List<Account> getAccountsByCustomer(Customer customer);
}
