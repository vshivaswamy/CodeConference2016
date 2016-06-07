package com.vinay.demo.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinay.demo.common.SomeCommonService;
import com.vinay.demo.vendor.Vendor;

/**
 * @author Vinay
 *
 */
public class AccountVendorServiceImp implements AccountVendorService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	SomeCommonService someCommonService;

	@Override
	public List<Account> getAccountsByVendor(Vendor vendor) {
		return accountRepository.findByVendor(vendor);
	}

}
