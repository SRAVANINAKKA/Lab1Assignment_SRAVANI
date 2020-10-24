import java.util.Arrays;
import java.util.Scanner;
	
	public class arrayofstring {

		public static void main(String[] args) {
			String[] names = new String[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the names: ");
			for (int i=0;i<((names.length/2)+1 );i++ ) {
				names[i] = sc.next();
			}
			for(int i=((names.length/2)+1 );i<names.length;i++) {
				names[i]=sc.next();
		    }
			Arrays.sort(names);
			for (int i=0;i<names.length ;i++) {
				System.out.println("Name are " + names[i]);
			}
		}
	
}
