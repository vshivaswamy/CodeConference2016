package com.vinay.demo.domain.vendor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Vinay
 *
 */
@Entity
public class Vendor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VENDOR_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String vendorNumber;
	private String vendorName;
		
	public Vendor() {
	}

	public Vendor(String vendorName) {
		super();
		this.vendorName = vendorName;
	}

	public Vendor(String vendorNumber, String vendorName) {
		super();
		this.vendorNumber = vendorNumber;
		this.vendorName = vendorName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}
