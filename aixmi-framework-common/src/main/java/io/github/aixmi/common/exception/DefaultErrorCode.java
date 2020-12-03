package io.github.aixmi.common.exception;

import lombok.AllArgsConstructor;

/**
 * @author mcqj
 * @date 2020-11-24 下午 17:35
 */
@AllArgsConstructor
public enum DefaultErrorCode implements I18nErrorCode {
	//
	BIZ_EX("4000", "ex.common.biz", "业务繁忙，请稍后再试"),

	SYS_EX("5000", "ex.common.sys", "系统繁忙，请稍后再试"),
	;

	private final String code;
	private final String i18nCode;
	private final String msg;


	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}

	@Override
	public String getI18nCode() {
		return i18nCode;
	}
}
