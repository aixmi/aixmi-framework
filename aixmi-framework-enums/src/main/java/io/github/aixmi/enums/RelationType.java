package io.github.aixmi.enums;

/**
 * 关系
 */
public enum RelationType {
	//
	NONE(0, "无关系或法人自己"),
	SPOUSE(1, "配偶"),
	CHILD(2, "子女"),
	COLLEAGUE(3, "同事"),
	FATHER(4, "父亲"),
	MOTHER(5, "母亲"),
	FRIEND(6, "朋友"),
	ORG_OPERATOR(7, "企业操作员"),
	BIZ_CONTACT(8, "业务联系人"),
	ORG_STAFF(9, "企业员工"),
	EMPLOYMENT(10, "雇佣"),
	FINANCE_STAFF(11, "财务人员"),
	STAFF(12, "员工"),
	LOVE(13, "亲属"),
	PARENT(14, "父母"),
	FAMLY(15, "家庭联系人");

	private int code;
	private String desc;

	RelationType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

}
