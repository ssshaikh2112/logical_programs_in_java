package arrays;

import java.util.Scanner;

public class IBMAssess98ArraysExp {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Chapter : ");
		int chapt=scan.nextInt();
		System.out.println("Start : ");
		int start=scan.nextInt();
		System.out.println("End : ");
		int end=scan.nextInt();
		int op=solve(chapt,start,end);
		System.out.println(op);
		scan.close();
	}

	private static int solve(int chapt, int start, int end) {
		// TODO Auto-generated method stub
		return (end-start>chapt)?chapt:(end-start)+1;
	}

}
