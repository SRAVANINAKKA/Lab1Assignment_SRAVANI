package validatename;
import java.util.*;
public class ValidFullNameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name of an person");
		String firstname = sc.next(); // first name of an person
		System.out.println("Enter Last Name of an person");
		String lastname = sc.next(); // last name of an person
		
		sc.close(); // scanner close

		try {
			
			if (firstname == "" || firstname == null || lastname == "" || lastname == null) {

				throw new InvalidNameException("Please Enter Full Name of an person");
				
			} else if (firstname.matches(".*\\d.*") && lastname.matches(".*\\d.*")) { 
				throw new InvalidNameException("Enter Valid Full Name of an person");

			} else if (firstname.matches(".*\\d.*")) { 

				throw new InvalidNameException("Enter Valid First Name of an person");

			} else if (lastname.matches(".*\\d.*")) {

				throw new InvalidNameException("Enter Valid Last Name of an person");

			} else {
				System.out.println("Full Name of an Employee is " + firstname + " " + lastname);
			}
		} catch (InvalidNameException e) {
			
			System.out.println(e.getMessage());

		}
	}


	}


