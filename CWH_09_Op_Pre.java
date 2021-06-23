package com.company;

public class CWH_09_Op_Pre {
    public static void main(String[] args) {
        // Precedence & Associativity
        int a = 6*5-34/2;
        /*
        Highest Precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
              =30-34/2
              =30-17
              =13
         */
        System.out.println(a);
        int b = 60/5-34*2;
        /*
              =12-34*2
              =12-68
              =-56
         */
        System.out.println(b);

    }
}
