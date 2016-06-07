package com.vinay.demo.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinay.demo.common.SomeCommonService;
import com.vinay.demo.customer.Customer;

/**
 * @author Vinay
 *
 */
public class AccountCustomerServiceImp implements AccountCustomerService {
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	SomeCommonService someCommonService;
	
	@Override
	public List<Account> getAccountsByCustomer(Customer customer) {
		
		return accountRepository.findByCustomer(customer);
		
	}
}
