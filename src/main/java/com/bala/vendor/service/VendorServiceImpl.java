package com.bala.vendor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.vendor.model.Vendors;
import com.bala.vendor.repository.VendorRepository;
@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository repository;

	@Override
	public Vendors saveVendor(Vendors vendor) {
		// TODO Auto-generated method stub
		Vendors saved = repository.save(vendor);
		return saved;
	}

	@Override
	public Vendors updateVendor(Vendors vendor) {
		return repository.save(vendor);
	}

	@Override
	public Vendors getVendorById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deleteVendor(Vendors vendor) {
		repository.delete(vendor);
	}

	@Override
	public List<Vendors> getAllVendor() {
		return repository.findAll();
	}
	
	

	

}
