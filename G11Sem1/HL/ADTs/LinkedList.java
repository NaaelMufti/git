/*
 * LinkedList.java
 * 
 * 
 */


public class LinkedList
{
	NodeString start;
	
	// this method creates an empty linked list
	public LinkedList() { }
	
	// this method creates a list
	// with its initial element
	public LinkedList(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		start = newNode;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}

	public void append(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		if( isEmpty() )
		{	
			start = newNode;
		} else {
			NodeString temp = start;
			while( temp.hasNext() ) // temp.next != null
			{	temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void delete(String data)
	{
		NodeString temp = start;
		NodeString prev = null;
		
		while (temp != null && temp.data != data) 
		{
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = temp.next;
	}
	
	public void insertAfter(String dataOfNodeToFind, String newData)
	{
		/*
		NodeString temp = new Node(newData);
	 
		
		newData.next = dataOfNodeToFind.next; // im an idiot (doesn't work at all)
	 
		
		dataOfNodeToFind.next = temp;
		*/ 
	}
	public void printList()
	{
		if( isEmpty() )
		{	System.out.println("List empty");
			return;
		}
		NodeString temp = start;
		System.out.print("Start -> ");
		while( temp != null )
		{
			System.out.print( temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println( " NULL ");
	}
	/* Homework for next lesson:
	 * add a delete() method
	 * add to the main method a test deleting 6 strings,
	 * including one not in the list, and
	 * print the list each time you add a string to it
	 */
	
}

