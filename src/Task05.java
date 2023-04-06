import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        // Отсортировать список строк по их длине:
        // Входные данные: список строк.
        // Выходные данные: отсортированный список строк по их длине.
        List <String> list = Arrays.asList("London is a capital of Great Britain", "hello world",
                "Tokyo is a capital of Japan", "We are learning java language");
        list.stream()
                .sorted(Comparator.comparing(String::length))
                .toList()
                .forEach(System.out::println);
    }
}
