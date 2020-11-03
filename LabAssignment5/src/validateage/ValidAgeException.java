package validateage;
import java.util.*;

public class ValidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		// input from the user
		int age = sc.nextInt();
		// scanner close
		sc.close();
		try {
			
			if (age > 15) {
				System.out.println("Valid Person's age: " + age);
			} else {
				throw new InvalidAgeException(); 
			}
		} catch (InvalidAgeException e) {
			
			System.out.println(e.getMessage() + age);
		}
	}

}
