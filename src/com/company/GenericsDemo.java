package com.company;

import javafx.util.Pair;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String[] args) {
        int digit = 1;

        A a = new A("Name", 1);
        A b = new A(new ArrayList<>(), 1);

        A<int[]> c = new A<>(new int[] {1, 2}, 1);
        c.setName(new int[] {10, 20});

        Pair<String, Integer> myKeyValue = new Pair<>("Mike", 15);



    }
}

//Java default-jdk
//Java oracle-java
//Java apple


class A <T>{ /*String*/ /*User*/

    private T name;  //String   User
    private int version;

    public A(T name, int version) { //String  User
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
