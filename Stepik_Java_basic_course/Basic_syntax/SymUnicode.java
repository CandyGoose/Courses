package Basic_syntax;
import java.util.Scanner;

/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
2.2.3
 */

public class SymUnicode {
    public static char charExpression(int a) {
        char charValue = (int) '\\';
        return (char) (charValue + a);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number of symbol: ");
        int a = in.nextInt();

        System.out.printf("Symbol: %s", charExpression(a));
        in.close();
    }
}