package com.alpha.FastRyd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.FastRyd.dto.AvailableVehicleDTO;
import com.alpha.FastRyd.dto.LocationDTO;
import com.alpha.FastRyd.dto.VehicleDetailDTO;
import com.alpha.FastRyd.entity.Customer;
import com.alpha.FastRyd.entity.Driver;
import com.alpha.FastRyd.entity.Vehicle;
import com.alpha.FastRyd.repository.CustomerRepository;
import com.alpha.FastRyd.repository.VehicleRepository;

@Service
public class AvailableVehicleService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    /**
     * @param mobileNumber - customer's registered mobile
     * @param destLat - destination latitude
     * @param destLon - destination longitude
     */
    public AvailableVehicleDTO getAvailableVehicles(String mobileNumber, double destLat, double destLon) {

        // 1. Verify Customer
        Customer customer = customerRepository.findByMobileNumber(mobileNumber);
        if (customer == null) {
            throw new RuntimeException("Customer not found with mobile: " + mobileNumber);
        }

        // 2. Source & Destination locations
        LocationDTO source = new LocationDTO(customer.getLatitude(), customer.getLongitude());
        LocationDTO destination = new LocationDTO(destLat, destLon);

        // 3. Calculate distance & estimated travel time (using default speed if needed)
        double distance = calculateDistance(source, destination); // in km
        double defaultSpeed = 40.0; // km/h
        double travelTime = distance / defaultSpeed;

        // 4. Fetch available vehicles
        List<Vehicle> vehicles = vehicleRepository.findByAvailabilityStatus("Available");

        // 5. Prepare Vehicle Detail DTOs
        List<VehicleDetailDTO> vehicleDetails = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v == null) continue; // safety check

            Driver driver = v.getDriver();
            double averageSpeed = (driver != null) ? driver.getAverageSpeed() : defaultSpeed;
            double estimatedTime = distance / averageSpeed;

            VehicleDetailDTO vd = new VehicleDetailDTO();
            vd.setModel(v.getModel());
            vd.setVehicleNumber(v.getVehicleNumber());
            vd.setPricePerKm(v.getPricePerKilometer());
            vd.setAverageSpeed(averageSpeed);
            vd.setFare(v.getPricePerKilometer() * distance);
            vd.setEstimatedTime(estimatedTime);

            if (driver == null) {
                System.out.println("Warning: Vehicle " + v.getVehicleNumber() + " has no driver assigned.");
            }

            vehicleDetails.add(vd);
        }

        // 6. Prepare final DTO
        AvailableVehicleDTO dto = new AvailableVehicleDTO();
        dto.setCustomerName(customer.getName());
        dto.setCustomerMobile(customer.getMobileNumber());
        dto.setSource(source);
        dto.setDestination(destination);
        dto.setDistanceInKm(distance);
        dto.setEstimatedTravelTime(travelTime);
        dto.setVehicles(vehicleDetails);

        return dto;
    }

	private double calculateDistance(LocationDTO source, LocationDTO destination) {
		// TODO Auto-generated method stub
		return 0;
	}
}