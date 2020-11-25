package io.github.aixmi.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcqj
 * @date 2020-11-25 下午 14:54
 */
public class TreesTest {

	@Test
	public void tree() {
		List<CategoryTree> trees = new ArrayList<>();
		CategoryTree categoryTree = new CategoryTree();
		categoryTree.setId(1L);
		categoryTree.setPid(0L);
		categoryTree.setName("分类一");

		CategoryTree categoryTree2 = new CategoryTree();
		categoryTree2.setId(2L);
		categoryTree2.setPid(0L);
		categoryTree2.setName("分类er");

		CategoryTree categoryTree11 = new CategoryTree();
		categoryTree11.setId(3L);
		categoryTree11.setPid(1L);
		categoryTree11.setName("分类11");

		CategoryTree categoryTree21 = new CategoryTree();
		categoryTree21.setId(4L);
		categoryTree21.setPid(2L);
		categoryTree21.setName("分类21");

		CategoryTree categoryTree211 = new CategoryTree();
		categoryTree211.setId(5L);
		categoryTree211.setPid(4L);
		categoryTree211.setName("分类211");


		trees.add(categoryTree);
		trees.add(categoryTree11);
		trees.add(categoryTree2);
		trees.add(categoryTree21);
		trees.add(categoryTree211);


		List<CategoryTree> tree = Trees.tree(trees);
		System.err.println("");
	}

	@Test
	public void getTreeByPid() {
		List<CategoryTree> trees = new ArrayList<>();
		CategoryTree categoryTree = new CategoryTree();
		categoryTree.setId(1L);
		categoryTree.setPid(0L);
		categoryTree.setName("分类一");

		CategoryTree categoryTree2 = new CategoryTree();
		categoryTree2.setId(2L);
		categoryTree2.setPid(0L);
		categoryTree2.setName("分类er");

		CategoryTree categoryTree11 = new CategoryTree();
		categoryTree11.setId(3L);
		categoryTree11.setPid(1L);
		categoryTree11.setName("分类11");

		CategoryTree categoryTree21 = new CategoryTree();
		categoryTree21.setId(4L);
		categoryTree21.setPid(2L);
		categoryTree21.setName("分类21");

		CategoryTree categoryTree211 = new CategoryTree();
		categoryTree211.setId(5L);
		categoryTree211.setPid(4L);
		categoryTree211.setName("分类211");


		trees.add(categoryTree);
		trees.add(categoryTree11);
		trees.add(categoryTree2);
		trees.add(categoryTree21);
		trees.add(categoryTree211);


		List<CategoryTree> tree = Trees.getTreeByPid(trees, 2L);
		System.err.println("");
	}
}
