import java.util.*;
import java.util.Scanner;
public class SumofCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		SumofCubes t=new SumofCubes();
		int n=sc.nextInt();
		int result=t.SumofCubes(n);
		System.out.println(result);
 }
	  int SumofCubes(int n)
	  {
		  int sum=0;
		  for(int i=1;i<=n;i++)
		  {
			  sum=sum+i*i*i;
		  }
		  return sum;
	  }

}
