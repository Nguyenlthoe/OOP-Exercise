package hust.soict.globalict.lab01;

import java.util.Scanner;

public class CaculateBai5 {
	public static void main(String[] args){
        double number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        number1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        number2 = scanner.nextDouble();
        System.out.println("a + b = " + (number1 + number2));
        System.out.println("a - b = " + (number1 - number2));
        System.out.println("a * b = " + (number1 * number2));
        System.out.println("a / b = " + (number1 / number2));
    }
}
