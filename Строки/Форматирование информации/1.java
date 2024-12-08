import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        try (Formatter formatter = new Formatter()) {
            formatter.format("logic: %b%n", true);
            formatter.format("Char: %c%n", 'T');
            formatter.format("Integer: %d%n", 42);
            formatter.format("Float: %.2f%n", 3.14159);
            formatter.format("Str: %s%n", "Hello");
            //Вывод форматированного текста
            System.out.println(formatter);
        }
    }
}
