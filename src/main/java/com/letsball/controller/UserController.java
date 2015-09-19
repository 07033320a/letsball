/**
 * 
 */
package com.letsball.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.letsball.model.UserEntity;
import com.letsball.service.IUserService;

/**
 * @author letsball
 */
@Controller
@RequestMapping("/user")
public class UserController{
	@Resource
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public Map<String,Object> login( UserEntity user){
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println(user.toString());
		boolean loginResult = userService.isExist(user);
		map.put("loginResult", loginResult);
		return map;
	}
}
