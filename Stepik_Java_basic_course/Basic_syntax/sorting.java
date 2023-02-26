package Basic_syntax;

/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке
массив. Массивы могут быть любой длины, в том числе нулевой.
Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
Пример: если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}.
2.4.9
 */

public class sorting {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {

        int n = a1.length, m = a2.length;
        int i = 0, j = 0;
        int[] array = new int[n + m];

        while (i < n || j < m)
            array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];

        System.out.print ("Полученный массив:");
        for (int k = 0; k < i + j; k++) {
            System.out.print (" " + array[k]);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 2, 2, 10, 10, 20};
        int[] a2 = {1, 3, 5, 7, 8, 10, 10};

        mergeArrays(a1, a2);
    }
}
