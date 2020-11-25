package io.github.aixmi.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcqj
 * @date 2020-11-25 上午 11:17
 */
public abstract class AbstractTreeNode implements ITreeNode {

	private final List<ITreeNode> children = new ArrayList<>();

	@Override
	public List<ITreeNode> getChildren() {
		return children;
	}


}
