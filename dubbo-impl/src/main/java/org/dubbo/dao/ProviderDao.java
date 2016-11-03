package org.dubbo.dao;

import org.apache.ibatis.annotations.Param;
import org.dubbo.common.User;

public interface ProviderDao {
	public User getUserByName(@Param(value="name") String name);
}
