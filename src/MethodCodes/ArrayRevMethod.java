package MethodCodes;
import java.util.Scanner;
public class ArrayRevMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input size ");
		int size=s.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			}
		int[] b = ArrayRev(arr);
		System.out.println("Printing main array :");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("Printing reversed array :");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]+" ");
		}
	}

		public static int[] ArrayRev(int[] a) {
			int [] b = new int[a.length];
			int j = b.length-1;
			for(int i =0; i<a.length;i++) {
				b[j]=a[i];
				j--;
			}
			return b;
			}

	}


