package CSCodes;
import java.util.Scanner;
public class Mock2Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		if(x==0)
			System.out.println("Zero");
		else if(x>0 && x%2==0)
			System.out.println("Positive Even");
		else if(x>0 && x%2 !=0)
			System.out.println("Positive Odd");
		else if(x<0 && x%2==0)
			System.out.println("Negative Even");
		else
			System.out.println("Negative Odd");
		

	}

}
