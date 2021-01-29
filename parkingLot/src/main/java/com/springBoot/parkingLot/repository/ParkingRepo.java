package com.springBoot.parkingLot.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.springBoot.parkingLot.model.VechicleDTO;

@Repository
public abstract class ParkingRepo implements JpaRepository<VechicleDTO, Long> {
	
}