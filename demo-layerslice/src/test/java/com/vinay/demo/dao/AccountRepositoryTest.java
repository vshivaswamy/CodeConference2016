package com.vinay.demo.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.dao.account.AccountRepository;
import com.vinay.demo.dao.customer.CustomerRepository;
import com.vinay.demo.domain.account.Account;
import com.vinay.demo.domain.customer.Customer;

import demolayerslice.DemoLayerSliceApp;

/**
 * @author Vinay
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoLayerSliceApp.class)
@Transactional
public class AccountRepositoryTest {

	@Autowired
	CommonUtil commonUtil;
	
	@Autowired
	AccountRepository repository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Test
	public void addAccount() throws Exception {
		String customerNumber = commonUtil.generateNumber();
		Customer customer = new Customer(customerNumber, "Vinay", "Shivaswamy");
		customer = customerRepository.save(customer);		
		Account account = new Account();
		account.setAccountName("TestAccount");account.setAccountNumber(commonUtil.generateNumber());
		account.setCustomer(customer);
		account.setStatus(true);
		assertNull(account.getId());
		repository.save(account);
		System.out.println("customer id: " + account.getId());
		assertNotNull(account.getId());
	}

}
