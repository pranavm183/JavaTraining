package javaTraning;

import java.util.Scanner;

public class AdditionofTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp=a+b;
		System.out.println("Addition is "+temp);
		
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int l = s3.nextInt();

		int reverse = 0; 

		// The loop runs until all digits are extracted
		while (l != 0) {
		    int remainder = l % 10;        // 1. Get the last digit
		    reverse = reverse * 10 + remainder; // 2. Append it to the reverse number
		    l = l / 10;                    // 3. Remove the last digit from the original number
		} 

		System.out.println("Reverse no. is " + reverse);

	}

}
