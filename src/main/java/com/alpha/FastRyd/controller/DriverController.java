package com.alpha.FastRyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.FastRyd.dto.RegisterDriverVehicleDTO;
import com.alpha.FastRyd.entity.Driver;
import com.alpha.FastRyd.service.DriverService;

@RestController
	@RequestMapping("/driver")
	public class DriverController {

	    @Autowired
	    private DriverService driverService;

	    @PostMapping("/registerDriver")
	    public String registerDriver(@RequestBody RegisterDriverVehicleDTO dto) {
	        return driverService.registerDriver(dto);
	    }
	    
	    @GetMapping("/findDriver")
	    public Driver findDriverByMobile(@RequestParam String mobilenumber) {
	        Driver driver = driverService.getDriverByMobileNumber(mobilenumber);

	        if (driver == null) {
	            throw new RuntimeException("Driver not found with mobile number: " + mobilenumber);
	        }

	        return driver;
	    }
	}


