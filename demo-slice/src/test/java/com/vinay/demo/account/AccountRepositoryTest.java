package com.vinay.demo.account;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.customer.Customer;
import com.vinay.demo.customer.CustomerRepositoryTest;

import demoslice.DemoSliceApp;

/**
 * @author Vinay
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoSliceApp.class)
@Transactional
public class AccountRepositoryTest {

	@Autowired
	CommonUtil commonUtil;
	
	@Autowired
	AccountRepository repository;
	
	@Autowired
	CustomerRepositoryTest customerTest;
	
	@Test
	@Transactional
	public void addAccount() throws Exception {
		Customer customer = customerTest.getCustomerByLastName();		
		Account account = new Account();
		account.setAccountName("TestAccount");
		account.setAccountNumber(commonUtil.generateNumber());
		account.setCustomer(customer);
		account.setStatus(true);
		assertNull(account.getId());
		repository.save(account);
		System.out.println("customer id: " + account.getId());
		assertNotNull(account.getId());
	}

}
