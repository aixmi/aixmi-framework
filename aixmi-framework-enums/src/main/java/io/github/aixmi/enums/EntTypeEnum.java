package io.github.aixmi.enums;


public enum EntTypeEnum {
	//
	COUNTRY_ENT("country_ent", "国企"),
	LISTED_COMPANY("listed_company", "上市公司"),
	PRIVATE_ENT("private_ent", "私人企业"),
	FREEDOM("freedom", "自由职业");


	private String code;

	private String message;

	private EntTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}

}
