package com.company;

public class Task1 {
    public static void main(String[] args) {
    // Remove extra spaces from the sentences;

    String str = " Hello Guys      Welcome     to Class!";
    System.out.println(str.replaceAll("\\s+"," "));
    }
}
