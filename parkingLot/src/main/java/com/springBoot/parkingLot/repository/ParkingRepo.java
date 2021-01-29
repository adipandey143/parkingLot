package com.springBoot.parkingLot.repository;

import org.springframework.stereotype.Repository;

import com.springBoot.parkingLot.model.VechicleDTO;

@Repository
public class ParkingRepo extends JpaRepository<VechicleDTO, Long> {

}
