package com.company;
public class yyyyy {
    public static void main(String[] args)
    {
        //Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
        //Create String str2=  SYNTAX TECHNOLOGIES and convert into syntax technologies
        String str1="syntax technologies\n" +
                "SYNTAX TECHNOLOGIES";
        StringBuffer newStr=new StringBuffer(str1);
        for(int i = 0; i < str1.length(); i++)
        {
            if(Character.isLowerCase(str1.charAt(i)))
            {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            else if(Character.isUpperCase(str1.charAt(i)))
            {
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }
}


