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

        // Show results by passing lambdas
        showResult(10, 5, addition, "Addition");
        showResult(10, 5, subtraction, "Subtraction");
        showResult(10, 2, division, "Division");

    }
    // Method to display the result of a math operation
    public static void showResult(double a, double b, MathOperation operation, String operationName) {
        double result = operation.operate(a, b);
        System.out.println(operationName + " result: " + result);
    }
}

