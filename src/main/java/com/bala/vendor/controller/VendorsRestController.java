package com.bala.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.vendor.model.Vendors;
import com.bala.vendor.repository.VendorRepository;

@RestController
@RequestMapping("/Vendors")
public class VendorsRestController {

	@Autowired
	VendorRepository repo;
	@GetMapping("/get")
	public List<Vendors> getVendors(){
		return repo.findAll();
	}
	@PostMapping("/post")
	public Vendors createVendor(@RequestBody Vendors vendor) {
		return repo.save(vendor);
	}
	@PutMapping("/put")
	public Vendors updateVendor(@RequestBody Vendors vendor) {
		return repo.save(vendor);
	}
	@DeleteMapping("/{id}")
	public void deleteVendor(@PathVariable("id") int id) {
		repo.deleteById(id);
		
	}
	@GetMapping("/{id}")
	public Vendors getVendor(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
}
