package ArrayCodes;
import java.util.Scanner;
public class Array2D{
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many students");
		int st=s.nextInt();
		System.out.println("How many exams");
		int ex=s.nextInt();
		double[][] a = new double[st][ex];
		System.out.println("Please input marks");
		for(int i=0;i<st;i++) {
			System.out.println("input marks for student"+i);
			for(int j=0;j<ex;j++) {
				a[i][j]=s.nextDouble();
			}
		}
		//calculating grade for each student
		double sum = 0;
		for(int i=0;i<st;i++) {
		sum = 0;
		for(int j=0;j<ex;j++) {
		sum = sum + a[i][j];
		}
		System.out.println("Marks of Student: "+i+" is: "+sum);
		System.out.println("Grade of Student: "+i);
		double mp = (sum/(20*ex))*100;
		if(mp>=90)
		System.out.println("Grade: A");
		else if(mp>=80)
		System.out.println("Grade: B");
		else if(mp>=70)
		System.out.println("Grade: C");
		else if(mp>=60)
		System.out.println("Grade: D");
		else
		System.out.println("Grade: F");
		}
		double highest = 0;
		int hstudent = 0;
		for(int i=0;i<ex;i++) {
		highest = 0;
		hstudent = 0;
		for(int j=0;j<st;j++) {
		if(a[j][i]>highest) {
		highest = a[j][i];
		hstudent = j;
		}
		}
		System.out.println("Highest Marks in Exam: "+i+" is: "+highest);
		System.out.println("Highest Marks obtained by Student:"+hstudent);
		}
	}
}