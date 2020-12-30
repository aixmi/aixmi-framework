package io.github.aixmi.enums;


public enum EduLevel {
	//
	PRIMARYSCHOOL(1, "小学"),
	MIDDLESCHOOL(2, "中学"),
	HIGHSCHOOL(3, "高中"),
	JUNIORCOLLEGE(4, "大专"),
	UNDERGRADUATE(5, "本科"),
	MASTER(6, "硕士"),
	DOCTOR(7, "博士"),
	GRADUATESTUDENT(8, "研究生");

	private int code;
	private String desc;

	EduLevel(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static EduLevel getByCode(int code) {
		for (EduLevel obj : EduLevel.values()) {
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
