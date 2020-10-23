
import java.io.*;
import java.util.*;

public class CalculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CalculateDifference s1= new CalculateDifference();
int input=sc.nextInt();
System.out.println(s1.calculate(input));
sc.close();
}
public int calculate (int n)
{
int sum=0,ps=0,res=0;
for(int i=0;i<=n;i++)
{
    ps=ps+(i*i);
    sum=sum+i;
}
int prod=sum*sum;
res=ps-prod;
return res;
}


	}


