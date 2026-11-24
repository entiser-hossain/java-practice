package LoopCodes;
import java.util.Scanner;
public class doWhile{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int i=20;
		do {
			System.out.println("Loop is running");
			i++;
		}while(i<25);
		System.out.println("Loop has ended");
	}
}