package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");
        int s  = myObj.nextInt();
        int numberOfNums= s ;

         for (int i = 0; i < numberOfNums; i++) {
            while(i < numberOfNums) {
                System.out.println("The Current Number is " + (i + 1));
                break;
            }
         }

        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
