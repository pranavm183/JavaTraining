package javaTraning;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		 System.out.println("Hello World");
		 System.out.println("Addition is "+(a+b));
		 System.out.println("Substraction is "+(b-a));
		 System.out.println("MultliPlication is "+(a*b));
		 System.out.println("quotient is "+(b/a));
		 System.out.println("quotient is "+(b%a));
		 
		 //7.Write a Java program to find the largest of two numbers
		 System.out.println("Largest no. is " + (a > b ? a : b));
		 //8.Write a Java program to find the largest of three numbers.
		 int c=30;
		 System.out.println("Largest no. is " + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
		 //a > b checks if a is greater than b.
		 //Step 2: If true, it evaluates (a > c ? a : c) to compare a with c.
		 //Step 3: If false, it evaluates (b > c ? b : c) to compare b with c
		 System.out.println("Largest no. is " + Math.max(a, Math.max(b, c)));
		 
		 //9.Write a Java program to check whether a number is even or odd.
		 System.out.println("no. is even "+(a%2==0));
		 System.out.println("no. is "+(a%2==0?"even":"odd"));
		 System.out.println("no.is odd "+(a%2!=0));
		 
		 //10.Write a Java program to check whether a number is positive, negative, or zero.
		 System.out.println("The number is " + (a > 0 ? "Positive" : (a < 0 ? "Negative" : "Zero")));
		 // Every '?' must have exactly one matching ':'to separate the true and false results.
		 
		 //11.Write a Java program to swap two numbers with using a temporary variable.
		 int x=20,y=10,z;
		 z=x;
		 x=y;
		 y=z;
		 System.out.println("x="+x+"y="+y);
		 //12.Write a Java program to swap two numbers without using a temporary variable.
		 int d=20,e=10;
		 d=d-e;
		 e=e+d;
		 System.out.println("d="+d+"e="+e);
		 
		 //13.Write a Java program to calculate the factorial of a number.
		 int fact=1;
		 for (int f = 5; f >=1 ; f--) {
			    fact *= f; 
			}
		 System.out.println("Factorial is " + fact);
	
		 //14.Write a Java program to generate the multiplication table of a given number.
	     //from input no. 
		 int t=5;
			for (int tr = 1; tr <= 10; tr++) { 
		    int tc = t * tr; 
		    System.out.println(t + " * " + tr + " = " + tc);
		}
		//from user input
			//import java.util.Scanner; // Import the Scanner class
			Scanner sc = new Scanner(System.in); 
	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        for (int tr = 1; tr <= 10; tr++) { 
			    int tc = num * tr; 
			    System.out.println(num + " * " + tr + " = " + tc);
	        }
		 
		 //15.Write a Java program to find the sum of the first N natural numbers.
	        Scanner s1 = new Scanner(System.in); 
	        System.out.print("Enter an integer: ");
	        int n = s1.nextInt();
	        int sum=0;
	        for(int m=1;m<=n;m++) {
	        	sum=sum+m;
	        }
	        System.out.println("Sum of first "+n+" numbers is "+sum);
	        
	        //16.Write a Java program to find the sum of the digits of a number.
	        Scanner s2=new Scanner(System.in);
	        System.out.print("Enetr a number:");
	        int i=s2.nextInt();
	        int sum1=0;
	        while (i > 0) {
	            sum1 = sum1 + (i % 10); // Extract the last digit and add to sum
	            i = i / 10;            // Remove the last digit
	        }
	        System.out.println("Sum of digits: " + sum1);
	        
	        //17.Write a Java program to reverse a given number.
	        Scanner s3 = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int l = s3.nextInt();
	        int Original=l;
	        int reverse = 0; 
	        // The loop runs until all digits are extracted
	        while (l != 0) {
	            int remainder = l % 10;        // 1. Get the last digit
	            reverse = reverse * 10 + remainder; // 2. Append it to the reverse number
	            l = l / 10;                    // 3. Remove the last digit from the original number
	        } 
	        System.out.println("Reverse no. is " + reverse);
	        
	        
	        //18.Write a Java program to check whether a number is a palindrome.
	        if(Original==reverse){
	        	 System.out.println(Original+" Number is palindrome");
	        }
	        System.out.println(Original+" Number is not palindrome");
	       
	        
	        //19.Write a Java program to check whether a number is a prime number.
	        Scanner s4 = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int r = s4.nextInt();
	        boolean isPrime = true;

	        // Numbers less than or equal to 1 are not prime
	        if (r <= 1) {
	            isPrime = false;
	        } else {
	            // Loop from 2 up to the square root of the number
	            for (int j = 2; j * j <= r; j++) {
	                if (r % j == 0) {
	                    isPrime = false; // Found a divisor, so it is not prime
	                    break;           // Exit the loop early
	                }
	            }
	        }
	        // Print the result
	        if (isPrime) {
	            System.out.println(r + " is a prime number.");
	        } else {
	            System.out.println(r+ " is not a prime number.");
	        }
	        
	        //20.Write a Java program to display all prime numbers within a given range.
	
	
	
	} 

}
