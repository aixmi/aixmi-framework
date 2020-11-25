package io.github.aixmi.tree;

import java.io.Serializable;
import java.util.List;

/**
 * @author mcqj
 * @date 2020-11-25 上午 11:16
 */
public interface ITreeNode extends Serializable {
	Long getId();

	Long getPid();

	List<ITreeNode> getChildren();
}
