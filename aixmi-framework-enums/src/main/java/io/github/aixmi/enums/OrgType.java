package io.github.aixmi.enums;

/**
 * 机构类型
 */
public enum OrgType {
	//
	AGENT(1, "代理商"),
	BOSS(2, "运营平台"),
	INDIVIDUAL(3, "个体户企业"),
	LEGAL_PERSON(4, "法人企业"),
	NO_LEGAL_PERSON(5, "非法人企业"),
	INSTITUTION(6, "事业单位"),
	SOCIAL_GROUP(7, "社会团体"),
	PARTY_GOVERNMENT(8, "党政机关");

	private int code;
	private String desc;

	OrgType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
