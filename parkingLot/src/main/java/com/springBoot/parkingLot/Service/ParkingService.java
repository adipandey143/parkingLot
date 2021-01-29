package com.springBoot.parkingLot.Service;
import com.springBoot.parkingLot.model.VechicleDTO;
import java.util.List;

public interface ParkingService {
	
	List<VechicleDTO> getAllVechile();
	String park(VechicleDTO vechicle);
	String unpark(Long slotId);
}
