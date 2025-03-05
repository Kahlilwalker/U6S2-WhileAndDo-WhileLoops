package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo(){
        String response = "";

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "\n");
            }
        }





        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileTwo = doWhileLoopTwo();
        System.out.println(outputDoWhileTwo);
    }
}
