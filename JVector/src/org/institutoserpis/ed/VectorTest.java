package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

//	@Test
//	public void indexOf() {
//		int[] v = new int [] {9,15,7,12,6};
//		assertEquals(0, Vector.indexOf(v, 9));
//		assertEquals(2, Vector.indexOf(v, 7));
//		assertEquals(4, Vector.indexOf(v, 6));
//
//	}
//	
//	@Test
//	public void indexOfEmpty() {
//		int [] v = new int[] {};
//		assertEquals(-1, Vector.indexOf(v, 7));
//
//	}
//	
//	@Test
//	public void min () {
//		assertEquals(6, Vector.min(new int [] {9,15,7,12,6}));	
//		assertEquals(7, Vector.min(new int [] {9,15,7,12,16}));	
//		assertEquals(9, Vector.min(new int [] {9,15,17,12,16}));	
//
//	}
//	
//	
//	@Test
//	public void selectionSort() {
//		int[] v = new int[] {9,15,7,12,6};
//		Vector.selectionSort(v);
//		assertArrayEquals(new int[] {6,7,9,12,15},v);
//	}
//	
//	}
	
	@Test
	public void sum() {
		assertEquals(49,Vector.suma(new int [] {9,15,7,12,6}));
		assertEquals(0,Vector.suma(new int [] {}));

	}

	@Test
	public void indexOfMin() {
		assertEquals(4,Vector.indexOfMin(new int [] {9,15,7,12,6}));
		assertEquals(0,Vector.indexOfMin(new int [] {9,15,17,12,16}));

	
	}

}

