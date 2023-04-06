import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        // Найти наименьшее число в массиве, большее заданного числа:
        // Входные данные: массив чисел и заданное число.
        // Выходные данные: наименьшее число в массиве, большее заданного числа.
        Integer [] array = {1, 2, 5, 10, 6, 17, 12, 9};
        Integer target = 8;
        int min = Arrays.stream(array)
                .filter(n -> n > target)
                .mapToInt(n -> n)
                .summaryStatistics()
                .getMin();
        System.out.println(min);
    }
}
