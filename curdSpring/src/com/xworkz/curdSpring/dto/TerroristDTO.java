package com.xworkz.curdSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TerroristDTO extends AbstarctAuditDTO {
	@NonNull
	@NotNull(message = "Terrorist name can not be null ")
	@Size(min = 3, max = 20, message = "Name is invalid,should be more than 3 and should be less than 20")
	private String name;
	@NonNull
	@Min(value = 1, message = "Age should be greater than 1 ")
	@Max(value = 100, message = "Age should be less than 100 ")
	private int age;
	private String country;
	private boolean alive;
	private boolean prison;
	private String specialization;
	private String organization;
}
