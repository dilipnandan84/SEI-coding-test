package com.dns.sei;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DeDupTest {

	public static Integer inputArr[] = {9,4,5,2,6,4,2,5,3,2};
	
	@Test
	public void testRemoveDuplicatesHashMap() {
		System.out.println("UnitTest Case 'HashSet'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.removeDuplicatesHashMap(inputArr);
		assertTrue("Number of Elements Matched", oArr.length == 6);
	}

	@Test
	public void testRemoveDuplicatesTreeSet() {
		Integer[] expected = {2,3,4,5,6,9};
		System.out.println("UnitTest Case 'TreeSet'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.removeDuplicatesTreeSet(inputArr);
		assertTrue("Set Sorted", oArr[0] < oArr[1] && oArr[1]<oArr[2] && 
				oArr[2]<oArr[3] && oArr[3]<oArr[4] && oArr[4]<oArr[5] && oArr[5]<oArr[6]);
	}

	@Test
	public void testRemoveDuplicates() {
		Integer[] expected = {9,4,5,2,6,3};
		System.out.println("UnitTest Case 'Array'");
		DeDup deDup = new DeDup();
		Integer[] oArr = deDup.removeDuplicates(inputArr);
		assertTrue("Set order preserved..", expected[0]==oArr[0] && expected[1]==oArr[1] && 
			expected[2]==oArr[2] && expected[3]==oArr[3] && expected[4]==oArr[4] && expected[5]==oArr[5]);
	}

	@Test
	public void testPrintArray() {
		System.out.println("Printing 'HashSet'");
		DeDupMain deDupMain = new DeDupMain();
		DeDup deDup = new DeDup();
		deDupMain.printArray( deDup.removeDuplicates(inputArr) );
		
		assertTrue("Printing Array", true);
	}

}
