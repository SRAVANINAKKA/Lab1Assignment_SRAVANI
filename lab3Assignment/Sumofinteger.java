package lab3Assignment;
import java.util.Scanner;
public class Sumofinteger {
public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the numbers");
			String input=in.next();
			String array[]=input.split(",");
			int sum=0;
			 for(String str:array)
			 {
				 sum+=Integer.parseInt(str);
			 }
	      System.out.println("Sum of the Integers: "+sum);
		}
}
	