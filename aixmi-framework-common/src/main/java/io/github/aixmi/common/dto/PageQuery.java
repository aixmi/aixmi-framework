package io.github.aixmi.common.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 * @date 2020-11-18 上午 11:18
 */
@Data
public class PageQuery implements Query {

	private int pageNum = 1;
	private int pageSize = 10;
	private boolean needTotalCount = true;
	private List<OrderDesc> orderDescs;
}
