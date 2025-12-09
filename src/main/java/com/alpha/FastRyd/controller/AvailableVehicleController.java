package com.alpha.FastRyd.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.alpha.FastRyd.dto.AvailableVehicleDTO;
import com.alpha.FastRyd.service.AvailableVehicleService;

@RestController
@RequestMapping("/api/customer")
public class AvailableVehicleController {

    private final AvailableVehicleService availableVehicleService;

    // Constructor injection avoids circular dependency
    @Autowired
    public AvailableVehicleController(AvailableVehicleService availableVehicleService) {
        this.availableVehicleService = availableVehicleService;
    }

    @GetMapping("/available-vehicles")
    public AvailableVehicleDTO getAvailableVehicles(
            @RequestParam String mobileNumber,
            @RequestParam double destLat,
            @RequestParam double destLon
    ) {
        return availableVehicleService.getAvailableVehicles(mobileNumber, destLat, destLon);
    }
}
