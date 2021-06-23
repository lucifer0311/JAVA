package com.company;

import java.util.Scanner;

public class CWH_06_CBSE_Board_Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max marks 100 in each Subjects:- ");

        System.out.println("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.println("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.println("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.println("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        System.out.println("Enter marks for Subject 5: ");
        int s5 = sc.nextInt();

        float sum = s1 + s2 + s3 + s4 + s5;
        System.out.println("Total marks: " + sum);

        System.out.println("Calculating Percentage for 5 Subjects:- ");
        float percentage = (sum / 500) * 100;
        System.out.println("Marks Percentage: " + percentage);

    }
}
