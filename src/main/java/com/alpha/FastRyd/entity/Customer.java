package com.alpha.FastRyd.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String mobileNumber;
    private String emailId;

    private String currentLocation;

    private double latitude;
    private double longitude;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    // No-args constructor
    public Customer() {
    }

    // All-args constructor
    public Customer(Long id, String name, int age, String gender, String mobileNumber,
                    String emailId, String currentLocation, double latitude, double longitude,
                    List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.currentLocation = currentLocation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.bookings = bookings;
    }

    // Getters and Setters
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
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

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", currentLocation=" + currentLocation + ", latitude="
				+ latitude + ", longitude=" + longitude + ", bookings=" + bookings + "]";
	}


   
}


//	public void setLatitude(double latitude) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setLongitude(double longitude) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//}
