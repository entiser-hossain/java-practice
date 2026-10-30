package Code;
import java.util.Scanner;
public class Excha1 {

	public static void main(String[] args) {
	int studentid;
	double javamarks;
	double mathmarks;
	double englishmarks;
	char gradecharacter;
	double total;
	double average;
	Scanner s = new Scanner(System.in);
	studentid=s.nextInt();
	javamarks=s.nextDouble();
	mathmarks=s.nextDouble();
	englishmarks=s.nextDouble();
	gradecharacter=s.next().charAt(0);
	total=javamarks+mathmarks+englishmarks;
	average=(javamarks+mathmarks+englishmarks)/3;
	System.out.println("Student ID: "+studentid);
	System.out.println("Java: "+javamarks);
	System.out.println("Math: "+mathmarks);
	System.out.println("English: "+englishmarks);
	System.out.println("Grade: "+gradecharacter);
	System.out.println("Total: "+total);
	System.out.println("Average: "+average);
	}

}
