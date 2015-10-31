/**
 * 
 */
package com.letsball.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsball.dao.IUserDao;
import com.letsball.dao.TUserMapper;
import com.letsball.entity.TUser;
import com.letsball.entity.TUserExample;
import com.letsball.service.IUserService;
import com.letsball.utils.DataUtils;
import com.letsball.utils.ValueUtil;

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
	
	@Override
	public Map<String, Object> getUserInfoByID(int userId) {
		TUser user = tUserMapper.selectByPrimaryKey(userId);
		return DataUtils.transBean2Map(user);
	}
	
	@Override
	public Map<String, Object> getUserInfoByLN(String loginName) {
		TUser user = new TUser();
		TUserExample tUserExample = new TUserExample();
		tUserExample.createCriteria().andLoginNameEqualTo(loginName);
		List<TUser> tUserList = tUserMapper.selectByExample(tUserExample);
		if(ValueUtil.valNotNullAndEmpty(tUserList)) {
			user = tUserList.get(0);
		}
		return DataUtils.transBean2Map(user);
	}

}
