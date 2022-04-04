public class CountCharacter 
{
	
	public static void main (String[] args) {
		String word = "abracadabra";
		char whichOne = 'a';
		int counter = 0;
		System.out.print("Counting " + whichOne + " from " + word + " = ");
		
		for(int i = 0; i < word.length(); i++) 
		{
			if(word.charAt(i) == whichOne) 
			{
				counter++;
			}
		}
		System.out.println(counter);
	}
}
