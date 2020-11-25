package io.github.aixmi.tree;

/**
 * @author mcqj
 * @date 2020-11-25 下午 12:02
 */
public class CategoryTree extends AbstractTreeNode {

	private long id;
	private long pid;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "CategoryTree{" +
				"id=" + id +
				", pid=" + pid +
				", name='" + name + '\'' +
				'}';
	}
}
