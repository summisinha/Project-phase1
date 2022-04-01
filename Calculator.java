package com.assisted.project;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int ch;
	    Double number1, number2, result;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Choose an option:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	    ch = sc.nextInt();
	    System.out.println("Enter first number");
	    number1 = sc.nextDouble();

	    System.out.println("Enter second number");
	    number2 = sc.nextDouble();

	    switch (ch) {
	      case 1:
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	       case 2:
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;
	        
	       case 3:
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	       
	       case 4:
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    sc.close();
	  }
	
	}


