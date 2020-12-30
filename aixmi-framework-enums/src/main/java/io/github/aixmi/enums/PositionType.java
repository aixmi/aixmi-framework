package io.github.aixmi.enums;

/**
 * 职务
 */
public enum PositionType {
	//
	CHAIRMAN(1, "公司董事长"),
	CEO(2, "公司总经理/厂长/CEO"),
	CFO(3, "财务主管/CFO"),
	AUTHORIZED_MANAGER(4, "授权经办人"),
	DEPARTMENT_MANAGER(5, "部门经理"),
	DIRECTOR(6, "董事"),
	SUPERVISOR(7, "监事"),
	ACTUAL_CONTROLLER(8, "实际控制人"),
	LEGAL_PERSON_POSITION(9, "法人代表");

	private int code;
	private String desc;

	PositionType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
