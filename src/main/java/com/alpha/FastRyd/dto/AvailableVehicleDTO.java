package com.alpha.FastRyd.dto;

import java.util.List;


public class AvailableVehicleDTO {

    private String customerName;
    private String customerMobile;

    private LocationDTO source;
    private LocationDTO destination;

    private double distanceInKm;
    private double estimatedTravelTime;

    private List<VehicleDetailDTO> vehicles;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public LocationDTO getSource() {
		return source;
	}

	public void setSource(LocationDTO source) {
		this.source = source;
	}

	public LocationDTO getDestination() {
		return destination;
	}

	public void setDestination(LocationDTO destination) {
		this.destination = destination;
	}

	public double getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(double distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public double getEstimatedTravelTime() {
		return estimatedTravelTime;
	}

	public void setEstimatedTravelTime(double estimatedTravelTime) {
		this.estimatedTravelTime = estimatedTravelTime;
	}

	public List<VehicleDetailDTO> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehicleDetailDTO> vehicles) {
		this.vehicles = vehicles;
	}
    
    
     
}
