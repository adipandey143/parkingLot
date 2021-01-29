package com.springBoot.parkingLot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



/*@Getter lombok provide these functionality to create getter setter directly without generate them manually.
@Setter*/
@Data //Combination of Getter, Setter, ToString, Hashcode
@Entity
public class VechicleDTO {

	@Id
	private Long slotId;
	private String VechicleNo;
	private String OwnerName;
	
}
