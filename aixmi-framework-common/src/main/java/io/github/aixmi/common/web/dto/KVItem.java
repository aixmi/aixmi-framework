package io.github.aixmi.common.web.dto;

import lombok.Data;

@Data
public class KVItem<K, V> {
	private K key;
	private V val;
}
