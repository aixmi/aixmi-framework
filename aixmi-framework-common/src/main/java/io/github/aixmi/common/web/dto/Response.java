package io.github.aixmi.common.web.dto;

import lombok.Data;

/**
 * @author mcqj
 * @date 2020-11-24 上午 11:54
 */
@Data
public class Response extends DTO {

	private static final Response SUCCESS;

	static {
		SUCCESS = new Response();
		SUCCESS.setSuccess(true);
	}

	private String code;
	private boolean success = false;
	private String msg;

	public static Response success() {
		return SUCCESS;
	}


	public static Response success(String msg, String code) {
		return build(msg, code, true);
	}

	public static Response build(String msg, String code, boolean isSuccess) {
		Response response = new Response();
		response.setSuccess(isSuccess);
		response.setCode(code);
		response.setMsg(msg);
		return response;
	}


	public static Response fail(String code, String msg) {
		return build(msg, code, false);
	}


}
