package com.alpha.FastRyd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.FastRyd.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByMobileNumber(String mobileNumber);
}
