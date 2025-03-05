package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");
        int s  = myObj.nextInt();
        int numberOfNums= s ;

<<<<<<< HEAD
         for (int i = 0; i < numberOfNums; i++) {
            while(i < numberOfNums) {
                System.out.println("The Current Number is " + (i + 1));
                break;
            }
         }
=======
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");
        int s  = myObj.nextInt();

        for (int i = 0; i <= s; i++) {
            while (i <= s) {
                System.out.println("The Current Number is: " + i);
                break;
            }
        }
>>>>>>> 3f935dccc21b256e04dec2c2fe0f3b59de9dd62d

        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
