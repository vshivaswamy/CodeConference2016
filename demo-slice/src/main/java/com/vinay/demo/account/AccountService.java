package com.vinay.demo.account;

/**
 * @author Vinay
 *
 */
interface AccountService {
	Account addAccount(Account account);

	Account updateAccount(Account account);

	Account getAccountByAccountNumber(String accountNumber);

	Account unlockAccount(Account account);
}
