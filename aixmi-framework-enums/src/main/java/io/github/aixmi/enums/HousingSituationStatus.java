package io.github.aixmi.enums;

/**
 * 住房情况-->1:自置 2:按揭 3:租房 4:亲属楼宇 5:集体宿舍 6:共有住宅
 */
public enum HousingSituationStatus {
	//
	OWN(1, "自置"),
	LOAN(2, "按揭"),
	LEASE(3, "租房"),
	LOVE(4, "亲属楼宇"),
	GROUP(5, "集体宿舍"),
	PUBLIC(6, "共有住宅");

	private int code;
	private String desc;

	HousingSituationStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}


}
