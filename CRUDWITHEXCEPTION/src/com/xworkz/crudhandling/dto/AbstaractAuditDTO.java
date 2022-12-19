package com.xworkz.crudhandling.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstaractAuditDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate = LocalDateTime.now();
	private String updatedBy;
	private LocalDateTime updatedDate = LocalDateTime.now();

	public AbstaractAuditDTO() {
		System.out.println("Created default constructor of AbstarctAuditDTO");
	}

	public AbstaractAuditDTO(String createdBy, String updatedBy) {
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "AbstaractAuditDTO [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
