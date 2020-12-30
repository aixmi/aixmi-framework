package io.github.aixmi.enums;


public enum MaritalStatusEnum {
	//
	MARRIED(1, "已婚"),
	UNMARRIED(2, "未婚"),
	DIVORCE(3, "离异"),
	WIDOWED(4, "丧偶");

	private int code;

	private String message;

	private MaritalStatusEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

