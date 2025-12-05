package com.alpha.FastRyd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alpha.FastRyd.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
