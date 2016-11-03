package org.dubbo.controller;

import org.dubbo.common.User;
import org.dubbo.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value = "/consumer")
public class ConsumerController {
	@Autowired
	ProviderService providerService;

	@RequestMapping(value = "/getUserByName")
	public @ResponseBody User getUserByName(@RequestBody JSONObject obj) {
		return providerService.getUserByName(obj.getString("name"));
	}
}
