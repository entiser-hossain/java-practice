package ArrayCodes;
import java.util.Scanner;
public class ArrayExample1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int [] a = new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Array value at "+i+" is"+a[i]);
		}
		int flag = 0; int count = 0;
		for(int i =0;i<size;i++) {
			flag=0;
		    for(int j=2;j<a[i];j++){
		    	if(a[i]%j==0) {
		    		flag=1;
		    	}
		    	if(flag==0) 
		    		count++;	
		    }
		    System.out.println("Prime count  "+count);                 
		}
		    }
}
	