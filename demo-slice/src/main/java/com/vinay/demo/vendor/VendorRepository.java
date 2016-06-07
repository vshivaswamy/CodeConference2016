package com.vinay.demo.vendor;

import org.springframework.data.repository.CrudRepository;


/**
 * @author Vinay
 *
 */
interface VendorRepository extends CrudRepository<Vendor, Long>{
	
	Vendor findByVendorNumber(String vendorNumber);
	Vendor findByVendorName(String vendorName);
}
