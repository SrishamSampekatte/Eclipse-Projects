package com.xworkz.bigbasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDTO {
	@NotNull(message = "name can not be blank")
	private String name;
	@NotNull(message = "email can not be blank")
	private String email;
	@NotNull(message = "phoneNumber can not be blank")
	private String phoneNumber;
	@Size(max = 8, message = "Password should be  8 char ")
	private String password;
	@NotBlank(message = "Item can not be blank")
	private String item;
	@NotNull(message = "price can not be blank")
	private String price;
	@NotNull(message = "color can not be blank")
	private String color;
	@NotNull(message = "quantity can not be blank")
	private String quantity;
	@NotNull(message = "area can not be blank")
	private String area;
	@NotNull(message = "pay can not be blank")
	private String pay;

}
