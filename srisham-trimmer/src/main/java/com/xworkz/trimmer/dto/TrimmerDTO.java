package com.xworkz.trimmer.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TrimmerDTO {
	
	private int id;
	@NotEmpty(message = "Company can not be Blank")
	private String company;
	@NotBlank(message = "Color can not be Blank")
	private String color;
	//@NotEmpty(message = "Speed can not be Blank")
	private Integer speed;
	//@NotEmpty(message = "chargingTime can not be Blank")
	private Integer chargingTime;
	@NotNull(message = "Price can not be Blank")
	private Double price;

}
