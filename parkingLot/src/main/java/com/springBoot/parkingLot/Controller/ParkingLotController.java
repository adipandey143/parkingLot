
package com.springBoot.parkingLot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.parkingLot.Service.ParkingServices;
import com.springBoot.parkingLot.model.VechicleDTO;

@RestController
@RequestMapping("/ParkingInfo")
public class ParkingLotController {

	@Autowired
	ParkingServices parkService;

	@GetMapping("/VechileList")
	public List<VechicleDTO> getAllVechiles()
	{
		return parkService.getAllVechile();
	}

}
