package com.alpha.FastRyd.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
	public class Booking {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String sourceLocation;
	    private String destinationLocation;
	    private double distanceTravelled;
	    private double fare;
	    private String estimationTimeRequired;
	    private LocalDateTime bookingDate;
	    private String payment;

	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;

	    @ManyToOne
	    @JoinColumn(name = "driver_id")
	    private Driver driver;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSourceLocation() {
			return sourceLocation;
		}

		public void setSourceLocation(String sourceLocation) {
			this.sourceLocation = sourceLocation;
		}

		public String getDestinationLocation() {
			return destinationLocation;
		}

		public void setDestinationLocation(String destinationLocation) {
			this.destinationLocation = destinationLocation;
		}

		public double getDistanceTravelled() {
			return distanceTravelled;
		}

		public void setDistanceTravelled(double distanceTravelled) {
			this.distanceTravelled = distanceTravelled;
		}

		public double getFare() {
			return fare;
		}

		public void setFare(double fare) {
			this.fare = fare;
		}

		public String getEstimationTimeRequired() {
			return estimationTimeRequired;
		}

		public void setEstimationTimeRequired(String estimationTimeRequired) {
			this.estimationTimeRequired = estimationTimeRequired;
		}

		public LocalDateTime getBookingDate() {
			return bookingDate;
		}

		public void setBookingDate(LocalDateTime bookingDate) {
			this.bookingDate = bookingDate;
		}

		public String getPayment() {
			return payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Driver getDriver() {
			return driver;
		}

		public void setDriver(Driver driver) {
			this.driver = driver;
		}

		public Booking(Long id, String sourceLocation, String destinationLocation, double distanceTravelled,
				double fare, String estimationTimeRequired, LocalDateTime bookingDate, String payment,
				Customer customer, Driver driver) {
			super();
			this.id = id;
			this.sourceLocation = sourceLocation;
			this.destinationLocation = destinationLocation;
			this.distanceTravelled = distanceTravelled;
			this.fare = fare;
			this.estimationTimeRequired = estimationTimeRequired;
			this.bookingDate = bookingDate;
			this.payment = payment;
			this.customer = customer;
			this.driver = driver;
		}

		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Booking [id=" + id + ", sourceLocation=" + sourceLocation + ", destinationLocation="
					+ destinationLocation + ", distanceTravelled=" + distanceTravelled + ", fare=" + fare
					+ ", estimationTimeRequired=" + estimationTimeRequired + ", bookingDate=" + bookingDate
					+ ", payment=" + payment + ", customer=" + customer + ", driver=" + driver + "]";
		}


}
