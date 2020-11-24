package io.github.aixmi.common.web.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcqj
 * @date 2020-11-24 上午 11:54
 */
@Data
public class PageQuery extends Query {

	private int page = 1;
	private int size = 10;
	private List<OrderDesc> orderDescs;


	public void addOrderDesc(OrderDesc orderDesc) {
		if (null == this.getOrderDescs()) {
			orderDescs = new ArrayList<>();
		}
		orderDescs.add(orderDesc);
	}

	public int getOffset() {
		return this.page > 0 ? (page - 1) * size : 0;
	}
}
