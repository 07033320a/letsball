/**
 * 2015年10月9日
 * TeamManageController.java
 * rex.wang
 */
package com.letsball.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.letsball.entity.TTeamFootball;
import com.letsball.service.ITeamManageSvc;

/**
 * @author rex.wang
 */
@Controller
@RequestMapping(value = "/teamManage")
public class TeamManageController {

	@Resource
	private ITeamManageSvc iTeamManageSvc;
	
	
	@InitBinder("tTeamFootball")    
    public void initBinder2(WebDataBinder binder) {    
            binder.setFieldDefaultPrefix("tTeamFootball.");    
    }

	@ResponseBody
	@RequestMapping(value = "/getTeamList", method = RequestMethod.POST)
	public Map<String, Object> getTeamList() {
		Map<String, String> map = new HashMap<String, String>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", iTeamManageSvc.getTeamList(map));
		return resultMap;
	}

	@ResponseBody
	@RequestMapping(value = "/getTeamInfo", method = RequestMethod.POST)
	public Map<String, Object> getTeamInfo(String tid) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", iTeamManageSvc.getTeamInfo(tid));
		return resultMap;
	}

	@ResponseBody
	@RequestMapping(value = "/getMemberList", method = RequestMethod.POST)
	public Map<String, Object> getMemberList(String tid, String position) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", iTeamManageSvc.getMemberList(tid, position));
		return resultMap;
	}

	@ResponseBody
	@RequestMapping(value = "/addTeamInfo", method = RequestMethod.POST)
	public Map<String, Object> addTeamInfo(@ModelAttribute("tTeamFootball") TTeamFootball tTeamFootball) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", iTeamManageSvc.addTeamInfo(tTeamFootball));
		return resultMap;
	}

}
