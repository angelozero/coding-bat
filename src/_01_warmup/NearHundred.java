package _01_warmup;

/**
 * Given an int n, return true if it is within 10 of 100 or 200.
 * Note: Math.abs(num) computes the absolute value of a number.
 * <p>
 * <p>
 * nearHundred(93) → true
 * nearHundred(90) → true
 * nearHundred(89) → false
 */
public class NearHundred {
    public static void main(String[] args) {

        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(n - 100)) <= 10 || (Math.abs(n - 200)) <= 10);
    }
}