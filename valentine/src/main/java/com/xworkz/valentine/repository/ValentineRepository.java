package com.xworkz.valentine.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;


public interface ValentineRepository {

	boolean save(ValentineEntity valentineEntity);

}
