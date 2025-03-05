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
<<<<<<< HEAD

=======
>>>>>>> 3f935dccc21b256e04dec2c2fe0f3b59de9dd62d

        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}
