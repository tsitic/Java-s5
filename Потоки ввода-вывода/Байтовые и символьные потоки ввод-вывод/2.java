import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String data = "Hello, Word!";
        try (FileOutputStream file = new FileOutputStream("output.txt")) {
            for (int i = 0; i < data.length(); i++) {
                file.write(data.charAt(i)); //Запись
            }
            System.out.println("Ready!");
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
