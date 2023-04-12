/*
 * IBCollection class
 * 
 * Collection of elements - implementation of
 * chapter 4 collections [pseudocode level]
 * for practice and testing
 * 
 * note that a counter may be added as a member/attribute
 * to keep track of the size of the collection
 * 
 * v2.0 using generics and inner Element class
 * 
 */
 
public class IBCollection <T>
{
	Element start;
	Element current;
	// a counter could be added to keep track of the collection's size
	
	public IBCollection()
	{	this.start = null;
		this.current = null;
	}
	
	public boolean isEmpty()
	{	return start == null;
	}

	public boolean hasNext()
	{
		return current != null;
	}

	public <T> void addItem(T data)
	{
		Element newElement = new Element(data);
		if( isEmpty() ) // add first element
		{	start = newElement;
			current = start;
		} else {
			current.setNext(newElement);
			current = current.getNext();
		}
	}
	
	public T getNext()
	{
		T data = (T)current.getData();
		current = current.getNext();
		return data;
	}
	
	public T getData()
	{
		return this.getNext();
	}
	
	public void resetNext()
	{	this.current = this.start;
	}
	
	public String toString()
	{	String output = "[ ";
		resetNext();
		while( this.current != null ) // while(this.hasNext())
		{	String e = this.getNext().toString();
			output = output + e + "  ";
		}
		return output + "]";
	}
	
	public void print()
	{	this.resetNext();
		while( this.current.hasNext() )
		{	System.out.println(this.getNext().toString());
		}
	}
	
	
	public class Element <T>
	{
		private T data; // here we are using Java generics
		private Element next;
		
		public Element() { }
		
		public Element(T data)
		{	this.data = data;
			this.next = null;
		}
		
		public boolean hasNext()
		{	return this.next != null;
		}
		
		public Element getNext()
		{	return this.next;
		}
		
		public T getData()
		{	return this.data;
		}
		
		public void setNext(Element e)
		{	this.next = e;
		}
		
		public void setData(T data)
		{	this.data = data;
		}
		
		public String toString()
		{	return this.data.toString();
		}
	}
}

