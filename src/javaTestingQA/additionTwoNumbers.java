package javaTestingQA;

import java.util.Scanner;

public class additionTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no: ");
		double firstNumber =scanner.nextDouble();
		System.out.print("Enter 2nd no: ");
		double secondNumber = scanner.nextDouble();
		double sum = firstNumber + secondNumber;
		System.out.println("The sum of " +firstNumber + " and " +secondNumber + "is:" + sum);
		scanner.close();
	}

}
