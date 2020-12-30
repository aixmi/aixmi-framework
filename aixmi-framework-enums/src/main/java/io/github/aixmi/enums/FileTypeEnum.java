package io.github.aixmi.enums;

public enum FileTypeEnum {
	//
	SFZPIC("sfzpic", "身份证图片"),
	FRONT("front", "身份证正面图片"),
	BEHIND("behind", "身份证背面图片"),
	BANK("bank", "银行卡图片"),
	FACEVIDEO("facevideo", "人脸识别视频"),
	COMMONVIDEO("commonvideo", "通用视频"),
	COMMONPIC("commonpic", "通用图片"),
	DRIVEPIC("drivepic", "驾驶证图片"),
	DRIVEBACK("driveback", "驾驶证背面"),
	DRIVEFRONT("drivefront", "驾驶证正面"),
	CARDOCUMENT("cardocument", "车辆图片"),
	CONTRACTDOCUMENT("contractdocument", "合同文件"),
	OTHERDOCUMENT("otherdocument", "其他资料"),
	PICTURE_APPROVAL("picture_approval", "审批图片"),
	SUPPLEINFORMATION("suppleinformation", "补充资料"),
	LESSEEINFO("lesseeInfo", "承租人资料"),
	LETTEROFCREDIT("letterOfCredit", "征信预审书"),
	LETTEROFCREDIT1("letterOfCredit1", "征信第一页"),
	LETTEROFCREDIT2("letterOfCredit2", "征信第二页"),
	//20190520新增附件类型
	VEHICLEEDITION("vehicleEdition", "车辆大本"),
	BANKCARDBACKANDFRONT("bankcardBackAndFront", "银行卡正反面"),
	MENTIONDATA("mentionData", "提额资料"),
	APPLICATIONFORM("applicationForm", "申请表"),
	INVESTIGATIONDATA("investigationData", "实地调查资料"),
	INSURANCEPIC("insurancePic", "保单图片"),
	COPYOFDRIVINGLICENSE("copyOfDrivingLicense", "行驶证副本"),
	AFTERTRANSFER("afterTransfer", "过户后登记证书"),
	VEHICLERECEIVINGORDER("vehicleReceivingOrder", "车辆接收单"),
	PAYMENTCERTIFICATE("paymentCertificate", "保证金付款凭证"),
	ECEIPTRECEIPTS("eceiptReceipts", "收款收据"),
	FIRST_EXAMINE("first_examine", "初审"),
	REEX_AMINE("reex_amine", "复审"),
	GPS_PHOTO("gps_photo", "GPS安装图片"),
	CAR_KEY_PHOTO("car_key_photo", "车钥匙照片"),
	MARR_IMG("marr_img", "结婚证或证明材料"),
	CONTRACTDOCUMENT_VEHICLESALES("contractdocument_vehicleSales", "二手车买卖合同"),
	CONTRACTDOCUMENT_FINANCIALLEASE("contractdocument_financialLease", "融资租赁合同"),
	CONTRACTDOCUMENT_BANKCARD("contractdocument_bankCard", "代持协议(买方与宗道汽服签署)"),
	CONTRACTDOCUMENT_FEENOTIFICATIONLETTER("contractdocument_feenotificationletter", "融资租赁金额确认函"),
	POLICY_IMG("policy_img", "保单"),
	SUPPORTING_MATERIALS("supporting_materials", "垫资资金佐证材料"),
	SPECIAL_MATERIALS("special_materials", "特批资料"),
	LOAN_CONFIRM("loan_confirm", "放款确认表"),
	CONTRANCTDOCUMENT_VECHICLE_FINANCIAL("contractdocument_vechicle_financial", "汽服与融资租赁合同"),
	SP_EXAMINE_DOCUMENT("sp_examine_document", "SP文档"),
	EXAMINE_DOCUMENT("examine_document", "审批文档");


	private final String code;

	private final String message;

	private FileTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}


}
