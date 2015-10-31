/**
 * @Title: DataUtils.java
 * @Package com.letsball.utils
 * @Description: TODO(用一句话描述该文件做什么)
 * @author Rex
 * @date 2015年10月10日
 * @version V1.0
 */
package com.letsball.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: DataUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Rex
 * @date 2015年10月10日
 *
 */
public class DataUtils {

	/**
	 * 生成随机九位数
	 * 
	 * @return
	 */
	public synchronized static int generate9() {
		int n = (int) (Math.random() * 900000000) + 100000000;
		return n;
	}

	/**
	 * Bean --> Map 1: 利用Introspector和PropertyDescriptor 将Bean 转换成 Map
	 *
	 * @param obj
	 * @return
	 */
	public static Map<String, Object> transBean2Map(Object obj) {

		if (obj == null) {
			return null;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
			PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				String key = property.getName();

				// 过滤class属性
				if (!key.equals("class")) {
					// 得到property对应的getter方法
					Method getter = property.getReadMethod();
					Object value = getter.invoke(obj);
					map.put(key, value);
				}
			}
		} catch (Exception e) {
			System.out.println("transBean2Map Error " + e);
		}
		return map;
	}
}
