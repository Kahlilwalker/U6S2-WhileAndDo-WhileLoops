package partA.ex02;

import java.util.Scanner;

public class                                                             SumOfNums {
    public static String sum(){
        String response ="";

        for (int i = 10; i >= 0; i++) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number");
            int s  = myObj.nextInt();
            response += i + " ";
        }

        return response;
    }
    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
