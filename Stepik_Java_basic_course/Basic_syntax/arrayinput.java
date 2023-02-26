package Basic_syntax;
import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner

        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:"); //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Полученный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
    }
}
