package com.vinay.demo.vendor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.demo.common.CommonUtil;
import com.vinay.demo.common.SomeCommonService;

/**
 * @author Vinay
 *
 */
@Service
class VendorServiceImpl implements VendorService{

	@Autowired
	private VendorRepository vendorRepository;
	
	@Autowired
	private CommonUtil commonUtil;
	
	@Autowired
	private SomeCommonService SomeCommonService;
	
	@Override
	public Vendor addVendor(Vendor vendor) {
		String customerNumber = commonUtil.generateNumber();
		vendor.setVendorNumber(customerNumber);
		return vendorRepository.save(vendor);
	}
	
	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor findVendor(String criteria) {
		Vendor vendor = null;
		vendor = vendorRepository.findByVendorNumber(criteria);
		if(vendor != null) return vendor;
		vendor = vendorRepository.findByVendorName(criteria);
		
		return vendor;
	}
	
	@Override
	public List<Vendor> findAllVendors() {
		Iterator<Vendor> itr = vendorRepository.findAll().iterator();
		List<Vendor> vendor = new ArrayList<Vendor>();
		while(itr.hasNext()){
			vendor.add(itr.next());
		}
		return vendor;
	}
}
