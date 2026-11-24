package LoopCodes;
import java.util.Scanner;
public class ForLoop{
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ending point");
		int ep=s.nextInt();
		int count = 0;
		for(int i=1;i<ep;i++) {
			double marks = s.nextDouble();
			if(marks<0) {
				break;
			}
			else if(marks>100) {
			continue;
			}
			else if(marks>=90) {
				System.out.println("Grade : A");
				count++;
			}
			else if(marks>=80) {
				System.out.println("Grade : B");
				count++;
			}
			else if(marks>=70) {
				System.out.println("Grade : C");
				count++;
			}
			else if(marks>=60) {
				System.out.println("Grade : D");
				count++;
			}
			else {
				System.out.println("Grade : F");
				count++;
			}
			System.out.println("Grade of student "+i);
		}
		System.out.println("Loop has ended");
		System.out.println("Grade count : "+count);
	}
}