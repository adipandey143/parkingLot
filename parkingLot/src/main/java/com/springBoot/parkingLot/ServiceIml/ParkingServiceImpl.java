package com.springBoot.parkingLot.ServiceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBoot.parkingLot.Service.ParkingService;
import com.springBoot.parkingLot.model.VechicleDTO;
import com.springBoot.parkingLot.repository.ParkingRepo;


public class ParkingServiceImpl implements ParkingService  {

	@Autowired
	ParkingRepo parkingRepo;
	
	@Override
	public List<VechicleDTO> getAllVechile() {
		return parkingRepo.findAll();
	}

	@Override
	public String park(VechicleDTO vechicle) {
		if(vechicle.getSlotId()>0 && vechicle.getSlotId()<=10 ) {
			parkingRepo.save(vechicle);
		}
		else
			{
			throw new RuntimeException("Exception Occured");
			}
		return "Parked";
	}
	
    @Override
	public String unpark(Long slotId) {
    	if(slotId >0 && slotId<=10 ) {
			parkingRepo.deleteById(slotId);
		}
		else
			{
			throw new RuntimeException("Exception Occured");
			}
		return "UNParked";
	}
}
