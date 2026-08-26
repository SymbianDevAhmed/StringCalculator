/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringcalculator;

import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class StringCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter equation: ");
        String equation = input.nextLine();

        // Remove spaces
        equation = equation.replace(" ", "");

        char operator = ' ';
        int index = -1;

        // Find the operator
        if (equation.contains("+")) {
            operator = '+';
            index = equation.indexOf('+');

        } else if (equation.contains("-")) {
            operator = '-';
            index = equation.indexOf('-');

        } else if (equation.contains("*")) {
            operator = '*';
            index = equation.indexOf('*');

        } else if (equation.contains("/")) {
            operator = '/';
            index = equation.indexOf('/');
        }

        // Check if the operator exists
        if (index == -1) {
            System.out.println("Invalid equation");
            input.close();
            return;
        }

        // Extract the two operands
        String firstNumber = equation.substring(0, index);
        String secondNumber = equation.substring(index + 1);

        // Convert String to numbers
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double result = 0;

        // Perform the operation
        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    input.close();
                    return;
                }

                result = num1 / num2;
                break;
        }

        // Display the result
        System.out.println("Result = " + result);

        input.close();
    }
}