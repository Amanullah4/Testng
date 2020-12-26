package com.company;
public class Task4reverse {
    public static void main(String[] args) {
        String name ="welcome";
        String reverse = "";
        for (int i = name.length()-1; i>0; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.print("The reversed string of "+name+" is = ");
        System.out.println(reverse);





    }
}
