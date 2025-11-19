package com.fleetops.service;

import com.fleetops.dto.Driver;

import java.util.List;

public interface DriverService {
    public boolean addDriver(Driver driver);
    public Driver getDriver(Long id);
    public List<Driver> getDriverList();
    public Driver updateDriver(Driver driver);
    
}
