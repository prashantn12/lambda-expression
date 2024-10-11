package com.bridgelabzlambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class NumberPlayList {

    private List<Integer> numberList = new ArrayList<>();

    public void addNumber(Integer number) {
        numberList.add(number);
    }

    public void iterateUsingClass() {
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer number) {
                System.out.println("Class-based iteration: " + number);
            }
        }

        numberList.forEach(new MyConsumer());
    }

    public void iterateUsingAnonymousClass() {
        numberList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println("Anonymous class iteration: " + number);
            }
        });
    }

    public void iterateUsingLambda() {
        numberList.forEach(number -> System.out.println("Lambda iteration: " + number));
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        NumberPlayList numberPlayList = new NumberPlayList();

        numberPlayList.addNumber(10);
        numberPlayList.addNumber(20);
        numberPlayList.addNumber(30);
        numberPlayList.addNumber(40);

        System.out.println("Iteration using Class:");
        numberPlayList.iterateUsingClass();

        System.out.println("\nIteration using Anonymous Class:");
        numberPlayList.iterateUsingAnonymousClass();

        System.out.println("\nIteration using Lambda:");
        numberPlayList.iterateUsingLambda();

    }

}

