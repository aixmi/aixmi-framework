package io.github.aixmi.enums;

/**
 * 状态：1-注销，2-正常，3-停用，4-冻结
 */
public enum StatusEnum {
	//
	CANCEL(1, "注销"),
	ENABLE(2, "正常"),
	PAUSE(3, "停用"),
	FROZEN(4, "冻结");

	private Integer code;

	private String message;

	private StatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
