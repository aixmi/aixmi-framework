package io.github.aixmi.common.web.dto;

import lombok.Data;

/**
 * @author mcqj
 * @date 2020-11-24 上午 11:55
 */
@Data
public class SingleResponse<T> extends Response {

	private T data;

	public static <T> SingleResponse<T> of(T data) {
		SingleResponse singleResponse = new SingleResponse();
		singleResponse.setData(data);
		singleResponse.setSuccess(true);
		return singleResponse;
	}
}
