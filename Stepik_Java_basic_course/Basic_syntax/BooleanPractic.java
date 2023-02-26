package Basic_syntax;

/*
Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые). Во всех остальных
случаях метод должен возвращать false.
Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас. Вам надо только
проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат.
2.1.6
 */

public class BooleanPractic {
    public static void main(String[] args) {
        String binary;
        boolean a, b, c, d;
        System.out.println("a\t\tb\t\tc\t\td\t\t result");
        for (int i = 0; i < 16; i++){
            binary = String.format("%4s",Integer.toBinaryString(i));
            a = binary.charAt(0) == '1';
            b = binary.charAt(1) == '1';
            c = binary.charAt(2) == '1';
            d = binary.charAt(3) == '1';
            System.out.printf("%b\t%b\t%b\t%b\t= %b%n", a, b, c, d, booleanExpression(a,b,c,d));
        }
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a & !b & c & d) ^ (!a & b & !c & d) ^ (!a & b & c & !d) ^ (a & !b & !c & d) ^ (a & !b & c & !d) ^ (a & b & !c & !d);
    }
}
