package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("enter any number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int num =1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
