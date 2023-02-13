package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "funk_table")
public class HostelDTO {
	@Column(name = "f_id")
	@Id
	private Integer id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_location")
	private String location;
	@Column(name = "f_district")
	private String district;

}
