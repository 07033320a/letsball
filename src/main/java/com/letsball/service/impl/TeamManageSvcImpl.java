/**
 * @Title: TeamManageSvcImpl.java
 * @Package com.letsball.service.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Rex
 * @date 2015年10月10日
 * @version V1.0
 */
package com.letsball.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.letsball.dao.TTeamFootballMapper;
import com.letsball.dao.TTeamFootballMemberMapper;
import com.letsball.dao.TUserMapper;
import com.letsball.entity.TTeamFootball;
import com.letsball.entity.TTeamFootballExample;
import com.letsball.entity.TTeamFootballMember;
import com.letsball.entity.TTeamFootballMemberExample;
import com.letsball.entity.TUser;
import com.letsball.entity.TUserExample;
import com.letsball.service.ITeamManageSvc;
import com.letsball.utils.DataUtils;
import com.letsball.utils.DateUtils;
import com.letsball.utils.GlobalConst;
import com.letsball.utils.ValueUtil;

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
	@Resource
	private TTeamFootballMemberMapper teamFootballMemberMapper;
	@Resource
	private TUserMapper tUserMapper;

	/**
	 * (重写方法功能描述)获取球队List
	 *
	 * @param map
	 * @return
	 * @see com.letsball.service.ITeamManageSvc#getTeamList(java.util.Map)
	 */
	@Override
	public List<Map<String, Object>> getTeamList(Map<String, String> map) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		TTeamFootballExample teamFootballExample = new TTeamFootballExample();
		teamFootballExample.createCriteria().andDelsignEqualTo(
				GlobalConst.DEL_SIGN);
		List<TTeamFootball> tTeamFootballs = teamFootballMapper
				.selectByExample(teamFootballExample);
		if (ValueUtil.valNotNullAndEmpty(tTeamFootballs)) {
			for (TTeamFootball TTeamFootball : tTeamFootballs) {
				resultMap = DataUtils.transBean2Map(TTeamFootball);
				int tid = TTeamFootball.getTid();
				int totalMember = getTeamMemberNum(tid);
				resultMap.put("teamCreateDate", DateUtils.format(
						TTeamFootball.getTeamCreateDate(),
						DateUtils.FORMAT_SHORT_CN));
				resultMap.put("totalMember", totalMember);
				list.add(resultMap);
			}
		}
		return list;
	}

	/**
	 * 获取球队人数
	 *
	 * @param tid
	 * @return
	 */
	private int getTeamMemberNum(int tid) {
		TTeamFootballMemberExample teamFootballMemberExample = new TTeamFootballMemberExample();
		teamFootballMemberExample.createCriteria()
				.andDelsignEqualTo(GlobalConst.DEL_SIGN).andTIdEqualTo(tid);
		int totalMember = teamFootballMemberMapper
				.countByExample(teamFootballMemberExample);
		return totalMember;
	}

	/**
	 * 获取球队信息
	 *
	 * @param tID
	 * @return
	 * @see com.letsball.service.ITeamManageSvc#getTeamInfo(java.lang.String)
	 */
	@Override
	public Map<String, Object> getTeamInfo(String tID) {
		TTeamFootball teamFootball = teamFootballMapper
				.selectByPrimaryKey(Integer.valueOf(tID));
		Map<String, Object> map = DataUtils.transBean2Map(teamFootball);
		int totalMember = getTeamMemberNum(Integer.valueOf(tID));
		map.put("totalMember", totalMember);
		return map;
	}

	/**
	 * 获取球队成员列表
	 *
	 * @param position
	 * @return
	 * @see com.letsball.service.ITeamManageSvc#getMemberList(java.lang.String)
	 */
	@Override
	public List<Map<String, Object>> getMemberList(String tid, String position) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		TTeamFootballMemberExample tTeamFootballMemberExample = new TTeamFootballMemberExample();
		tTeamFootballMemberExample.createCriteria()
				.andDelsignEqualTo(GlobalConst.DEL_SIGN)
				.andMemberPositionEqualTo(position).andTIdEqualTo(Integer.valueOf(tid));
		List<TTeamFootballMember> tTeamFootballMemberList = teamFootballMemberMapper
				.selectByExample(tTeamFootballMemberExample);
		if (ValueUtil.valNotNullAndEmpty(tTeamFootballMemberList)) {
			for (TTeamFootballMember tTeamFootballMember : tTeamFootballMemberList) {
				map.putAll(DataUtils.transBean2Map(tTeamFootballMember));
				map.put("joinDate", DateUtils.format(tTeamFootballMember.getMemberJoinDate(), DateUtils.FORMAT_SHORT_CN));
				int id = tTeamFootballMember.getuId();
				TUserExample tUserExample = new TUserExample();
				tUserExample.createCriteria()
						.andDelsignEqualTo(GlobalConst.DEL_SIGN)
						.andIdEqualTo(id);
				List<TUser> tuList = tUserMapper.selectByExample(tUserExample);
				if (ValueUtil.valNotNullAndEmpty(tuList)) {
					map.put("userName", tuList.get(0).getUserName());
				}
				list.add(map);
			}
		}
		return list;
	}

}
