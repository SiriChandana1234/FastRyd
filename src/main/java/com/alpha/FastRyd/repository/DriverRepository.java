package com.alpha.FastRyd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.FastRyd.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
	 Driver findByMobileNumber(String mobileNumber);
	 
}
