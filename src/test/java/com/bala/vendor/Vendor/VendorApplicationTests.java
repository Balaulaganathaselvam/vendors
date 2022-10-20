package com.bala.vendor.Vendor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bala.vendor.model.Vendors;

@SpringBootTest
class VendorApplicationTests {

	@Test
	void createsVendor() {
		Vendors vendor=new Vendors();
		vendor.setAddress(null);
	}

}
