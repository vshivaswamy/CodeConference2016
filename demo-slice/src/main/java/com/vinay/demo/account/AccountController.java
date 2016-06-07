package com.vinay.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.demo.common.SomeCommonService;

/**
 * @author Vinay
 *
 */
@RestController
class AccountController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	SomeCommonService someCommonService;
	
	
	
	@RequestMapping(value = "/accounts/{accountNumber}", method = RequestMethod.GET, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Account getAccountByAccountNumber(@PathVariable("accountNumber") String accountNumber) throws Exception {
		Account account = accountService.getAccountByAccountNumber(accountNumber);
		return account;
	}
	
	@RequestMapping(value = "/accounts", method = RequestMethod.POST, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Account addAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}
	
	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.POST, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Account updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);
	}
	
	/*@RequestMapping(value = "/accounts/{customerNumber}", method = RequestMethod.GET, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public List<Account> getAccountsByCustomer(@PathVariable("customerNumber") String customerNumber) throws Exception {
		List<Account> accounts = accountService.getAccountByCustomer(customerNumber);
		return accounts;
	}*/
	
}
