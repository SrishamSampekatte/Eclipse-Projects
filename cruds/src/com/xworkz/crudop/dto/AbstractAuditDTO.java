package com.xworkz.crudop.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractAuditDTO implements Serializable {
	private String CreatedBy;
	private LocalDateTime CreatedDate = LocalDateTime.now();
	private String UpdatedBy;
	private LocalDateTime UpdatedDate = LocalDateTime.now();

	public AbstractAuditDTO() {
		System.out.println("Calling no arguent constructor of AbstractAuditDTO");
	}

	public AbstractAuditDTO(String createdBy, String updatedBy) {
		super();
		CreatedBy = createdBy;

		UpdatedBy = updatedBy;

	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [CreatedBy=" + CreatedBy + ", CreatedDate=" + CreatedDate + ", UpdatedBy=" + UpdatedBy
				+ ", UpdatedDate=" + UpdatedDate + "]";
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		CreatedDate = createdDate;
	}

	public String getUpdatedBy() {
		return UpdatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return UpdatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		UpdatedDate = updatedDate;
	}

}
