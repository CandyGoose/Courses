package Basic_syntax;
import java.util.Scanner;

/*
Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
2.2.9
 */

public class degree_of_two {
    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.toBinaryString(Math.abs(value)).replace("0", "").length() == 1; // you implementation here
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of symbol: ");
        int a = in.nextInt();

        System.out.printf("Является ли заданное число по абсолютной величине степенью двойки? %s", isPowerOfTwo(a));
        in.close();
    }
}
