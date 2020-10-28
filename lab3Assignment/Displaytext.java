package lab3Assignment;
import java.util.*;
public class Displaytext {
public static void main(String[] args) {
			System.out.println("Enter the text");
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			int countWord=0;
			int countLines=0;
			int countCharacter=0;
			String[] listWord=text.split("\\s+");
			countWord+=listWord.length;
			String[] LineList=text.split("[!?.:]+");
			countLines+=LineList.length;
		    countCharacter+=text.length();
		    System.out.println("Number of words:"+countWord+"\nNumber of Lines:"+ countLines+"\nNumber of  characters:"+countCharacter);			
}
}
