import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        // Найти среднее значение чисел в массиве: Входные данные: массив чисел.
        // Выходные данные: среднее значение чисел в массиве.
        List<Integer> list = Arrays.asList(1, 2, 5, 9, 7);
        double average = list.stream()
                .mapToInt(x -> x)
                .summaryStatistics()
                .getAverage();
        System.out.println("Среднее значение чисел в массиве: " + average);
    }
}