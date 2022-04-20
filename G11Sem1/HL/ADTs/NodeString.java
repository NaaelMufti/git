

public class NodeString
{
	String data;
	NodeString next; //self-referential data structure, or basically just a reference variable that is null in default but if you make a new node and define the Node.next = newnode or smth like that then that next is basically stores the address 

	public boolean hasNext()
	{
		return next != null;
	}
	
	public NodeString()
	{	}
	
	public NodeString(String s)
	{
		data = s;
		next = null;
	}

}


