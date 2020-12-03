package io.github.aixmi.tool;

import lombok.experimental.UtilityClass;

/**
 * @author mcqj
 * @date 2020-12-03 下午 13:05
 */
@UtilityClass
public class ObjectUtil {

	public static boolean isNull(Object o) {
		return o == null;
	}

	public static boolean isNotNull(Object o) {
		return o != null;
	}


}
