package com.xworkz.trimmer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "trimmer")
public class TrimmerEntity {
	@Id
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_company")
	private String company;
	@Column(name = "t_color")
	private String color;
	@Column(name = "t_speed")
	private Integer speed;
	@Column(name = "t_chargingTime")
	private Integer chargingTime;
	@Column(name = "t_price")
	private Double price;

}
