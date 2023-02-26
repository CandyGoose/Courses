package Basic_syntax;
import java.math.BigInteger;
import java.util.Scanner;

/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1 * 2 * ... * N.
Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит.
Поэтому будем использовать BigInteger.
2.4.8
 */

public class fact {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result; // your implementation here
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для расчета факториала: ");
        int a = in.nextInt();

        System.out.printf("Полученное число %d", factorial(a));
        in.close();
    }
}
