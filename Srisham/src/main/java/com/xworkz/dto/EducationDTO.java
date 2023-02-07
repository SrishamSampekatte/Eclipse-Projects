package com.xworkz.dto;

import lombok.Data;

@Data
public class EducationDTO {
	private boolean anganvadi;
	private String primary;
	private String secondary;
	private String degree;
	private String university;
	private double anganvadiPercentage;
	private double primaryPercentage;
	private double secondaryPercentage;
	private double degreePercentage;
	private double universityPercentage;

}
