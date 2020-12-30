package io.github.aixmi.enums;

/**
 * 收入来源
 */
public enum SourceOfIncomeEnum {

	//
	SELFSUPPORT("selfsupport", "自营收入"),
	SALARY("salary", "工资收入"),
	OTHER("other", "其他收入");

	private final String code;

	private final String message;

	private SourceOfIncomeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
