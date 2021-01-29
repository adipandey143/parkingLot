package com.springBoot.parkingLot.repository;

import org.springframework.stereotype.Repository;

import com.springBoot.parkingLot.model.ParkingInfo;

@Repository
public class ParkingRepo extends JpaRepository<ParkingInfo, Long> {

}
