package com.company;

public class CWH_24_Break_and_Continue {
    public static void main(String[] args) {

        // Break and Continue Using Loops

//        for (int i = 0; i<5; i++){
//            System.out.println(i);
//            System.out.println("JAVA is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("JAVA is great");
//            if (i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");

//        for (int i = 0; i<5; i++){

//           if (i==2){
//               System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("JAVA is great");
//        }

        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");

    }
}
