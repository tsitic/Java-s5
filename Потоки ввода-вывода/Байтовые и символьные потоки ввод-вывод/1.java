import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("read.txt")) {
            int data;
            while ((data = file.read()) != -1) { //Чтение по байту
                System.out.print((char) data); //Преобразование байта в символ
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}

