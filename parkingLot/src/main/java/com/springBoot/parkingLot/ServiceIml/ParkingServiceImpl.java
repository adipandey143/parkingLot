package com.springBoot.parkingLot.ServiceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springBoot.parkingLot.Service.ParkingServices;
import com.springBoot.parkingLot.model.VechicleDTO;
import com.springBoot.parkingLot.repository.ParkingRepo;

@Service
public class ParkingServiceImpl implements ParkingServices  {

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
