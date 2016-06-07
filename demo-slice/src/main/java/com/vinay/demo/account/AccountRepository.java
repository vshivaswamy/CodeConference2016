package com.vinay.demo.account;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vinay.demo.customer.Customer;
import com.vinay.demo.vendor.Vendor;

/**
 * @author Vinay
 *
 */
interface AccountRepository extends CrudRepository<Account, Long> {
	Account findByAccountNumber(String accountNumber);

	List<Account> findByCustomer(Customer customer);

	List<Account> findByVendor(Vendor vendor);

}
