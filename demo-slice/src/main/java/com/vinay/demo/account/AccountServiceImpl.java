package com.vinay.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.common.SomeCommonService;

/**
 * @author Vinay
 *
 */
@Component
class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private SomeCommonService someCommonService;

	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	AccountUnlockUtil accountUnlockUtil;

	@Override
	public Account addAccount(Account account) {
		String accountNumber = commonUtil.generateNumber();
		account.setAccountNumber(accountNumber);
		return accountRepository.save(account);
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account getAccountByAccountNumber(String accountNumber) {
		return accountRepository.findByAccountNumber(accountNumber);
	}

	/**
	 * unlock the account if its expired or whatever the reason
	 */
	@Override
	public Account unlockAccount(Account account) {
		account = accountRepository.findByAccountNumber(account
				.getAccountNumber());
		if (account != null)
			account.setStatus(true);
		return account;
	}

	public boolean someAccount() {
		someCommonService.someServiceA(true);
		commonUtil.publicMethod();
		accountUnlockUtil.accountUtil();
		return true;
	}
}
