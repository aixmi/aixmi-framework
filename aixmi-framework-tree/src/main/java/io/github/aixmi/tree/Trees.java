package io.github.aixmi.tree;


import java.util.*;

/**
 * @author mcqj
 * @date 2020-11-25 上午 11:29
 */
public class Trees {
	private Trees() {

	}

	public static <T extends ITreeNode> List<T> tree(List<T> items) {
		List<T> result = new ArrayList<>();
		Map<Long, T> cacheMap = new HashMap<>();
		for (T item : items) {
			cacheMap.put(item.getId(), item);
		}

		for (Map.Entry<Long, T> entryMap : cacheMap.entrySet()) {
			T item = entryMap.getValue();
			Long pid = item.getPid();
			if (pid == null || pid == 0) {
				result.add(item);
			} else {
				T parentItem = cacheMap.get(pid);
				parentItem.getChildren().add(item);
			}
		}
		return result;
	}

	public static <T extends ITreeNode> List<T> getTreeByPid(List<T> items, Long pid) {
		List<T> result = new ArrayList<>();
		Map<Long, T> cacheMap = new HashMap<>();
		for (T item : items) {
			cacheMap.put(item.getId(), item);
		}

		for (Map.Entry<Long, T> entryMap : cacheMap.entrySet()) {
			T item = entryMap.getValue();
			Long parentId = item.getPid();
			if (Objects.equals(pid, parentId)) {
				result.add(item);
			} else {
				T parentItem = cacheMap.get(parentId);
				if (parentItem == null) {
					continue;
				}
				parentItem.getChildren().add(item);
			}
		}
		return result;
	}


}
