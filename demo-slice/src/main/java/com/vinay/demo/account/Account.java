package com.vinay.demo.account;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.vinay.demo.customer.Customer;
import com.vinay.demo.vendor.Vendor;

/**
 * @author Vinay
 *
 */
@Entity
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String accountNumber;
	private String accountName;
	
	@OneToOne(optional=true)
	@JoinColumn(name = "CUSTOMER_ID") 
	private Customer customer;
	
	@OneToOne(optional=true)
	@JoinColumn(name = "VENDOR_ID") 
	private Vendor vendor;
	
	private boolean status;

	public Account() {
	}

	/**
	 * Default active account will be created.
	 * @param accountName
	 * @param customer
	 */
	public Account(String accountName, Customer customer) {
		super();
		this.accountName = accountName;
		this.customer = customer;
		this.status = true;
	}

	
	public Account(String accountNumber, String accountName, Customer customer,
			boolean status) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.customer = customer;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	
}
