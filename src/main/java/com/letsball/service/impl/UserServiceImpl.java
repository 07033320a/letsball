/**
 * 
 */
package com.letsball.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsball.dao.IUserDao;
import com.letsball.dao.TUserMapper;
import com.letsball.entity.TUser;
import com.letsball.entity.TUserExample;
import com.letsball.service.IUserService;

/**
 * @author letsball
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	public UserServiceImpl(TUserMapper mapper) {
	}
	
	@Resource
	private IUserDao userDao;
	@Resource
	private TUserMapper tUserMapper;

	@Override
	public boolean isExist(TUser user) {
		boolean b = false;
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andLoginNameEqualTo(user.getLoginName());
		int i = tUserMapper.countByExample(tUserExample);
		if(i > 0) {
			b = true;
		}
		return b;
	}

}
