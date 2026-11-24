package LoopCodes;
import java.util.Scanner;
public class WhileLoop{
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
	    int i = 10;
			System.out.println("Enter endind point");
			int ep=s.nextInt();
			while(i<ep) {
				double marks = s.nextDouble();
				if(marks>=90) {
					System.out.println("Grade A");
				}
				else if(marks>=80) {
					System.out.println("Grade B");
				}
				else if(marks>=70) {
					System.out.println("Grade C");
				}
				else if(marks>=60) {
					System.out.println("Grade D");
				}
				else {
					System.out.println("Grade F");
				}
				i++;
		}
		
	}
}