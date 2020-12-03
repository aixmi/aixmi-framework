package io.github.aixmi.tool;

import lombok.experimental.UtilityClass;

import java.util.Collection;

/**
 * @author mcqj
 * @date 2020-12-03 下午 13:08
 */
@UtilityClass
public class CollectionUtil {
	public static boolean isNull(Collection<?> collection) {
		return ObjectUtil.isNull(collection);
	}

	public static boolean isNotNull(Collection<?> collection) {
		return !isNull(collection);
	}

	public static boolean isEmpty(Collection<?> collection) {
		return isNull(collection) || collection.isEmpty();
	}

	public static boolean isNotEmpty(Collection<?> collection) {
		return !isEmpty(collection);
	}

	public static int sizeOf(Collection<?> collection) {
		return isEmpty(collection) ? 0 : collection.size();
	}

}
