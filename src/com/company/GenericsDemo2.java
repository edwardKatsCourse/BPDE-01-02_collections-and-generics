package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo2 {

    public static void main(String[] args) {

        List apples = new ArrayList<>(); //List<Object> apples
        apples.add(new Apple());
        for (Object f : apples) {
            if (f instanceof Apple) {

                ((Fruit) f).doJuice();
            }
        }

        List<Apple> applesWithGenericType = new ArrayList<>(); //List<Object> apples
        applesWithGenericType.add(new Apple());
        for (Apple apple : applesWithGenericType) {
            apple.getApple();
            apple.doJuice();
        }

        new Juicer<Apple>(apples);
        new AppleJuicer<Apple>(new Apple());
    }
}

class Juicer<T extends Fruit & Juicable> {

    private List<T> fruits;

    public Juicer(List<T> fruits) {
        this.fruits = fruits;
    }

    public void getJuice() {
        for (Fruit fruit : fruits) {
            fruit.doJuice();
        }
    }
}

class AppleJuicer<T extends Apple> implements Fruit {
    T apple;

    public AppleJuicer(T apple) {
        this.apple = apple;
    }

    @Override
    public void doJuice() {
        this.apple.getApple();
    }
}

interface Juicable {

}


interface Fruit {
    void doJuice();
}

class Apple implements Fruit, Juicable {

    public void getApple() {
    }

    @Override
    public void doJuice() {
        System.out.println("Creating juice from " + this.getClass().getSimpleName());
    }
}

class Pineapple implements Fruit {
    @Override
    public void doJuice() {
        System.out.println("Creating juice from " + this.getClass().getSimpleName());
    }
}

class Car {

}