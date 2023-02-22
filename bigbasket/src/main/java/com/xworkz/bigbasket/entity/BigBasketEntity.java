package com.xworkz.bigbasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bigbasket")
public class BigBasketEntity {
	@Id
	@Column(name = "b_id")
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_email")
	private String email;
	@Column(name = "b_phoneNumber")
	private String phoneNumber;
	@Column(name = "b_password")
	private String password;
	@Column(name = "b_item")
	private String item;
	@Column(name = "b_price")
	private String price;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_quantity")
	private String quantity;
	@Column(name = "b_area")
	private String area;
	@Column(name = "b_pay")
	private String pay;

}
