package com.vinay.demo.service;

import java.util.List;

import com.vinay.demo.domain.Account;

/**
 * @author Vinay
 *
 */
public interface AccountService {
	Account addAccount(Account account);
	
	Account updateAccount(Account account);
	
	List<Account> getAccountByCustomer(Account account);
	
	Account getAccountByAccountNumber(String accountNumber);
	
	Account unlockAccount(Account account);
}
