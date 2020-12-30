package io.github.aixmi.enums;

/**
 * 系统默认
 */
public enum StatusDeFultEnum {
	//
	CANCEL("cancel", "注销"),
	DISABLE("disable", "无效"),
	ENABLE("enable", "有效"),
	LOCKED("locked", "锁定");

	private String code;

	private String message;

	private StatusDeFultEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
