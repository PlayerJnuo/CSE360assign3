/**	
 *	Name: Eric Kim
 *	ClassID: 438
 *	Assignment #: 3
 *	Description: The OrderedIntList class inserts an integer into a
 *				 list in ascending order. It should not take any
 *				 duplicate values. If the array is full, then the
 *				 value is inserted and length is increased by 1/2 of
 *				 of the length. If deleting elements, and the array is
 *				 1/2 empty, the length is reduced by 1/2. When the array
 *				 is to be printed, it is printed in form "number space
 *				 number space number", or returns an empty string if empty.
 */

package cse360assign3;

public class OrderedIntList 
{	
	private int[] array;
	private int counter;
	
	/**
	 *	Constructor for OrderedIntList
	 *	makes an int array of size 10
	 */
	
	public OrderedIntList ()
	{
		array = new int[10];
		counter = 0;
	}
	
	/**
	 * Overloaded constructor for OrderedIntList
	 * makes an int array of size "size".
	 * 
	 * @param the size of the array.
	 */
	
	public OrderedIntList(int size)
	{
		array = new int[size];
		counter = 0;
	}
	
	/**
	 * Inserts an integer input into the OrderedIntList 
	 * array of size 10 in ascending order. It continues
	 * after the max length value by extending the size 
	 * of the array by 1/2 of its original length, while
	 * excluding duplicate values.
	 * 
	 * It first checks the position in which to insert
	 * the value in the array, finding position by
	 * comparison. If the number is found to be a duplicate
	 * then no operation will happen.
	 * 
	 * @param number An integer input
	 */
	
	public void insert (int number) 
	{
		int position = 0;
		boolean duplicate = false;
		
		if (size() == length())
		{
			int[] temp = new int[length()];
			for (int iterator = 0; iterator < size(); iterator ++)
			{
				temp[iterator] = array[iterator];
			}
			array = new int[length() + (length() / 2)];
			for (int iterator = 0; iterator < temp.length; iterator++)
			{
				array[iterator] = temp[iterator];
			}
		}
		
		for (int iterator = 0; iterator < counter; iterator++)
		{
			if (number > array[iterator]) 
			{
				position++;
			}
			if (number == array[iterator])
			{
				duplicate = true;
			}
		}
		
		if (duplicate == false)
		{
			for (int iterator = size(); iterator > position; iterator--)
			{
				array[iterator] = array[iterator - 1];
			}
			array[position] = number;
			counter++;
		}
	}
	
	/**
	 * Returns the amount of values in the array.
	 * 
	 * @return the amount of values in the array.
	 */
	
	public int size ()
	{
		int length = 0;
		length = array.length;
		return length;
	}
	
	/**
	 * Returns the length the array.
	 * 
	 * @return the length of th array.
	 */
	
	public int length ()
	{
		int size = 0;
		size = counter;
		return size;	
	}
	
	/**
	 * Deletes the value with the key from the array
	 * while moving all values past the key's point back
	 * and then decrements the length of the array
	 * if it is more than 50% empty.
	 * 
	 * @param the key to be deleted.
	 */
	
	public void delete (int key)
	{
		for (int iterator = 0; iterator < size(); iterator++)
		{
			if (array[iterator] ==  key)
			{
				for (int position = iterator; position < size() - 1; position++)
				{
					array[position] = array[position + 1];
				}
				array[size() - 1] = 0;
				counter--;
			}
		}
			
		if (size() == (length() / 2))
		{
			int[] temp = new int[length()];
			for (int iterator = 0; iterator < size(); iterator ++)
			{
				temp[iterator] = array[iterator];
			}
			array = new int[(length() / 2)];
			for (int iterator = 0; iterator < array.length; iterator++)
			{
				array[iterator] = temp[iterator];
			}
		}
	}
	
	/**
	 * Prints the contents of the array in form
	 * number space number space. Returns an empty
	 * string if the array is empty.
	 * 
	 * @return the contents of the array in a string.
	 */
	
	public String toString ()
	{
		StringBuilder line = new StringBuilder();
		line.append("");
		
		for (int iterator = 0; iterator < counter; iterator++) 
		{
			line.append(array[iterator]);
			if (iterator != counter - 1)
			{
				line.append(" ");
			}
		}
		return line.toString();
	}
	
	
}
