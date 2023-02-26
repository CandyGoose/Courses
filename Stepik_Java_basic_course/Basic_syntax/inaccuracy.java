package Basic_syntax;

/*
Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность – 0.0001 (1E-4)
2.1.12
 */

public class inaccuracy {
    public static boolean doubleExpression(double a, double b, double c) {
        return (-0.0001 <= a + b - c) & (a + b - c <= 0.0001);
    }
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.2, 0.2, 0.3));
    }
}