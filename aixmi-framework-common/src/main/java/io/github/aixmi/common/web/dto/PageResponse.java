package io.github.aixmi.common.web.dto;

import lombok.Data;

import java.util.Collection;

/**
 * @author mcqj
 * @date 2020-11-24 下午 13:30
 */
@Data
public class PageResponse<T> extends Response {
	private long total;
	private Collection<T> data;


	public static <T> PageResponse<T> of(Collection<T> data, long total) {
		PageResponse<T> page = new PageResponse<>();
		page.setSuccess(true);
		page.setData(data);
		page.setTotal(total);
		return page;
	}
}
