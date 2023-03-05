package com.xworkz.trimmer.dto;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotNull;


import lombok.Data;

@Data
public class TrimmerDTO {

	private int id;
	@NotNull(message = "Company can not be blank ")
	private String company;
	@NotBlank(message = "color can not be blank ")
	private String color;
	@NotBlank(message = "speed has to be select")
	private String type;
	
	private Integer speed;
	private Double price;
}
