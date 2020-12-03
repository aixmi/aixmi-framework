package io.github.aixmi.common.exception;

/**
 * @author mcqj
 * @date 2020-11-24 下午 17:19
 */
public interface I18nErrorCode extends IErrorCode {

	/**
	 * 获取国际化用的异常编码
	 *
	 * @return 获取国际化用的异常编码
	 */
	String getI18nCode();
}
