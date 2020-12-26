package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.FileNameMap;

public class Task3 {
    public static void main(String[] args) {
        String s ="Is it saturday? Is it raining? Do we have a Java Class today?";
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)=='?'){
                count++;
            }
        }
        count=count+1;
        System.out.println(count);
    }

}
