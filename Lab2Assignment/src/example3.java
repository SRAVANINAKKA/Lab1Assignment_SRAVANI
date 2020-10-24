import java.util.Arrays;
import java.util.Scanner;
public class example3 {
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[5];
			System.out.println("Enter array values:");
			for(int i=0;i<5;i++) {
			  a[i]=sc.nextInt();
			  }
			example3 obj=new example3();
			obj.revArray(a);
		}

	void revArray(int a[])
	{
			String str=Arrays.toString(a);
			
		    Arrays.sort(a);
		    System.out.println("sorted array is:"+Arrays.toString(a));
		    
		}


	}