package com.company;

import java.util.Locale;

public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String a = "Harry";
        System.out.println(a);

        int value = a.length();
        System.out.println(value);

        String lstring = a.toLowerCase();
        System.out.println(lstring);

        String ustring = a.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Harry     ";
        System.out.println(nonTrimmedString);

        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println(a.substring(1,4));

        System.out.println(a.startsWith("Ha"));
        System.out.println(a.endsWith("Ha"));

        System.out.println(a.charAt(4));

        System.out.println(a.indexOf("r"));

        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));

        System.out.println(a.equals("Harry"));

        System.out.println("I am escape sequence \" double quote");

        String text = "To Lower Case";
        text = text.replace(" " , "_");
        System.out.println(text);

    }
}
