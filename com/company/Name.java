package com.company;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        java.lang.String momsName;
        java.lang.String dadname;
        java.lang.String gender;
        java.lang.String babyname;
        System.out.println("please enter moms name");

        momsName = scanner.nextLine();

        System.out.println("please enter dads name");
        dadname = scanner.nextLine();

        System.out.println("Is this a boy or girl");
        gender = scanner.nextLine();

        if (gender.toLowerCase().startsWith("b")) {
            java.lang.String firstPart = dadname.substring(0, dadname.length() / 2);
            java.lang.String lasttPart = dadname.substring(dadname.length() / 2);
            babyname = firstPart + lasttPart;
        }else if( gender.toLowerCase().startsWith("g")) {
            java.lang.String firstpart = momsName.substring(0, momsName.length() / 2);
            java.lang.String lastpart = momsName.substring(momsName.length() / 2);
            babyname = firstpart + lastpart;
        }else {
            babyname = "No suggestion";
        }
        System.out.println(babyname);
    }
}
