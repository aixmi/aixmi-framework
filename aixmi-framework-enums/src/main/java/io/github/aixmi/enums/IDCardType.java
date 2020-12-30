package io.github.aixmi.enums;

/**
 * 证件类型
 * 1: 身份证
 * 2. 户口簿
 * 3. 护照
 * 4 港澳居民来往内地通行证
 * 5 台湾同胞来往内地通行证
 * 6 香港身份证
 * 7 澳门身份证
 * 8 台湾身份证
 * 9 其他个人证件
 */
public enum IDCardType {
	//
	ID_CARD(1, "身份证"),
	ACCOUNT_BOOK(2, "户口簿"),
	PASSPORT(3, "护照"),
	GA_TO_MAINLAND(4, "港澳居民来往内地通行证"),
	TW_TO_MAINLAND(5, "台湾同胞来往内地通行证"),
	ID_CARD_HK(6, "香港身份证"),
	ID_CARD_MACAO(7, "澳门身份证"),
	ID_CARD_TW(8, "台湾身份证"),
	ID_CARD_OTHER(9, "其他个人证件");

	private int code;
	private String desc;

	IDCardType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static IDCardType getByCode(int code) {
		for (IDCardType obj : IDCardType.values()) {
			if (obj.getCode() == code) {
				return obj;
			}
		}
		return null;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
