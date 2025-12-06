package com.alpha.FastRyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alpha.FastRyd.dto.RegistrationCustomerDto;
import com.alpha.FastRyd.entity.Customer;
import com.alpha.FastRyd.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Register Customer
   
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody RegistrationCustomerDto dto) {
        Customer saved = customerService.registerCustomer(dto);
        return ResponseEntity.ok(saved);
    }

    // Find Customer By Mobile Number
   
    @GetMapping("/find/{mobileNo}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String mobileNo) {
           Customer customer = customerService.getCustomerByMobile(mobileNo);

        if (customer == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customer);
    }
    
  // Delete Customer By Mobile Number
  @DeleteMapping("/delete/{mobileNo}")
        public ResponseEntity<String> deleteCustomer(@PathVariable String mobileNo) {
     boolean deleted = customerService.deleteCustomerByMobile(mobileNo);

     if (!deleted) {
         return ResponseEntity.notFound().build();  // if Customer not found
     }

     return ResponseEntity.ok("Customer deleted successfully");
 }

}
