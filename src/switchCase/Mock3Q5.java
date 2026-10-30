package switchCase;
import java.util.Scanner;
public class Mock3Q5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int choice = s.nextInt();
		switch(choice){
		case 1:System.out.println("Sum: "+(x+y));
		break;
		case 2:System.out.println("Difference: "+(x-y));
		break;
		case 3:System.out.println("Product: "+(x*y));
		break;
		case 4:
			if(y !=0)
			System.out.println("Division: "+((double)x/y));
			else
			System.out.println("Cannot divide by zero");
		break;
		case 5:
			if(y !=0)
			System.out.println("Remainder: "+(x%y));
			else
			System.out.println("Cannot take zero");
		break;
		default:System.out.println("Error");
		
		
			
		}

	}

}
