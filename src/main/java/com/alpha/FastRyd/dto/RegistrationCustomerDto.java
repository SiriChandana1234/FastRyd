
	package com.alpha.FastRyd.dto;

	public class RegistrationCustomerDto {

	    private String name;
	    private int age;
	    private String gender;
	    private String mobileNumber;
	    private String email;
	    private double latitude;
	    private double longitude;

	    // -------------------------
	    // No-Args Constructor
	    // -------------------------
	    public RegistrationCustomerDto() {
	    }

	    // -------------------------
	    // All-Args Constructor
	    // -------------------------
	    public RegistrationCustomerDto(String name, int age, String gender,
	                                   String mobileNumber, String email,
	                                   double latitude, double longitude) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.mobileNumber = mobileNumber;
	        this.email = email;
	        this.latitude = latitude;
	        this.longitude = longitude;
	    }

	    // -------------------------
	    // Getters & Setters
	    // -------------------------
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public double getLatitude() {
	        return latitude;
	    }

	    public void setLatitude(double latitude) {
	        this.latitude = latitude;
	    }

	    public double getLongitude() {
	        return longitude;
	    }

	    public void setLongitude(double longitude) {
	        this.longitude = longitude;
	    }
	}



