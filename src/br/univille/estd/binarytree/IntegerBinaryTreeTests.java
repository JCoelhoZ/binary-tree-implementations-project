package br.univille.estd.binarytree;

import org.junit.Assert;
import org.junit.Test;


public class IntegerBinaryTreeTests {
	private IntegerBinaryTreeImpl impl;

	@Test
	public void Add(){
		impl.add(123);
		impl.add(666);
		impl.add(244);
		Assert.assertTrue(impl.contains(123));
		Assert.assertEquals(3, size());
	}

	@Test
	public void testRemove() {
		impl.add(666);
		impl.add(123);
		impl.add(245);
		impl.remove(123);
		Assert.assertTrue(impl.contains(123));
		Assert.assertEquals(3, impl.size());
	}

}