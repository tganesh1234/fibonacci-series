package gani.assignments;

import java.util.Scanner;

public class Febonacciseries {

	public static void main(String[] args) {
		// print fibonacci series
		int n,x=0,y=1,z=0;
		System.out.print("enter series length :");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.print(z+" ");
			z=x+y;
			x=y;
			y=z;
		}
		sc.close();

	}

}
