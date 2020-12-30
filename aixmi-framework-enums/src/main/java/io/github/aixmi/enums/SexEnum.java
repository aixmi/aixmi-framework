package io.github.aixmi.enums;


/**
 * 相别
 */
public enum SexEnum {
	//
	MALE("m", "男"),
	FEMALE("w", "女"),
	;

	private final String code;

	private final String message;

	private SexEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
