package io.github.aixmi.enums;

public enum OFileTypeEnum {

	//
	PICTURE("picture", "图片", "jpg,png,gif,jpeg"),
	VIDEO("video", "视频", "mp4,avi,mpg,mkv,mv,mov"),
	VOICE("voice", "音频", "mp3,wav"),
	APP("app", "程序", "apk,ipa"),
	DOCUMENT("document", "文档", "doc,docx,xls,xlsx,pdf,txt,json"),
	OTHER("other", "其它", "");

	private String code;
	private String message;
	private String extentions;

	OFileTypeEnum(String code, String message, String extentions) {
		this.code = code;
		this.message = message;
		this.extentions = extentions;
	}

}
