package org.dubbo.controller;

import org.dubbo.common.Institution;
import org.dubbo.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/institution")
public class InstitutionController {
	@Autowired
	InstitutionService institutionService;

	@RequestMapping(value = "/getUserByName")
	public @ResponseBody Institution getUserByName(@RequestBody JSONObject obj) {
		return institutionService.getInsByName(obj.getString("name"));
	}
}
