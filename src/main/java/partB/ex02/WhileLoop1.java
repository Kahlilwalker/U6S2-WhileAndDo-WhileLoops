package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne(){
        String response = "";

        for (int i = 0; i <= 1000; i++) {
            while (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }

        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}
