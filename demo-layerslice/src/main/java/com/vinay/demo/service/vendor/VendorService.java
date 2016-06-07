package com.vinay.demo.service.vendor;

import java.util.List;

import com.vinay.demo.domain.vendor.Vendor;

/**
 * @author Vinay
 *
 */
public interface VendorService {
	Vendor addVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	Vendor findVendor(String criteria);

	List<Vendor> findAllVendors();
}
