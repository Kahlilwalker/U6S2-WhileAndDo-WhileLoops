package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int s  = myObj.nextInt();

        for (int i = 0; i <= s; i++) {
            while (i <= s) {
                System.out.println("The Current Number is: " + i);
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
