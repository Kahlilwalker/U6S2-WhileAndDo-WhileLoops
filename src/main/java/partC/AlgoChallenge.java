package partC;

public class AlgoChallenge {
    /* Problem 1
    Looking at your math worksheet, your given 2 number values of either positive or negative.
    Evaluate a problem and find out if one of those numbers is positive and the other is negative.

    Return true if one is negative and one is positive.

    An exception to this is if the parameter "negative" is true, then only return true if both are negative.

    Example:
    checkPosOrNeg(1, -1, false) --> true
    checkPosOrNeg(-1, 1, false) --> true
    checkPosOrNeg(-4, -5, true) --> true
     */

    public static Boolean checkPosOrNeg(int a, int b, boolean negative) {


        a = 1;
        b = -1;
        if (a > 0 && b < 0){
           negative = true;
       }
        if (b > 0 && a < 0){
            negative = true;
        }

        if (a < 0 && b < 0){
            negative = true;
        }
        else {
            negative = false;
        }

        return negative;
    }


    /* Problem 2
    With the provided string, you need to exchange the first and last characters to create a new string.

    Return the new string.

    Example:
    exchange("code") --> "eodc
    exchange("a") --> "a"
    exchange("ab") --> "ba"
     */

    public static String exchange(String str) {

        return null;
    }

}
