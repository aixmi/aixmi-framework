package io.github.aixmi.enums;

/**
 * 企业所有制类型
 */
public enum OrgOwnership {
	//
	COUNTRY_HOLD_COMPANY(1, "国有控股企业"),
	GROUP_HOLD_COMPANY(2, "集体控股企业"),
	PERSONAL_HOLD_COMPANY(3, "私人控股企业"),
	GAT_HOLD_COMPANY(4, "港澳台商控股企业"),
	FOREIGNER_HOLD_COMPANY(5, "外商控股企业");

	private int code;
	private String desc;

	OrgOwnership(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
