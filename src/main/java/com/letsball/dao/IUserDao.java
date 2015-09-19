/**
 * 
 */
package com.letsball.dao;

import com.letsball.model.UserEntity;

/**
 * @author letsball
 */
public interface IUserDao {
	public boolean isExist(UserEntity user);
}
