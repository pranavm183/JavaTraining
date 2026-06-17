
package javaTraning;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;

        System.out.println("Hello World");
        System.out.println("Addition is " + (a + b));
        System.out.println("Subtraction is " + (b - a));
        System.out.println("Multiplication is " + (a * b));
        System.out.println("Quotient is " + (b / a));
        System.out.println("Remainder is " + (b % a));

        // 7. Largest of two numbers
        System.out.println("Largest no. is " + (a > b ? a : b));

        // 8. Largest of three numbers
        int c = 30;
        System.out.println("Largest no. is " +
                (a > b ? (a > c ? a : c) : (b > c ? b : c)));

        System.out.println("Largest no. is " +
                Math.max(a, Math.max(b, c)));

        // 9. Even or Odd
        System.out.println("No. is " + (a % 2 == 0 ? "even" : "odd"));

        // 10. Positive, Negative, Zero
        System.out.println("The number is " +
                (a > 0 ? "Positive" :
                        (a < 0 ? "Negative" : "Zero")));

        // 11. Swap with temporary variable
        int x = 20, y = 10, z;

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x + " y = " + y);

        // 12. Swap without temporary variable
        int d = 20, e = 10;

        d = d - e;
        e = d + e;
        d = e - d;

        System.out.println("d = " + d + " e = " + e);

        // 13. Factorial
        int fact = 1;

        for (int f = 5; f >= 1; f--) {
            fact *= f;
        }

        System.out.println("Factorial is " + fact);

        // 14. Multiplication table of 5
        int t = 5;

        for (int tr = 1; tr <= 10; tr++) {
            System.out.println(t + " * " + tr + " = " + (t * tr));
        }

        // Multiplication table from user input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        for (int tr = 1; tr <= 10; tr++) {
            System.out.println(num + " * " + tr + " = " + (num * tr));
        }

        // 15. Sum of first N natural numbers
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int m = 1; m <= n; m++) {
            sum += m;
        }

        System.out.println("Sum of first " + n +
                " numbers is " + sum);

        // 16. Sum of digits
        System.out.print("Enter a number: ");
        int i = sc.nextInt();

        int sum1 = 0;

        while (i > 0) {
            sum1 += i % 10;
            i /= 10;
        }

        System.out.println("Sum of digits: " + sum1);

        // 17. Reverse a number
        System.out.print("Enter a number: ");
        int l = sc.nextInt();

        int original = l;
        int reverse = 0;

        while (l != 0) {
            int remainder = l % 10;
            reverse = reverse * 10 + remainder;
            l /= 10;
        }

        System.out.println("Reverse no. is " + reverse);

        // 18. Palindrome
        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

        // 19. Prime number check
        System.out.print("Enter a number: ");
        int r = sc.nextInt();

        if (isPrime(r)) {
            System.out.println(r + " is a prime number.");
        } else {
            System.out.println(r + " is not a prime number.");
        }

        // 20. Prime numbers in a range
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " +
                start + " and " + end + " are:");

        for (int num4 = start; num4 <= end; num4++) {
            if (isPrime(num4)) {
                System.out.print(num4 + " ");
            }
        }

        System.out.println();

        // 21. Fibonacci Series
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int k = 1; k <= terms; k++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();

        // 22. Armstrong Number
        System.out.print("Enter a number: ");
        int armNum = sc.nextInt();

        int temp = armNum;
        int armSum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            armSum += digit * digit * digit;
            temp /= 10;
        }

        if (armNum == armSum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        // 23. GCD
        System.out.print("Enter first number: ");
        int g1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int g2 = sc.nextInt();

        int gcd = 1;

        for (int k = 1; k <= g1 && k <= g2; k++) {
            if (g1 % k == 0 && g2 % k == 0) {
                gcd = k;
            }
        }

        System.out.println("GCD = " + gcd);

        // 24. LCM
        int lcm = (g1 * g2) / gcd;

        System.out.println("LCM = " + lcm);

        // 25. Count digits
        System.out.print("Enter a number: ");
        int countNum = sc.nextInt();

        int digitCount = 0;

        while (countNum != 0) {
            digitCount++;
            countNum /= 10;
        }

        System.out.println("Number of digits = " + digitCount);

        // 26. Power of number
        System.out.print("Enter base number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter power: ");
        int n2 = sc.nextInt();

        int result = 1;

        for (int count = 1; count <= n2; count++) {
            result *= n1;
        }

        System.out.println("Result = " + result);

        // 27. Largest element in array
        int[] arr = {10, 25, 7, 89, 45};

        int largest = arr[0];

        for (int no = 1; no < arr.length; no++) {
            if (arr[no] > largest) {
                largest = arr[no];
            }
        }

        System.out.println("Largest no. is " + largest);

        // 28. Smallest element in array
        int[] arr1 = {10, 25, 7, 89, 45};

        int smallest = arr1[0];

        for (int no = 1; no < arr1.length; no++) {
            if (arr1[no] < smallest) {
                smallest = arr1[no];
            }
        }

        System.out.println("Smallest no. is " + smallest);

        // 29. Sum of array elements
        int[] arr2 = {10, 25, 7, 89, 45};

        int arrSum = 0;

        for (int no = 0; no < arr2.length; no++) {
            arrSum += arr2[no];
        }

        System.out.println("Sum of array elements = " + arrSum);

        // 30. Average of array elements
        int[] arr3 = {10, 25, 7, 89, 45};

        int arrSum1 = 0;

        for (int no = 0; no < arr3.length; no++) {
            arrSum1 += arr3[no];
        }

        double arrAvg = (double) arrSum1 / arr3.length;

        System.out.println("Average of array elements = " + arrAvg);

        sc.close();
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

