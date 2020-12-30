package io.github.aixmi.enums;

public enum UserTypeEnum {
	//
	PERSONAL("personal", "个人"),
	ENTERPRISE("enterprise", "企业"),
	;

	private final String code;

	private final String message;

	private UserTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
}
