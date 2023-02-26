package Basic_syntax;

/*
Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
Данная задача актуальна, например, при работе с битовыми полями.
Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
2.1.15

Алгоритм:
1. Берем число 1, оно у нас в двоичной СС представляется как 00000001.
2. Затем побитово сдвигаем его на bitIndex-1.
3. Выполняем операцию "логическое исключающее или" c value и побитово сдвинутой единицей (см шаг 2): value^(1<<(bitIndex-1)).

Пример:
Дано число 13. Изменить 2й бит на противоположный.
Число 13 в 2й СС = 1101. 2й бит у нас 0, т.е. его меняем на 1 и получаем результат 1111 (2я СС) = 15 (10я СС).
Что происходит в программе:
1 << 2-1, получается 0001 превратилось в 0010
Выполняем 3й шаг: 1101 ^ 0010 = 1111 (2я СС) = 15 (10я СС).
 */

public class bits {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value^(1<<(bitIndex-1)); // put your implementation here
    }
    public static void main(String[] args) {
        System.out.println(flipBit(13, 3));
    }
}
