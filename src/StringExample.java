
public class StringExample {

	public static void main(String[] args) {
		String s = "Manish Datta Salvi";//literal string defined
		String[] splitedstring = s.split(" "); // split() is the method of string which gets splitted into an array
		
		  for(int i=0;i<=splitedstring.length;i++) 
		  {
			  System.out.println(splitedstring[i]);//Print the string is sequence 
		  }
		  
		 
		System.out.println("Reverse Of Array String Is===========================");
		
		for(int i=splitedstring.length-1;i>=0;i--)
		{
		   System.out.println(splitedstring[i]);//Print the string is sequence

		}

	}

}
