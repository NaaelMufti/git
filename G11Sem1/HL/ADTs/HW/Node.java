public class Node{
	int data;
	Node next; //self-referential data structure, or basically just a reference variable that is null in default but if you make a new node and define the Node.next = newnode or smth like that then that next is basically stores the address 
	public Node ()
	{
		
	}
	public Node(int n)
	{
		data = n;
		next = null;
	}
	public boolean hasNext()
	{
		return next != null;
	}
	public static void main (String[] args) {
		Node test = new Node();
		System.out.println(test.hasNext());
		System.out.println(test.data);
		System.out.println(test.next);
		Node test2 = new Node();
	}
}

