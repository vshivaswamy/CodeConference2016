package com.vinay.demo.account;

import java.util.List;

import com.vinay.demo.vendor.Vendor;


/**
 * @author Vinay
 *
 */
public interface AccountVendorService {
	public List<Account> getAccountsByVendor(Vendor vendor);
}
