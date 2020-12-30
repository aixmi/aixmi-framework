package io.github.aixmi.enums;


public enum OrgAttachFileType {
	//
	BUSINESS_ADD_PHOTO(1, "经营场所照片"),
	BUSINESS_ADDR_CERTIFICATION(2, "经营场地租赁合同/产权证明"),
	BUSINESS_LICENSE(3, "营业执照（带公章）"),
	BANK_PERMIT(4, "开户许可证(带公章）"),
	CONTACT_PHOTO(5, "合同照片"),
	CAR_FIX_QUALIFICATION(6, "汽修资质证明"),
	BUSINESS_LICENSE_COPY(7, "营业执照复印件（带公章）"),
	LEGAL_PERSON_ID_FACADE(8, "法定代表人身份证正面"),
	LEGAL_PERSON_ID_BACK(9, "法定代表人身份证反面"),
	LAST_YEAR_FINANCIAL_REPORT(10, "上一年度财务报表"),
	CONTRACT_SIGN_PAGE(11, "协议签署页"),
	OTHER_FILE(99, "其他资料");

	private int code;
	private String desc;

	OrgAttachFileType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
