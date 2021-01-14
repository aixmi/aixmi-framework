package io.github.aixmi.enums;


import io.github.aixmi.core.ds.KVItem;

import java.util.List;
import java.util.Objects;

/**
 * @author mcqj
 * @date 2020-12-30 下午 16:41
 */
public interface KVEnum<K, V> {
	K getKey();

	V getValue();

	List<K> getKeys();

	List<V> getValues();

	default V getValueByKey(K k) {
		for (KVItem<K, V> kvkvItem : getAll()) {
			if (Objects.equals(k, kvkvItem.getKey())) {
				return kvkvItem.getVal();
			}
		}
		return null;
	}


	default boolean containsKey(K k) {
		return getKeys().contains(k);
	}

	default boolean containsValue(V v) {
		return getValues().contains(v);
	}

	KVEnum<K, V> getByKey(K k);

	List<KVItem<K, V>> getAll();

}
