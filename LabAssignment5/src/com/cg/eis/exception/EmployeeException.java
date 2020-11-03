package com.cg.eis.exception;
import java.util.*;
public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		int salary = sc.nextInt(); //input from the user
		sc.close();//scanner close
		try {
			
			if (salary < 3000) {
				throw new SalaryException();
			} else {
				System.out.println("Salary of an Employee is " + salary); 
			}
		} catch (SalaryException e) {
			System.out.println(e.getMessage());
		}
	}

}
