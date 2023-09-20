package javaTestingQA;

import java.util.Scanner;

public class OddNumberChecker {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number=scanner.nextInt();
	if(isOdd(number)) {
		System.out.println(number + " is odd.");
			}else {
				System.out.println(number + "is not odd.");
				
			}
	System.out.print("Enter a number: ");
	int number1=scanner.nextInt();
	if(isOdd(number1)) {
		System.out.println(number1 + " is odd.");
			}else {
				System.out.println(number1 + "is not odd.");
				
			}
	scanner.close();
}

private static boolean isOdd(int number) {
	
	return number%2 !=0;
}
}
