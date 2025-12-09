package com.alpha.FastRyd.entity;

import jakarta.persistence.*;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String vehicleNumber;
    private String type;
    private String model;
    private int capacity;
    private String currentCity;
    private String availabilityStatus;
    private double pricePerKilometer;
    @OneToOne(optional = true)
    @JoinColumn(name = "driver_id", nullable = true)
    private Driver driver;



    public Vehicle() {}

    public Vehicle(String name, String vehicleNumber, String type, String model,
                   int capacity, String currentCity, String availabilityStatus,
                   double pricePerKilometer, Driver driver) {
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.model = model;
        this.capacity = capacity;
        this.currentCity = currentCity;
        this.availabilityStatus = availabilityStatus;
        this.pricePerKilometer = pricePerKilometer;
        this.driver = driver;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public double getPricePerKilometer() {
		return pricePerKilometer;
	}

	public void setPricePerKilometer(double pricePerKilometer) {
		this.pricePerKilometer = pricePerKilometer;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", vehicleNumber=" + vehicleNumber + ", type=" + type
				+ ", model=" + model + ", capacity=" + capacity + ", currentCity=" + currentCity
				+ ", availabilityStatus=" + availabilityStatus + ", pricePerKilometer=" + pricePerKilometer
				+ ", driver=" + driver + "]";
	}

	public Vehicle(Long id, String name, String vehicleNumber, String type, String model, int capacity,
			String currentCity, String availabilityStatus, double pricePerKilometer, Driver driver) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.model = model;
		this.capacity = capacity;
		this.currentCity = currentCity;
		this.availabilityStatus = availabilityStatus;
		this.pricePerKilometer = pricePerKilometer;
		this.driver = driver;
	}

    
    // getters + setters (same as before)
}
