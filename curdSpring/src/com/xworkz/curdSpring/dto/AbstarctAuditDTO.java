package com.xworkz.curdSpring.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AbstarctAuditDTO implements Serializable {
	private String craetedBy;
	private LocalDateTime craetedAt;
	private String updatedBy;
	private LocalDateTime updatedAt;

}
