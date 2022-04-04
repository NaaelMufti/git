
public class LinkedList 
{
	NodeString start;
	
	//public LinkedList() { } 
	/* if we leave the empty constructor here, we would have to check for an empty list
	 * before adding elemts (first element of an empty list becomes the start/head element
	 */
	
	// this method already takes care of creating a list with its initial element
	
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
		
		if( start == null)
		{
			start = newNode;
		} else 
		{
			NodeString temp = start;
			while( temp.hasNext())
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public static void main (String[] args) 
	{
		
	}
}

