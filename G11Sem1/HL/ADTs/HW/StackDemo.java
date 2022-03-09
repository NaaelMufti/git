public class StackDemo
{
	
	public static void main (String[] args)
	{
		/* Marcos Code
		Stack s = new Stack();
		s.push(3);
		System.out.println( s.isEmpty() );
		s.push(5);
		System.out.println( s.top.data );
		s.push(7);
		System.out.println( s.top.data );
		
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		System.out.println( s.isEmpty() );
		if(s.isEmpty() )
		{	System.out.println( "Stack is empty" );
		} else {
			System.out.println( s.pop() );
		}
		*/
		Stack s1 = new Stack();
		for (int i = 1; i<=5; i++)
		{
			s1.push(i);
		}
		while (!s1.isEmpty())
		{
			System.out.println(s1.pop());
		}
			
	}
	public void printStack()
	{
		
	}
}
