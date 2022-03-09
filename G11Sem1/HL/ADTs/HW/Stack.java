/*
 * Stack.java
 * 
 * Class to define the structure and behaviour of
 * a linked stack abstract data structure/type
 * 
 */


public class Stack
{
	Node top;
	
	public boolean isEmpty()
	{	// top == null is a boolean expression that will return TRUE or FALSE. This is an shortcut of if..else
		return top == null;
	}
	
	public void push(int n)
	{
		Node newNode = new Node(); // create a node to push
		newNode.data = n;  // place the data in the new node
		if( isEmpty() )
		{
			top = newNode;
		} else
		{
			newNode.next = top;
			top = newNode;
		}
	}
	
	// Classwork: write the pop method:
	public int pop()
	{
		if( !isEmpty() )
		{	int n = top.data;
			top = top.next;
			return n;
		}
		return 0;
	}
	
}


