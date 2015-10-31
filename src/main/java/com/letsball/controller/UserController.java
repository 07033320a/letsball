/**
 * 
 */
package com.letsball.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.letsball.entity.TUser;
import com.letsball.service.IUserService;
import com.letsball.utils.ValueUtil;

/**
 * @author letsball
 */
@Controller
@RequestMapping("/user")
public class UserController{
	@Resource
	private IUserService userService;
	
	/*@ResponseBody
	@RequestMapping(value="/login2", method = RequestMethod.POST)
	public Map<String,Object> login2( UserEntity user){
		Map<String,Object> map = new HashMap<String,Object>();
		System.out.println(user.toString());
		boolean loginResult = userService.isExist(user);
		map.put("loginResult", loginResult);
		return map;
	}*/
	
	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public Map<String,Object> login(HttpServletRequest request, TUser user){
		Map<String,Object> map = new HashMap<String,Object>();
		boolean loginResult = userService.isExist(user);
		if(loginResult) {
			request.getSession().setAttribute("user", userService.getUserInfoByLN(user.getLoginName()));
		}
		map.put("loginResult", loginResult);
		return map;
	}
	
	@SuppressWarnings("unchecked")
	@ResponseBody
	@RequestMapping(value="/getUserInfo", method = RequestMethod.POST)
	public Map<String,Object> getSessionUserInfo(HttpServletRequest request){
		Map<String,Object> map = (Map<String,Object>)request.getSession().getAttribute("user");
		if(!ValueUtil.valNotNullAndEmpty(map)) {
			map = new HashMap<String,Object>();
			map.put("result", "error");
			map.put("msg", "session中的用户为空");
		} else {
			map.put("result", "success");
		}
		return map;
	}
}
