package com.xworkz.trimmer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "trimmer_table")
@NamedQuery(name = "findByCompany", query = "select entity from TrimmerEntity entity where entity.company=:comp")
public class TrimmerEntity {

	@Id
	@Column(name = "t_id")
	private int id;
	@Column(name = "t_company")
	private String company;
	@Column(name = "t_color")
	private String color;
	@Column(name = "t_type")
	private String type;
	@Column(name = "t_speed")
	private Integer speed;
	@Column(name = "t_price")
	private Double price;

}
