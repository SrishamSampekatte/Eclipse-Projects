package com.xworkz.crudhandling.dto;

public class GameDTO extends AbstaractAuditDTO {
	private String name;
	private String type;
	private Integer totalPlayers;

	public GameDTO() {
		System.out.println("Created default constructor");
	}

	public GameDTO(String name, String type, Integer totalPlayers, String createdBy, String updatedBy) {
		super(createdBy, updatedBy);
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}

	@Override
	public boolean equals(Object reference) {
		System.out.println("Running equals from GameDTO");
		if (reference != null) {
			if (reference instanceof GameDTO) {
				GameDTO dto = (GameDTO) reference;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is matching " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getTotalPlayers() {
		return totalPlayers;
	}

	public void setTotalPlayers(Integer totalPlayers) {
		this.totalPlayers = totalPlayers;
	}

}
