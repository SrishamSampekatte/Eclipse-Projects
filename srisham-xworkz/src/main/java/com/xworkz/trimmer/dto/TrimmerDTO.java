package com.xworkz.trimmer.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TrimmerDTO {
	private int id;
	@NotBlank(message = "Company can not be blank ")
	@NotNull
	private String company;
	@NotBlank(message = "color can not be blank ")
	private String color;
	@NotBlank(message = "type can not be blank ")
	private String type;
	
	private int speed;
	//@Size(min = 400, max = 5000, message = "Price should be minimum 300 and max 5000")
	@NotNull
	private int price;

}
