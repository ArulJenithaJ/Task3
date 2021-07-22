package intro;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		int choice;
		System.out.println("Enter your choice: ");
		Scanner s =new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{
		case 1:System.out.println("You said HI!");
		       break;
		case 2:System.out.println("You said HELLO!");
		       break;
		case 3:System.out.println("You said HEY!");
	           break;
	    default:System.out.println("Invalid choice");
               break;	
		}
		

	}
}
