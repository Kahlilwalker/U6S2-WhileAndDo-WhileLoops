package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot() {
        String response = " ";




        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter number");
        int s  = myObj.nextInt();
        int sum = (int) Math.sqrt(s);



        while (s < 0) {
            if (s >= 0) {
                System.out.println(sum);
            }
            myObj = new Scanner(System.in);
            System.out.println("Enter number");
            s = myObj.nextInt();



        }
=======
                while (s < 0) {
                    if (s >= 0) {
                        System.out.println(sum);
                    }
                    myObj = new Scanner(System.in);
                    System.out.println("Enter number");
                    s = myObj.nextInt();



                }
>>>>>>> 1a93cbb7170547eb2bd99fda40fcf75c356bc99c
        System.out.println(Math.sqrt(s));










        return response;
    }


    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 1a93cbb7170547eb2bd99fda40fcf75c356bc99c
