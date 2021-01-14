package io.github.aixmi.core.ds;

import lombok.Data;

/**
 * @author xyk
 * @date 2021-01-14 下午 16:03
 */
@Data
public class KVItem<K, V> {

	private K key;
	private V val;
}
