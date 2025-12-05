package com.alpha.FastRyd.entity;


	import jakarta.persistence.*;

	@Entity
	public class Driver {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String licenseNumber;
	    private String upiId;
	    private String name;
	    private String status;
	    private int age;
	    private String mobileNumber;
	    private String gender;
	    private String mailId;

	    @OneToOne
	    private Vehicle vehicle;

	    // Constructor without fields
	    public Driver() {
	    }

	    // Constructor using fields
	    public Driver( String licenseNumber, String upiId, String name, String status,
	                  int age, String mobileNumber, String gender, String mailId, Vehicle vehicle) {
	        
	        this.licenseNumber = licenseNumber;
	        this.upiId = upiId;
	        this.name = name;
	        this.status = status;
	        this.age = age;
	        this.mobileNumber = mobileNumber;
	        this.gender = gender;
	        this.mailId = mailId;
	        this.vehicle = vehicle;
	    }

	    // Getters & Setters

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getLicenseNumber() {
	        return licenseNumber;
	    }

	    public void setLicenseNumber(String licenseNumber) {
	        this.licenseNumber = licenseNumber;
	    }

	    public String getUpiId() {
	        return upiId;
	    }

	    public void setUpiId(String upiId) {
	        this.upiId = upiId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getMailId() {
	        return mailId;
	    }

	    public void setMailId(String mailId) {
	        this.mailId = mailId;
	    }

	    public Vehicle getVehicle() {
	        return vehicle;
	    }

	    public void setVehicle(Vehicle vehicle) {
	        this.vehicle = vehicle;
	    }
	}


