package com.alpha.FastRyd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.FastRyd.dto.RegistrationCustomerDto;
import com.alpha.FastRyd.entity.Customer;
import com.alpha.FastRyd.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Register Customer
    public Customer registerCustomer(RegistrationCustomerDto dto) {

        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setAge(dto.getAge());
        customer.setGender(dto.getGender());
        customer.setMobileNumber(dto.getMobileNumber());
        customer.setEmailId(dto.getEmail());
        customer.setLatitude(dto.getLatitude());
        customer.setLongitude(dto.getLongitude());

        customer.setCurrentLocation("Lat: " + dto.getLatitude() + ", Lon: " + dto.getLongitude());

        return customerRepository.save(customer);
    }

    // Find Customer by Mobile
    public Customer getCustomerByMobile(String mobileNumber) {
        return customerRepository.findByMobileNumber(mobileNumber);
    }

    // Delete Customer by Mobile
    public boolean deleteCustomerByMobile(String mobileNo) {

        Customer customer = customerRepository.findByMobileNumber(mobileNo);

        if (customer == null) {
            return false;  // Not found
        }

        customerRepository.delete(customer);
        return true;
    }
}
