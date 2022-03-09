public class Queue {
	NodeString head;
	NodeString tail;
	public boolean isEmptyy()
	{
		return head == null;
	}
	public void enqueue(String n)
	{
		NodeString newNode = new NodeString(); // create a node to endqueue
		newNode.data = n;  // place the data in the new node
		if( isEmptyy() )
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
		if( !isEmptyy() )
		{	String n = head.data;
			head = head.next;
			return n;
		}
		return null;
	} 
	
	public static void main (String[] args) {
		Queue newQueue = new Queue();
		newQueue.enqueue("Hello");
		System.out.println(newQueue.dequeue());
	}
}
