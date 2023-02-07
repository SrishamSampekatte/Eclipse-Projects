package com.xworkz.dto;

import lombok.Data;

@Data
public class FamilyDTO {
	private String familyName;
	private String location;
	private String grandFather;
	private String grandMother;
	private String fatheName;
	private String motherName;
	private int famMembers;
	private int noOfSiblings;
	private String fatherProfession;
	private boolean jointFamily;

}
