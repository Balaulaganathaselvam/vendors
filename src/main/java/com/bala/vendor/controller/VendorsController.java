package com.bala.vendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bala.vendor.model.Vendors;
import com.bala.vendor.service.VendorService;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
@Controller
//@RestController

public class VendorsController {
	@Autowired
private VendorService vendorService;
	
	//@ResponseBody
	@RequestMapping("/data")
	public String createvendor() {
		return "CreateVendors";
	}
	@RequestMapping("/saveVen")
	public String createVendors(@ModelAttribute("Vendors")Vendors vendor,ModelMap modelMap) {
		Vendors saveVendor = vendorService.saveVendor(vendor);
		String msg="Location saved with id: " +saveVendor.getId();
		modelMap.addAttribute("msg", msg);
		
		return "CreateVendors";
	}
	@RequestMapping("/DisplayVendors")
	public String displayVendors(ModelMap modelmap) {
		List<Vendors> vendor = vendorService.getAllVendor();
		modelmap.addAttribute("vendor", vendor);
		return "DisplayVendors";
	}
	@RequestMapping("/deleteVendors")
	public String deleteVendors(@RequestParam("id") int id,ModelMap modelMap) {
		//Vendors vendor = vendorService.getVendorById(id);
		Vendors vendor = new Vendors();
		vendor.setId(id);
			vendorService.deleteVendor(vendor);
			List<Vendors> vendors=vendorService.getAllVendor();
			modelMap.addAttribute("vendors", vendors);
		return "DisplayVendors";
	}
	@RequestMapping("/dataUpdate")
	public String showVendors(@RequestParam("id")int id,ModelMap modelMap) {
		Vendors vendor = vendorService.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendors";
	}
	@RequestMapping("/updateVen")
	public String updateVedndors(@ModelAttribute("Vendors")Vendors vendor,ModelMap modelMap) {
		 vendorService.updateVendor(vendor);
		List<Vendors> vendors= vendorService.getAllVendor();
		modelMap.addAttribute("vendors", vendors);
		return "DisplayVendors";
	}

}
