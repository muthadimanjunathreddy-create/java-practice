package com.tnsif.intro;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a Number = ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while(num > 0)
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		if(temp == rev)
		{
			System.out.println("The Given Number is a Palindrome Number"); 
		}
		else
		{
			System.out.println("The Given Number is Not a Palindrome Number");
		}
		
	}

}
