package Basic_syntax;
import java.util.Scanner;

/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается
одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться
только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в
метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских,
китайских и прочих экзотических символов в строке не будет.
2.3.10
 */

public class palindrome {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        String result  = text.replaceAll("[^a-zA-Z0-9]","");
        return result.equalsIgnoreCase(new StringBuilder(result).reverse().toString()); // your implementation here
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        String text = in.nextLine();
        System.out.printf("Является ли заданная строка палиндромом? %s", isPalindrome(text));
        in.close();
    }
}
