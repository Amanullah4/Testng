package com.company;
public class Taslk2 {

    public static void main(String[] args) {
        //find how many aipha characters are there in the string
        String string="3213Hello 89 World354545 *&***^&*^&*";
        int count=0;
        System.out.println("String: "+string);
        for (int i=0; i<string.length(); i++){
            if (Character.isLetter(string.charAt(i)))
                count++;
        }
        System.out.println("Letters: "+count);

    }
}
