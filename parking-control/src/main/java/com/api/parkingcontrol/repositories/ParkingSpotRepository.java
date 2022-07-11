package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    public boolean existsByLicensePlateCar(String licensePlateCar);
    public boolean existsByApartmentAndBlock(String apartment, String block);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
}
