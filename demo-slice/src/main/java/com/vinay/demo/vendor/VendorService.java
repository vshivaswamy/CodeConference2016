package com.vinay.demo.vendor;

import java.util.List;

/**
 * @author Vinay
 *
 */
interface VendorService {
	Vendor addVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	Vendor findVendor(String criteria);

	List<Vendor> findAllVendors();
}
