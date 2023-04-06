import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        // Отфильтровать строки массива, которые содержат заданную подстроку.
        // Входные данные: массив строк и заданная подстрока.
        // Выходные данные: массив строк, содержащих заданную подстроку.
        String [] array = {"hello world", "London is a capital of Great Britain",
                "Moscow is a capital of Russia", "Tokyo is a capital of Japan", "We are learning java language"};
        String target = "capital";
        Arrays.stream(array)
                .filter(s -> s.contains(target))
                .toList()
                .forEach(System.out::println);
    }
}
