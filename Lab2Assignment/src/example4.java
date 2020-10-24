import java.util.Arrays;
import java.util.Scanner;
	
public class example4 {
	
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      int[] a = new int[5];
	      int[] b = new int[5];
	      System.out.println("Enter the elements of the array ::");
	      for(int i=0; i<5; i++) {
	         a[i] = sc.nextInt();
	      }
	      System.out.println("The array created is ::"+Arrays.toString(a));
	      for(int i=0; i<5; i++) 
	      {
	         for (int j=0; j<5; j++) 
	         {
	        	 if(a[i]!=a[j])
	             {
	        		 b[i++]=a[i];
	             }
	         }
	      }
	      System.out.println("Array after removing elements ::"+Arrays.toString(b));
	   }
	}
	

