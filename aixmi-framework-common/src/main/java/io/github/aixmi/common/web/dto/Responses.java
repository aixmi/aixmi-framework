package io.github.aixmi.common.web.dto;

import java.util.Collection;

/**
 * @author mcqj
 * @date 2020-11-24 下午 14:03
 */
public class Responses {

	public static <T> SingleResponse<T> single(T data) {
		return SingleResponse.of(data);
	}

	public static <T> PageResponse<T> page(Collection<T> data, long total) {
		return PageResponse.of(data, total);
	}

	public static <T> CollectionResponse<T> collection(Collection<T> data) {
		return CollectionResponse.of(data);
	}

	public static Response success() {
		return Response.success();
	}


	public static Response fail(String code, String msg) {
		return Response.fail(code, msg);
	}


	public static Response success(String msg, String code) {

		return Response.success(msg, code);
	}

	public static Response build(String msg, String code, boolean isSuccess) {
		return Response.build(msg, code, isSuccess);
	}
}
