package partB.ex01;

import java.util.Random;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";


        Random random = new Random();
        int numberOfRandoms = 5;

        for (int i = 0; i < numberOfRandoms; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Random number " + (i + 1) + ": " + randomNumber);
        }



        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
