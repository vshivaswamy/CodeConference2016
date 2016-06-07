package com.vinay.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.vinay.demo.domain.Vendor;


/**
 * @author Vinay
 *
 */
public interface VendorRepository extends CrudRepository<Vendor, Long>{
	
	Vendor findByVendorNumber(String vendorNumber);
	Vendor findByVendorName(String vendorName);
}
