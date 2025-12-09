package com.alpha.FastRyd.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.FastRyd.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    // Fetch available vehicles where driver is in the same city as customer
//    List<Vehicle> findByAvailabilityStatusAndCurrentCity(String availabilityStatus, String currentCity);
    List<Vehicle> findByAvailabilityStatus(String availabilityStatus);

}
