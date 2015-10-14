package com.nstc.pattern.structure.composite;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nstc.pattern.structure.composite.Tree;
import com.nstc.pattern.structure.composite.TreeNode;

public class CompositeTest {

	@Test
	public void test() {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}
