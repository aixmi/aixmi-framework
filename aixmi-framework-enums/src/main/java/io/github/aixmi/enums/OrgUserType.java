package io.github.aixmi.enums;

/**
 * 企业用户类型
 */
public enum OrgUserType {
	//
	HIGH_MANAGER(1, "高管"),
	SHAREHOLDER(2, "股东"),
	BENEFICIARY(3, "收益人");

	private int code;
	private String desc;

	OrgUserType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
