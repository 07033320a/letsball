/**
 * 
 */
package com.letsball.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsball.dao.IUserDao;
import com.letsball.model.UserEntity;
import com.letsball.service.IUserService;

/**
 * @author letsball
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public boolean isExist(UserEntity user) {
		return userDao.isExist(user);
	}

}
