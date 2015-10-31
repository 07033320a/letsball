/**
 * 
 */
package com.letsball.service;

import java.util.Map;

import com.letsball.entity.TUser;

/**
 * @author letsball
 */
public interface IUserService {
	public boolean isExist(TUser user);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	public Map<String, Object> getUserInfoByID(int userId);
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	public Map<String, Object> getUserInfoByLN(String loginName);
}
