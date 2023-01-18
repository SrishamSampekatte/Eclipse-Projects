package com.xworkz.template.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class AbstaractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDate localDate;
	private String updatedBy;
	private LocalDate updatedDate;

}
