package io.github.aixmi.common.web.dto;

import lombok.Data;

import java.util.Collection;

/**
 * @author mcqj
 * @date 2020-11-24 下午 13:30
 */
@Data
public class CollectionResponse<T> extends Response {
	private Collection<T> data;

	public static <T> CollectionResponse<T> of(Collection<T> data) {
		CollectionResponse<T> page = new CollectionResponse<>();
		page.setSuccess(true);
		page.setData(data);
		return page;
	}
}
