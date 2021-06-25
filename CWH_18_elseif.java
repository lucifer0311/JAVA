package com.company;

import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        char var = 'r';

        switch(var){
            case 'r':
                System.out.println("You are going to become an Adult!");
                break;
            case 'c':
                System.out.println("You are going to join a Job!");
                break;
            case 'd':
                System.out.println("You are going to get Retired!");
                break;
            default:
                System.out.println("Enjoy your LIFE!");
        }
        System.out.println("Thanks for using my JAVA Code!!");


        /*
        int age;
        System.out.print("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46){
            System.out.println("You are semi-experienced!");
        }
        else if (age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
        if (age>2){
            System.out.println("You are not a Baby!");
        }
         */
    }
}
