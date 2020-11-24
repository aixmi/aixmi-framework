package io.github.aixmi.common.exception;

/**
 * @author Administrator
 * @date 2020-11-24 下午 17:35
 */
public enum DefaultErrorCode implements IErrorCode {
	//
	BIZ_EX("ex.common.biz", "业务繁忙，请稍后再试"),

	SYS_EX("ex.common.sys", "系统繁忙，请稍后再试"),
	;

	private final String code;
	private final String msg;

	DefaultErrorCode(String code, String msg) {
		this.code = code;
		this.msg = msg;

	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getMsg() {
		return msg;
	}
}
