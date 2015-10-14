/**
 * @Title: ITeamManageSvc.java
 * @Package com.letsball.service
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Rex
 * @date 2015年10月10日
 * @version V1.0
 */
package com.letsball.service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: ITeamManageSvc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Rex
 * @date 2015年10月10日
 *
 */
public interface ITeamManageSvc {

	/**
	 * 获取球队List
	 *
	 * @param map
	 * @return
	 */
	public List<Map<String, Object>> getTeamList(Map<String, String> map);

	/**
	 * 获取球队信息
	 * 
	 * @param tID
	 * @return
	 */
	public Map<String, Object> getTeamInfo(String tID);

	/**
	 * 获取球队成员List
	 * 
	 * @param position
	 * @return
	 */
	public List<Map<String, Object>> getMemberList(String tid, String position);
}
