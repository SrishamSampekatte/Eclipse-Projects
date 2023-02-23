package com.xworkz.bigbasket.repository;

import com.xworkz.bigbasket.entity.BigBasketEntity;

public interface BigBasketRepository {
	boolean save(BigBasketEntity basketEntity);
	default AeroplaneEntity findById(int id) {
		return null;
	}

}
