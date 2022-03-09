
public class Queue 
{
	NodeString head;
	NodeString tail;
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void enqueue(String n)
	{
		NodeString newNode = new NodeString(); // create a node to endqueue
		newNode.data = n;  // place the data in the new node
		if( isEmpty() )
		{
			head = newNode;
			tail = newNode;
		} 
		else
		{
			tail.next = newNode;
			tail = newNode;
			
		}
	}
	public String dequeue()
	{
		if( !isEmpty() )
		{	String n = head.data;
			head = head.next;
			return n;
		}
		return null;
	} 
	
	public void printQueue()
	{
		NodeString temp = head;
		System.out.println("head");
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("null");
	}

	
	public static void main (String[] args) 
	{
		Queue newQueue = new Queue();
		newQueue.enqueue("Hello");
		newQueue.printQueue();
	}
}

