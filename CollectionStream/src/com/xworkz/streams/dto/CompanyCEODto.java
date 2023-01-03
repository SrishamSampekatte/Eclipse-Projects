package com.xworkz.streams.dto;

import java.io.Serializable;

public class CompanyCEODto implements Serializable {
	private String name;
	private String company;
	private Integer age;
	private String country;
	private String qualification;
	private boolean married;
	private DaughterDto daughterDto;

	public CompanyCEODto() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODto(String name, String company, Integer age, String country, String qualification,
			boolean married, DaughterDto daughterDto) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualification = qualification;
		this.married = married;
		this.daughterDto = daughterDto;
	}

	@Override
	public String toString() {
		return "CompanyCEODto [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualification=" + qualification + ", married=" + married + ", daughterDto=" + daughterDto + ", ]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 02;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CompanyCEODto) {
				CompanyCEODto dto = (CompanyCEODto) obj;
				if (dto.name.equals(this.name) && dto.daughterDto.equals(this.daughterDto)) {
					System.out.println("name & daughterDto matches : " + dto);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public Integer getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public String getQualification() {
		return qualification;
	}

	public DaughterDto getDaughterDto() {
		return daughterDto;
	}

	public void setDaughterDto(DaughterDto daughterDto) {
		this.daughterDto = daughterDto;
	}

	public boolean isMarried() {
		return married;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

}
