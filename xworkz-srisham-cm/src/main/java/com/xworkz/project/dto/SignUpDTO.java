package com.xworkz.project.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SignUpDTO {

	private int id;
	@Size(min = 3, max = 20, message = "userId should contain char min 3 and less than 20")
	private String userId;
	@Size(min = 3, max = 20, message = "email should contain char min 3 and less than 20")

	private String email;
	@Min(message = "mobile number should be more than 1", value = 1)
	private long mobile;
	@Size(min = 4, max = 20, message = "password should contain  min 3 and less than 20")

	private String password;
	@Size(min = 3, max = 20, message = "confirmPassword should contain  min 3 and less than 20")

	private String confirmPassword;
	private boolean acceptAgreement;

}
