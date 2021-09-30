package testprograms;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,j;
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s1.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		@SuppressWarnings("resource")
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the "+i+" element of array:");
		a[i]=s2.nextInt();

		}

		System.out.println("The entered array:");
		for (i = 0;i <n;i++) {
		System.out.println(a[i] + " ");
		}

		System.out.println("The Reversed array:");
		for (j = n-1;j >= 0;j--) {
		System.out.print(a[j] + " ");
		}


	}

}
