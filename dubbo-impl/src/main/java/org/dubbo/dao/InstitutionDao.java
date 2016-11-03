package org.dubbo.dao;

import org.apache.ibatis.annotations.Param;
import org.dubbo.common.Institution;

public interface InstitutionDao {
	public Institution getInsByName(@Param(value = "name") String name);
}
