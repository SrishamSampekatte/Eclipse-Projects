package com.xworkz.trimmer.repository;

import com.xworkz.trimmer.entity.TrimmerEntity;

public interface TrimmerRepository {
	boolean save(TrimmerEntity entity);

	default TrimmerEntity findById(int id) {
		return null;
	}
}
