package com.xworkz.streams.dto;

import java.io.Serializable;

public class DaughterDto implements Serializable {
	private String name;
	private Long mobileNo;
	private Integer age;
	private boolean committed;
	private boolean alive;

	public DaughterDto() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDto(String name, Long mobileNo, Integer age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDto [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hashCode");
		return 02;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof DaughterDto) {
				DaughterDto dto = (DaughterDto) obj;
				if (dto.name.equals(this.name) && dto.mobileNo.equals(this.mobileNo)) {
					System.out.println("name & mobile matches : " + dto);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public Integer getAge() {
		return age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
