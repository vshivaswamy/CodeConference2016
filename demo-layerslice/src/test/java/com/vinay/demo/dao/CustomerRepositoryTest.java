package com.vinay.demo.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.dao.customer.CustomerRepository;
import com.vinay.demo.domain.customer.Customer;

import demolayerslice.DemoLayerSliceApp;

/**
 * @author Vinay
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoLayerSliceApp.class)
@Transactional
public class CustomerRepositoryTest {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CommonUtil commonUtil;
	
	@Test
	public void addCustomer() throws Exception {
		String customerNumber = commonUtil.generateNumber();
		Customer customer = new Customer(customerNumber, "Vinay1", "Shivaswamy1");
		assertNull(customer.getId());
		customerRepository.save(customer);
		System.out.println("customer id: " + customer.getId());
		assertNotNull(customer.getId());
	}

	@Test
	public void getCustomer() throws Exception {
		String customerNumber = commonUtil.generateNumber();
		Customer customer = new Customer(customerNumber, "Vinay", "Shivaswamy");
		assertNull(customer.getId());
		customerRepository.save(customer);
		System.out.println("customer id: " + customer.getId());
		assertNotNull(customer.getId());
		Customer result = customerRepository.findOne(customer.getId());
		assertEquals(customer.getCustomerNumber(), result.getCustomerNumber());
		// findByLastName
		Customer result1 = customerRepository.findByLastName(customer
				.getLastName());
		assertEquals(customer.getCustomerNumber(), result1.getCustomerNumber());

		// findByCustomerNumber
		Customer result2 = customerRepository.findByCustomerNumber(customerNumber);
		assertEquals(customer.getCustomerNumber(), result2.getCustomerNumber());
	}
	
	
	public Customer getCustomerByLastName() throws Exception {
		String customerNumber = UUID.randomUUID().toString();
		Customer customer = new Customer(customerNumber, "Vinay", "Shivaswamy");
		assertNull(customer.getId());
		customerRepository.save(customer);
		System.out.println("customer id: " + customer.getId());
		assertNotNull(customer.getId());
		
		// findByLastName
		Customer result1 = customerRepository.findByLastName(customer
				.getLastName());
		assertEquals(customer.getCustomerNumber(), result1.getCustomerNumber());
		return result1;
	}
}
