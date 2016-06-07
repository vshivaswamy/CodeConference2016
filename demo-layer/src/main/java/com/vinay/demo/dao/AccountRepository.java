package com.vinay.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vinay.demo.domain.Account;
import com.vinay.demo.domain.Customer;


/**
 * @author Vinay
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long> {
	
	List<Account> findByCustomer(Customer customer);
	Account findByAccountNumber(String accountNumber);
}
