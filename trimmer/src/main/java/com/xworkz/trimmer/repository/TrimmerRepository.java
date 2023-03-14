package com.xworkz.trimmer.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.trimmer.entity.TrimmerEntity;

public interface TrimmerRepository {
	boolean save(TrimmerEntity entity);

	default TrimmerEntity findById(int id) {
		return null;
	}

	default List<TrimmerEntity> findByCompany(String company) {
		return Collections.emptyList();
	}

	boolean update(TrimmerEntity entity);

	boolean delete(int id);

	default List<TrimmerEntity> findByAll() {
		return null;
	}

	default List<TrimmerEntity> findByTwoProperties(String company, String color) {
		return null;
	}

}
