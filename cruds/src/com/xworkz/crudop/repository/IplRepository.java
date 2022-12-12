package com.xworkz.crudop.repository;

import com.xworkz.crudop.dto.IplDto;

public interface IplRepository {
	boolean iplTeam(IplDto dto);

	default int total() {
		return 0;

	}

}
