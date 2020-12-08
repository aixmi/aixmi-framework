package io.github.aixmi.tool.base;

import lombok.experimental.UtilityClass;

/**
 * @author mcqj
 * @date 2020-11-17 下午 12:56
 */
@UtilityClass
public class StringUtil {


	public static boolean isEmpty(String source) {
		return source == null || source.isEmpty();
	}

	public static boolean isNotEmpty(String source) {
		return !isEmpty(source);
	}

	public static boolean isNull(String source) {
		return ObjectUtil.isNull(source);
	}

	public static boolean isNotNull(String source) {
		return !isNull(source);
	}
}
