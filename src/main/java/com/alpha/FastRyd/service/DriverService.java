package com.alpha.FastRyd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.FastRyd.dto.RegisterDriverVehicleDTO;
import com.alpha.FastRyd.entity.Driver;
import com.alpha.FastRyd.entity.Vehicle;
import com.alpha.FastRyd.repository.DriverRepository;
import com.alpha.FastRyd.repository.VehicleRepository;

@Service
	public class DriverService {

	    @Autowired
	    private DriverRepository driverRepository;

	    @Autowired
	    private VehicleRepository vehicleRepository;

	    public String registerDriver(RegisterDriverVehicleDTO dto) {

	        // Create Driver object
	        Driver driver = new Driver();
	        driver.setLicenseNumber(dto.getLicenseNumber());
	        driver.setUpiId(dto.getUpiId());
	        driver.setName(dto.getDriverName());
	        driver.setAge(dto.getAge());
	        driver.setMobileNumber(dto.getMobileNumber());
	        driver.setGender(dto.getGender());
	        driver.setMailId(dto.getMailId());
	        driver.setStatus("ACTIVE");

	        // Save driver first (to generate ID)
	        driver = driverRepository.save(driver);

	        // Create Vehicle object
	        Vehicle vehicle = new Vehicle();
	        vehicle.setDriver(driver);          // One-to-One
	        vehicle.setName(dto.getVehicleName());
	        vehicle.setVehicleNumber(dto.getVehicleNumber());
	        vehicle.setType(dto.getVehicleType());
	        vehicle.setModel(dto.getVehicleModel());
	        vehicle.setCapacity(dto.getVehicleCapacity());
	        vehicle.setCurrentCity("Not provided");
	        vehicle.setAvailabilityStatus("Available");
	        vehicle.setPricePerKilometer(dto.getPricePerKilometer());

	        // Save Vehicle (MapsId → will take same ID as driver)
	        vehicleRepository.save(vehicle);

	        return "Driver + Vehicle Registered Successfully!";
	    }
	    

	    public Driver getDriverByMobileNumber(String mobileNumber) {
	        return driverRepository.findByMobileNumber(mobileNumber);
	    }
	    
	    public String deleteDriverByMobileNumber(String mobileNumber) {

	        Driver driver = driverRepository.findByMobileNumber(mobileNumber);

	        if (driver == null) {
	            return "Driver not found with mobile number: " + mobileNumber;
	        }

	        driverRepository.deleteById(driver.getId());

	        return "Driver deleted successfully with mobile number: " + mobileNumber;
	    }
	    
	}


