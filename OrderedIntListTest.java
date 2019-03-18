package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrderedIntListTest 
{
	// state variables for use
	private OrderedIntList original;
	private OrderedIntList overLoaded;
	int varInt;
	
	// makes a new OrderedIntList called original
	// result: original will be no longer null
	
	@Test
	void testOrderedIntListOriginal() 
	{
		original = new OrderedIntList();
		assertNotNull(original);
	}

	// makes a new OrderedIntList called overLoaded
	// with size 4
	// result: overloaded will be no longer null	
	
	@Test
	void testOrderedIntListWithVarInt() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		assertNotNull(overLoaded);
	}
	
	// makes a new OrderedIntList called original
	// checks length
	// result: length will be size 0
	
	@Test
	void testLengthInitial() 
	{
		original = new OrderedIntList();
		int expected = 0;
		assertEquals(expected, original.length());
	}
	
	// makes a new OrderedIntList called original
	// inserts a value, then checks length
	// result: length will be length 1
	
	@Test
	void testLengthPost() 
	{
		original = new OrderedIntList();
		original.insert(1);
		int expected = 1;
		assertEquals(expected, original.length());
	}
	
	// makes a new OrderedIntList called original
	// checks size
	// result: size will be 10
	
	@Test
	void testSizeOriginal() 
	{
		original = new OrderedIntList();
		assertEquals(10,original.size());
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, checks size
	// result: length will be 4
	
	@Test
	void testSizeWithVarInt() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		assertEquals(varInt,overLoaded.size());
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 5 numbers, checks size
	// result: size will be 6
	
	@Test
	void testSizeInsertIncrement() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);
		overLoaded.insert(4);
		overLoaded.insert(5);
		int expected = 6;
		assertEquals(expected, overLoaded.size()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 3 numbers, and deletes 1
	// number, checks size
	// result: length will be 2
	
	@Test
	void testSizeDeleteDecrement() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);		
		overLoaded.delete(1);
		int expected = 2;
		assertEquals(expected, overLoaded.size()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 1 numbers, checks contents
	// result: contents will be "2"
	
	@Test
	void testInsertIntial() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(2);
		String expected = ("2");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 4 numbers in order, 
	// checks contents
	// result: contents will be "1 2 3 4"
	
	@Test
	void testInsertInOrder() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);
		overLoaded.insert(4);
		String expected = ("1 2 3 4");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 4 numbers out of order, 
	// checks contents
	// result: contents will be "1 2 3 4"
	
	@Test
	void testInsertOutOrder() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(4);
		overLoaded.insert(2);
		overLoaded.insert(3);
		String expected = ("1 2 3 4");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 5 numbers, 
	// checks contents
	// result: contents will be "1 2 3 4 5"

	@Test
	void testInsertIncrementLengthContents() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(4);
		overLoaded.insert(2);
		overLoaded.insert(5);
		overLoaded.insert(3);
		String expected = ("1 2 3 4 5");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 4 numbers, deletes the
	// first number, checks contents
	// result: contents will be "2 3 4"
	
	@Test
	void testDeleteStart() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);
		overLoaded.insert(4);
		overLoaded.delete(1);
		String expected = ("2 3 4");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 5 numbers, deletes the
	// last number, checks contents
	// result: contents will be "1 2 3"
	
	@Test
	void testDeleteEnd() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);
		overLoaded.insert(4);
		overLoaded.delete(4);
		String expected = ("1 2 3");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 5 numbers, deletes a
	// middle number, checks contents
	// result: contents will be "1 2 4"
	
	@Test
	void testDeleteMiddle() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);
		overLoaded.insert(4);
		overLoaded.delete(3);
		String expected = ("1 2 4");
		assertEquals(expected, overLoaded.toString()); 
	}
	
	// makes a new OrderedIntList called overLoaded
	// with size 4, inserts 3 numbers, deletes
	// a number, checks contents
	// result: contents will be "2 3"
	
	@Test
	void testDeleteDecrementLengthContents() 
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		overLoaded.insert(1);
		overLoaded.insert(2);
		overLoaded.insert(3);		
		overLoaded.delete(1);
		String expected = ("2 3");
		assertEquals(expected, overLoaded.toString()); 
	}

	// makes a new OrderedIntList called overLoaded
	// with length 4 checks contents
	// result: contents will be ""
	
	@Test
	void testToStringEmpty()
	{
		varInt = 4;
		overLoaded = new OrderedIntList(varInt);
		String expected = ("");
		assertEquals(expected, overLoaded.toString());
	}

}
