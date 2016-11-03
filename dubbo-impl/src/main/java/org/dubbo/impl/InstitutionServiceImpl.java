package org.dubbo.impl;

import org.dubbo.common.Institution;
import org.dubbo.dao.InstitutionDao;
import org.dubbo.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("institutionService")
public class InstitutionServiceImpl implements InstitutionService{
@Autowired 
InstitutionDao institutionDao;

	public Institution getInsByName(String name) {
		return institutionDao.getInsByName(name);
	}
}
