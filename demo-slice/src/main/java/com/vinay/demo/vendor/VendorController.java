package com.vinay.demo.vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.demo.common.SomeCommonService;

/**
 * @author Vinay
 *
 */
@RestController
class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private SomeCommonService SomeCommonService;

	@RequestMapping(value = "/vendors", method = RequestMethod.GET, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public List<Vendor> getCustomers() throws Exception {
		List<Vendor> vendors = vendorService.findAllVendors();
		return vendors;
	}
	
	@RequestMapping(value = "/vendors/{criteria}", method = RequestMethod.GET, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Vendor getVendor(@PathVariable("criteria") String criteria) throws Exception {
		Vendor vendor = vendorService.findVendor(criteria);
		return vendor;
	}
	
	@RequestMapping(value = "/vendors", method = RequestMethod.POST, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Vendor addVendor(@RequestBody Vendor vendor) {
		return vendorService.addVendor(vendor);
	}
	
	@RequestMapping(value = "/vendors/{id}", method = RequestMethod.POST, headers = { "Accept=application/json,application/xml" }, produces = {
			"application/json", "application/xml" })
	public Vendor updateVendor(@RequestBody Vendor vendor) {
		return vendorService.updateVendor(vendor);
	}
}
