package io.github.aixmi.faker;

/**
 * @author mcqj
 * @date 2020-11-30 下午 13:56
 */
public class Fakes {

	public <T> T fake(Class<T> clazz) throws IllegalAccessException, InstantiationException {
		return clazz.newInstance();
	}

}
