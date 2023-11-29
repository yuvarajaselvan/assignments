package Squareroot;
public class SquareRoot {
    public static int squareroot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        for (int i = 1; i <= x / 2; i++) {
          
            if (i > x / i) {
                return i - 1;
            }
        }

        return x / 2; // Fallback case
    }

    public static void main(String[] args) {
        int x = 8; 
        int result = squareroot(x);
        System.out.println("The square root of " + x + " is: " + result);
    }
}
