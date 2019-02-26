package com.algos.ds.lists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {
	
	
	
	@Test
	public void testCreate()
	{
		
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		assertEquals(list.size(),7);
		
		
		
		
	}

}
