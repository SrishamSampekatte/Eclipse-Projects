package com.xworkz.template.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class SoldierDTO extends AbstaractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 15, message = "Name must be greater than 3 and lesser than 15")
	private String name;
	@Min(value = 3, message = "Id should be grater than 3 ")
	@Max(value = 1000, message = "Id should be lesser than 1000")
	private int id;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 15, message = "Regiment must be minimum 3 and lesser than 15")
	private String regiment;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 15, message = "State must be minimum 3 and lesser than 15")
	private String state;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 15, message = "Country must be minimum 3 and lesser than 15")
	private String country;

}
