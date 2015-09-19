/**
 * 
 */
package com.letsball.service;

import com.letsball.model.UserEntity;

/**
 * @author letsball
 */
public interface IUserService {
	public boolean isExist(UserEntity user);
}
