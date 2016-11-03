package org.dubbo.impl;

import org.dubbo.common.User;
import org.dubbo.dao.ProviderDao;
import org.dubbo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
	@Autowired
	ProviderDao pDao;

	public User getUserByName(String name) {
		User u = new User();
		u.setName("fenwe");
		u.setPhone("13667687812");
		return pDao.getUserByName(name);
	}

}
 