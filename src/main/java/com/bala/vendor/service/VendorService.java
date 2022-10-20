package com.bala.vendor.service;

import java.util.List;

import com.bala.vendor.model.Vendors;

public interface VendorService {
	
	public Vendors saveVendor(Vendors vendor);
	
	public Vendors updateVendor(Vendors vendor);
	
	public Vendors getVendorById(int id);
	
	public void deleteVendor(Vendors vendor);
	
	public List<Vendors> getAllVendor();

}
