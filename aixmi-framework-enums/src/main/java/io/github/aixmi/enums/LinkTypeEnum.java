package io.github.aixmi.enums;

public enum LinkTypeEnum {
	//
	FATHER("father", "父亲"),
	MATHER("mather", "母亲"),
	SON("son", "儿子"),
	DAUGHTER("daughter", "女儿"),
	FRIEND("friend", "朋友"),
	SPOUSE("spouse", "配偶"),
	WORKMATE("workmate", "同事"),
	OTHER("other", "其他"),
	;

	private final String code;

	private final String message;

	private LinkTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
