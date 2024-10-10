package com.bridgelabzlambdaexpression;

@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda for Addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda for Subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda for Division
        MathOperation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        };


        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 2));
    }
}
