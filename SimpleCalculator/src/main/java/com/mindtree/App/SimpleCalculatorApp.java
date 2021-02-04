package com.mindtree.App;

import java.util.Scanner;

public class SimpleCalculatorApp {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		boolean flag;
		do {
			System.out.println(
					"1 --> Add two number\n 2 --> Substract two number\n 3--> Multiply Number\n Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Addition of number" + (2+5));
				break;
			case 2:
				System.out.println("Subtraction of number" + (10-5));
				break;
			case 3:
				System.out.println("Multiplication of number" + (10*5));
				break;
			default:
				System.out.println("-----------------Existing Main Menu-------------------");
			}
		} while (choice <= 3 && choice >= 1);
	}

}
