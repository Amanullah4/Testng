package com.company;

import java.util.Arrays;

public class Task4ReverseWords {
    public static void main(String[] args) {
        String sentence = "what are you doing now?";
        String[] stringArray = sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for (int i = 0; i < stringArray.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(stringArray[i]);
            stringArray[i] = stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));
    }

 }
