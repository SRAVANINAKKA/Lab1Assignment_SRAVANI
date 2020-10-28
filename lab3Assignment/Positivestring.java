package lab3Assignment;
import java.util.*;
public class Positivestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next().toLowerCase();
		if(CheckString(input).equals(input))
				System.out.println(input+" is positive String");
		else
			System.out.println(input+" is negative String");

	}	
	public static String CheckString(String input)
	{
		char array[]=input.toCharArray();
		Arrays.sort(array);
		String result=String.valueOf(array);
		return result;
	}
}