/**
 * @Title: TeamManageSvcImpl.java
 * @Package com.letsball.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Rex
 * @date 2015年10月10日
 * @version V1.0
 */
package com.letsball.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsball.dao.TTeamFootballMapper;
import com.letsball.entity.TTeamFootball;
import com.letsball.entity.TTeamFootballExample;
import com.letsball.service.ITeamManageSvc;

/**
 * @ClassName: TeamManageSvcImpl
 * @Description: 球队管理Svc实现类
 * @author Rex
 * @date 2015年10月10日
 *
 */
@Transactional
@Service("teamService")
public class TeamManageSvcImpl implements ITeamManageSvc {

	@Autowired
	public TeamManageSvcImpl(TTeamFootballMapper mapper) {
	}

	@Resource
	private TTeamFootballMapper teamFootballMapper;

	/**
	 * (重写方法功能描述)获取球队List
	 *
	 * @param map
	 * @return
	 * @see com.letsball.service.ITeamManageSvc#getTeamList(java.util.Map)
	 */
	@Override
	public List<TTeamFootball> getTeamList(Map<String, String> map) {
		TTeamFootballExample teamFootballExample = new TTeamFootballExample();
		teamFootballExample.createCriteria().andDelsignEqualTo(new Short("0"));
		List<TTeamFootball> tTeamFootballs = teamFootballMapper.selectByExample(teamFootballExample);
		System.out.println(tTeamFootballs);
		return tTeamFootballs;
	}

}
