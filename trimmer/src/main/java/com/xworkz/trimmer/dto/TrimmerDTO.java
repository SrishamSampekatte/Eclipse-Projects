package com.xworkz.trimmer.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class TrimmerDTO {

	private int id;
	@NotBlank(message = "Company cannot be null")
	@Size(min = 5, max = 30, message = "Company should be more than 5 or less than 30 characters")
	private String company;
	@NotBlank(message = "Color can not be blank ")
	private String color;
	@NotBlank(message = "Speed has to be select")
	private String type;
	@NotNull(message = "Speed cannot be null or blank")
	// @Min(value = 1, message = "speed cannot be less than zero")
	private Integer speed;
	@NotNull(message = "Price cannot be null or blank")
	@Min(value = 100, message = "Price cannot be less than 100")
//	@Size(min = 300, max = 5000, message = "Price should be more than 300 and max 50000")
	private Double price;
}
