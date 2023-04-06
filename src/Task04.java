import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        // Посчитать количество уникальных слов в массиве строк:
        // Входные данные: массив строк.
        // Выходные данные: количество уникальных слов в массиве строк.
        String [] array = {"hello world", "London is a capital of Great Britain",
                "Moscow is a capital of Russia", "Tokyo is a capital of Japan"};
        long count = Arrays.stream(array)
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count();
        System.out.println(count);
    }
}
